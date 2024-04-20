package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Automation Testing\\software\\chrome\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		//to maximize the window we can use below code
		driver.manage().window().maximize();
		
		//to manimize the window we can use below code
		//driver.manage().window().minimize();
		
		//1.ALERT
//		WebElement button =driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button"));
//		
//		button.click();
//		//1. to get the text from alert box we will use get text method
//		String text=driver.switchTo().alert().getText();
//		System.out.println(text);
//		
//		//2. to accept the alert we can use accept method
//		driver.switchTo().alert().accept();
		
		//AlERT AND CANCEL
//		WebElement button=driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
//		button.click();
//		
//		WebElement button1=driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button"));
//		button1.click();
//		
//		//to dismiss the alert we can use dismiss method
//		driver.switchTo().alert().dismiss();
		
		//ALERT AND ENTER VALUE
		
		WebElement button=driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a"));
		button.click();
		
		WebElement button1=driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button"));
		button1.click();
		
		//4.to enter the text value in alert we can use sendkeys method
		
		driver.switchTo().alert().sendKeys("snehal123");
		driver.switchTo().alert().accept();
		

	}

}
