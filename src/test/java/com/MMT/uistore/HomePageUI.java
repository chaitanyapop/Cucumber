package com.MMT.uistore;

import org.openqa.selenium.By;

public class HomePageUI {
	public static By loginclick=By.xpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[3]");
	public static By source=By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/div[1]/div[1]/label");
	public static By sourceloc=By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/div[1]/div[1]/div[1]/div/div/div/input");
	public static By destclick=By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/div[1]/div[2]/label");
	public static By destloc=By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/div[1]/div[2]/div[1]/div/div/div[1]/input");
	public static By loginClick=By.xpath("//li[@class='makeFlex hrtlCenter font10 makeRelative lhUser userLoggedOut']");
	public static By month=By.xpath("//div[@class='DayPicker-Month'] //div[@class='DayPicker-Caption']");
	public static By nextarrow=By.xpath("//span[@aria-label='Next Month']");
	public static By dateset=By.xpath("//div[@class='DayPicker-Month'][1] //div[@class='DayPicker-Day']");
	public static By travellers=By.xpath("//div[@data-cy='flightTraveller']");
	public static By travelnum=By.xpath("//li[@data-cy='adults-6']");
	public static By apply=By.xpath("//button[@class='primaryBtn btnApply pushRight']");
	public static By submit=By.xpath("//a[@class='primaryBtn font24 latoBold widgetSearchBtn ']");
}
