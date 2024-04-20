package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS2Locator8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Automation Testing\\software\\chrome\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/facebook.html");
		
		//6.by using start with ...it will find the locators based on starting chara
		WebElement un=driver.findElement(By.cssSelector("input[name^='ema']"));
		un.sendKeys("snehal");
		
		//7.by using ends with ...it will find the locators based on ending chara
		WebElement pass=driver.findElement(By.cssSelector("input[type$='word']"));
		pass.sendKeys("snehal123");
		
		//8.by using contains .....it will find the locators based on character is present or not
		
		WebElement login=driver.findElement(By.cssSelector("input#u_0_b[type*='bm']"));
		login.click();

	}

}
