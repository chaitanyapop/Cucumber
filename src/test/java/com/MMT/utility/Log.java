package com.MMT.utility;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import com.MMT.pageobject.HomePage;
import com.MMT.pageobject.ListOfFlight;






public class Log {
	public static Logger log=LogManager.getLogger(HomePage.class.getName());
	public static Logger log1=LogManager.getLogger(ListOfFlight.class.getName());
	

}
