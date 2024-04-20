package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Namelocators3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       System.setProperty("webdriver.chrome.driver", "E:\\Automation Testing\\software\\chrome\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/facebook.html");
		
	WebElement username=	driver.findElement(By.name("email"));
	WebElement password=	driver.findElement(By.name("pass"));
	
	username.sendKeys("snehalgawand");
	password.sendKeys("snehal123");
	
	
	

	}

}
