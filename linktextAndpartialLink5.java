package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linktextAndpartialLink5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    System.setProperty("webdriver.chrome.driver", "E:\\Automation Testing\\software\\chrome\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/facebook.html");
		
		//1.link text=  use full link
		
//		WebElement forgot=driver.findElement(By.linkText("Forgot your password?"));
//		forgot.click();
		
		
		//2.partial link use only any specific words
		
		WebElement forgot=driver.findElement(By.partialLinkText("Forgot"));
		forgot.click();
		
		
		

	}

}
