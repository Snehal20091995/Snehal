package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocator4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver", "E:\\Automation Testing\\software\\chrome\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/facebook.html");
		
		
		//classname take first reference value when both classname values are same
		WebElement username=	driver.findElement(By.className("inputtext"));
		WebElement password=	driver.findElement(By.className("inputtext"));
		
		username.sendKeys("snehal");
		password.sendKeys("snehal123");
		

	}

}
