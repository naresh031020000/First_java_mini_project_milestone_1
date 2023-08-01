package com.fssa.ShareToRise.model;

import java.time.LocalDate;
import java.util.List;

/*
 * 
 * multiple recievers
 * 
 * */
public class FundingRaiser {
	
	
	private int id;
	
	private String title;
	
	private String description;
	
	private double fundingGoal;
	
	private LocalDate fundEndingDate;
	
	private int noOfDaysRequired;
	

	
	
//	Creating constructor for all fields
	
	public FundingRaiser() {
		
	}
	


	
	
public FundingRaiser(int id, String title, String description, double fundingGoal, LocalDate fundEndingDate,
			int noOfDaysRequired) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.fundingGoal = fundingGoal;
		this.fundEndingDate = fundEndingDate;
		this.noOfDaysRequired = noOfDaysRequired;
	}
 
public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	//	creating Getters and Setters for this method
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getFundingGoal() {
		return fundingGoal;
	}

	public void setFundingGoal(double fundingGoal) {
		this.fundingGoal = fundingGoal;
	}



	public LocalDate getFundEndingDate() {
		return fundEndingDate;
	}

	public void setFundEndingDate(LocalDate fundEndingDate) {
		this.fundEndingDate = fundEndingDate;
	}

	

	public int getNoOfDaysRequired() {
		return noOfDaysRequired;
	}

	public void setNoOfDaysRequired(int noOfDaysRequired) {
		this.noOfDaysRequired = noOfDaysRequired;
	}

}
