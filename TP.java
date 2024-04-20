package com.testing;


import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;




public class TP {

	public static void main(String[] args) throws InterruptedException, IOException{
		System.setProperty("webdriver.chrome.driver","E:\\Automation Testing\\software\\chrome\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/v4/index.php");
		driver.manage().window().maximize();
		
		//firstly we create refrence  variable of taking screenshot
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File srsfile=ts.getScreenshotAs(OutputType.FILE);
		File d=new File("E:\\1.jpg");
		
		Files.copy(srsfile, d);
		
	}
}	
		
	

		
		
		
		
		

	