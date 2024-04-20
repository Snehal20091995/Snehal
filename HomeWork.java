package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Automation Testing\\software\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		// by name
//	WebElement username =	driver.findElement(By.name("email"));
//	WebElement password=	driver.findElement(By.name("pass"));
//	WebElement login=   driver.findElement(By.name("login"));
	
		//by Id
//		WebElement username =	driver.findElement(By.id("email"));
//		WebElement password=	driver.findElement(By.id("pass"));
//		WebElement login=   driver.findElement(By.name("login"));
		
		//by class
		
//		WebElement username =	driver.findElement(By.className("inputtext"));
//		WebElement password=	driver.findElement(By.className("inputtext"));
//		WebElement login=   driver.findElement(By.className("_42ft"));
//		
		//CSS Selectors
		
		//1.tag and class
		
//		WebElement username =	driver.findElement(By.cssSelector("input.inputtext"));
//		WebElement password=	driver.findElement(By.cssSelector("input#pass"));
//		WebElement login=   driver.findElement(By.cssSelector("button[value='1']"));
		
		//tag and id
		
//		WebElement username =	driver.findElement(By.cssSelector("input#email"));
//		WebElement password=	driver.findElement(By.cssSelector("input#pass"));
//		WebElement login=   driver.findElement(By.cssSelector("button[value='1']"));
		
		//by tag and attributs
//		
//		WebElement username =	driver.findElement(By.cssSelector("input[type='text']"));
//		WebElement password=	driver.findElement(By.cssSelector("input[type='password']"));
//		WebElement login=   driver.findElement(By.cssSelector("button[value='1']"));
//		
		
		//by tag,class,and attributs
		
		
//		WebElement username =	driver.findElement(By.cssSelector("input.inputtext[type='text']"));
//		WebElement password=	driver.findElement(By.cssSelector("input.inputtext[type='password']"));
//		WebElement login=   driver.findElement(By.cssSelector("button._42ft[value='1']"));
//		
		
		//by tag ,id and atrributs
		WebElement username =	driver.findElement(By.cssSelector("input#email[type='text']"));
		WebElement password=	driver.findElement(By.cssSelector("input#pass[type='password']"));
		WebElement login=   driver.findElement(By.cssSelector("button[value='1']"));
		
	
	username.sendKeys("snehalgawand95@gmail.com");
	password.sendKeys("mynameissnehal");
	login.click();
	
	
	
	
		
		

	}

}
