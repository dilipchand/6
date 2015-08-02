package com.chase.web.qa.cuk.stepdefs;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;

import com.chase.web.qa.selenium.UIActionHelper;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class BranchATMSearchSteps {
	
	private UIActionHelper uiActionHelper;
	
	private static HashMap<String, String> objectMap = new HashMap<String, String>();
	
	static {
		objectMap.put("\"Chase ATM\"", "atm_locations");
		objectMap.put("\"Allow deposits\"", "allow_deposits");
		objectMap.put("Search Field", "fullAddress");
		objectMap.put("Bottom Search button", "//div[@id='searchbtn']/a[1]/img");
	}
	
	@Before
	public void setUp() {
		this.uiActionHelper =  new UIActionHelper();
	}
	
	@Given("^I have launched the (.*)$") 
	public void launch_app(String url) {
		this.uiActionHelper.get(url);
	}
	
	@Given("^I click on \"(.*)\"$")
	public void click_on_element(String element) {
		System.out.println(element);
		if(!"Bottom Search button".equals(element)) {
			this.uiActionHelper.waitForElementByLinkTextAndClick(element);
		} else {
			this.uiActionHelper.clickOnButton(objectMap.get(element));
		}
	}
	
	@Given("^the \"(.*)\" are visible$")
	public void is_element_visible(String element) {
		this.uiActionHelper.waitForElementToBeVisible(By.id("advancesectionslide"));
	}
	
	@Given("^I select the check box (.*)$")
	public void select_the_check_box(List<String> checkboxes) {
		for(String checkbox: checkboxes) {
			System.out.println(objectMap.get(checkbox));
			this.uiActionHelper.selectCheckBoxById(objectMap.get(checkbox));
		}
	}
	
	@Given("^I enter the (.*) in the \"(.*)\"$")
	public void enter_the_input(String input, String inputElement) {
		this.uiActionHelper.typeInputById(input, objectMap.get(inputElement));
	}
	
	@Given("^search page is opened with a \"Search Field\", \"Search Button\" and \"Advanced Search Option\"$")
	public void search_page_is_opend() {

	}
	
	@Then("^ATM & Branch search results are displayed$")
	public void assert_number_of_results() {
		this.uiActionHelper.waitForElementToBeVisible(By.id("mapaddress"));
	}
	
	@After
	public void scenarioTearDown() {
		try {
			Thread.sleep(10000);
		} catch (Exception e) {
			
		}
		this.uiActionHelper.quitWebDriver();
	}
}
