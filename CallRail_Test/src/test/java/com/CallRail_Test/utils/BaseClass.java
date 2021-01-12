package com.CallRail_Test.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	private static WebDriver webDriver;

	public static WebDriver getWebDriver() {
		return webDriver;
	}

	public static void setUp() {
		ConfigsReader.readProperties(Constants.CONFIGFILEPATH);
		
		System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");

		webDriver = new ChromeDriver();

		webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		webDriver.manage().window().maximize();

		webDriver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
	}

	public static void tearDown()  {
		
		try {
			webDriver.close();
		} catch (Exception e) {
			System.out.println("Browser was unable to close: " + e.getMessage());
		}
		try {
			webDriver.quit();
		} catch (NoSuchSessionException e) {
			System.out.println("Browser was already exited.");
		} catch (Exception ex) {
			System.out.println("Browser was unable to Quit: " + ex.getMessage());
		}
	}

}
