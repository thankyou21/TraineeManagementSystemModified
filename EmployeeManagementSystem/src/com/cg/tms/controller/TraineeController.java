package com.cg.tms.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.tms.entities.Trainees;
import com.cg.tms.entities.ValidateLogin;
import com.cg.tms.service.TraineeService;

@Controller
public class TraineeController
{

	@Autowired
	TraineeService tser;
	
	@RequestMapping("start")
	public String Login(Model model)
	{
		ValidateLogin vl=new ValidateLogin();
		model.addAttribute("vl", vl);
		return "login";
	}
	
	@RequestMapping("validate")
	public String Validate(@Valid@ModelAttribute("vl")ValidateLogin vl,BindingResult res,Model model)
	{
		
		if(res.hasErrors())
		{
			return "login";
		}
		
		return "options";
	}
	
	@RequestMapping("choise")
	public String UserChoise(@RequestParam("id") String id,Model model)
	{
		Trainees tdetails=new Trainees();
		model.addAttribute("tdetails", tdetails);
		model.addAttribute("id", id);
		
		
		switch(id)
		{
			case "1":{return "AddTrainee";}
			case "2":{return "DeleteTrainee";}
			case "3":{return "ModifyTrainee";}
			case "4":{return "RetrieveOneTrainee";}
			default:{return "";}
		}
	
		
		
	}
	
	@RequestMapping("AddToDB")
	public String AddTrainee(@Valid@ModelAttribute("tdetails")Trainees tdetails,BindingResult res,Model model)
	{
		model.addAttribute("tdetails", tdetails);

		if(res.hasErrors())
		{
			return"AddTrainee";
		}
		
		else
		{	
			tser.AddTrainee(tdetails);
			return"success";
		}
		
	}
	
	
	@RequestMapping("display")
	public String DisplayTrainee(Model model)
	{
		List<Trainees> tList=tser.RetrieveAllTrainee();
		model.addAttribute("tList", tList);
		
		return "RetrieveAllTrainee";

		
	}
	
	
	@RequestMapping("retrieveOneTrainee")
	public String RetrieveOneTrainee(@ModelAttribute("tdetails") Trainees tdetails,Model model)
	{
		Trainees trainee=null;
		model.addAttribute("flag", true);
		model.addAttribute("tdetails", tdetails);
		trainee=tser.retrieveOneTrainee(tdetails.getTraineeId());
		
		if(trainee!=null)
		{
			model.addAttribute("trainee", trainee);
			return "RetrieveOneTrainee";
		}
		
		else
			return "noRecordFound2";
		
	}
	
	
	@RequestMapping("delete1")
	public String DeleteTrainee1(@ModelAttribute("tdetails") Trainees tdetails,Model model)
	{
		Trainees trainee=null;
		model.addAttribute("flag", true);
		model.addAttribute("tdetails", tdetails);
		trainee=tser.deleteOneTrainee(tdetails.getTraineeId());
		
		if(trainee!=null)
		{
			model.addAttribute("trainee", trainee);
			return "DeleteTrainee";
		}
		
		else
			return "noRecordFound";
		
	}
	
	@RequestMapping("delete2")
	public String DeleteTrainee2(@ModelAttribute("trainee") Trainees trainee,Model model)
	{
		
		model.addAttribute("trainee", trainee);
		tser.DeleteTrainee(trainee.getTraineeId());
		
		return "success";

		
	}
	
	@RequestMapping("modify")
	public String ModifyTrainee(@Valid@ModelAttribute("tdetails")Trainees tdetails,BindingResult res,Model model)
	{
		model.addAttribute("tdetails", tdetails);

		if(res.hasErrors())
		{
			return"ModifyTrainee";
		}
		
		else
		{	
			tser.ModifyTrainee(tdetails);
			return"success";
		}
		
	}
	
	
	
}
