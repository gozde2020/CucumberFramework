package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Ticket_gp2_gp7 {
	
	@FindBy(id = "menu_admin_Qualifications")
	public WebElement qualificationBtn;
	
	@FindBy(xpath = "//a[@id = 'menu_admin_viewLicenses']")
	public WebElement licensesBtn;
	
	@FindBy(xpath ="//input[@id = 'btnAdd']")
	public WebElement addBtn;
	
	@FindBy(xpath ="//input[@id = 'license_name']")
	public WebElement nameField;
	
	@FindBy(xpath ="//input[@id = 'btnSave']")
	public WebElement saveBtn;
	
	//  phython eklemsi icin  //table[@id = 'recordsListTable']/tbody/tr/td/a
	
	//TICKET 2
	@FindBy(xpath ="//a[text() = 'Emergency Contacts']")
	public WebElement emergencyContactTab;
	
	@FindBy(id = "btnAddContact")
	public WebElement addEmergencyContactBtn;
	
	@FindBy(id = "emgcontacts_name")
	public WebElement emergencyContactName;
	
	@FindBy(id = "emgcontacts_relationship")
	public WebElement relationship;
	
	@FindBy(id = "emgcontacts_homePhone")
	public WebElement homephone;
	
	@FindBy(id = "emgcontacts_mobilePhone")
	public WebElement mobile;
	
	@FindBy(id = "emgcontacts_workPhone")
	public WebElement workTelephone;
	
	@FindBy(id = "btnSaveEContact")
	public WebElement saveContactBtn;
	
	//table da sonia ismini bulma   //table[@id = 'emgcontact_list']/tbody/tr/td/a
}
