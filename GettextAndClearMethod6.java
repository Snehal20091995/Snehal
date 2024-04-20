package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettextAndClearMethod6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver", "E:\\Automation Testing\\software\\chrome\\chromedriver.exe");
			
			WebDriver driver =new ChromeDriver();
			
			driver.get("https://demo.guru99.com/test/facebook.html");
			
			WebElement username=driver.findElement(By.id("email"));
			username.sendKeys("snehal");
			// to clear the populated text in textbox we need to use clear method
			username.clear();
			
			//to fetch the value of particular element
			WebElement text=driver.findElement(By.tagName("h1"));
			String value =text.getText();
			System.out.println(value);
			

	}

}
