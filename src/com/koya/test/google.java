package com.koya.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class google {

	
	public static void main(String[] args) throws Exception {
		
		String url="http://clientdemo.cloudapp.net/";
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
//		log-iN
		
		driver.findElement(By.xpath(".//*[@id='txtUserName']")).sendKeys("sudhaadmin");
		driver.findElement(By.xpath(".//*[@id='txtPassword']")).sendKeys("123456");
		driver.findElement(By.xpath(".//*[@id='login-box']/div[1]/div[1]/fieldset/div[3]/label/input")).click();
		driver.findElement(By.xpath(".//*[@id='btnSubmit']")).click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.tagName("html")).sendKeys(
				Keys.chord(Keys.CONTROL, Keys.SUBTRACT));
		driver.findElement(By.tagName("html")).sendKeys(
				Keys.chord(Keys.CONTROL, Keys.SUBTRACT));
		/*for(int i=0;i<4;i++)
        {
                 driver.findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        }*/
		
		driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[3]/a/span")).click();
		driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[3]/ul/li[3]/a")).click();
		driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[3]/ul/li[3]/ul/li[1]/a")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddlPBEntity']"))).selectByValue("17");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddlClient']"))).selectByIndex(2);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddlClientEntities']"))).selectByVisibleText("Beta Long Short Master Fund Ltd");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddFormofPrimeBroker']"))).selectByIndex(1);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddl_mm']"))).selectByIndex(7);
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddl_dd']"))).selectByValue("7");
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddl_yyyy']"))).selectByVisibleText("2007");
		
		for(int i=0;i<3;i++)
        {
                 driver.findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        }
		
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddSignedPB']"))).selectByIndex(1);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		for(int i=0;i<3;i++)
        {
                 driver.findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        }
		
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddSignedCE']"))).selectByVisibleText("Yes");
		for(int i=0;i<3;i++)
        {
                 driver.findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        }
		
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddStrength']"))).selectByValue("Acceptable");
		for(int i=0;i<3;i++)
        {
                 driver.findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        }
		
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddAgreementslist']"))).selectByIndex(1);
		for(int i=0;i<3;i++)
        {
                 driver.findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        }
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_btnSubmit']")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		//Input view Agreement
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_lblLink']/a")).click();
		
		driver.findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		
		//Answering
//		PB LOCKUP TERMS
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_btnPBLT']")).click();
		driver.findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		
//		Financing Rates on Debit Balance
		driver.findElement(By.linkText("Financing Rates on Debit Balance")).click();
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_1_A_Options']"))).selectByValue("Yes");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_Q_sub1_identity']")).sendKeys("IDS1");
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_A_sub1']")).sendKeys("the financing rate on debit balance");
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_1_A_Options_sub2']"))).selectByValue("Yes");
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_Q_sub2_1_identity']")).sendKeys("IDS2");
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_1_A_Options_sub2_1']"))).selectByValue("Yes");
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_Q_sub2_1_1_identity']")).sendKeys("IDS3");
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_A_sub2_1_1']")).sendKeys(" rate to the debit balance");
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_btncopy']")).click();
		Thread.sleep(5000);
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_1_A_Options_sub4']"))).selectByValue("Yes");
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_Q_sub4_1_identity']")).sendKeys("IDS4");
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_A_sub4']")).sendKeys("rate on debit balance");
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_2_A_Options']"))).selectByVisibleText("Renegotiate");
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_2_A_1']")).sendKeys("renegotiate");
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_btnSubmit']")).click();
		Thread.sleep(5000);
		
//		Financing Rates on Free Credit Balances
		
		driver.findElement(By.linkText("Financing Rates on Free Credit Balances")).click();
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_1_A_Options']"))).selectByValue("Yes");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_Q_sub1_identity']")).sendKeys("IDS1");
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_A_sub1']")).sendKeys("the financing rate on debit balance");
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_1_A_Options_sub2']"))).selectByValue("Yes");
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_Q_sub2_1_identity']")).sendKeys("IDS2");
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_1_A_Options_sub2_1']"))).selectByValue("Yes");
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_Q_sub2_1_1_identity']")).sendKeys("IDS3");
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_A_sub2_1_1']")).sendKeys(" rate to the debit balance");
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_btncopy']")).click();
		Thread.sleep(5000);
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_1_A_Options_sub4']"))).selectByValue("Yes");
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_Q_sub4_1_identity']")).sendKeys("IDS4");
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_A_sub4']")).sendKeys("rate on debit balance");
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_2_A_Options']"))).selectByVisibleText("Renegotiate");
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_2_A_1']")).sendKeys("renegotiate");
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_btnSubmit']")).click();
		Thread.sleep(5000);
		
		
//		Stock Loan Rates
		
		driver.findElement(By.linkText("Stock Loan Rates")).click();
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_1_A_Options']"))).selectByValue("Yes");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_Q_sub1_identity']")).sendKeys("IDS1");
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_A_sub1']")).sendKeys("the financing rate on debit balance");
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_Q_sub2_identity']")).sendKeys("IDS2");		
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_1_A_Options_sub2']"))).selectByValue("Yes");
		Thread.sleep(5000);
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_1_A_Options_sub2_1']"))).selectByValue("Yes");
		Thread.sleep(5000);		
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_Q_sub2_1_1_identity']")).sendKeys("IDS3");
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_Q_sub2_1_1']")).sendKeys(" rate to the debit balance");
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_Q_sub2_1_Otheridentity']")).sendKeys("IDS4");
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_Q_sub2_1_Other']")).sendKeys(" rate to the debit balance");
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_Q_sub2_2_identity']")).sendKeys("IDS5");
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_1_A_Options_sub2_2']"))).selectByValue("Yes");
		Thread.sleep(5000);
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_1_A_Options_sub2_3']"))).selectByValue("Yes");
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_Q_sub2_3_1_identity']")).sendKeys("IDS6");
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_Q_sub2_3_1']")).sendKeys("the financing rate on debit balance");
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_btncopy']")).click();
		Thread.sleep(10000);
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_1_A_Options_sub4']"))).selectByValue("Yes");
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_Q_sub4_1']")).sendKeys("stock loan rate");
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_2_A_Options']"))).selectByVisibleText("Renegotiate");
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_2_A_1']")).sendKeys("renegotiate");
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_btnSubmit']")).click();
		Thread.sleep(6000);
		
		
		
		
		
			
		

		}

	}


