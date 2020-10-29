package com.hrms.pages;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class JobTitlePageElements extends BaseClass{
	@FindBy(id = "menu_admin_viewAdminModule")
	public WebElement adminBtn;
	
	@FindBy(id = "menu_admin_Job")
	public WebElement jobBtn;
	
	@FindBy(id = "menu_admin_viewJobTitleList")
	public WebElement jobTitleBtn;
	
	@FindBy(xpath = "//table[@id = 'resultTable']")
	public WebElement resultTable;
	
	public boolean isTableDisplayed() {
		return resultTable.isDisplayed();
	}
	
	@FindBy(xpath = "//table[@id = 'resultTable']/tbody/tr/td[2]")
	public List<WebElement> JobTitleTableResult;
	
	public List<Map<String, String>> getjobTitlesFromTable() {
		List<Map<String, String>> uiJobTitles = new ArrayList<>();
		for(WebElement firstJobTitleRow: JobTitleTableResult) {
			Map<String, String> mapData = new LinkedHashMap<>();
			String tableName = firstJobTitleRow.getText();
			mapData.put("job_title", tableName);
			uiJobTitles.add(mapData);
		}
		return uiJobTitles;
	}
	
	public JobTitlePageElements() {
		
		PageFactory.initElements(driver, this);
}
}
