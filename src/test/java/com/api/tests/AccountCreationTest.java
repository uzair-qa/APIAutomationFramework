package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.SignUpRequest;

import io.restassured.response.Response;

public class AccountCreationTest {

	@Test(description = "Verify if Login API is working...")
	public void createAccountTest() {
		
		SignUpRequest signUpRequest = new SignUpRequest.Builder()
			.userName("disha54321")
			.email("disha54321@yahoo.com")
			.firstName("Disha")
			.password("disha1234")
			.lastName("Bhatt")
			.mobileNumber("7777777776")
			.build();
			
		AuthService authService = new AuthService();
		Response response = authService.signUp(signUpRequest);
		Assert.assertEquals(response.asPrettyString(), "User registered successfully!");
		Assert.assertEquals(response.statusCode(), 200);
	} 
}
