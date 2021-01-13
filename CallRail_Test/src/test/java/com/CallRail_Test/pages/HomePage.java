package com.CallRail_Test.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CallRail_Test.utils.CommonMethods;


public class HomePage extends CommonMethods{
	@FindBy(id = "menu_admin_viewAdminModule")
	public WebElement adminMenu;

	@FindBy(id = "menu_pim_viewPimModule")
	public WebElement pimMenu;

	@FindBy(id = "menu_leave_viewLeaveModule")
	public WebElement leaveMenu;

	@FindBy(id = "menu_time_viewTimeModule")
	public WebElement timeMenu;
	
	@FindBy(id = "menu_admin_UserManagement")
	WebElement userManagementMenu;

	@FindBy(id = "menu_admin_viewSystemUsers")
	WebElement usersMenu;
	
	public HomePage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}
	
	public void verifyHomePage() {
		waitForElementToPresent(adminMenu);
		Assert.assertTrue("Admin menu is not present on home page", adminMenu.isDisplayed());
		Assert.assertTrue("Pim menu is not present on home page", pimMenu.isDisplayed());
	}
	
	public void userClickUsersTab() {
		CommonMethods.waitForElementToBeClickable(adminMenu);
		Actions action = new Actions(getWebDriver());
		action.moveToElement(adminMenu).moveToElement(userManagementMenu).click(usersMenu).build()
				.perform();
	}
	
}
