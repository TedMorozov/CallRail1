package com.CallRail_Test.stepDef;


import com.CallRail_Test.pages.AddUserPage;
import com.CallRail_Test.utils.BaseClass;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddUserStep extends BaseClass {
	
	AddUserPage addUserPage = new AddUserPage(getWebDriver());

	@Then("verify add users page is displayed")
	public void verify_add_user_page_is_displayed() {
		addUserPage.verifyAddUserPage();
	}

	@When("user fill required details")
	public void user_fill_required_details() {
		addUserPage.fillDetails();
	}

	@When("click on save button")
	public void click_on_save_button() {
		addUserPage.clickOnSaveBtn();
	}

}
