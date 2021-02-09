package com.hrms.utils;

import org.json.JSONObject;

public class APIPayloadCommonMethods {
	public static String createEmployeeBody() {

		String createEmployeeBody = "{\n" + 
				"  \"emp_firstname\": \"hello\",\n" + 
				"  \"emp_lastname\": \"there\",\n" + 
				"  \"emp_middle_name\": \"Syntax\",\n" + 
				"  \"emp_gender\": \"F\",\n" + 
				"  \"emp_birthday\": \"2001-10-11\",\n" + 
				"  \"emp_status\": \"Zero hours contract\",\n" + 
				"  \"emp_job_title\": \"QA Tester\"\n" + 
				"}";

		return createEmployeeBody;
	}
	
	
	public static String createEmployeePayload() {
		JSONObject obj = new JSONObject();
		obj.put("emp_firstname", "Syntaxxxx");
		obj.put("emp_lastname", "Batch");
		obj.put("emp_middle_name", "Seven");
		obj.put("emp_gender", "M");
		obj.put("emp_birthday", "2009-10-11");
		obj.put("emp_status", "Zero hours contract");
		obj.put("emp_job_title", "QA Tester");
		return obj.toString();
		
	}
	
	public static String createEmployeePayloadMoreDynamic(String firstName, String lastName, String middleName,
			String gender, String dob, String employeeStatus, String employeeJobTitle) {
		JSONObject obj = new JSONObject();
		obj.put("emp_firstname", firstName);
		obj.put("emp_lastname", lastName);
		obj.put("emp_middle_name", middleName);
		obj.put("emp_gender", gender);
		obj.put("emp_birthday", dob);
		obj.put("emp_status", employeeStatus);
		obj.put("emp_job_title", employeeJobTitle);
		return obj.toString();
	}
}
