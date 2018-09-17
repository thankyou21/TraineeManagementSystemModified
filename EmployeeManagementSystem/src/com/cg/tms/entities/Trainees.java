package com.cg.tms.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;


@Entity
@Table(name="Trainee_157998")
public class Trainees
{
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seq")
	@SequenceGenerator(name="seq",sequenceName="TSEQ" ,allocationSize=1)
	@Column(name="TRAINEE_ID")
	private Integer traineeId;
	
	@Column(name="TRAINEE_NAME")
	@NotEmpty
	@Pattern(regexp="[A-Z][a-z]+",message="Cannot be empty.Please select Trainee Name starting with Capital letter followed by small letters")
	private String traineeName;
	
	@Column(name="TRAINEE_DOMAIN")
	@NotNull(message="Cannot be empty.Please select Trainee Domain")
	private String traineeDomain;
	
	@Column(name="TRAINEE_LOCATION")
	@NotNull(message="Cannot be empty.Please select Trainee Location")
	private String traineeLocation;

	public Trainees()
	{
		
	}

	public Integer getTraineeId() {
		return traineeId;
	}

	public void setTraineeId(Integer traineeId) {
		this.traineeId = traineeId;
	}

	public String getTraineeName() {
		return traineeName;
	}

	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}

	public String getTraineeDomain() {
		return traineeDomain;
	}

	public void setTraineeDomain(String traineeDomain) {
		this.traineeDomain = traineeDomain;
	}

	public String getTraineeLocation() {
		return traineeLocation;
	}

	public void setTraineeLocation(String traineeLocation) {
		this.traineeLocation = traineeLocation;
	}

		
	
	
	
}
