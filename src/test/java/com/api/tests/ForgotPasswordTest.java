package com.api.tests;

import org.testng.annotations.Test;

import com.api.base.AuthService;

import io.restassured.response.Response;

public class ForgotPasswordTest {

	@Test(description = "Verify if forgot password is working")
	public void forgotPassword() {
		AuthService authService = new AuthService();
		Response response = authService.forgotPassword("khanuzair54670@gmail.com");
		System.out.println(response.asPrettyString());
	}
}
