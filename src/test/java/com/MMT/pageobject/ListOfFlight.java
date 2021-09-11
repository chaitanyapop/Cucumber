package com.MMT.pageobject;
import java.io.IOException;
import com.MMT.utility.*;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.MMT.pageobject.*;
import com.MMT.reusablecomponent.ReusableComponent;
import com.MMT.utility.*;
import com.MMT.uistore.*;

public class ListOfFlight{
	static WebDriver driver;
	static String searchurl;
	
	public static void navpage() throws IOException
	{
		driver=ReusableComponent.WebDriver();
		System.out.println(searchurl);
		driver.get(searchurl);
	}
	public static void listofflights()
	{
		int count=driver.findElements(ListOfFlightUI.planename).size();
		//int count=ListOfFlight.planename(driver).size();
		for(int i=0;i<count;i++)
		{
			System.out.println(i+")"+" "+"Flight name is"+driver.findElements(ListOfFlightUI.planename).get(i).getText());
		}
		Log.log1.info("List of flights displayed");
		
	}
}
