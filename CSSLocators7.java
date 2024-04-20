package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocators7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver", "E:\\Automation Testing\\software\\chrome\\chromedriver.exe");
			
			WebDriver driver =new ChromeDriver();
			
			driver.get("https://demo.guru99.com/test/facebook.html");
			//5 types of css locators
			
//			//1. tag and class name in css locator
//			
//		WebElement username=	driver.findElement(By.cssSelector("input.inputtext"));
//			
//			//2. tag and id name in css locator
//		WebElement password=driver.findElement(By.cssSelector("input#pass"));
//		username.sendKeys("snehalgawand");
//		password.sendKeys("snehal123");
			
		//3. tag and attribute in css locator
			//for attribute [] use
		WebElement username=driver.findElement(By.cssSelector("input[type='text'][name='email']"));
		
		//4.tag,class and attributes in css locators
		
		WebElement password =driver.findElement(By.cssSelector("input.inputtext[type='password'][name='pass']"));
		
		username.sendKeys("snehalgawand");
		password.sendKeys("1234");
		
		//5. tag,id,and attributes in css locators
		
		WebElement login=driver.findElement(By.cssSelector("input#u_0_b[value='Log In'][type='submit']"));
		login.click();
		
		
			
			
			

	}

}
