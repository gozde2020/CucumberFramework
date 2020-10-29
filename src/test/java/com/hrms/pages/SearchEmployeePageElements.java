package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class SearchEmployeePageElements extends BaseClass{
	
	@FindBy(id = "empsearch_id")
	public WebElement idField;
	
	@FindBy(id = "empsearch_employee_name_empName")
	public WebElement empNameField;
	
	@FindBy(xpath = "//input[@id = 'searchBtn']")
	public WebElement searchButton;
	
//	@FindBy(xpath = "//table[@id='resultTable']/tbody/tr/td[1]")
//	public WebElement checkButton;
	
	@FindBy(xpath = "//input[@name='chkSelectRow[]']")
	public WebElement checkButton;
	
	@FindBy(xpath = "//table[@id='resultTable']/tbody/tr/td[2]")
	public WebElement resultID;
	
	@FindBy(xpath = "//table[@id='resultTable']/tbody/tr/td[3]")
	public WebElement resultNameAndMiddleName;
	
	public SearchEmployeePageElements() {
		PageFactory.initElements(driver, this);
	}
}
