package com.koya.test;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	String url="http://73f03a3c373340a596d220e47e539824.cloudapp.net/";
	WebDriver driver=new FirefoxDriver();
	
  @BeforeTest
  public void testLogin() throws Exception { 
		
		driver.manage().window().maximize();
		driver.navigate().refresh();
		driver.get(url);
		Thread.sleep(5000);
		
		driver.findElement(By.xpath(".//*[@id='txtUserName']")).sendKeys("sudhaadmin");
		driver.findElement(By.xpath(".//*[@id='txtPassword']")).sendKeys("123456");
		driver.findElement(By.xpath(".//*[@id='login-box']/div[1]/div[1]/fieldset/div[3]/label/input")).click();
		driver.findElement(By.xpath(".//*[@id='btnSubmit']")).click();		
		Thread.sleep(5000);
  }
  @BeforeMethod
  public void testGotoPredefinedReport() throws Exception
  {	  
	  /*driver.findElement(By.xpath(".//*[@id='navbar-container']/div[1]/a/small")).click();
	  Thread.sleep(5000);	*/  
	  driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[4]/a/span")).click();
	  System.out.println(" Clicking On Reports");
	  driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[4]/ul/li[1]/a")).click();
	  System.out.println(" Clicking On Predefined Reports");
	  driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[4]/ul/li[1]/ul/li[2]/a")).click();
	  System.out.println("Selecting PB");
	  Thread.sleep(5000);
	  driver.findElement(By.xpath(".//*[@id='sample-table-2']/tbody/tr/td[2]/a")).click();
	  System.out.println(" Clicking On Alpha");
	  Thread.sleep(3000);
	  System.out.println("Selecting Predefined Reports");
	  new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_dllpredefined']"))).selectByVisibleText("All PB Predefined Reports");
	  Thread.sleep(5000);
  }
  @Test
  public void testPBAgreementInfo() throws Exception
  {
		//===========================General PB Agreement Information==========================================
		System.out.println("Selecting General PB Agreement Information");
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_gridSavedReports_linkbutton_0']")).click();
		Thread.sleep(10000);
		System.out.println("Selecting Agreements");
		//Select AgreementStyle
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddAgreementStyle']"))).selectByVisibleText("All types");
		Thread.sleep(4000);
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddlClientEntities']"))).selectByVisibleText("All Client Entities");
		Thread.sleep(4000);
		//=======================ID's Include==================================================
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_cbIdentiDocuments_0']")).click();
		System.out.println("IDS are Included");
		
		/*driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_cbIdentiDocuments_1']")).click();
		System.out.println("IDS are not Included");*/
		
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_btngo']")).click();
		System.out.println("GO Button Clicked");
		Thread.sleep(7000);
		
		
		driver.findElement(By.xpath(".//*[@id='chkbox_SelectDeselectAgreementTree']")).click();
		System.out.println("Select All Agreements Selected");
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath(".//*[@id='SaveSubmitAgreements']")).click();
		System.out.println("Save Button clicked");
		Thread.sleep(15000);
		
		
		driver.findElement(By.xpath(".//*[@id='mybutton']")).click();
		System.out.println("Click the Excel Report Button");
		Thread.sleep(10000);
		
		
		driver.findElement(By.xpath(".//*[@id='downloadReport']")).click();
		System.out.println("Download Report Button Clicked");
		Thread.sleep(15000);
		
		Robot rbt=new Robot();
		rbt.keyPress(KeyEvent.VK_DOWN);
		
		Thread.sleep(5000);
		Robot rbt1=new Robot();
		rbt1.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		
		
		
		
		driver.navigate().back();
		
		driver.navigate().back();
		Thread.sleep(10000);
		//=======================ID's Do Not Include==================================================
		/*driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_cbIdentiDocuments_0']")).click();
		System.out.println("IDS are Included");*/
		
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_cbIdentiDocuments_1']")).click();
		System.out.println("IDS are not Included");
		
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_btngo']")).click();
		System.out.println("GO Button Clicked");
		Thread.sleep(7000);
		
		
		driver.findElement(By.xpath(".//*[@id='chkbox_SelectDeselectAgreementTree']")).click();
		System.out.println("Select All Agreements Selected");
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath(".//*[@id='SaveSubmitAgreements']")).click();
		System.out.println("Save Button clicked");
		Thread.sleep(15000);
		
		
		driver.findElement(By.xpath(".//*[@id='mybutton']")).click();
		System.out.println("Click the Excel Report Button");
		Thread.sleep(10000);
		
		
		driver.findElement(By.xpath(".//*[@id='downloadReport']")).click();
		System.out.println("Download Report Button Clicked");
		Thread.sleep(15000);
		

		Robot rbt3=new Robot();
		rbt3.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
	  
  }
  @Test
  public void testPBAgreementInfo2() throws Exception
  {
	  
	  	driver.findElement(By.xpath(".//*[@id='rhome']")).click();
	  	Thread.sleep(8000);
		//===========================General PB Agreement Information2==========================================
		System.out.println("Selecting General PB Agreement Information2");
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_gridSavedReports_linkbutton_0']")).click();
		Thread.sleep(10000);
		System.out.println("Selecting Agreements");
		//Select AgreementStyle
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddAgreementStyle']"))).selectByVisibleText("All types");
		Thread.sleep(4000);
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddlClientEntities']"))).selectByVisibleText("All Client Entities");
		Thread.sleep(4000);
		//=======================ID's Include==================================================
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_cbIdentiDocuments_0']")).click();
		System.out.println("IDS are Included");
		
		/*driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_cbIdentiDocuments_1']")).click();
		System.out.println("IDS are not Included");*/
		
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_btngo']")).click();
		System.out.println("GO Button Clicked");
		Thread.sleep(7000);
		
		
		driver.findElement(By.xpath(".//*[@id='chkbox_SelectDeselectAgreementTree']")).click();
		System.out.println("Select All Agreements Selected");
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath(".//*[@id='SaveSubmitAgreements']")).click();
		System.out.println("Save Button clicked");
		Thread.sleep(15000);
		
		
		driver.findElement(By.xpath(".//*[@id='mybutton']")).click();
		System.out.println("Click the Excel Report Button");
		Thread.sleep(10000);
		
		
		driver.findElement(By.xpath(".//*[@id='downloadReport']")).click();
		System.out.println("Download Report Button Clicked");
		Thread.sleep(15000);
		
		Robot rbt=new Robot();
		rbt.keyPress(KeyEvent.VK_DOWN);
		
		Thread.sleep(5000);
		Robot rbt1=new Robot();
		rbt1.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		
		
		
		
		driver.navigate().back();
		
		driver.navigate().back();
		Thread.sleep(10000);
		//=======================ID's Do Not Include==================================================
		/*driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_cbIdentiDocuments_0']")).click();
		System.out.println("IDS are Included");*/
		
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_cbIdentiDocuments_1']")).click();
		System.out.println("IDS are not Included");
		
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_btngo']")).click();
		System.out.println("GO Button Clicked");
		Thread.sleep(7000);
		
		
		driver.findElement(By.xpath(".//*[@id='chkbox_SelectDeselectAgreementTree']")).click();
		System.out.println("Select All Agreements Selected");
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath(".//*[@id='SaveSubmitAgreements']")).click();
		System.out.println("Save Button clicked");
		Thread.sleep(15000);
		
		
		driver.findElement(By.xpath(".//*[@id='mybutton']")).click();
		System.out.println("Click the Excel Report Button");
		Thread.sleep(10000);
		
		
		driver.findElement(By.xpath(".//*[@id='downloadReport']")).click();
		System.out.println("Download Report Button Clicked");
		Thread.sleep(15000);
		

		Robot rbt3=new Robot();
		rbt3.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
  }
  
}
