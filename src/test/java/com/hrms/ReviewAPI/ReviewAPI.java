package com.hrms.ReviewAPI;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;

import static org.hamcrest.Matchers.equalTo;

import com.hrms.API.Final.steps.GenerateTokenSteps;
import com.hrms.utils.APICommonMethods;
import com.hrms.utils.APIConstants;
import com.hrms.utils.APIPayloadCommonMethods;
import com.hrms.utils.CommonMethods;
public class ReviewAPI extends CommonMethods{

	String baseURI = RestAssured.baseURI = "http://http://3.237.189.167/syntaxapi/api";
	String token;
	RequestSpecification Request;
	Response response;
	String employee_ID;
	RequestSpecification getCreatedEmployeeReq;
	Response createdEmployeeRes;
	

//@Given("a JWT is generated")
//public void a_JWT_is_generated() {
// RequestSpecification generateTokenRequest = given().header("Content-Type","Application/json").body("{\n" + 
// 		"  \"name\": \"studentG\",\n" + 
// 		"  \"email\": \"studentG@gmail.com\",\n" + 
// 		"  \"password\": \"studentG123\"\n" + 
// 		"}");
//		 
//		 Response generateTokenResponse = generateTokenRequest.when().post("/generateToken.php");
//		 generateTokenResponse.prettyPrint();
//		 
//		 
//		 token = "Bearer "+generateTokenResponse.jsonPath().getString("token");
//		 System.out.println(token);
//}

@Given("a request is prepared to create an employee")
public void a_request_is_prepared_to_create_an_employee() {
	Request = given().header("Authorization", GenerateTokenSteps.token).header("Content-Type","application/json").body( "{\n" + 
			"  \"emp_firstname\": \"Syn\",\n" + 
			"  \"emp_lastname\": \"Bat\",\n" + 
			"  \"emp_middle_name\": \"Eight\",\n" + 
			"  \"emp_gender\": \"F\",\n" + 
			"  \"emp_birthday\": \"2010-10-11\",\n" + 
			"  \"emp_status\": \"Zero hours contract\",\n" + 
			"  \"emp_job_title\": \"QA Tester\"\n" + 
			"}");
	
	//Request = given().header("Authorization", GenerateTokenSteps.token).header("Content-Type","application/json").body(APIPayloadCommonMethods.createEmployeeBody());
	

}

@When("a POST call is made to create an Employee")
public void a_POST_call_is_made_to_create_an_Employee() {
  //response= Request.when().post("/createEmployee.php");
  response= Request.when().post(APIConstants.CREATE_EMPLOYEE_URI);
  response.prettyPrint();
}

@Then("the status code should be {int}")
public void the_status_code_should_be(int status_code) {
   response.then().assertThat().statusCode(status_code);
}

@Then("the employee created contains key {string} and the value {string}")
public void the_employee_created_contains_key_and_the_value(String key, String value) {
   response.then().assertThat().body(key, equalTo(value));
}

@Then("the employee_id {string} is being stored as a global variable")
public void the_employee_id_is_being_stored_as_a_global_variable(String employeeID) {
   employee_ID= response.jsonPath().getString(employeeID);


}
/////////////////////////////////////////////////////////SCENARIO 2//////////////////////////



@Given("a request is ready to get the created employee")
public void a_request_is_ready_to_get_the_created_employee() {
    getCreatedEmployeeReq = given().header("Content-type","application/json").header("Authorization",GenerateTokenSteps.token);
	//getCreatedEmployeeReq = APICommonMethods.getOneEmployeeRequest(GenerateTokenSteps.token, employee_ID);
}


@When("a GET call is made to retrieve the created employee")
public void a_GET_call_is_made_to_retrieve_the_created_employee() {
     createdEmployeeRes= getCreatedEmployeeReq.when().get(APIConstants.GET_ONE_EMPLOYEE_URI);
}

@Then("status code should be {int}")
public void status_code_should_be(int status_code) {
   createdEmployeeRes.then().assertThat().statusCode(status_code);
}

@Then("the retrived EmployeeID {string} matches the globally stored EmployeeID")
public void the_retrived_EmployeeID_matches_the_globally_stored_EmployeeID(String retrievedEmpID) {
	String Employee_ID = createdEmployeeRes.jsonPath().getString(retrievedEmpID);
	createdEmployeeRes.then().assertThat().body(Employee_ID, equalTo(employee_ID));
	
	}
}

