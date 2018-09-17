package com.cg.tms.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.cg.tms.entities.Trainees;

@Repository
public class TraineeDaoImpl implements TraineeDao 
{

	@PersistenceContext
	EntityManager em;
	
	@Override
	public void AddTrainee(Trainees tdetails) 
	{
		em.persist(tdetails);
	}

	@Override
	public List<Trainees> RetrieveAllTrainee()
	{
		String traineelist="SELECT m FROM Trainees m";
		
		TypedQuery<Trainees> query=em.createQuery(traineelist,Trainees.class);
		return query.getResultList();
	}

	@Override
	public void DeleteTrainee(Integer tdetails)
	{
		Trainees tr=em.find(Trainees.class, tdetails);
		em.remove(tr);
		
	}

	@Override
	public Trainees deleteOneTrainee(Integer tdetails)
	{
		Trainees tr=em.find(Trainees.class, tdetails);
		return tr;
	}
	
	
	@Override
	public Trainees retrieveOneTrainee(Integer tdetails)
	{
		Trainees tr=em.find(Trainees.class, tdetails);
		return tr;
	}

	@Override
	public void ModifyTrainee(Trainees tdetails)
	{
		em.merge(tdetails);
		
	}

}
