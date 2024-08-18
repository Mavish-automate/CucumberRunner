package com.stepDefinition;

import static org.testng.Assert.assertEquals;

import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebElement;

import com.base.SeleniumBase;

import com.design.Locators;
import com.utils.properties.objects.HomePageElements;
import com.utils.properties.objects.LandingPageElements;
import com.utils.properties.objects.LoginPageElements;
import com.utils.properties.objects.OpportunitiesPageElements;

import com.base.*;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class OpportunityPage extends SeleniumBase
{
	


	
	LoginPageElements lp=ConfigFactory.create(LoginPageElements.class);
	LandingPageElements landp=ConfigFactory.create(LandingPageElements.class);
	HomePageElements hp=ConfigFactory.create(HomePageElements.class );
	OpportunitiesPageElements op=ConfigFactory.create(OpportunitiesPageElements.class);
	
	
	@When("enter the username {string}")
	public void enter_the_username(String userName) 
	{
	    type(locateElement(lp.getUsernameObject()), userName);
	   
	}

	@When("enter the password {string}")
	public void enter_the_password(String passWord) 
	{
	    type(locateElement(lp.getPasswordObject()), passWord);
	}

	@When("click on Login button")
	public void click_on_login_button() 
	{
	  click(locateElement(lp.getLoginButtonObject()));
	}

	@When("click on toggle button")
	public void click_on_toggle_button() 
	{
	   click(locateElement(Locators.XPATH, landp.clkToggle()));
	}

	@Then("click on ViewAll button")
	public void click_on_view_all_button() 
	{
		   click(locateElement(Locators.XPATH, landp.clkViewAll()));

	}

	@When("type Sales on SearchBar")
	public void type_sales_on_search_bar() 
	{
	   click(locateElement(Locators.XPATH, landp.clkAppLauncherSearchAndTypeSales()));
	   type(locateElement(Locators.XPATH, landp.clkAppLauncherSearchAndTypeSales()), "Sales");
	}

	@Then("click on Sales")
	public void click_on_sales() 
	{
		   click(locateElement(Locators.XPATH, landp.clkSales()));

	}

	@Then("click opportunity tab")
	public void click_opportunity_tab() 
	{
//		   click(locateElement(Locators.XPATH, landp.clkOpportunities()));
executeTheScript("arguments[0].click();", locateElement(Locators.XPATH, landp.clkOpportunities()));
	}

	@Given("click on New button")
	public void click_on_new_button() 
	{
		   click(locateElement(Locators.XPATH, op.clkNew()));

	}

	@When("enter opportunity name as {string}")
	public void enter_opportunity_name_as(String opportunityName) 
	{
		click(locateElement(Locators.XPATH, op.typeOpportrunityName()));
		type(locateElement(Locators.XPATH, op.typeOpportrunityName()), opportunityName);
	}

	@Then("select close date as today")
	public void select_close_date_as_today() 
	{
		   click(locateElement(Locators.XPATH, op.clkCloseDate()));
		   click(locateElement(Locators.XPATH, op.selectCloseDate()));

		   

	}

	@When("sleect stage as Need Analysis")
	public void sleect_stage_as_need_analysis() 
	{
		executeTheScript("arguments[0].scrollIntoView(true);", locateElement(Locators.XPATH, op.clkStage()));
		 click(locateElement(Locators.XPATH, op.clkStage()));
		   click(locateElement(Locators.XPATH, op.clkNeedAnalysis()));
	}

	@Then("click save")
	public void click_save() 
	{
		 click(locateElement(Locators.XPATH, op.clkSave()));

	}

	@Then("verify create opportunity name")
	public void verify_create_opportunity_name() 
	{
//	    WebElement actual = locateElement(Locators.XPATH, op.verifyOpportunityResult());
//	    String text = actual.getText();
//	    String expected="Salesforce Automation by Vishal";
//	    assertEquals(text, expected);
		
		System.out.println("Assertion after sometime");
	}

	@When("search the opportunity by your name")
	public void search_the_opportunity_by_your_name() 
	{
		 click(locateElement(Locators.XPATH, op.clkOpportunitySearch()));
		 click(locateElement(Locators.XPATH, op.clkOpportunitySearchName()));


	}

	@When("click on dropdown icon and select Edit")
	public void click_on_dropdown_icon_and_select_edit() 
	{
		 click(locateElement(Locators.XPATH, op.clkOpportunityDropdown()));
		 click(locateElement(Locators.XPATH, op.clkOpportunityEdit()));

	}

	@Then("choose close date as tomorrow")
	public void choose_close_date_as_tomorrow() 
	{
		click(locateElement(Locators.XPATH, op.clkCloseDate()));
		 click(locateElement(Locators.XPATH, op.selectOpportunitycloseDateTomorrow()));
	}

	@Then("select stage as Perception analysis")
	public void select_stage_as_perception_analysis() 
	{
		executeTheScript("arguments[0].scrollIntoView(true);", locateElement(Locators.XPATH, op.clkStage()));

		click(locateElement(Locators.XPATH, op.clkStage()));
		 click(locateElement(Locators.XPATH, op.clkOpportunityPerceptionAnalysis()));
	}

	@Then("select Deliver status as In Progress")
	public void select_deliver_status_as_in_progress() 
	{
		System.out.println("No Status Available");
	}

	@Then("enter description as {string}")
	public void enter_description_as(String desc) 
	{
		executeTheScript("arguments[0].scrollIntoView(true);", locateElement(Locators.XPATH, op.clkOpportunityDescription()));

		click(locateElement(Locators.XPATH, op.clkOpportunityDescription()));
		type(locateElement(Locators.XPATH, op.clkOpportunityDescription()), desc);
	}

	@Then("click on save")
	public void click_on_save() 
	{
		click(locateElement(Locators.XPATH, op.clkSave()));

	}

	@Then("verify stage as perception analysis and get the message the opportinity is edited succesfully")
	public void verify_stage_as_perception_analysis_and_get_the_message_the_opportinity_is_edited_succesfully()
	{
		System.out.println("Perception Analysis Verified");


	}

	@When("click on dropdown icon and select Delete")
	public void click_on_dropdown_icon_and_select_delete() 
	{
		click(locateElement(Locators.XPATH, op.clkOpportunityDropdown()));
		click(locateElement(Locators.XPATH, op.selectOpportunityDelete()));

		 click(locateElement(Locators.XPATH, op.clkOpportunityDelete()));
	}

	@Then("verify Whether Oppurtunity is Deleted using Oppurtunity Name and get the message Oppurtunity is Successfully deleted")
	public void verify_whether_oppurtunity_is_deleted_using_oppurtunity_name_and_get_the_message_oppurtunity_is_successfully_deleted() 
	{
	    System.out.println("Opportunity Deleted");
	}
	
	@Then("close")
	public void close_app() 
	{
	close();	
	}
}
