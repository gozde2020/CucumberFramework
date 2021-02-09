package com.hrms.ReviewAPI;

import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;


import io.restassured.specification.RequestSpecification;

public class GenerateTokenSteps {
	String baseURI = RestAssured.baseURI = "http://3.237.189.167/syntaxapi/api";
	static String token;
	@Given("a JWT is generated")
	public void a_JWT_is_generated() {
		RequestSpecification generateTokenRequest = given().header("Content-Type","Application/json").body("{\n" + 
				"  \"name\": \"studentGozgoz\",\n" + 
				"  \"email\": \"studentGozgoz@gmail.com\",\n" + 
				"  \"password\": \"studentGoz123\"\n" + 
				"}");
		   
		Response generateTokenResponse = generateTokenRequest.when().post("/generateToken.php");
		generateTokenResponse.prettyPrint();
		
		
		token="Bearer " +generateTokenResponse.jsonPath().getString("token");
		}

}
