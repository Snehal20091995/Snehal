package com.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethodPracticle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//this method is helps you to set the browser path which we need to used to run the automation script
		System.setProperty("webdriver.chrome.driver", "E:\\Automation Testing\\software\\chrome\\chromedriver.exe");

		//to create chromedriver object we need to create webdriver  interface reference variable and need to 
		//create object for browser
		WebDriver driver =new ChromeDriver();
		
		//1.get()-this method will help you open to any url 
		
		driver.get("https://www.amazon.in/");
		
		//3.get title()-to get title of current opened url we can use get title method
			String title=driver.getTitle();
			System.out.println(title);
			
		//4.get current url()-to get currently opened url  we can use get current url method
			String url=driver.getCurrentUrl();
			System.out.println(url);
			
		//5.pagesource code()-to get pagesource code of opened url   we can use pagesource code method
			String source=driver.getPageSource();
			System.out.println(source);
		

		
		//2.close()-to close the current open to any url we need to use closed method
		driver.close();
		
		
		//6.quit()-to close the all opened url we need to use quit method
			
			driver.quit();
			
			
		
		
		
		
		
		
	}

}
