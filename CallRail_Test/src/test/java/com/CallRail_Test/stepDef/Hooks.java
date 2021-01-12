package com.CallRail_Test.stepDef;

import com.CallRail_Test.utils.BaseClass;
import com.CallRail_Test.utils.ConfigsReader;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	@Before
	public void setUp() {
		ConfigsReader.readProperties("src/test/resources/configs/credentials.properties");
		BaseClass.setUp();
	}

	@After
	public void tearDown() {
		BaseClass.tearDown();
	}

}
