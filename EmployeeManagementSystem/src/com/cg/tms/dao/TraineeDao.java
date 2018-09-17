package com.cg.tms.dao;

import java.util.List;

import com.cg.tms.entities.Trainees;

public interface TraineeDao 
{
	public void AddTrainee(Trainees tdetails);
	
	public List<Trainees> RetrieveAllTrainee();
	
	public void DeleteTrainee(Integer tdetails);
	
	public Trainees deleteOneTrainee(Integer tdetails);
	
	public Trainees retrieveOneTrainee(Integer tdetails);
	
	public void ModifyTrainee(Trainees tdetails);
}
