package com.TestNGChallenge;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTesting {
	WebDriver driver;
@BeforeMethod
	public void getOpenBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
@AfterMethod
	public void getCloseBrowser() {
		driver.quit();
	}
@Test
	public void getLogin() {
	driver.get("https://www.automationexercise.com/login");	
	driver.manage().window().maximize();
	}
}
