package com.koya.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CopyTemplate {
	public static void main(String[] args) throws Exception{
		String url="http://73f03a3c373340a596d220e47e539824.cloudapp.net/";
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		//driver.navigate().refresh();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath(".//*[@id='txtUserName']")).sendKeys("sudhaadmin");
		driver.findElement(By.xpath(".//*[@id='txtPassword']")).sendKeys("123456");
		driver.findElement(By.xpath(".//*[@id='login-box']/div[1]/div[1]/fieldset/div[3]/label/input")).click();
		driver.findElement(By.xpath(".//*[@id='btnSubmit']")).click();		
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[3]/a/span")).click();//Managed Agreements
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[3]/ul/li[5]/a")).click();//Template Agreements
		Thread.sleep(2000);
		//driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[3]/ul/li[5]/ul/li[1]/a")).click();//Template Agreement Terms
		driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[3]/ul/li[5]/ul/li[2]/a")).click();//Template
		Thread.sleep(4000);
		
		
		
		//=======================================================================================================
		//For ISDA
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddlAgreementType']"))).selectByVisibleText("ISDAAgreement");
		Thread.sleep(5000);
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddlCounterpartySourceList']"))).selectByIndex(21);
		Thread.sleep(4000);
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddlCounterpartyTargetList']"))).selectByIndex(11);
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_btncopy']")).click();
		Thread.sleep(5000);
		
		
		
		
		/*//=======================================================================================================
		//For PB
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddlAgreementType']"))).selectByVisibleText("Prime Broker Agreement");
		Thread.sleep(5000);
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddlCounterpartySourceList']"))).selectByIndex(21);
		Thread.sleep(4000);
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddlCounterpartyTargetList']"))).selectByIndex(11);
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_btncopy']")).click();
		Thread.sleep(5000);*/
		
		/*if(s.isTextPresent("Opportunities"))
        {
            System.out.println("continue");
        }
        else
        {
            System.out.println("error");

        }*/
		if(driver.getPageSource().contains("Successfully Copied"))
		{
		    System.out.println("Successfully Copied Template to Template");
		}

		else
		{
			System.out.println("Copy Template to Template Failed");
		}
		
		
		
		
		driver.close();
		
		
	}

}
