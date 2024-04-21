package com.PracticeTask;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class YahooSignInCheckBox {

	WebDriver driver=new ChromeDriver();

	@Test
	public void CheckBox() {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver.manage().window().maximize();      //using manage method to maximize the window
		driver.get("https://login.yahoo.com/");  // launch the url

		//locate the checkbox element
		WebElement SignInCheckBox = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div[2]/form/div[3]/div[1]/span/label"));
		driver.findElement(By.name("username")).sendKeys("apeksha123@gmail.com");
		
		// 1.using click() method
		//SignInCheckBox .click();

		//2.using javascriptExcecuter
		//1 way
		JavascriptExecutor js= (JavascriptExecutor) driver;
		//js.executeScript("document.getElementById('persistent').click()");
		
		//2 way
		//WebElement checkbox = driver.findElement(By.xpath("//input[@id='persistent']"));
		js.executeScript("arguments[0].click()",SignInCheckBox);
		
		//3.using Action class
		//Actions actions=new Actions(driver);
		//1 way
		//actions.click(SignInCheckBox).build().perform();
		
		//2 way
		//actions.moveToElement(SignInCheckBox).click().perform();
		
		//3 way
		//actions.sendKeys(SignInCheckBox,Keys.RETURN).perform();
		
		//4 way
		//actions.clickAndHold(SignInCheckBox).release().perform();
		
		//4.using isSelected method
		/*if (!SignInCheckBox.isSelected()) 
		{
			SignInCheckBox.click();
		}*/
		
		// using WebDriverWait
		
		/* new WebDriverWait(driver,50).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div[2]/form/div[3]"
		 		+ "/div[1]/span/label"))); */
		//driver.close();
		
}

}
