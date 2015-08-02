package com.chase.web.qa.selenium;

import java.io.File;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.chase.web.qa.utils.BrowserConfig;

public class UIActionHelper {

	private WebDriver webDriver;
	private BrowserConfig browserConfig;
	
	public UIActionHelper() {
		browserConfig = new BrowserConfig();
		this.webDriver = new FirefoxDriver(new FirefoxBinary(new File(browserConfig.getProperty("firefox.location"))), new FirefoxProfile());
	}
	
	
	
	public void get(String url) {
		this.webDriver.get(url);
		this.webDriver.manage().window().maximize();
	}
	
	public void quitWebDriver() {
		this.webDriver.quit();
	}
	
	public void selectCheckBoxById(String id) {
		WebElement checkbox = this.webDriver.findElement(By.id(id));
		if(!checkbox.isSelected()) {
			checkbox.click();
		}
	}
	
	public void clickOnButton(String button) {
		this.webDriver.findElement(By.xpath(button)).click();
	}
	
	public void typeInputById(String input, String id) {
		this.webDriver.findElement(By.id(id)).sendKeys(input);
	}
	
	public void waitForElementByLinkTextAndClick(String linkText) {
		System.out.println(linkText);
		waitForElementByLinkTextToClick(linkText);
		this.webDriver.findElement(By.linkText(linkText)).click();
	}
	
	public void waitForElementToBeVisible(By by) {
		WaitFactory.newFluentWait(this.webDriver).ignoring(NoSuchElementException.class).until(ExpectedConditions.visibilityOfElementLocated(by));
	}
	
	private void waitForElementByLinkTextToClick(String linkText) {
		WaitFactory.newFluentWait(this.webDriver).ignoring(NoSuchElementException.class).until(ExpectedConditions.elementToBeClickable(By.linkText(linkText)));
	}
	
	
	 
}
