package com.koya.test;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Firstt {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new FirefoxDriver();
		
		

		driver.get("http://73f03a3c373340a596d220e47e539824.cloudapp.net/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.name("txtUserName")).sendKeys("sivaadmin");
		driver.findElement(By.name("txtPassword")).sendKeys("123456");
		driver.findElement(By.name("btnSubmit")).click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.tagName("body")).sendKeys("keys.down");
		/*driver.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL, Keys.ADD));
		driver.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL, Keys.ADD));*/
		driver.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL, Keys.SUBTRACT));
		driver.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL, Keys.SUBTRACT));
		driver.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL, Keys.SUBTRACT));
		//ISDA DRAFT CREATE AGREMENT
		driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[3]/a/span")).click();
		driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[3]/ul/li[2]/a")).click();
		//driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[3]/ul/li[2]/ul/li[2]/a")).click();
				
				
		driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[3]/ul/li[2]/ul/li[1]/a")).click();
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddlCounterParty']"))).selectByVisibleText("ABC Bank AG");
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddlClient']"))).selectByVisibleText("Delta Advisors LLC");
		//new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddlClientEntities']"))).selectByVisibleText("Delta Optimal Macro Fund Ltd.");
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddlClientEntities']"))).selectByValue("14");
				
				
				
		Thread.sleep(4000);
		
				
		int month[]={1,2,3,4,5,6,7,8,9,10,11,12};
		Random mgenerator = new Random();
		int mlen = mgenerator.nextInt(month.length);
		System.out.println(month[mlen]);
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddl_mm']"))).selectByIndex(month[mlen]);
		Thread.sleep(2000);
			     
		
		int date[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};
		Random ygenerator = new Random();
		int ylen = ygenerator.nextInt(date.length);
		System.out.println(date[ylen]);
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddl_dd']"))).selectByIndex(date[ylen]);
			     
		
		String myArray[]={"1980","1981","1982","1983","1984","1985","1986","1987","1988","1989","1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000",
				"2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020"};
		Random generator = new Random();
		int dfd = generator.nextInt(myArray.length);
		System.out.println(myArray[dfd]);
		
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddl_yyyy']"))).selectByVisibleText(myArray[dfd]);
		
		
		
		//.selectByValue(myArray[dfd]);

	}
}


