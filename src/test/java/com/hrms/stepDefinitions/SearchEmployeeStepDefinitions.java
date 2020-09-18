package com.hrms.stepDefinitions;

import org.junit.Assert;
import com.hrms.utils.CommonMethods;
import io.cucumber.java.en.Then;

public class SearchEmployeeStepDefinitions extends CommonMethods {

	@Then("navigate to employee list page")
	public void navigate_to_employee_list_page() {
		click(dash.pimLinkBtn);
		click(dash.empListButton);
	}
	@Then("enter {string}")
	public void enter(String firstName) {
		waitForVisibility(search.empNameField);
		//waitForClickability(search.empNameField);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		sendText(search.empNameField, firstName);
	}

	@Then("click on search button")
	public void click_on_search_button() {
		click(search.searchButton);
	}
	@Then("enter {string} number")
	public void enter_number(String ID) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		waitForVisibility(search.idField);
		//waitForClickability(search.idField);
		sendText(search.idField, ID);
	}
	@Then("verify the {string} , {string}")
	public void verify_the(String firstName, String middleName) {
		String fullFirstnameLastname = firstName + " " + middleName;
		waitForVisibility(search.resultNameAndMiddleName);
		String fullprofile = search.resultNameAndMiddleName.getText();
		Assert.assertEquals(fullFirstnameLastname, fullprofile);

	}

}