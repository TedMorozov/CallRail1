package com.CallRail_Test.stepDef;


import com.CallRail_Test.pages.UserListingPage;
import com.CallRail_Test.utils.BaseClass;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class UserListingStep extends BaseClass {

	UserListingPage userListingPage = new UserListingPage(getWebDriver());

	@Then("verify user is on users listing page")
	public void verify_user_is_on_system_users_page() {
		userListingPage.verifyUserListingPage();
	}

	@When("user clicks on add button")
	public void user_clicks_on_add_button() {
		userListingPage.clickOnAddBtn();
	}

	@Then("verify success message is displayed")
	public void verify_success_message_is_displayed() {
		userListingPage.verifySuccessMsg();
	}
	
	
}
