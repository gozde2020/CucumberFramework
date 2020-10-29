package com.hrms.stepDefinitions;

import org.junit.Assert;

import com.hrms.utils.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JobTitleStepDefinitions extends CommonMethods{
	@When("navigate to job titles")
	public void navigate_to_job_titles() {
	    click(jobTitles.adminBtn);
	    click(jobTitles.jobBtn);
	    click(jobTitles.jobTitleBtn);
	}

	@When("get all job titles from the table")
	public void get_all_job_titles_from_the_table() {
	    System.out.println(jobTitles.getjobTitlesFromTable());
	}
	
	@Then("validate Job Titles from ui against db")
	public void validate_Job_Titles_from_ui_against_db() {
		System.out.println("DB job title size= "+ DBStepDefinitions.dbData.size());
		System.out.println("UI job title size= "+ jobTitles.getjobTitlesFromTable().size());
		Assert.assertEquals(DBStepDefinitions.dbData, jobTitles.getjobTitlesFromTable());
		 
	}
}
