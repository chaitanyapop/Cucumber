package com.MMT.pageobject;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import com.MMT.uistore.*;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.MMT.pageobject.*;
import com.MMT.reusablecomponent.ReusableComponent;
import com.MMT.uistore.HomePageUI;
import com.MMT.utility.Datadriven;
import com.MMT.utility.ExcelReader;
import com.MMT.utility.Log;



public class HomePage {
	static WebDriver driver;
	static int count=0;
	static ArrayList<String> arlist=new ArrayList<String>();
	static String searchurl=null;
	
	public static void navigatetopage() throws IOException, InterruptedException
	{
		driver=ReusableComponent.WebDriver();
		driver.get(Datadriven.datadriver("website"));
		driver.manage().window().maximize();
		Log.log.info("Screen maximize");
		//Log.info("Screen maximize");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		
		driver.findElement(HomePageUI.loginClick).click();
	}
		//HomePage.hmpage(driver).click();
		
		//HomePage.source(driver).click();
	public static void source() throws InterruptedException, FileNotFoundException, IOException
	{
		driver.findElement(HomePageUI.source).click();
		System.out.println("hello 0");
		arlist.addAll(ExcelReader.excel("Source"));
		Thread.sleep(1000);
		System.out.println(arlist);
		driver.findElement(HomePageUI.sourceloc).sendKeys(arlist.get(count));
		Thread.sleep(1000);
		driver.findElement(HomePageUI.sourceloc).sendKeys(Keys.ARROW_DOWN);
		//HomePage.sourceloc(driver).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		while(true)
		{
			String a=driver.findElement(HomePageUI.sourceloc).getAttribute("value");
			if(a.equals(arlist.get(count))) {
				Thread.sleep(1000);
				driver.findElement(HomePageUI.sourceloc).sendKeys(Keys.ENTER);
				Thread.sleep(1000);
				break;
			}
			else {
				Thread.sleep(1000);
				driver.findElement(HomePageUI.sourceloc).sendKeys(Keys.ARROW_DOWN);
			}
		}
		Log.log.info("Source selected");
		arlist.removeAll(arlist);
	}
	public static void destination() throws InterruptedException, FileNotFoundException, IOException
	{
	
		//HomePage.destclick(driver).click();
		Thread.sleep(1000);
		arlist.addAll(ExcelReader.excel("Destination"));
		System.out.println(arlist);
		//System.out.println(arlist.get(count));
		Thread.sleep(1000);
		driver.findElement(HomePageUI.destloc).sendKeys(arlist.get(count));
		//HomePage.Destination(driver).sendKeys("Mumbai");
		Thread.sleep(1000);
		System.out.println(arlist);
		driver.findElement(HomePageUI.destloc).sendKeys(Keys.ARROW_DOWN);
		while(true)
		{
			String a=driver.findElement(HomePageUI.destloc).getAttribute("value");
			if(a.equals(arlist.get(count))) {
				Thread.sleep(1000);
				driver.findElement(HomePageUI.destloc).sendKeys(Keys.ENTER);
				Thread.sleep(1000);
				break;
			}
			else {
				Thread.sleep(1000);
				driver.findElement(HomePageUI.destloc).sendKeys(Keys.ARROW_DOWN);
			}
		}
		Log.log.info("Destination selected");
		arlist.removeAll(arlist);
	}
	public static void month() throws FileNotFoundException, IOException, InterruptedException
	{
		Thread.sleep(1000);
		arlist.addAll(ExcelReader.excel("Month"));
		while(!driver.findElement(HomePageUI.month).getText().contains(arlist.get(count)))
		{
			System.out.println(driver.findElement(HomePageUI.month).getText());
			Thread.sleep(1000);
			driver.findElement(HomePageUI.nextarrow).click();
			//HomePage.nextarrow(driver).click();
		}
		int count1=driver.findElements(HomePageUI.dateset).size();
		arlist.removeAll(arlist);
		Thread.sleep(1000);
		arlist.addAll(ExcelReader.excel("Date"));
		List<WebElement> itr=driver.findElements(HomePageUI.dateset);
		for(int i=0;i<count1;i++)
		{
			String date=itr.get(i).getText();
			if(date.contains(arlist.get(count)))
			{
				itr.get(i).click();
				break;
			}
			else {
				continue;
			}
		}
		Log.log.info("Month and Date are selected");
	}
	public static void selecttraveller()
	{
		driver.findElement(HomePageUI.travellers).click();
		//HomePage.travellers(driver).click();
		driver.findElement(HomePageUI.travelnum).click();
		//HomePage.travelnum(driver).click();
		driver.findElement(HomePageUI.apply).click();
		//HomePage.apply(driver).click();
	}
	public static void clickonsubmit()
	{
		driver.findElement(HomePageUI.submit).click();
		//HomePage.submit(driver).click();
		Log.log.info("Clicked on submit");
		searchurl=driver.getCurrentUrl();
		ListOfFlight.searchurl=driver.getCurrentUrl();
		
	}
}

