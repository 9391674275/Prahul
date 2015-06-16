package com.koya.test;

import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CustomGen {
	
	public static void main(String[] args) throws Exception  {
		String url="http://clientdemo.cloudapp.net/";
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.navigate().refresh();
		driver.get(url);
		
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='txtUserName']")).sendKeys("sudhaadmin");
		driver.findElement(By.xpath(".//*[@id='txtPassword']")).sendKeys("123456");
		driver.findElement(By.xpath(".//*[@id='login-box']/div[1]/div[1]/fieldset/div[3]/label/input")).click();
		driver.findElement(By.xpath(".//*[@id='btnSubmit']")).click();		
		
		Thread.sleep(8000);
		driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[4]/a/span")).click();//report
		driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[4]/ul/li[2]/a")).click();//custom 
		driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[4]/ul/li[2]/ul/li[1]/a")).click();//generate
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(@href,'steponereportsignalRNew.aspx?CID=10')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_chkExec_0']")).click();
		new Select(driver.findElement(By.xpath(".//*[@id='ddlClientEntities']"))).selectByVisibleText("All Client Entities");
		driver.findElement(By.xpath(".//*[@id='LoadingTree']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath(".//*[@id='AgreementTree']/ul/li/ul/li/div/div/div/span[1]/span")).click();
		driver.findElement(By.xpath(".//*[@id='AgreementTree']/ul/li/ul/li/ul/li[3]/div/div/div/div/span[2]/label/span[1]")).click();
		driver.findElement(By.xpath(".//*[@id='btnsubmit']")).click();
		Thread.sleep(10000);
		if(driver.getPageSource().contains("Agreement Submitted successfully"))
		{
		    System.out.println("Agreement Successfully added");
		}

		else
		{
			System.out.println("Agreement not Submitted");
		}
		
		driver.findElement(By.xpath(".//*[@id='FilterTree']")).click();
		Thread.sleep(10000);
		
		driver.findElement(By.xpath(".//*[@id='chkbox_SelectDeselect']")).click();
		for(int i=0;i<15;i++)
        {
                 driver.findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        }
		driver.findElement(By.xpath(".//*[@id='tbReportName']")).sendKeys("ptpouuty232583");
		driver.findElement(By.xpath(".//*[@id='Submit']")).click();
		
		Thread.sleep(20000);
		driver.findElement(By.xpath(".//*[@id='mybutton']")).click();
		Thread.sleep(20000);
		
		driver.findElement(By.xpath(".//*[@id=' downloadReport1']")).click();
		Thread.sleep(10000);
		
		
		Robot rbt=new Robot();
		
		rbt.keyPress(java.awt.event.KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(".//*[@id='download62PDF1']")).click();
		Thread.sleep(5000);
		Robot rbt1=new Robot();
		rbt1.keyPress(java.awt.event.KeyEvent.VK_ENTER);
		
		driver.findElement(By.xpath(".//*[@id='download63PDF1']")).click();
		Thread.sleep(5000);
		
		Robot rbt2=new Robot();
		rbt2.keyPress(java.awt.event.KeyEvent.VK_ENTER);
		

	}

}
