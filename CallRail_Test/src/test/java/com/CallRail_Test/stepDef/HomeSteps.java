package com.CallRail_Test.stepDef;

import com.CallRail_Test.pages.HomePage;
import com.CallRail_Test.utils.BaseClass;

import cucumber.api.java.en.Then;

public class HomeSteps extends BaseClass{
	
	HomePage home = new HomePage(getWebDriver());
	
	@Then("^verify user is on homepage$")
	public void verify_user_is_on_homepage() throws Throwable {
		home.verifyHomePage();
	}
	
}