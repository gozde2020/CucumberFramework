package com.hrms.API.steps.practice;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;



@FixMethodOrder(MethodSorters.NAME_ASCENDING)



public class HardcodedExamples {
	/*
	 * REST Assured - Java library specifically developed to automate REST endpoints
	 * 
	 * Given - Preparing your request 
	 * When - What action will you perform, what type
	 * of call are you making? 
	 * Then - Verification
	 * 
	 */
	//Concatenates with endpoint during run time
	String baseURI = RestAssured.baseURI = "http://18.232.148.34/syntaxapi/api";
	String token = "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE2MDM2MzU3MjIsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTYwMzY3ODkyMiwidXNlcklkIjoiMTI4OSJ9.dyKljx8Lc8EPknUXCyxVJnODIFxQWuGY6avz4SdmP4I";
	static String employeeID;
	//@Test
	public void sampleTest() {

		/** BaseURI for all endpoints */

		/** JWT **/

		/** Preparing request for /getOneEmployee.php **/
		/** using. log. all print out everything being sent with the request **/
		RequestSpecification preparingGetOneEmployeeRequest = given().header("Authorization", token)
				.header("Content-Type", "application/json").queryParam("employee_id", "3816").log().all();

		Response getOneEmployeeResponse = preparingGetOneEmployeeRequest.when().get("/getOneEmployee.php");

		// one way to print response object
		// System.out.println(getOneEmployeeResponse.asString());

		// second way using rest assured prettyPrint()
		getOneEmployeeResponse.prettyPrint();

		/** Using assertThat() to verify status code */
		getOneEmployeeResponse.then().assertThat().statusCode(200);

	}
	@Test
	public void aPOSTcreateEmployee() {
			//preparing request 
			RequestSpecification createEmployeeRequest = given().header("Authorization",token).header("Content-Type", "application/json").body("{\n" + 
					"  \"emp_firstname\": \"Syntaxxxx\",\n" + 
					"  \"emp_lastname\": \"Batch\",\n" + 
					"  \"emp_middle_name\": \"Seven\",\n" + 
					"  \"emp_gender\": \"M\",\n" + 
					"  \"emp_birthday\": \"2009-10-11\",\n" + 
					"  \"emp_status\": \"Zero hours contract\",\n" + 
					"  \"emp_job_title\": \"QA Tester\"\n" + 
					"}");//.log().all();
			
			//making call to create an employee
			Response createEmployeeResponse = createEmployeeRequest.when().post("/createEmployee.php");
			//FOR SEEING Response createEmployeeResponse = createEmployeeRequest.when().log().all().post("/createEmployee.php");
			//printing responses
			//createEmployeeResponse.prettyPrint();
			
			//using Json to view the response body which lets us get the employee ID
			//we are storing the employeeID as a static global variable to be able to use with other calls
			employeeID = createEmployeeResponse.jsonPath().getString("Employee[0].employee_id");
			//optional: printing employeeID
			//System.out.println(employeeID);
			
			//Verify status code is 201
			createEmployeeResponse.then().assertThat().statusCode(201);

			//verify response body "Message" is paired with "Entry Created";
			//equalTo() method comes from static Hamcrest package -NEEd TO IMPORT MANUALLY
			//static org.hamcrest.Matchers
			createEmployeeResponse.then().assertThat().body("Message",equalTo("Entry Created"));
			//verify created
			createEmployeeResponse.then().assertThat().body("Employee[0].emp_firstname",equalTo("Syntaxxxx"));
			//verify server
			createEmployeeResponse.then().header("Server", "Apache/2.4.39 (Win64) PHP/7.2.18");
		}
	@Test
	public void bGETcreateEmployee() {
		//Preparing request to get created employee
		RequestSpecification getCreateEmployeeRequest = given().header("Authorization",token).header("Content-Type", "application/json").header("Authorization",token).queryParam("employee_id", employeeID);
		
		//Storing response for retrieving created employee
		Response getCreatedEmployeeResponse = getCreateEmployeeRequest.when().get("/getOneEmployee.php");
		//to print
		//getCreatedEmployeeResponse.prettyPrint();
		//storing response employeeID into empID compare with static global employee ID
		String empID = getCreatedEmployeeResponse.body().jsonPath().getString("employee[0].employee_id");
		
		//COMPARING EMPid with stored employeeID from created employee call
		boolean veryfingEmployeeID = empID.contentEquals(employeeID);
		
		//Asserting to verify the above condition is true
		Assert.assertTrue(veryfingEmployeeID);
		
		//verifying status code is 200
		getCreatedEmployeeResponse.then().assertThat().statusCode(200);
		
		//Storing full response as a string so that we are able to pass it as an argument with JsonPath
		String response =getCreatedEmployeeResponse.asString();
		
		//Created object of JsonPath
		JsonPath js = new JsonPath(response);
		
		//Grabbing employee ID using 'js'
		String employeeId = js.getString("employee[0].employee_id");
		String firstname = js.getString("employee[0].emp_firstname");
		String middlename = js.getString("employee[0].emp_middle_name");
		String lastname = js.getString("employee[0].emp_lastname");
		String birthday = js.getString("employee[0].emp_birthday");
		String emp_gender = js.getString("employee[0].emp_gender");
		String emp_JobTitle = js.getString("employee[0].emp_job_title");
		String emp_status = js.getString("employee[0].emp_status");
		
		
		//Asserting response employee ID matches stored employeee
		//Assert.assertTrue(employeeId.contentEquals(employeeID));
		
//		Assert.assertEquals(firstname, "Syntaxxxx");
//		Assert.assertEquals(middlename, "Seven");
//		Assert.assertEquals(lastname, "Batch");
//		Assert.assertEquals(birthday, "2009-10-11");
//		Assert.assertEquals(emp_gender, "Male");
//		Assert.assertEquals(emp_JobTitle, "QA Tester");
//		Assert.assertEquals(emp_status, "Zero hours contract");
		
		
	}
	@Test
	public void cGETallEmployees() {
		//Preparing request to get all employees
		RequestSpecification getAllEmployeesRequest = given().header("Content-Type", "application/json").header("Authorization",token);
		//Storing response into getAllEmployees
		Response getAllEmployeesResponse = getAllEmployeesRequest.when().get("/getAllEmployees.php");
		
		//printing response
		//getAllEmployeesResponse.prettyPrint();
		
		//Storing response as a String
		String response = getAllEmployeesResponse.asString();
		
		//Creating the object of JsonPath and passing response as a String as an argument
		JsonPath js = new JsonPath(response);
		
		//Retrieving the size of the array (the number of object in the array
		int count = js.getInt("Employees.size()");
		//System.out.println(count);
		
//		for(int i= 0;i<count; i++) {
//			String allEmployeeIDs = js.getString("Employees[" + i + "].employee_id");
//			//System.out.println(allEmployeeIDs);
//			
//			if(allEmployeeIDs.contentEquals(employeeID)) {
//				System.out.println("Employee ID: "+ employeeID +" is present in the body");
//				String firstNameOfEmpID=  js.getString("Employees[" + "i" + "].emp_firstname");
//				//System.out.println(firstNameOfEmpID);
//				break;
//				
//			}	
		}
		
		//for loop to print out first names of all employees
		
//		for(int i= 0; i<count; i++) {
//			String allFirstNames = js.getString("Employees[" + i + "].emp_firstname");
//			System.out.println(allFirstNames);
//		
//	}
	
		@Test
		public void dPUTupdateCreatedEmployee() {
			RequestSpecification putUpdatedEmployeesRequest = given().header("Content-Type", "application/json").header("Authorization",token).body("{\n" + 
					"  \"employee_id\": \""+employeeID+"\",\n" + 
					"  \"emp_firstname\": \"Syntax\",\n" + 
					"  \"emp_lastname\": \"Syn\",\n" + 
					"  \"emp_middle_name\": \"Sy\",\n" + 
					"  \"emp_gender\": \"M\",\n" + 
					"  \"emp_birthday\": \"2021-10-17\",\n" + 
					"  \"emp_status\": \"Super Contractor\",\n" + 
					"  \"emp_job_title\": \"Jr Sales Manager\"\n" + 
					"}").log().all();
			Response putUpdatedEmployeesResponse = putUpdatedEmployeesRequest.when().put("/updateEmployee.php");
			putUpdatedEmployeesResponse.prettyPrint();
			
			String response =putUpdatedEmployeesResponse.asString();
			
			JsonPath js = new JsonPath(response);
			
			String employeeId = js.getString("employee[0].employee_id");
			String firstname = js.getString("employee[0].emp_firstname");
			String middlename = js.getString("employee[0].emp_middle_name");
			String lastname = js.getString("employee[0].emp_lastname");
			String birthday = js.getString("employee[0].emp_birthday");
			String emp_gender = js.getString("employee[0].emp_gender");
			String emp_JobTitle = js.getString("employee[0].emp_job_title");
			String emp_status = js.getString("employee[0].emp_status");
			
			Assert.assertTrue(employeeId.contentEquals(employeeID));
			Assert.assertEquals(firstname, "Syntax");
			Assert.assertEquals(middlename, "Sy");
			Assert.assertEquals(lastname, "Syn");
			Assert.assertEquals(birthday, "2021-10-17");
			Assert.assertEquals(emp_gender, "Male");
			Assert.assertEquals(emp_JobTitle, "Jr Sales Manager");
			Assert.assertEquals(emp_status, "Super Contractor");
			
			
		}

}