package com.stepDefinition;

import com.base.SeleniumBase;

import io.cucumber.java.Before;

public class CucumberHooks extends SeleniumBase
{
	@Before
	public void pre() 
	{
	startApp("https://login.salesforce.com/",false);
	}
}
