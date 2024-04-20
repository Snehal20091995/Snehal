package com.testing;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleWindow20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver", "E:\\Automation Testing\\software\\chrome\\chromedriver.exe");
			
			WebDriver driver =new ChromeDriver();
			
			driver.get("https://demo.automationtesting.in/Windows.html");
			driver.manage().window().maximize();
			
			//getwindowhandle method will store the unique session id of opened window
		String parentSessionId=	driver.getWindowHandle();
		System.out.println(parentSessionId);
		
		WebElement button=driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button"));
		button.click();
		
		//it will store the all the opened window after clicking on button
		Set<String> childWindow=driver.getWindowHandles();
		Iterator<String> i=childWindow.iterator();
		while(i.hasNext())
		{
			String childWindow1=i.next();
			System.out.println(childWindow1);
			if(!parentSessionId.equalsIgnoreCase(childWindow1))
			{
				driver.switchTo().window(childWindow1);
				WebElement download=driver.findElement(By.linkText("Downloads"));
				download.click();
				driver.close();
			}
		}
		//switch to parent window
		driver.switchTo().window(parentSessionId);

	}

}
