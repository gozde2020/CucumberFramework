package com.hrms.testbase;

import com.hrms.pages.AddEmployeePageElements;
import com.hrms.pages.DashboardPageElements;
import com.hrms.pages.DeleteEmployeePageElements;
import com.hrms.pages.JobTitlePageElements;
import com.hrms.pages.LoginPageElements;
import com.hrms.pages.PageWithDetailsAndPictureElements;
import com.hrms.pages.SearchEmployeePageElements;
import com.hrms.pages.ViewEmployeePageElements;

public class PageInitilizer extends BaseClass {
	public static LoginPageElements login;
	protected static DashboardPageElements dash;
	protected static AddEmployeePageElements addEmp;
	protected static PageWithDetailsAndPictureElements viewPersonalD;
	protected static SearchEmployeePageElements search;
	protected static DeleteEmployeePageElements delete;
	protected static ViewEmployeePageElements viewEmp;
	protected static JobTitlePageElements jobTitles;
	
	public static void initializePageObjects() {
		
	
	login =new LoginPageElements();
	dash =new DashboardPageElements();
	addEmp = new AddEmployeePageElements();
	viewPersonalD=new PageWithDetailsAndPictureElements();
	search = new SearchEmployeePageElements();
	delete = new DeleteEmployeePageElements();
	viewEmp = new ViewEmployeePageElements();
	jobTitles = new JobTitlePageElements();
	
	}
	
}
