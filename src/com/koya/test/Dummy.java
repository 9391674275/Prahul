package com.koya.test;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dummy {
	public static void main(String args[]) throws Exception{
	

	 System.out.println("Create New ISDAAgreement ");
	  
	 WebDriver driver=new FirefoxDriver();
	 driver.manage().window().maximize();
	 String url="http://73f03a3c373340a596d220e47e539824.cloudapp.net";
	 driver.get(url);
	 driver.findElement(By.xpath(".//*[@id='txtUserName']")).sendKeys("maniadmin");
	 driver.findElement(By.xpath(".//*[@id='txtPassword']")).sendKeys("123456");
	 driver.findElement(By.xpath(".//*[@id='login-box']/div[1]/div[1]/fieldset/div[3]/label/input")).click();
	 driver.findElement(By.xpath(".//*[@id='btnSubmit']")).click();
	   driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[3]/a/span")).click();
	   driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[3]/ul/li[1]/a")).click();
	   driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[3]/ul/li[1]/ul/li[1]/a")).click();
	   //manage Agreements create agreement Dropdown code
	   new Select(driver.findElement(By.id("ContentPlaceHolder1_ddlCounterParty"))).selectByValue("57");
	  
	   Thread.sleep(3000);
	   new Select(driver.findElement(By.id("ContentPlaceHolder1_ddlClient"))).selectByIndex(1);
	   Thread.sleep(2000);
	   new Select(driver.findElement(By.id("ContentPlaceHolder1_ddlClientEntities"))).selectByIndex(1);
	   new Select(driver.findElement(By.id("ContentPlaceHolder1_ddFormofISDA"))).selectByIndex(1);
	   new Select(driver.findElement(By.id("ContentPlaceHolder1_ddl_mm"))).selectByIndex(1);
	   new Select(driver.findElement(By.id("ContentPlaceHolder1_ddl_dd"))).selectByIndex(2);
	   new Select(driver.findElement(By.id("ContentPlaceHolder1_ddl_yyyy"))).selectByIndex(1);
	   new Select(driver.findElement(By.id("ContentPlaceHolder1_ddSignedCP"))).selectByValue("Yes");
	   new Select(driver.findElement(By.id("ContentPlaceHolder1_ddSignedCE"))).selectByValue("Yes");
	   new Select(driver.findElement(By.id("ContentPlaceHolder1_ddStrength"))).selectByValue("Strong");
	   new Select(driver.findElement(By.id("ContentPlaceHolder1_ddPartyA"))).selectByValue("1");
	   new Select(driver.findElement(By.id("ContentPlaceHolder1_ddPartyB"))).selectByValue("3");
	   new Select(driver.findElement(By.id("ContentPlaceHolder1_ddAgreementslist"))).selectByValue("Not Applicable");
	   driver.findElement(By.id("ContentPlaceHolder1_btnSubmit")).click();
	   
	   System.out.println("Answer one Provison Approve IT");
	   
	   driver.findElement(By.linkText("Input Agreement Terms")).click();
	   driver.findElement(By.id("ContentPlaceHolder1_btnShcedule")).click();
	      driver.findElement(By.linkText("Net Asset Value")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_A']")).sendKeys("Net Asset Value");
	      driver.findElement(By.id("ContentPlaceHolder1_ctl00_btnSubmit")).click();
	      Thread.sleep(2000);
	      //Approve
	     driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_btnSubmitforApproval']")).click();
	      Thread.sleep(3000);
	      new Select(driver.findElement(By.id("ContentPlaceHolder1_ddStatusList"))).selectByValue("3");
	      driver.findElement(By.id("ContentPlaceHolder1_tb_Notes_Review")).sendKeys("ok Approved");
	      driver.findElement(By.id("ContentPlaceHolder1_btnSubmit")).click();
	      
	      System.out.println("Check for Single report Generation ");
	    
	        String parentwindow=driver.getWindowHandle();//For Parent window 
	      driver.findElement(By.id("ContentPlaceHolder1_btnPreview")).click();
	        Thread.sleep(10000);
	                for (String Child_Window : driver.getWindowHandles())
	                  {
	                 driver.switchTo().window(Child_Window); 
	                       }
	                  Thread.sleep(2000);
	                  driver.findElement(By.linkText("Generate PDF")).click();//Switch to Child window
	                  Thread.sleep(3000);
	                  driver.findElement(By.id("btnGeneratePDF")).click();
	                  Thread.sleep(5000);
	                  Robot rb=new Robot();
	                  rb.keyPress(KeyEvent.VK_ENTER);
	                  Thread.sleep(2000);
	                    driver.close();     //Close Child window
	          driver.switchTo().window(parentwindow); //Finally Switch to main window
	  
	}

}

