package com.hrms.stepDefinitions;



import org.junit.Assert;

import com.hrms.utils.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddEmployeeStepDefinitions extends CommonMethods{

	@Then("navigate to add employee page")
	public void navigate_to_add_employee_page() {
		jsClick(dash.pimLinkBtn);
		jsClick(dash.addEmpButton);
	}
	@When("add new employee with login details")
	public void add_new_employee_with_login_details() {
		sendText(addEmp.firstNameField,"Chadwick");
		sendText(addEmp.lastNameField,"Boseman");
		click(addEmp.createLoginDetailsCheckbox);
		
		sendText(addEmp.userName,"BlackPantherRipppp");
		sendText(addEmp.userPassword,"ripBlackpanther:(@9/2020");
		sendText(addEmp.confirmPassword,"ripBlackpanther:(@9/2020");
		click(addEmp.saveButton);
	}
	@Then("verify add employee succesfully")
	public void verify_add_employee_succesfully() {
		Assert.assertEquals(viewPersonalD.profPicText.getText(), "Chadwick Bosem");  
	}
	@When("add new employee without login details")
	public void add_new_employee_without_login_details() {
		sendText(addEmp.firstNameField,"Chadwick");
		sendText(addEmp.lastNameField,"Boseman");  
		click(addEmp.saveButton);
	}

	
}
