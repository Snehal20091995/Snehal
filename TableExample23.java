package com.testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExample23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "E:\\Automation Testing\\software\\chrome\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		
		//to fetch the all the column from the table we will use the below code
		
		List<WebElement> columns=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
		
		int size=columns.size();
		System.out.println("column NO :"+size);
		
		for(int i=0;i<size;i++)
		{
			String columnName=columns.get(i).getText();
			System.out.println(columnName);
			
		}
		
		//to fetch the all the row from the table we will use the below code
		
     List<WebElement> rows=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
		
		int size1=rows.size();
		System.out.println("row NO :"+size1);
		
		for(int j=0;j<size1;j++)
		{
			String rowName=rows.get(j).getText();
			System.out.println(rowName);
			
		}
		//to fetch the cell from the table we will use the below code
		
		WebElement cellData=driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]/td[4]"));
		System.out.println(cellData.getText());

	}

}
