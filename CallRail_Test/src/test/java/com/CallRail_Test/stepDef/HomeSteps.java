package com.CallRail_Test.stepDef;

import com.CallRail_Test.pages.HomePage;
import com.CallRail_Test.utils.BaseClass;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class HomeSteps extends BaseClass{
	
	HomePage home = new HomePage(getWebDriver());
	
	@Then("^verify user is on homepage$")
	public void verify_user_is_on_homepage() throws Throwable {
		home.verifyHomePage();
	}

	@When("user clicks on Users tab under admin and user management menu")
	public void user_clicks_on_User_tab_under_admin_and_user_management_menu() {
		home.userClickUsersTab();
	}
	
}