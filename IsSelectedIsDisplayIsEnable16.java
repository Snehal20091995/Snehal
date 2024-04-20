package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedIsDisplayIsEnable16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver", "E:\\Automation Testing\\software\\chrome\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/facebook.html");
		
		WebElement username=driver.findElement(By.id("email"));
		WebElement pass=driver.findElement(By.id("pass"));
		
//	boolean result1=	username.isDisplayed();
//	boolean result2=	username.isEnabled();
//	
//	System.out.println(result1);
//	System.out.println(result2);
//	
	
//	boolean result3=pass.isDisplayed();
//	boolean result4=pass.isEnabled();
//	
//	System.out.println(result3);
//	System.out.println(result4);
//	
		//is  display methods use to validate element is present or not
		//is  enable methods use to validate element is enable or disable
		if(username.isDisplayed() && username.isEnabled())
		{
			username.sendKeys("snehal");
		}
		else
		{
			System.out.println("username not display");
		}
		if(pass.isDisplayed() && pass.isEnabled())
		{
			pass.sendKeys("snehal");
		}
		else
		{
			System.out.println("password not display");
		}
		
		//is selected methods use to validate checkbox or radio button  is already selected or not
		
		WebElement checkbox=driver.findElement(By.id("persist_box"));
		boolean result5=checkbox.isSelected();
		System.out.println(result5);
		

	}

}
