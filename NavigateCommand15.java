package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommand15 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Automation Testing\\software\\chrome\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		//1.open the url we use navigate.to method
		// navigate.to use for backword and forword open url 
		//get methos only use for forword open
		driver.navigate().to("https://demo.guru99.com/test/newtours/register.php");
       //2.refresh the page
		driver.navigate().refresh();
		
		//3.to redirect on one step back
		WebElement flight=driver.findElement(By.linkText("Flights"));
		flight.click();
		
		Thread.sleep(2000);
		//driver.navigate().back();
		
		//4.to redirect on step forword
		driver.navigate().forward();
	}

}
