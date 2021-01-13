package com.CallRail_Test.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CallRail_Test.utils.CommonMethods;


public class AddUserPage extends BasePage{
	@FindBy(id = "UserHeading")
	WebElement addUserPageHeading;

	@FindBy(id = "btnSave")
	WebElement saveBtn;

	@FindBy(id = "systemUser_employeeName_empName")
	WebElement employeeNameInput;

	@FindBy(id = "systemUser_userName")//systemUser_userName
	WebElement userNameInput;

	@FindBy(id = "systemUser_password")
	WebElement passwordInput;

	@FindBy(id = "systemUser_confirmPassword")
	WebElement confirmPasswordInput;

	@FindBy(xpath = "//span[@for='systemUser_userName']")
	WebElement invalidUsernameError;

	public AddUserPage(WebDriver webDriver) {
		driver = webDriver;
		PageFactory.initElements(webDriver, this);
	}

	
	public void verifyAddUserPage() {
		CommonMethods.waitForElementToBePresent(addUserPageHeading);
		Assert.assertTrue("Add User page is not loaded", CommonMethods.isDisplayed(addUserPageHeading));
	}

	public void fillDetails() {
		employeeNameInput.sendKeys("John Smith");
		userNameInput.sendKeys("Test974442353");
		passwordInput.sendKeys("Test@183");
		confirmPasswordInput.sendKeys("Test@183");
	}
	
	
	public void clickOnSaveBtn() {
		CommonMethods.waitForElementToBeClickable(saveBtn);
		saveBtn.click();
	}

}
