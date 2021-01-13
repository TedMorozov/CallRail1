package com.CallRail_Test.pages;

import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CallRail_Test.utils.CommonMethods;

public class UserListingPage extends BasePage{

	@FindBy(id = "searchBtn")
	WebElement searchBtn;

	@FindBy(id = "btnAdd")
	WebElement addBtn;

	@FindBy(xpath = "//div[@class='message success fadable']")
	WebElement successMsg;

	@FindBy(xpath = "//table[@id='resultTable']//tbody//tr")
	List<WebElement> listOfUsers;

	@FindBy(xpath = "//table[@id='resultTable']/thead/tr/th[@class='header']")
	List<WebElement> listOfColumn;

	public UserListingPage(WebDriver webDriver) {
		driver = webDriver;
		PageFactory.initElements(webDriver, this);
	}

	public void verifyUserListingPage() {
		CommonMethods.waitForElementToBePresent(searchBtn);
		Assert.assertTrue("User Listing page is not loaded", CommonMethods.isDisplayed(searchBtn));
		Assert.assertTrue("Add button is missing ono user listing page", CommonMethods.isDisplayed(addBtn));
	}

	public void clickOnAddBtn() {
		addBtn.click();
	}

	public void verifySuccessMsg() {
		Assert.assertTrue("Success message is missing on user listing page", CommonMethods.isDisplayed(successMsg));
	}

	
}
