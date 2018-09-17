package com.cg.tms.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.tms.dao.TraineeDao;
import com.cg.tms.entities.Trainees;

@Service
@Transactional
public class TraineeServiceImpl implements TraineeService 
{

	@Autowired
	TraineeDao tdao;
	
	@Override
	public void AddTrainee(Trainees tdetails) 
	{
		tdao.AddTrainee(tdetails);
	}

	@Override
	public List<Trainees> RetrieveAllTrainee()
	{
		
		return tdao.RetrieveAllTrainee();
	}

	@Override
	public void DeleteTrainee(Integer tdetails)
	{
		tdao.DeleteTrainee(tdetails);
		
	}

	@Override
	public Trainees deleteOneTrainee(Integer tdetails) {
		
		return tdao.deleteOneTrainee(tdetails);
	}
	
	@Override
	public Trainees retrieveOneTrainee(Integer tdetails) {
		
		return tdao.deleteOneTrainee(tdetails);
	}

	@Override
	public void ModifyTrainee(Trainees tdetails)
	{
		tdao.ModifyTrainee(tdetails);
		
	}

}
