package com.chase.web.qa.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitFactory {

	public static FluentWait<WebDriver> newFluentWait(WebDriver driver) {
		
		FluentWait<WebDriver> fluentWait = new WebDriverWait(driver, 20);
		fluentWait.pollingEvery(500, TimeUnit.NANOSECONDS);
		return fluentWait;
	}
}
