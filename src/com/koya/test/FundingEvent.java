package com.koya.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FundingEvent {

	
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
		//1111111111111
		//Prime Broker Related Lockup Termination Events / Funding Events (Detailed)
		driver.findElement(By.linkText("Prime Broker Related Lockup Termination Events / Funding Events (Detailed)")).click();
		Thread.sleep(5000);
		
		String parentwindow=driver.getWindowHandle();
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_1_A']"))).selectByVisibleText("Yes");
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_Q_1_Ident']")).sendKeys("IDS1");
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_Q_identity']")).sendKeys("IDS2");
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_1_1_A']"))).selectByVisibleText("Funding Event");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_1_Fun']")).sendKeys("Funding Event");
		Thread.sleep(3000);
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_1_2_GuarantorsSelection']"))).selectByIndex(1);
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_CE_LongTermLink1']/a")).click();
		Thread.sleep(4000);
		for (String Child_Window : driver.getWindowHandles())
        {
            driver.switchTo().window(Child_Window);             //Switch to Child window
                        
        }
		new Select(driver.findElement(By.xpath(".//*[@id='one_uc_ddl_ClientEntities']"))).selectByVisibleText("BNP Paribas");
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[@id='one_uc_txt_1_3_Q_Identify']")).sendKeys("IDS50");
		driver.findElement(By.xpath(".//*[@id='one_uc_cbl_1_3_A_0']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='one_uc_cbl_1_3_A_1']")).click();
		Thread.sleep(2000);
		/*driver.findElement(By.xpath(".//*[@id='one_uc_cbl_1_3_A_1']")).click();
		driver.findElement(By.xpath(".//*[@id='one_uc_cbl_1_3_A_1']")).click();*/
		driver.findElement(By.xpath(".//*[@id='one_uc_txt_CE_Moody_Long_Q_1_Identify']")).sendKeys("IDS51");
		new Select(driver.findElement(By.xpath(".//*[@id='one_uc_dd_CE_Moody_Long_A_1']"))).selectByVisibleText("Aa3");
		new Select(driver.findElement(By.xpath(".//*[@id='one_uc_dd_CE_Moody_Long_A_2']"))).selectByVisibleText("4");
		new Select(driver.findElement(By.xpath(".//*[@id='one_uc_dd_CE_SP_Long_A_1']"))).selectByVisibleText("A+");
		new Select(driver.findElement(By.xpath(".//*[@id='one_uc_dd_CE_SP_Long_A_2']"))).selectByVisibleText("5");
		driver.findElement(By.xpath(".//*[@id='one_uc_txt_1_5']")).sendKeys("180");
		new Select(driver.findElement(By.xpath(".//*[@id='one_uc_ddldays']"))).selectByVisibleText("Business Days");
		Thread.sleep(2000);
		new Select(driver.findElement(By.xpath(".//*[@id='one_uc_ddl_1_6']"))).selectByVisibleText("4");
		new Select(driver.findElement(By.xpath(".//*[@id='one_uc_dd_1_4_A']"))).selectByVisibleText("Yes");
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[@id='one_uc_dd_4th_third_A_0']")).click();
		driver.findElement(By.xpath(".//*[@id='one_uc_dd_4th_third_A_1']")).click();
		driver.findElement(By.xpath(".//*[@id='one_uc_dd_4th_third_A_2']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[@id='one_uc_txt_4th_2_A']")).sendKeys("180");
		new Select(driver.findElement(By.xpath(".//*[@id='one_uc_ddldayslongterm1']"))).selectByVisibleText("Business Days");
		driver.findElement(By.xpath(".//*[@id='one_uc_btnSubSubmit']")).click();
		Thread.sleep(8000);
		driver.close();
		driver.switchTo().window(parentwindow);
		
		//22222222222
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_2_A']"))).selectByVisibleText("Yes");
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_Q_2_Ident']")).sendKeys("IDS3");
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_2_Q_Identity']")).sendKeys("IDS4");
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_2_1_A']"))).selectByVisibleText("Funding Event");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_2_Fun']")).sendKeys("Funding Event");
		Thread.sleep(3000);
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_2_2_Q_GuarantorsSelection']"))).selectByIndex(1);
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_CE_ShortTermLink1']/a")).click();
		Thread.sleep(4000);
		for (String Child_Window : driver.getWindowHandles())
        {
            driver.switchTo().window(Child_Window);            
                        
        }
		new Select(driver.findElement(By.xpath(".//*[@id='SRCE3_ddl_ClientEntities']"))).selectByVisibleText("Citibank, N.A.");
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='SRCE3_txt_1_3_Q_Identify']")).sendKeys("IDS60");
		driver.findElement(By.xpath(".//*[@id='SRCE3_cbl_1_3_A_0']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='SRCE3_cbl_1_3_A_1']")).click();
		Thread.sleep(2000);
		/*driver.findElement(By.xpath(".//*[@id='one_uc_cbl_1_3_A_1']")).click();
		driver.findElement(By.xpath(".//*[@id='one_uc_cbl_1_3_A_1']")).click();*/
		driver.findElement(By.xpath(".//*[@id='SRCE3_txt_CE_Moody_Long_Q_1_Identify']")).sendKeys("IDS61");
		Thread.sleep(5000);
		new Select(driver.findElement(By.xpath(".//*[@id='SRCE3_dd_CE_Moody_Long_A_1']"))).selectByVisibleText("P-1");
		new Select(driver.findElement(By.xpath(".//*[@id='SRCE3_dd_CE_Moody_Long_A_2']"))).selectByVisibleText("3");
		new Select(driver.findElement(By.xpath(".//*[@id='SRCE3_dd_CE_SP_Long_A_1']"))).selectByVisibleText("A-3");
		new Select(driver.findElement(By.xpath(".//*[@id='SRCE3_dd_CE_SP_Long_A_2']"))).selectByVisibleText("4");
		driver.findElement(By.xpath(".//*[@id='SRCE3_txt_1_5']")).sendKeys("180");
		new Select(driver.findElement(By.xpath(".//*[@id='SRCE3_ddldayshortterm1']"))).selectByVisibleText("Business Days");
		Thread.sleep(2000);
		new Select(driver.findElement(By.xpath(".//*[@id='SRCE3_ddl_1_6']"))).selectByVisibleText("4");
		new Select(driver.findElement(By.xpath(".//*[@id='SRCE3_dd_1_4_A']"))).selectByVisibleText("Yes");
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[@id='SRCE3_dd_4th_third_A_0']")).click();
		driver.findElement(By.xpath(".//*[@id='SRCE3_dd_4th_third_A_1']")).click();
		driver.findElement(By.xpath(".//*[@id='SRCE3_dd_4th_third_A_2']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[@id='SRCE3_btnSubSubmit']")).click();
		Thread.sleep(8000);
		driver.close();
		driver.switchTo().window(parentwindow);
		
		
		//333333333333333
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_3_A']"))).selectByVisibleText("Yes");
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_Q_3_ident']")).sendKeys("IDS5");
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_3_Q_Identity']")).sendKeys("IDS6");
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_3_1_A']"))).selectByVisibleText("Funding Event");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_3_1_Fun']")).sendKeys("Funding Event");
		Thread.sleep(3000);
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl3_2_GuarantorSelection']"))).selectByIndex(2);
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_CE_FinancialLink1']/a")).click();
		Thread.sleep(4000);
		for (String Child_Window : driver.getWindowHandles())
        {
            driver.switchTo().window(Child_Window);            
                        
        }
		new Select(driver.findElement(By.xpath(".//*[@id='Shortterm_Rating_ddl_ClientEntities']"))).selectByVisibleText("UBS AG");
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='Shortterm_Rating_txt_3_Q_Identify']")).sendKeys("IDS70");
		driver.findElement(By.xpath(".//*[@id='Shortterm_Rating_cbl_1_3_A_0']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='Shortterm_Rating_cbl_1_3_A_1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='Shortterm_Rating_cbl_1_3_A_2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='Shortterm_Rating_cbl_1_3_A_3']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='Shortterm_Rating_txt_CE_AM_Long_Q_1_Identify']")).sendKeys("IDS71");
		Thread.sleep(5000);
		new Select(driver.findElement(By.xpath(".//*[@id='Shortterm_Rating_dd_CE_AM_Long_A_1']"))).selectByVisibleText("A++");
		new Select(driver.findElement(By.xpath(".//*[@id='Shortterm_Rating_dd_CE_AM_Long_A_2']"))).selectByVisibleText("3");
		new Select(driver.findElement(By.xpath(".//*[@id='Shortterm_Rating_dd_CE_Moody_Long_A_1']"))).selectByVisibleText("A1");
		new Select(driver.findElement(By.xpath(".//*[@id='Shortterm_Rating_dd_CE_Moody_Long_A_2']"))).selectByVisibleText("5");
		new Select(driver.findElement(By.xpath(".//*[@id='Shortterm_Rating_dd_CE_SP_Long_A_1']"))).selectByVisibleText("AA+");
		new Select(driver.findElement(By.xpath(".//*[@id='Shortterm_Rating_dd_CE_SP_Long_A_2']"))).selectByVisibleText("7");
		new Select(driver.findElement(By.xpath(".//*[@id='Shortterm_Rating_dd_CE_Fitch_Long_A_1']"))).selectByVisibleText("BBB+");
		new Select(driver.findElement(By.xpath(".//*[@id='Shortterm_Rating_dd_CE_Fitch_Long_A_2']"))).selectByVisibleText("8");
		driver.findElement(By.xpath(".//*[@id='Shortterm_Rating_txt_1_5']")).sendKeys("180");
		new Select(driver.findElement(By.xpath(".//*[@id='Shortterm_Rating_ddldayfinancial']"))).selectByVisibleText("Business Days");
		Thread.sleep(2000);
		new Select(driver.findElement(By.xpath(".//*[@id='Shortterm_Rating_ddl_1_6']"))).selectByVisibleText("4");
		new Select(driver.findElement(By.xpath(".//*[@id='Shortterm_Rating_dd_1_4_A']"))).selectByVisibleText("Yes");
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='Shortterm_Rating_dd_4th_third_A_0']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='Shortterm_Rating_dd_4th_third_A_1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='Shortterm_Rating_dd_4th_third_A_2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='Shortterm_Rating_dd_4th_third_A_3']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='Shortterm_Rating_btnSubSubmit']")).click();
		Thread.sleep(8000);
		driver.close();
		driver.switchTo().window(parentwindow);
		Thread.sleep(5000);
		
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_CE_FinancialLink2']/a")).click();
		Thread.sleep(4000);
		for (String Child_Window : driver.getWindowHandles())
        {
            driver.switchTo().window(Child_Window);            
                        
        }
		new Select(driver.findElement(By.xpath(".//*[@id='Shortterm_Rating_ddl_ClientEntities']"))).selectByVisibleText("HSBC Bank plc");
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='Shortterm_Rating_txt_3_Q_Identify']")).sendKeys("IDS80");
		driver.findElement(By.xpath(".//*[@id='Shortterm_Rating_cbl_1_3_A_0']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='Shortterm_Rating_cbl_1_3_A_1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='Shortterm_Rating_cbl_1_3_A_2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='Shortterm_Rating_cbl_1_3_A_3']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='Shortterm_Rating_txt_CE_AM_Long_Q_1_Identify']")).sendKeys("IDS81");
		Thread.sleep(5000);
		new Select(driver.findElement(By.xpath(".//*[@id='Shortterm_Rating_dd_CE_AM_Long_A_1']"))).selectByVisibleText("A++");
		new Select(driver.findElement(By.xpath(".//*[@id='Shortterm_Rating_dd_CE_AM_Long_A_2']"))).selectByVisibleText("3");
		new Select(driver.findElement(By.xpath(".//*[@id='Shortterm_Rating_dd_CE_Moody_Long_A_1']"))).selectByVisibleText("A1");
		new Select(driver.findElement(By.xpath(".//*[@id='Shortterm_Rating_dd_CE_Moody_Long_A_2']"))).selectByVisibleText("5");
		new Select(driver.findElement(By.xpath(".//*[@id='Shortterm_Rating_dd_CE_SP_Long_A_1']"))).selectByVisibleText("AA+");
		new Select(driver.findElement(By.xpath(".//*[@id='Shortterm_Rating_dd_CE_SP_Long_A_2']"))).selectByVisibleText("7");
		new Select(driver.findElement(By.xpath(".//*[@id='Shortterm_Rating_dd_CE_Fitch_Long_A_1']"))).selectByVisibleText("BBB+");
		new Select(driver.findElement(By.xpath(".//*[@id='Shortterm_Rating_dd_CE_Fitch_Long_A_2']"))).selectByVisibleText("8");
		driver.findElement(By.xpath(".//*[@id='Shortterm_Rating_txt_1_5']")).sendKeys("180");
		new Select(driver.findElement(By.xpath(".//*[@id='Shortterm_Rating_ddldayfinancial']"))).selectByVisibleText("Business Days");
		Thread.sleep(2000);
		new Select(driver.findElement(By.xpath(".//*[@id='Shortterm_Rating_ddl_1_6']"))).selectByVisibleText("4");
		new Select(driver.findElement(By.xpath(".//*[@id='Shortterm_Rating_dd_1_4_A']"))).selectByVisibleText("Yes");
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='Shortterm_Rating_dd_4th_third_A_0']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='Shortterm_Rating_dd_4th_third_A_1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='Shortterm_Rating_dd_4th_third_A_2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='Shortterm_Rating_dd_4th_third_A_3']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='Shortterm_Rating_btnSubSubmit']")).click();
		Thread.sleep(8000);
		driver.close();
		driver.switchTo().window(parentwindow);
		Thread.sleep(4000);
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_rene_answer']"))).selectByVisibleText("Renegotiate");
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_7_A_Sub']")).sendKeys("Renegotiate");
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_btnSubmit']")).click();
		Thread.sleep(20000);
		driver.findElement(By.linkText("Prime Broker Related Lockup Termination Events / Funding Events (Detailed)")).click();
		Thread.sleep(10000);
		driver.findElement(By.linkText("Prime Brokerage Related Lockup Termination / Funding Events CDS Spread Provisions (Detailed)")).click();
		
		
		
		
	}
}