package com.testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class CheckboxExample11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver", "E:\\Automation Testing\\software\\chrome\\chromedriver.exe");
			
			WebDriver driver =new ChromeDriver();
			
			driver.get("https://demo.automationtesting.in/Register.html");
			
			//to click on the single checkbox we need to find out the element and need to click it
			
//			WebElement checkbox1=driver.findElement(By.id("checkbox1"));
//			checkbox1.click();
			
			//to check the checkbox is already selected or not we need to use below logic
//			if(checkbox1.isSelected())
//			{
//				System.out.println("checkbox is selected by default");
//			}
//			else
//			{
//				checkbox1.click();
//			}
			
			// to select the multiple checkbox in single code we will use below method
			
		List<WebElement> checkboxs=	driver.findElements(By.xpath("//*[@type='checkbox']"));
		int size=checkboxs.size();
		System.out.println(size);
		//if you have multiple checkbox but select only one then use this method
//		checkboxs.get(0).click();
		
//		for(int i=0;i<size;i++)
//		{
//			checkboxs.get(i).click();
//		}
		
		for(int i=0;i<size;i++)
			
			{  //getattributes method is used to fetch the value of elements atrributs as per given by key
			   String value=    checkboxs.get(i).getAttribute("value");
				if(value.equalsIgnoreCase("hockey"))
				{
					checkboxs.get(i).click();
				}
			}
		
			

	}

}
