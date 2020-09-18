package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.PageInitilizer;

public class DeleteEmployeePageElements extends PageInitilizer{
	
	@FindBy(id = "btnDelete")
	public WebElement deleteButton;
	
	@FindBy(id = "dialogDeleteBtn")
	public WebElement confirmDeleteButton;

	public DeleteEmployeePageElements() {
		PageFactory.initElements(driver, this);
	}

}
