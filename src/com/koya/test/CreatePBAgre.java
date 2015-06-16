package com.koya.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CreatePBAgre {

	
	public static void main(String[] args) throws Exception {
		
		String url="http://clientdemo.cloudapp.net/";
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get(url);
		Thread.sleep(2000);
		
//		log-iN
		
		driver.findElement(By.xpath(".//*[@id='txtUserName']")).sendKeys("sudhaadmin");
		driver.findElement(By.xpath(".//*[@id='txtPassword']")).sendKeys("123456");
		driver.findElement(By.xpath(".//*[@id='login-box']/div[1]/div[1]/fieldset/div[3]/label/input")).click();
		driver.findElement(By.xpath(".//*[@id='btnSubmit']")).click();
		
		Thread.sleep(5000);
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
		Thread.sleep(3000);
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddlPBEntity']"))).selectByValue("17");
		Thread.sleep(3000);
		
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddlClient']"))).selectByIndex(2);
		Thread.sleep(3000);
		
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddlClientEntities']"))).selectByVisibleText("Beta Long Short Master Fund Ltd");
		Thread.sleep(3000);
		
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddFormofPrimeBroker']"))).selectByIndex(1);
		Thread.sleep(2000);
		
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddl_mm']"))).selectByIndex(7);
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddl_dd']"))).selectByValue("7");
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddl_yyyy']"))).selectByVisibleText("2007");
		
		for(int i=0;i<3;i++)
        {
                 driver.findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        }
		
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddSignedPB']"))).selectByIndex(1);
		Thread.sleep(2000);
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
		Thread.sleep(3000);
		
		//Input view Agreement
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_lblLink']/a")).click();
		
		driver.findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		
		//Answering
		
//		GENERAL PRIME BROKER INFORMATION
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_btnGPBI']")).click();
		
		for(int i=0;i<2;i++)
        {
                 driver.findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        }
		
		
//		PB Entities and Documentation
		
		
		driver.findElement(By.linkText("PB Entities and Documentation")).click();
		
		for(int i=0;i<2;i++)
        {
                 driver.findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        }
		
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_1_A_Options']"))).selectByVisibleText("Yes");
		Thread.sleep(3000);
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_1_A_Options_1']"))).selectByIndex(1);
		Thread.sleep(3000);
		for(int i=0;i<2;i++)
        {
                 driver.findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        }
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_1_A_Options_1_1']"))).selectByValue("17");
		Thread.sleep(5000);
		
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_2_A_Options']"))).selectByIndex(1);
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_1_A_1_Documents1']")).sendKeys("document");
		for(int i=0;i<4;i++)
        {
                 driver.findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        }
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_3_A']")).sendKeys("Pr4ime Broker");
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_6_Q_identity']")).sendKeys("IDS1");
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_6_A']")).sendKeys("fee schedule");
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_7_Q_identity']")).sendKeys("Ids2");
		for(int i=0;i<5;i++)
        {
                 driver.findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        }
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_7_A']")).sendKeys("Margin Schedule");
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_4_A']"))).selectByIndex(3);
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_4_A']")).sendKeys("Reneg");
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_btnSubmit']")).click();
		
		Thread.sleep(5000);
		for(int i=0;i<3;i++)
        {
                 driver.findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        }
		
//		PB Relationship
		
		driver.findElement(By.linkText("PB Relationship")).click();
		Thread.sleep(5000);
		for(int i=0;i<3;i++)
        {
                 driver.findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        }
		
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_1_A_Options']"))).selectByVisibleText("Yes");
		for(int i=0;i<2;i++)
        {
                 driver.findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        }
		
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_1_A_Options_1']"))).selectByIndex(2);
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_2_A_Options_2']"))).selectByValue("90");
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_2_A_Options_3']"))).selectByValue("Calendar days");
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_1_A_2']"))).selectByIndex(1);
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_4_A']"))).selectByIndex(3);
		Thread.sleep(2000);
		driver.findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_4_A']")).sendKeys("Renegotiate");
		
		
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_btnSubmit']")).click();
		
		Thread.sleep(5000);
		
		for(int i=0;i<2;i++)
        {
                 driver.findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        }
		
		
//		Notes Regarding General Prime Broker Information
		
		
		driver.findElement(By.partialLinkText("Notes Regarding General")).click();
		Thread.sleep(3000);

		for(int i=0;i<2;i++)
        {
                 driver.findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        }
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_1_A']")).sendKeys("Notes Regarding General Prime Broker Information");
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_btnSubmit54']")).click();
		Thread.sleep(3000);
		
		//driver.findElement(By.partialLinkText("Notes Regarding General")).click();
		
				
//		PB LOCKUP TERMS
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_btnPBLT']")).click();
		driver.findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		driver.findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		
//		Financing Rates on Debit Balance
		driver.findElement(By.xpath(".//*[@id='sample-table-2']/tbody/tr/td/a")).click();
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
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*String parentwindow=driver.getWindowHandle();
		
//		Rate Spread related Lockup Termination / Funding Event (Detailed)
		driver.findElement(By.linkText("Rate Spread related Lockup Termination / Funding Event (Detailed)")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_Q_1_ident']")).sendKeys("IDS1");
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_A_1']"))).selectByVisibleText("Yes");
		Thread.sleep(5000);
		
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_S_Q_1']"))).selectByVisibleText("3");
		
		
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_Lnk_1']/a")).click();
		Thread.sleep(3000);
		for (String Child_Window : driver.getWindowHandles())
        {
            driver.switchTo().window(Child_Window);
                        
        }
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='lbl_3L_Q_1_Identity']")).sendKeys("IDS1");
		new Select(driver.findElement(By.xpath(".//*[@id='ddl_3L_A_1']"))).selectByVisibleText("1 month USD LIBOR OIS");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='txt_3L_A_2']")).sendKeys("OK");
		driver.findElement(By.xpath(".//*[@id='txt_3L_A_3']")).sendKeys("183");
		new Select(driver.findElement(By.xpath(".//*[@id='ddl_3L_A_3']"))).selectByVisibleText("Business Days");
		Thread.sleep(3000);
		new Select(driver.findElement(By.xpath(".//*[@id='ddl_3L_A_4']"))).selectByVisibleText("Funding Event (Provides Prime Broker with the right to change financing in Prime Broker's sole discretion)");
		driver.findElement(By.xpath(".//*[@id='lbl_3L_Q_5_Identity']")).sendKeys("IDS2");
		new Select(driver.findElement(By.xpath(".//*[@id='ddl_3L_A_5']"))).selectByVisibleText("Yes");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='txt_3L_5_Other']")).sendKeys("Prime Broker to exercise its rights upon the occurrence of the Rate Spread Event");
		new Select(driver.findElement(By.xpath(".//*[@id='ddl_3L_A_6']"))).selectByVisibleText("Yes");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='txt_3L_A_6_2']")).sendKeys("145");
		new Select(driver.findElement(By.xpath(".//*[@id='ddl_3L_A_6_2']"))).selectByVisibleText("Business Days");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='btn_submit']")).click();
		Thread.sleep(5000);
		driver.close();
		driver.switchTo().window(parentwindow);
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_Lnk_2']/a")).click();
		Thread.sleep(3000);
		for (String Child_Window : driver.getWindowHandles())
        {
            driver.switchTo().window(Child_Window);
                        
        }
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='lbl_3L_Q_1_Identity']")).sendKeys("IDS1");
		new Select(driver.findElement(By.xpath(".//*[@id='ddl_3L_A_1']"))).selectByVisibleText("1 month USD LIBOR OIS");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='btn_submit']")).click();
		Thread.sleep(5000);
		driver.close();
		driver.switchTo().window(parentwindow);


		
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_Lnk_3']/a")).click();
		Thread.sleep(3000);
		for (String Child_Window : driver.getWindowHandles())
        {
            driver.switchTo().window(Child_Window);
                        
        }
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='lbl_3L_Q_1_Identity']")).sendKeys("IDS1");
		new Select(driver.findElement(By.xpath(".//*[@id='ddl_3L_A_1']"))).selectByVisibleText("1 month USD LIBOR OIS");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='btn_submit']")).click();
		Thread.sleep(5000);
		driver.close();
		driver.switchTo().window(parentwindow);
		
		
		
		
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_ISR']"))).selectByVisibleText("Renegotiate");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_ISR']")).sendKeys("Renegotiate");
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_btnSubmit']")).click();
		Thread.sleep(5000);*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
