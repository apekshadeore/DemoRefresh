package com.PracticeTask;

import javax.xml.crypto.KeySelector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RefreshCommand {

	WebDriver driver= new ChromeDriver();

	@Test
	public void RefreshPage() {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver.get("https://login.yahoo.com/");
		driver.manage().window().maximize();

		//using navigate.refresh method
		driver.navigate().refresh();

		//using get method
		//driver.get(driver.getCurrentUrl());

		//using navigate method
		//driver.navigate().to(driver.getCurrentUrl());


		//using F5 keys
		//WebElement username = driver.findElement(By.name("username"));
		//username .sendKeys(Keys.F5);

		driver.close();
	}

}
