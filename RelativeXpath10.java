package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
       System.setProperty("webdriver.chrome.driver", "E:\\Automation Testing\\software\\chrome\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/facebook.html");
		//1.using simple xpath method by using tag and attributs
		
//		WebElement username=driver.findElement(By.xpath("//input[@name='email']"));
//		WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
//		WebElement login=driver.findElement(By.xpath("//input[@value='Log In']"));
//		
		
		//2.using and condition
		
//		WebElement username=driver.findElement(By.xpath("//input[@type='text' and @id='email']"));
//		WebElement password=driver.findElement(By.xpath("//input[@tabindex='2' and @id='pass']"));
//		WebElement login=driver.findElement(By.xpath("//input[@value='Log In' and @tabindex='4']"));
//		
		
		//3.using or condition
		
//		WebElement username=driver.findElement(By.xpath("//input[@type='text' or @id='email']"));
//		WebElement password=driver.findElement(By.xpath("//input[@tabindex='2' or @id='pass']"));
//		WebElement login=driver.findElement(By.xpath("//input[@value='Log In' or @tabindex='4']"));
//		
		
		//4.using contains methods
//		WebElement username=driver.findElement(By.xpath("//input[contains(@type,'te')]"));
//		WebElement password=driver.findElement(By.xpath("//input[contains(@name,'pa')]"));
//		WebElement login=driver.findElement(By.xpath("//input[contains(@value,'Log')]"));
//		
		
		//5.using starts-with method
		
//		WebElement username=driver.findElement(By.xpath("//input[starts-with(@name,'em')]"));
//		WebElement password=driver.findElement(By.xpath("//input[starts-with(@type,'pas')]"));
//		WebElement login=driver.findElement(By.xpath("//input[starts-with(@value,'Log')]"));
//		
		
//		username.sendKeys("snehal");
//		password.sendKeys("9876");
//		login.click();
		
		//6.using  text method
		WebElement link=driver.findElement(By.xpath("//*[text()='Agile Project']"));
		link.click();
	}

}
