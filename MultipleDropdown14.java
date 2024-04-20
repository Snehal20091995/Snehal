package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropdown14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "E:\\Automation Testing\\software\\chrome\\chromedriver.exe");
			
			WebDriver driver =new ChromeDriver();
			
			driver.get("https://output.jsbin.com/osebed/2");
			WebElement fruits=driver.findElement(By.id("fruits"));
			Select select =new Select(fruits);
			
			//to select multiple value from the dropdown use multiple method
			if(select.isMultiple())
			{
				select.selectByIndex(0);
				select.selectByValue("apple");
				select.selectByVisibleText("Orange");
			}
			
			//deselect use for deselect the dropdown
			
//			select.deselectByIndex(0);
//			select.deselectByValue("apple");
//			select.deselectByVisibleText("Orange");
			select.deselectAll();

	}

}
