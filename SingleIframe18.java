package com.testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleIframe18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "E:\\Automation Testing\\software\\chrome\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		driver.manage().window().maximize();
		
		// to fetch the no of iframe we will get the size of iframe
		
	List<WebElement> noofFrame=driver.findElements(By.tagName("iframe"));
	int size=noofFrame.size();
	System.out.println(size);
	
	//1.switch by index
	//driver.switchTo().frame(0);
	
	//2.switch by id
	//driver.switchTo().frame("singleframe");
	
	//3.switch by name
		driver.switchTo().frame("SingleFrame");
	
	WebElement text=driver.findElement(By.xpath("/html/body/section/div/div/div/input"));
	text.sendKeys("snehal");
		
		

	}

}
