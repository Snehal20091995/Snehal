package com.testing;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakeScreenShot34 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "E:\\Automation Testing\\software\\chrome\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://demo.guru99.com/v4/index.php");
		driver.manage().window().maximize();
		
		//firstly we create refrence  variable of taking screenshot
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		//calling getscreenshot method to create image
		File srcFile=ts.getScreenshotAs(OutputType.FILE);
		
		//move file into the distination folder
		File destFile=new File("E:\\IMAGE\\1.png");
		
		//WE WILL copy screenshot into destination folder
		Files.copy(srcFile, destFile);

	}

}
