package com.cg.tms.entities;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

public class ValidateLogin
{

	@NotEmpty
	@Pattern(regexp="Capgemini",message="Enter correct username")
	private String userName;
	
	@NotEmpty
	@Pattern(regexp="capgemini",message="Enter correct password")
	private String password;

	public ValidateLogin()
	{
		
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	
}
