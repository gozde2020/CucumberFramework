package com.hrms.API.Final.steps;

import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

import com.hrms.utils.APIConstants;

public class GenerateTokenSteps {
	
	//String BaseURI  = RestAssured.baseURI= "http://18.232.148.34/syntaxapi/api";
	static String token;
	
	@Given("a JWT is generated")
	public void a_JWT_is_generated() {
		//preparing request to generate token
	RequestSpecification generateTokenRequest = given().header("Content-Type","application/json").body("{\n" + 
			"  \"email\": \"studentGoz@gmail.com\",\n" + 
			"  \"password\": \"studentGoz123\"\n" + 
			"}");  
	//storing response into generate Token response
	Response generateTokenResponse=generateTokenRequest.when().post(APIConstants.GENERATE_TOKEN_URI);
	//optional to print response
	generateTokenResponse.prettyPrint();
	
	//Storing token as a static global variable that will be used for other calls
	token = "Bearer "+generateTokenResponse.jsonPath().getString("token");
	
	}
}
