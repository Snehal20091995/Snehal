package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "E:\\Automation Testing\\software\\chrome\\chromedriver.exe");
			
			WebDriver driver =new ChromeDriver();
			
			driver.get("https://demo.guru99.com/test/newtours/register.php");
			WebElement country=driver.findElement(By.name("country"));
			Select select=new Select(country);
			
			//1.select by visible text
			//select.selectByVisibleText("BRAZIL");
			
			//2.select by value text
			//select.selectByValue("CHINA");
			
			//3.select by index 
			select.selectByIndex(5);
	}

}
