package com.hrms.API.steps.practice;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class DeleteEmployee {
	String baseURI = RestAssured.baseURI = "http://3.237.189.167/syntaxapi/api";
	String token= "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE2MTE1MDU2NTQsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTYxMTU0ODg1NCwidXNlcklkIjoiMTI4OSJ9.wMTT0du1H4FYfHg_gcDb1ZXZNgKAz1va_uNyYPbfnIQ";
	static String employeeID;
	

	@Test
	public void deleteEmployee() {
	RequestSpecification prepareDeleteEmployee = given().header("Authorization",token).header("Content-Type", "application/json").queryParam("employee_id","13294A").log().all(); 
	
	Response deleteResponse = prepareDeleteEmployee.when().delete("/deleteEmployee.php");
	System.out.println("First print preety one "+deleteResponse);
	deleteResponse.prettyPrint();
//	deleteResponse.then().assertThat().statusCode(201);
//	deleteResponse.then().assertThat().body("message", equalTo("Entry deleted"));
//	deleteResponse.then().assertThat().body("employee[0].emp_firstname",equalTo("Mister"));
	
	}
}
