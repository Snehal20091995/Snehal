package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptexcuter32 {

	public static void main(String[] args) {
		
		
		
System.setProperty("webdriver.chrome.driver", "E:\\Automation Testing\\software\\chrome\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://demo.guru99.com/v4/index.php");
		driver.manage().window().maximize();
		
		//1.firstly we need to create reference variable of javascript EXECUTOR INTERFACE
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//2. in javascript executer interface we have 2 method executescript and executeAsynssript
		driver.findElement(By.name("uid")).sendKeys("snehal");
		driver.findElement(By.name("password")).sendKeys("snehal");
		
		WebElement login=driver.findElement(By.name("btnLogin"));
		//we will use below javasript to click on login button
		//js.executeScript("arguments[0].click();",login);
		//we will use below javascript to handle the alert
		//js.executeScript("alert('user or Password is not valid');");
		
		
		//we will use below script to get all the details of webpage like title,url
//		String domainName=js.executeScript("return document.domain;").toString();
//		System.out.println(domainName);
//		
//		String title=js.executeScript("return document.title;").toString();
//		System.out.println(title);
//		
//		String url=js.executeScript("return document.URL;").toString();
//		System.out.println(url);
//		
		//we will open new url
		//js.executeScript("window.location='https://demo.guru99.com/test/facebook.html'");
		
		
		
		

	}

}
