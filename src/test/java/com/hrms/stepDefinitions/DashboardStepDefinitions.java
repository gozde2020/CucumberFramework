package com.hrms.stepDefinitions;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.hrms.utils.CommonMethods;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;

public class DashboardStepDefinitions extends CommonMethods{
	@Then("verify the following dashboard tabs")
	public void verify_the_following_dashboard_tabs(DataTable dashboardTabs) {
	    List<String> expectedDashTabs =dashboardTabs.asList(); // convert to data table
	    List<String> actualDashTabs = new ArrayList<String>();
	    
	    for(WebElement dashTab:dash.dashTabs) {
	    	actualDashTabs.add(dashTab.getText());
	    }
	    System.out.println(expectedDashTabs);
	    System.out.println(actualDashTabs);
	    Assert.assertEquals(expectedDashTabs, actualDashTabs);
	}
	
//	@Then("verify the following dashboard tabs")
//	public void verify_the_following_dashboard_tabs(DataTable dashboardTabs) {
//	List<String> expectedTabs = dashboardTabs.asList();
//	List<String> actualTab = new ArrayList<String>();
	
//	for(WebElementt dashTab:dash.dashTabs){
//  actualTabs.add(	dashTab.getText();
//}
// System.out.println(expectedTabs);
	
// System.out.println(actualTabs);
//Assert.asserTrue(expectedTabs, actualTabs);
//
//


}
