package com.hrms.stepDefinitions;

import com.hrms.utils.CommonMethods;

import io.cucumber.java.en.Then;

public class DeleteEmployeeStepDefinitions extends CommonMethods{
	
	@Then("click on the check button")
	public void click_on_the_check_button() {
		click(search.checkButton);
	}

	@Then("click delete button")
	public void click_delete_button() throws InterruptedException {
		click(delete.deleteButton);
		
			Thread.sleep(2000);
	
		click(delete.confirmDeleteButton);
	}

}
