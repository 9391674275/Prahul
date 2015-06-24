package com.koya.test;

//import java.awt.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.WebElement;




public class first {
	
	
	

	
	//private static Object rowCollection;

	public static void main( String[] args ) throws InterruptedException
    {
		
		
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
		//driver.findElement(By.id("btnSubmit")).isSelected();
		/*
		if (! driver.findElement(By.xpath(".//*[@id='login-box']/div[1]/div[1]/fieldset/div[3]/label/span")).isSelected() )
		{
		    // driver.findElement(By.id("idOfTheElement")).click();
		    // driver.findElement(By.name("btnSubmit")).click();
		     driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_chkCECP']")).click();
		}*/
		
		
		//CASE 1;
		//driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[2]/a/span")).click();
		//driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[2]/ul/li[1]/a")).click();
		
			
		/*
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddlClient']"))).selectByVisibleText("Alpha Advisors LLC");
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddAgreementType']"))).selectByVisibleText("All Agreements");
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_chkCECP']")).isSelected();
		
		driver.findElement(By.id("ContentPlaceHolder1_chkCECP")).click();*/
		
		
		//driver.findElement(By.linkText("View Document List")).click();
		/*
		
		
		if(driver.findElement(By.xpath(".//*[@id='sample-table-2']/tbody/tr/td[2]/a")) != null){
		
			
			driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_gridAgreements']/tbody/tr[2]/td[1]")).click();
			driver.findElement(By.xpath(".//*[@id='sample-table-2']/tbody/tr/td[2]/a")).click();
			driver.navigate().back();
		}
			
			else {
				driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_gridAgreements']/tbody/tr[3]/td[1]")).click();
				driver.findElement(By.xpath(".//*[@id='sample-table-2']/tbody/tr/td[2]/a")).click();
				driver.navigate().back();
			}*/
			
			
			
		
		
		/*
		for(int numberOfRows=1; numberOfRows<=10; numberOfRows++)
			
		{
	
		for(int numberOfCol=1; numberOfCol <=6; numberOfCol++)
	
		{*/
	
			//Object classname = null;
			//Object newclientheaderaligncolor = null;
			//if(classname == newclientheaderaligncolor)
		//System.out.println(driver.findElement(By.xpath(".//*[@id='sample-table-2']/tbody/tr/td[2]/a")));
		/*
		if(driver.findElement(By.id("ContentPlaceHolder1_gridAgreements")) != null)
		{
		
			driver.findElement(By.xpath(".//*[@id='sample-table-2']/tbody/tr/td[2]/a")).click();
		//driver.findElement(By.linkText("View Document List")).click();
			driver.navigate().back();
		}
		else if(driver.findElement(By.id("sample-table-2")) != null)
		{
			driver.findElement(By.xpath(".//*[@id='sample-table-2']/tbody/tr/td[2]/a")).click();
			//driver.findElement(By.linkText("View Document List")).click();
				driver.navigate().back();
		}*/
			/*
			for(int numberOfRows=1; numberOfRows<=50; numberOfRows++)
				
					{
				
					for(int numberOfCol=1; numberOfCol <=6; numberOfCol++)
				
					{
				
						driver.findElement(By.xpath(".//*[@id='sample-table-2']/tbody/tr/td[2]/a")).click();
						driver.navigate().back();
					}
				
					}*/
		
		
		/*
		WebElement htmltable=driver.findElement(By.xpath(".//*[@id='sample-table-2']/tbody/tr/td[2]/a"));
		
			java.util.List<WebElement> rows=htmltable.findElements(By.tagName("tr"));
		
			 
		
			for(int rnum=0;rnum<rows.size();rnum++)
		
			{
		
			java.util.List<WebElement> columns=rows.get(rnum).findElements(By.tagName("th"));
		
			System.out.println("Number of columns:"+columns.size());
			//driver.findElement(By.xpath(".//*[@id='sample-table-2']/tbody/tr/td[2]/a")).click();
			 
		
			for(int cnum=0;cnum<columns.size();cnum++)
		
			{
		
			System.out.println(columns.get(cnum).getText());
			//driver.findElement(By.xpath(".//*[@id='sample-table-2']/tbody/tr/td[2]/a")).click();
			}
		
			}*/
			
			//driver.findElement(By.className("newclientheaderaligncolor")).click();
			
		
			//driver.findElement(By.xpath(".//*[@id='sample-table-2']/tbody/tr/td[5]/a")).click();
			//driver.navigate().back();
			
	
		//}
	
		//}
			/*
			//CASE 2;
		
			//driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddlClient']")).click();
			//driver.findElement(By.xpath(".//*[@id='main-container']/div/div/div[2]/div/div/div/div/div/div/div[6]/div/div/div[2]")).click();
			new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddlClient']"))).selectByVisibleText("Beta Advisors LLC");
			new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddAgreementType']"))).selectByVisibleText("All Agreements");
			driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_chkCECP']")).isSelected();
			
			driver.findElement(By.id("ContentPlaceHolder1_chkCECP")).click();
			
			driver.findElement(By.xpath(".//*[@id='sample-table-2']/tbody/tr/td[2]/a")).click();
			driver.navigate().back();
			
			 //CASE 3;
			new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddlClient']"))).selectByVisibleText("Delta Advisors LLC");
			new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddAgreementType']"))).selectByVisibleText("All Agreements");
			driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_chkCECP']")).isSelected();
			
			driver.findElement(By.id("ContentPlaceHolder1_chkCECP")).click();
			
			driver.findElement(By.xpath(".//*[@id='sample-table-2']/tbody/tr/td[2]/a")).click();
			driver.navigate().back();
			*/
		
		/*
		//ISDA Create Agrement:
		
		driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[3]/a/span")).click();
		driver.findElement(By.xpath("html/body/form/div[4]/div/div/div[1]/div/ul/li[3]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//a[@href='NewISDAAgreement.aspx']")).click();
		//manage Agrements create agrement dropdown code
		new Select(driver.findElement(By.id("ContentPlaceHolder1_ddlCounterParty"))).selectByVisibleText("chirucounterparty");
		new Select(driver.findElement(By.id("ContentPlaceHolder1_ddlClient"))).selectByVisibleText("Beta Advisors LLC");
		new Select(driver.findElement(By.id("ContentPlaceHolder1_ddlClientEntities"))).selectByVisibleText("Beta Long Short Master Fund Ltd.");
		new Select(driver.findElement(By.id("ContentPlaceHolder1_ddFormofISDA"))).selectByVisibleText("1992");
		  for(int i=1;i<5;i++){
		//new Select(driver.findElement(By.id("ContentPlaceHolder1_ddl_mm"))).selectByVisibleText("i");
		new Select(driver.findElement(By.id("ContentPlaceHolder1_ddl_mm"))).selectByIndex(i);
		  }
		new Select(driver.findElement(By.id("ContentPlaceHolder1_ddl_dd"))).selectByVisibleText("1");
		new Select(driver.findElement(By.id("ContentPlaceHolder1_ddl_yyyy"))).selectByVisibleText("2020");
		new Select(driver.findElement(By.id("ContentPlaceHolder1_ddSignedCP"))).selectByVisibleText("Yes");
		new Select(driver.findElement(By.id("ContentPlaceHolder1_ddSignedCE"))).selectByVisibleText("Yes");
		new Select(driver.findElement(By.id("ContentPlaceHolder1_ddStrength"))).selectByVisibleText("Not Applicable");
		new Select(driver.findElement(By.id("ContentPlaceHolder1_ddPartyA"))).selectByVisibleText("Counterparty");
		new Select(driver.findElement(By.id("ContentPlaceHolder1_ddPartyB"))).selectByVisibleText("Client Entity");
		new Select(driver.findElement(By.id("ContentPlaceHolder1_ddAgreementslist"))).selectByVisibleText("Not Applicable");
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_btnSubmit']")).click();*/
		
		
	
		
		
		
		//ISDA DRAFT CREATE AGREMENT
		driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[3]/a/span")).click();
		driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[3]/ul/li[2]/a")).click();
		//driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[3]/ul/li[2]/ul/li[2]/a")).click();
		
		
		driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[3]/ul/li[2]/ul/li[1]/a")).click();
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddlCounterParty']"))).selectByVisibleText("ABC Bank AG");
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddlClient']"))).selectByVisibleText("Delta Advisors LLC");
		//new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddlClientEntities']"))).selectByVisibleText("Delta Optimal Macro Fund Ltd.");
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddlClientEntities']"))).selectByValue("14");
		//calander
		//new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddl_mm']"))).selectByVisibleText("1");
		//new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddl_mm']"))).selectByVisibleText("7");
		//new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddl_mm']"))).selectByVisibleText("8");
		//new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddl_mm']"))).selectByVisibleText("9");
		
		/*for(int i=1;i<5;i++){
				//new Select(driver.findElement(By.id("ContentPlaceHolder1_ddl_mm"))).selectByVisibleText("i");
			  if(i==1)
				
				new Select(driver.findElement(By.id("ContentPlaceHolder1_ddl_mm"))).selectByIndex(i);
				  
		  else if(i==2)
			  new Select(driver.findElement(By.id("ContentPlaceHolder1_ddl_mm"))).selectByIndex(i);
		  }*/
		//new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddl_mm']"))).selectByVisibleText("6");
		
		
	/*String[] date = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30"};
	  for(int i=1;i<=30;i++){
		  new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddl_dd']"))).selectByVisibleText(date[i]);*/
		
		
		/* int START = 1;
		    int END = 10;
		    Random random = new Random();
		    for (int idx = 1; idx <= 10; ++idx){
		    	 showRandomInteger(START, END, random);
		      new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddl_dd']"))).selectByVisibleText(randomInt);*/
		      
		      
		 Thread.sleep(4000);
		Random randomGenerator = new Random();
	     for (int idx = 1; idx <= 1; idx++){
	       int randomInt = randomGenerator.nextInt(30);
	       System.out.println("Generated : " + randomInt);
	       Thread.sleep(4000);
	       new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddl_dd']"))).selectByValue("randomInt");
	     
		
		
		
		  String[] month = {"1","2","3","4","5","6","7","8","9","10","11","12"};
		  for(int j=1;j<=12;j++){
			  new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddl_mm']"))).selectByVisibleText(month[j]);
			   
			  int[] year = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
			  for(int k=1;k<=10;k++){
				  new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddl_yyyy']"))).selectByIndex(year[k]);
				  
			  
			  
		  
		
		/*Random randomGenerator = new Random();
	     for (int idx = 1; idx <= 10; ++idx){
	       int randomInt = randomGenerator.nextInt(100);
	       System.out.println("Generated : " + randomInt);
	     }*/
		
		
		
		
		
		 
		    
		
	
		
		//new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddl_dd']"))).selectByVisibleText("24");
		//new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddl_yyyy']"))).selectByVisibleText("2019");
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddFormofISDA']"))).selectByVisibleText("1992");
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_btnSubmit']")).click();
		
		//Create Version
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddl_mm']"))).selectByVisibleText("3");
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddl_dd']"))).selectByVisibleText("2");
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddl_yyyy']"))).selectByVisibleText("2019");
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_dfParty']"))).selectByVisibleText("Client Entity");
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddAgreementslist']"))).selectByVisibleText("Not Applicable");
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_btnSubmit']")).click();
	  
		
		//Answers(fill provisions)
		
		driver.findElement(By.xpath(".//*[@id='sample-table-2']/tbody/tr/td[4]/a")).click();
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_btnShcedule']")).click();
		driver.findElement(By.xpath(".//*[@id='sample-table-2']/tbody/tr/td/a")).click();
		/*
		
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_1_A']"))).selectByVisibleText("Yes");
		
		driver.findElement(By.name("ctl00$ContentPlaceHolder1$ctl00$txt_1_Q_identity")).sendKeys("maniadmin");
		
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_1_1_A']"))).selectByVisibleText("Yes");
		driver.findElement(By.name("ctl00$ContentPlaceHolder1$ctl00$txt_1_1_Q_identity")).sendKeys("maniadmin");
		
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_1_A_Options_1']"))).selectByVisibleText("1 - Client Entity");
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_1_A_1_CounterParties_1']"))).selectByVisibleText("Alpha Convertible Fund Ltd.");
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_1_2_A']"))).selectByVisibleText("Yes");
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_1_2_A_sbu']"))).selectByVisibleText("2002 Definition");
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_1_3_A']"))).selectByVisibleText("Yes");
	    new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_1_3_A']"))).selectByVisibleText("Yes");
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_1_4_A']"))).selectByVisibleText("Yes");
		
	
		
		
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_btnCopyClientEntities']")).click();
		
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_3_bench']"))).selectByVisibleText("Yes");
		//Thread.sleep(1000);
		((WebElement) new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_Q_identity']")))).sendKeys("1");
	 */
		//ISDA create Draft agreemnet closing
		
		//ISDA MANAGE AGREMENTS
		
		
		/*
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddlClient']"))).selectByVisibleText("Alpha Advisors LLC");
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddlClientEntity']"))).selectByVisibleText("Alpha Convertible Fund Ltd");
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddlCounterparty']"))).selectByVisibleText("Select All Counterparties");
		
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_btnButton']")).click();
		driver.findElement(By.xpath(".//*[@id='sample-table-2']/tbody/tr/td[2]/a")).click();
		driver.findElement(By.xpath(".//*[@id='sample-table-2']/tbody/tr/td[4]/a")).click();
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_btnShcedule']")).click();*/
		
		//Default Under Specified Transaction (Cross Default to Other Agreements Between the Parties) - Section 5(a)(v)
		driver.findElement(By.linkText("Default Under Specified Transaction (Cross Default to Other Agreements Between the Parties) - Section 5(a)(v)")).click();
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_Q_identity']")).sendKeys("1");
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_1_A']"))).selectByVisibleText("Yes");
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_1_Q_identity']")).sendKeys("2");
		Thread.sleep(2000);
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_1_1_A']"))).selectByVisibleText("Yes");
		Thread.sleep(2000);
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_1_A_Options_1']"))).selectByVisibleText("1 - Client Entity");
		Thread.sleep(2000);
	    new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_1_A_1_CounterParties_1']"))).selectByVisibleText("Delta Distressed Arbitrage Fund");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//textarea[@class=' firepath-matching-node']")).sendKeys("3");
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_2_Q_identity']")).sendKeys("3");
		Thread.sleep(2000);
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_1_2_A']"))).selectByVisibleText("Yes");
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_First_2Q_Sub1_identity']")).sendKeys("4");
		Thread.sleep(2000);
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_1_2_A_sbu']"))).selectByVisibleText("2002 Definition");
		Thread.sleep(2000);
		//driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_2_3_Q_identity']")).sendKeys("5");
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_3_Q_identity']")).sendKeys("5");
		Thread.sleep(2000);
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_1_3_A']"))).selectByVisibleText("Yes");
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_4_Q_identity']")).sendKeys("6");
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_1_4_A']"))).selectByVisibleText("Yes");
		 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_btnCopyClientEntities']")).click();
		 new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_2_A_Options_1']"))).selectByVisibleText("1 - Counterparty");
		 Thread.sleep(2000);
		 new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_2_A_1_CounterParties_1']"))).selectByVisibleText("ABC Bank AG");
		 Thread.sleep(2000);
		 new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_3_bench']"))).selectByVisibleText("Yes");
			driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_3_1_bench']")).sendKeys("ABCDEFG");
			 Thread.sleep(2000);
			driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_btnSubmit']")).click();
		//Fill First Provision
		//ISDA Schedule
		driver.findElement(By.linkText("Cross Default (to 3rd Party Agreements) - Section 5(a)(vi)")).click();
		
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_Q_identity']")).sendKeys("A");
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_1_A']"))).selectByVisibleText("Yes");
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_1_Q_identity']")).sendKeys("B");
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_1_1_A']"))).selectByVisibleText("Yes");
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_1_A_Options_1']"))).selectByVisibleText("1 - Client Entity");
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_1_A_1_CounterParties_1']"))).selectByVisibleText("Alpha Convertible Fund Ltd.");
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_2_Q_identity']")).sendKeys("C");
		 new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_1_2_A']"))).selectByVisibleText("Yes");
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_First_2Q_Sub1_identity']")).sendKeys("D");
	   
	 
		
		
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_1_2_A_sbu']"))).selectByVisibleText("2002 Definition");
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_3_Q_identity']")).sendKeys("E");
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_1_3_A']"))).selectByVisibleText("Yes");
		 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_4_Q_identity']")).sendKeys("F");
		 new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_1_4_A']"))).selectByVisibleText("Yes");
		//copy
		 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_btnCopyClientEntities']")).click();
		 new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_2_A_Options_1']"))).selectByVisibleText("1 - Counterparty");
		 new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_2_A_1_CounterParties_1']"))).selectByVisibleText("ABC Bank AG");
		 
		 new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_3_bench']"))).selectByVisibleText("No");
		// driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_3_1_bench']")).sendKeys("ABCDEFG");
		 driver.findElement(By.name("ctl00$ContentPlaceHolder1$ctl00$btnSubmit")).click();
		 
		 /*
		 new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_3_bench']"))).selectByVisibleText("Yes");
		 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_3_1_bench']")).sendKeys("123456");
		 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_btnSubmit']")).click();*/
		
		 
		 //Fill Second Provision
		 driver.findElement(By.linkText("Cross Default (to 3rd Party Agreements) - Section 5(a)(vi)")).click();
		
		 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_Q_identity']")).sendKeys("1");
			new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_1_A']"))).selectByVisibleText("Yes");
			 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_2_Q_identity']")).sendKeys("2");
			  new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_1_1_A']"))).selectByVisibleText("Yes");
			driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_1_1_1_A']")).sendKeys("1111");
			 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_2_Q_identity']")).sendKeys("3");
			 new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_1_2_A']"))).selectByVisibleText("Yes");
			 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_3_Q_identity']")).sendKeys("4");
			 new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_1_3_A']"))).selectByVisibleText("Cross Default");
			 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_4_Q_identity']")).sendKeys("5");
			 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_1_4_A']")).sendKeys("5555");
			 new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_1_5_A']"))).selectByVisibleText("Yes");
			 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_5_1_Q_identity']")).sendKeys("6");
			 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_1_5_1_A']")).sendKeys("6666");
			 //Copy
				Thread.sleep(2000);
			 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_btnCopyClientEntities']")).click();
			 Thread.sleep(2000);
			 
			 new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_3_bench']"))).selectByVisibleText("Yes");
			 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_3_1_bench']")).sendKeys("123456");
			 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_btnSubmit']")).click();
			 
			 
			 // Fill Third Provision:
			 driver.findElement(By.linkText("Credit Event Upon Merger - Section 5(b)(iv)")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_Q_identity']")).sendKeys("1");
			 Thread.sleep(2000);
			 new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_1_A']"))).selectByVisibleText("Yes");
			 Thread.sleep(2000);
			 new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_2_A']"))).selectByVisibleText("Yes");
			 Thread.sleep(2000);
			 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_3_Q_identity']")).sendKeys("2");
			 Thread.sleep(2000);
			 new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_3_A']"))).selectByVisibleText("Yes");
			 Thread.sleep(2000);
			 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_3_1_A']")).sendKeys("2222");
			 Thread.sleep(2000);
			 new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_3_bench']"))).selectByVisibleText("Yes");
			 Thread.sleep(2000);
			 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_3_1_bench']")).sendKeys("123456");
			 Thread.sleep(2000);
			 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_btnSubmit']")).click();
			 
			 //Fill Fourth Provision
			 driver.findElement(By.linkText("Grace / Cure Periods - Section 5(a)(i), (ii)")).click();
			  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_Q_identity']")).sendKeys("1");
			  Thread.sleep(2000);
			 new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_1_A']"))).selectByVisibleText("Yes");
			 Thread.sleep(2000);
			 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_1_1_A']")).sendKeys("1111");
			 Thread.sleep(2000);
			 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_2_Q_identity']")).sendKeys("2");
			 Thread.sleep(2000);
			 new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_2_A']"))).selectByVisibleText("Yes");
			 Thread.sleep(2000);
			 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_2_1_A']")).sendKeys("2222");
			 Thread.sleep(2000);
			 new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_3_bench']"))).selectByVisibleText("Yes");
			 Thread.sleep(2000);
			 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_3_1_bench']")).sendKeys("123456");
			 Thread.sleep(2000);
			 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_btnSubmit']")).click();
			 
			 //Fill Fifth Provision
			 driver.findElement(By.linkText("Payment Measures - Section 6(e)")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_Q_identity']")).sendKeys("1");
			 Thread.sleep(2000);
			 new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_1_A']"))).selectByVisibleText("Market Quotation");
			 Thread.sleep(2000);
			 new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_3_bench']"))).selectByVisibleText("Yes");
			 Thread.sleep(2000);
			 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_3_1_bench']")).sendKeys("123456");
			 Thread.sleep(2000);
			 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_btnSubmit']")).click();
			 
		//--------------------------------------------------------
			 //Fill ATE/EOD-NAVTEST
//------------------------------------------------------------------------------------			 
			  
			 //Fill Sexth Provision
		
			 driver.findElement(By.linkText("Net Asset Value")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_A']")).sendKeys("123456");
			 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_btnSubmit']")).click();
			 
			 Thread.sleep(3000);
			 
			 //Fill Seventh Provision
			// driver.findElement(By.linkText("ATE / EoD - Monthly NAV Decline")).click();
			 //driver.findElement(By.partialLinkText("ATE / EoD - Monthly NAV Decline")).click();
			 driver.findElement(By.partialLinkText("ATE / EoD - Monthly NAV Decline")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_Q_identity']")).sendKeys("1");
			 Thread.sleep(2000);
		     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_1_A']"))).selectByVisibleText("Yes");
		     Thread.sleep(2000);
		     driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_1_A']")).sendKeys("1");
		     Thread.sleep(2000);
		     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddlPerformance_1_2_Q']"))).selectByVisibleText("Performance only");
		     Thread.sleep(2000);
		     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_2_A']"))).selectByVisibleText("Month end to month end");
		     Thread.sleep(2000);
		     driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_3_Q_identity']")).sendKeys("2");
		     Thread.sleep(2000);
		     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_3_A']"))).selectByVisibleText("Additional Termination Event");
		     Thread.sleep(3000);
		     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_1_A_Options_1']"))).selectByVisibleText("1 - Client Entity");
		     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_1_A_1_CounterParties_1']"))).selectByVisibleText("Alpha Convertible Fund Ltd.");
		     Thread.sleep(2000);
		     driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_4_Q_identity']")).sendKeys("3");
		     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_4_A']"))).selectByVisibleText("Yes");
		     Thread.sleep(2000);
		     driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_4_1_A']")).sendKeys("3");
		     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddlPerformance_4_2_Q']"))).selectByVisibleText("Performance only");
		     Thread.sleep(2000);
		     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_5_A']"))).selectByVisibleText("Month end to month end");
		     Thread.sleep(2000);
		     driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_6_Q_identity']")).sendKeys("4");
		     Thread.sleep(2000);
		     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_6_A']"))).selectByVisibleText("Additional Termination Event");
		     Thread.sleep(2000);
		     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_2_A_Options_1']"))).selectByVisibleText("1 - Counterparty");
		     Thread.sleep(2000);
		     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_2_A_1_CounterParties_1']"))).selectByVisibleText("ABC Bank AG");
		     Thread.sleep(2000);
		     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_3_bench']"))).selectByVisibleText("Yes");
		     Thread.sleep(2000);
		     driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_3_1_bench']")).sendKeys("123456");
		     driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_btnSubmit']")).click();
		     
		     //-----------------------------------------------------------------------------------
		     //Fill ATE / EoD - 3 Month / Quarterly NAV Decline Provision
		     driver.findElement(By.linkText("ATE / EoD - 3 Month / Quarterly NAV Decline")).click();
		     Thread.sleep(2000);
			 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_Q_Identify']")).sendKeys("1");
			 Thread.sleep(2000);
		     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_1_A']"))).selectByVisibleText("Yes");
		     Thread.sleep(2000);
			 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_1_A']")).sendKeys("1");
			 Thread.sleep(2000);
		     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddlPerformance_1_2_Q']"))).selectByVisibleText("Performance only");
		     Thread.sleep(2000);
		     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_2_A']"))).selectByVisibleText("Month end to 3rd prior month end");
		     Thread.sleep(2000);
			 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_3_Q_identify']")).sendKeys("2");
			 Thread.sleep(2000);
		     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_3_A']"))).selectByVisibleText("Additional Termination Event");
			 
		     
		     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_1_A_Options_1']"))).selectByVisibleText("1 - Client Entity");
		     Thread.sleep(2000);
		     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_1_A_1_CounterParties_1']"))).selectByVisibleText("Alpha Convertible Fund Ltd.");
		     driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_4_Q_identity']")).sendKeys("3");
		     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_4_A']"))).selectByVisibleText("Yes");
		     Thread.sleep(2000);
		     driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_4_1_A']")).sendKeys("3");
		     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddlPerformance_4_2_Q']"))).selectByVisibleText("Performance only");
		     Thread.sleep(2000);
		     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_5_A']"))).selectByVisibleText("Month end to 3rd prior month end");
		     Thread.sleep(2000);
		     driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_6_Q_identity']")).sendKeys("4");
		     Thread.sleep(2000);
		     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_6_A']"))).selectByVisibleText("Additional Termination Event");
		     Thread.sleep(2000);
		     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_2_A_Options_1']"))).selectByVisibleText("1 - Counterparty");
		     Thread.sleep(2000);
		     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_2_A_1_CounterParties_1']"))).selectByVisibleText("ABC Bank AG");
		     Thread.sleep(2000);
		     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_3_bench']"))).selectByVisibleText("Yes");
		     Thread.sleep(2000);
		     driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_3_1_bench']")).sendKeys("123456");
		     driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_btnSubmit']")).click();
		   //-------------------------------------------------------------------------------------------
		   
		     //Fill ATE / EoD - 12 Month / Quarterly NAV Decline Provision
		     driver.findElement(By.linkText("ATE / EoD - 12 Month / Annual NAV Decline")).click();
		     Thread.sleep(1000);
			 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_Q_identity']")).sendKeys("1");
			 Thread.sleep(2000);
		     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_1_A']"))).selectByVisibleText("Yes");
		     Thread.sleep(2000);
			 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_1_A']")).sendKeys("1");
			 Thread.sleep(2000);
		     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddlPerformance_1_2_Q']"))).selectByVisibleText("Performance only");
		     Thread.sleep(2000);
		     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_2_A']"))).selectByVisibleText("Month end to 12th prior month end");
		     Thread.sleep(2000);
			 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_3_Q_identity']")).sendKeys("2");
			 Thread.sleep(2000);
		     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_3_A']"))).selectByVisibleText("Additional Termination Event");
			 
		     
		     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_1_A_Options_1']"))).selectByVisibleText("1 - Client Entity");
		     Thread.sleep(2000);
		     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_1_A_1_CounterParties_1']"))).selectByVisibleText("Alpha Convertible Fund Ltd.");
		     driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_4_Q_identity']")).sendKeys("3");
		     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_4_A']"))).selectByVisibleText("Yes");
		     Thread.sleep(2000);
		     driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_4_1_A']")).sendKeys("3");
		     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddlPerformance_4_2_Q']"))).selectByVisibleText("Performance only");
		     Thread.sleep(2000);
		     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_5_A']"))).selectByVisibleText("Month end to 12th prior month end");
		     Thread.sleep(2000);
		     driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_6_Q_identity']")).sendKeys("4");
		     Thread.sleep(2000);
		     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_6_A']"))).selectByVisibleText("Additional Termination Event");
		     Thread.sleep(2000);
		     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_2_A_Options_1']"))).selectByVisibleText("1 - Counterparty");
		     Thread.sleep(2000);
		     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_2_A_1_CounterParties_1']"))).selectByVisibleText("ABC Bank AG");
		     Thread.sleep(2000);
		     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_7_Options']"))).selectByVisibleText("Yes");
		     Thread.sleep(2000);
		     driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_7_1_A']")).sendKeys("123456");
		     driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_btnSubmit']")).click();
		     //------------------------------------------------------------------------------------------
		     
		     //Fill ATE / EoD - NAV Floor Provision
		     driver.findElement(By.linkText("ATE / EoD - NAV Floor")).click();
		     driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_Q_identity']")).sendKeys("1");
		     Thread.sleep(2000);
		     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_1_A']"))).selectByVisibleText("Yes");
		     Thread.sleep(2000);
		     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_1_1_A']"))).selectByVisibleText("Yes");
		     driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_dolar_A']")).sendKeys("10");
		     Thread.sleep(2000);
		     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddlDolarce']"))).selectByVisibleText("USD");
		     Thread.sleep(2000);
		     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_1_2_A']"))).selectByVisibleText("Yes");
		     driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_percentage_A']")).sendKeys("20");
		     Thread.sleep(2000);
		     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_performance_1']"))).selectByVisibleText("Performance only");
		     Thread.sleep(2000);
		     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_Determination_Period_1']"))).selectByVisibleText("Month end compared to prior year end");
		     //driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_3_Q_identity']")).sendKeys("2");
		     Thread.sleep(2000);
		     driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_3_Q_identity']")).sendKeys("2");
		     Thread.sleep(2000);
		     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_1_3_A']"))).selectByVisibleText("Yes");
		     driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_1_3_A']")).sendKeys("2222");
		     driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_3_Q_identity']")).sendKeys("3");
		     Thread.sleep(2000);
		     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_3_A']"))).selectByVisibleText("Additional Termination Event");
		     Thread.sleep(2000);
		     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_1_A_Options_1']"))).selectByVisibleText("1 - Client Entity");
		     Thread.sleep(2000);
		     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_1_A_1_CounterParties_1']"))).selectByVisibleText("Alpha Convertible Fund Ltd.");
		    // driver.findElement(By.xpath("..//*[@id='ContentPlaceHolder1_ctl00_txt_4_Q_identity']")).sendKeys("4");
		     
		     driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_4_Q_identity']")).sendKeys("1");
		     Thread.sleep(2000);
		     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_4_A']"))).selectByVisibleText("Yes");
		     Thread.sleep(2000);
		     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_4_1_A']"))).selectByVisibleText("Yes");
		     driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_Dolar_CP']")).sendKeys("10");
		     Thread.sleep(2000);
		     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddlDolarcp']"))).selectByVisibleText("USD");
		     Thread.sleep(2000);
		     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_4_2_A']"))).selectByVisibleText("Yes");
		     driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_percentage_CP']")).sendKeys("20");
		     Thread.sleep(2000);
		     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_peformance_CP']"))).selectByVisibleText("Performance only");
		     Thread.sleep(2000);
		     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_Determination_Period_CP']"))).selectByVisibleText("Month end compared to prior year end");
		     Thread.sleep(2000);
		     driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_4_3_Q_identity']")).sendKeys("2");
		     Thread.sleep(2000);
		     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_4_3_A']"))).selectByVisibleText("Yes");
		     driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_4_3_A']")).sendKeys("2222");
		     driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_6_Q_identity']")).sendKeys("3");
		     Thread.sleep(2000);
		     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_6_A']"))).selectByVisibleText("Additional Termination Event");
		     Thread.sleep(2000);
		     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_2_A_Options_1']"))).selectByVisibleText("1 - Counterparty");
		     Thread.sleep(2000);
		     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_2_A_1_CounterParties_1']"))).selectByVisibleText("ABC Bank AG");
		    // driver.findElement(By.xpath("..//*[@id='ContentPlaceHolder1_ctl00_txt_4_Q_identity']")).sendKeys("4");
		     Thread.sleep(2000);
		     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_3_bench']"))).selectByVisibleText("Yes");
		     driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_3_1_bench']")).sendKeys("123456");
		     driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_btnSubmit']")).click();
		     //------------------------------------------------------------------------------------------
		     //Fill ATE / EoD - Other NAV Tests Provision
		
		   driver.findElement(By.linkText("ATE / EoD - Other NAV Tests")).click();
		   driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_Q_identity']")).sendKeys("1");
		   Thread.sleep(2000);
		     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_1_A']"))).selectByVisibleText("Yes");
		     driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_1_A']")).sendKeys("1111");
		     driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_2_Q_identity']")).sendKeys("2");
		     Thread.sleep(2000);
		     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_2_A']"))).selectByVisibleText("Additional Termination Event");
		     Thread.sleep(2000);
		     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_1_A_Options_1']"))).selectByVisibleText("1 - Client Entity");
		     Thread.sleep(2000);
		     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_1_A_1_CounterParties_1']"))).selectByVisibleText("Alpha Convertible Fund Ltd.");
		     
		     driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_3_Q_identity']")).sendKeys("3");
		     Thread.sleep(2000);
		     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_3_A']"))).selectByVisibleText("Yes");
		     driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_3_A']")).sendKeys("1111");
		     driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_4_Q_identity']")).sendKeys("2");
		     Thread.sleep(2000);
		     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_4_A']"))).selectByVisibleText("Additional Termination Event");
		     Thread.sleep(2000);
		     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_2_A_Options_1']"))).selectByVisibleText("1 - Counterparty");
		     Thread.sleep(2000);
		     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_2_A_1_CounterParties_1']"))).selectByVisibleText("ABC Bank AG");
		     Thread.sleep(2000);
		     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_3_bench']"))).selectByVisibleText("Yes");
		     driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_3_1_bench']")).sendKeys("123456");
		     driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_btnSubmit']")).click();
		//--------------------------------------------------------------------------------------------     
		     // Fill Other Additional Termination Events / Other Events of Default
		     
		//------------------------------------------------------------------------------------------     
		     //Fill ATE / EoD - Key Person Privision
		
		  driver.findElement(By.linkText("ATE / EoD - Key Person")).click();
		   driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_lbl_1_Q_identity']")).sendKeys("1");
		   Thread.sleep(2000);
		     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_1_A_Options']"))).selectByVisibleText("Yes");
		     Thread.sleep(2000);
		     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_1_A_Options_1']"))).selectByVisibleText("1 - Person");
		     driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_1_A_1_Person_1']")).sendKeys("ABCD");
		     driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_Q_Sub2_identity']")).sendKeys("2");
		     driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_1_A_Select_2']")).sendKeys("EFGH");
		     driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_Q_Sub3_identity']")).sendKeys("3");
		     Thread.sleep(2000);
		     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_1_A_Select_2_1']"))).selectByVisibleText("Yes");
		     Thread.sleep(2000);
		     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_1_A_Select_2_1_Third']"))).selectByVisibleText("Yes");
		     driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_Sub2_Set1']")).sendKeys("3");
		     Thread.sleep(2000);
		     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_Sub2_Set1']"))).selectByVisibleText("Calendar Days");
		     Thread.sleep(2000);
		     driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_Q_Sub4_identity']")).sendKeys("4");
		     Thread.sleep(2000);
		     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_1_A_Options_3']"))).selectByVisibleText("Additional Termination Event");
		     
		     Thread.sleep(2000);
		     driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_Q_CP_identity']")).sendKeys("5");
			   Thread.sleep(2000);
			     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_1_A_Options_CP']"))).selectByVisibleText("Yes");
			     Thread.sleep(2000);
			     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_1_A_Options_1_CP']"))).selectByVisibleText("1 - Person");
			     driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_1_A_1_Person_CP1']")).sendKeys("ABCD");
			     driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_Q_Sub2_CP_identity']")).sendKeys("6");
			     driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_1_A_Select_2_CP']")).sendKeys("IJKL");
			     driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_Q_Sub3_CP_identity']")).sendKeys("7");
			     Thread.sleep(2000);
			     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_1_A_Select_2_1_CP']"))).selectByVisibleText("Yes");
			     Thread.sleep(2000);
			     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_1_A_Select_2_1_Third_CP']"))).selectByVisibleText("Yes");
			     driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_Sub2_Set1_CP']")).sendKeys("7");
			     Thread.sleep(2000);
			     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_Sub2_Set1_CP']"))).selectByVisibleText("Calendar Days");
			     Thread.sleep(2000);
			     driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_Q_Sub4_CP_identity']")).sendKeys("8");
			     Thread.sleep(2000);
			     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_1_A_Options_3_CP']"))).selectByVisibleText("Additional Termination Event");
			     Thread.sleep(2000);
			     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_3_bench']"))).selectByVisibleText("Yes");
			     driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_3_1_bench']")).sendKeys("123456");
			     driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_btnSubmit']")).click();
		//-----------------------------------------------------------------------------------------------------
		
		//Fill Definition of Investment Adviser / Manager Privision
		 driver.findElement(By.linkText("Definition of Investment Adviser / Manager")).click();
		   driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_Q_identity']")).sendKeys("1");
		   Thread.sleep(2000);
		     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_1_A']"))).selectByVisibleText("Yes");
		     driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_1_A']")).sendKeys("1111");
		
		     driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_2_Q_identity']")).sendKeys("2");
			   Thread.sleep(2000);
			     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_2_A']"))).selectByVisibleText("Yes");
			     driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_2_A']")).sendKeys("2222");
			     driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_btnSubmit']")).click();
		//-----------------------------------------------------------------------------------------------------	    
			     
			     //Fill ATE / EoD - Investment Adviser / Manager Related Provisions Provision
		 driver.findElement(By.linkText("ATE / EoD - Investment Adviser / Manager Related Provisions")).click();
		   driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_Q_identity']")).sendKeys("1");
		   Thread.sleep(2000);
		     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_1_A']"))).selectByVisibleText("Yes");
		     driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_Q_Sub2_identity']")).sendKeys("2");
			   Thread.sleep(2000);
			 new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_2_Q_Sub2']"))).selectByVisibleText("Yes");
			 Thread.sleep(2000);
			 new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_2_Q_Sub2_Set1']"))).selectByVisibleText("Yes");
			 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_Sub2_Set1']")).sendKeys("2222");
			 Thread.sleep(2000);
			 new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_Sub2_Set1']"))).selectByVisibleText("Calendar Days");
			 Thread.sleep(2000); 
			 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_Q_Sub1_identity']")).sendKeys("3");
			  Thread.sleep(2000);
			  new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_1_A_Sub1']"))).selectByVisibleText("Additional Termination Event");
			     
			  Thread.sleep(2000); 
			  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_Q_CP_identity']")).sendKeys("4");
			  Thread.sleep(2000);
			  new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_1_A_CP']"))).selectByVisibleText("Yes");
			  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_Q_Sub2_CP_identity']")).sendKeys("5");
		      Thread.sleep(2000);
			  new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_2_Q_Sub2_CP']"))).selectByVisibleText("Yes");
		       Thread.sleep(2000);
			  new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_2_Q_Sub2_Set1_CP']"))).selectByVisibleText("Yes");
			driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_Sub2_Set1_CP']")).sendKeys("2222");
			Thread.sleep(2000);
			 new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_Sub2_Set1_CP']"))).selectByVisibleText("Calendar Days");
			 Thread.sleep(2000); 
			 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_Q_Sub1_CP_identity']")).sendKeys("6");
			 Thread.sleep(2000);
			 new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_1_A_Sub1_CP']"))).selectByVisibleText("Additional Termination Event");
		      new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_3_bench']"))).selectByVisibleText("Yes");
			driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_3_1_bench']")).sendKeys("123456");
			 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_btnSubmit']")).click();
	
			 //--------------------------------------------------------------------------------------
			 //Fill ATE / EoD Failure to Deliver Information Provision
			 driver.findElement(By.linkText("ATE / EoD Failure to Deliver Information")).click();
			   driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_Q_identity']")).sendKeys("1");
			   Thread.sleep(2000);
			     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_1_A']"))).selectByVisibleText("Yes");
			    // new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_1_A']"))).selectByVisibleText("Yes");
			     driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_1_Q_identity']")).sendKeys("2");
			     driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_1_1_A']")).sendKeys("2222");
			     driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_2_Q']")).sendKeys("3");
			     Thread.sleep(2000);
			     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_1_2_A']"))).selectByVisibleText("Calendar Days");
			     driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_1_2_A1']")).sendKeys("3333");
			     driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_3_Q_identity']")).sendKeys("4");
			     Thread.sleep(2000);
			     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_1_3_A']"))).selectByVisibleText("Yes");
			     driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_4_Q_identity']")).sendKeys("5");
			     Thread.sleep(2000);
			     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_1_4_A']"))).selectByVisibleText("Additional Termination Event");
			     
			     Thread.sleep(2000);
			     driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_2_Q_identity']")).sendKeys("6");
				   Thread.sleep(2000);
				     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_2_A']"))).selectByVisibleText("Yes");
				    // new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_1_A']"))).selectByVisibleText("Yes");
				     driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_2_1_Q_identity']")).sendKeys("7");
				     driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_2_1_A']")).sendKeys("7777");
				     driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_2_2_Q_identity']")).sendKeys("8");
				     Thread.sleep(2000);
				     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_2_2_A']"))).selectByVisibleText("Calendar Days");
				     driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_2_2_A']")).sendKeys("8888");
				     driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_2_3_Q_identity']")).sendKeys("9");
				     Thread.sleep(2000);
				     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_2_3_A']"))).selectByVisibleText("Yes");
				     driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_2_4_Q_identity']")).sendKeys("10");
				     Thread.sleep(2000);
				     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_2_4_A']"))).selectByVisibleText("Additional Termination Event");
				     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_3_bench']"))).selectByVisibleText("Yes");
						driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_3_1_bench']")).sendKeys("123456");
						 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_btnSubmit']")).click();
			    //--------------------------------------------------------------------------------------------------
						// Fill ATE / EoD - ERISA Provisions  
		 driver.findElement(By.linkText("ATE / EoD - ERISA Provisions")).click();
		   driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_Q_identity']")).sendKeys("1");
		   Thread.sleep(2000);
		     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_1_A']"))).selectByVisibleText("Yes");
		     driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_1_1_A']")).sendKeys("1111");
		     Thread.sleep(2000);
		     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_1_2_A']"))).selectByVisibleText("Additional Termination Event");
		     Thread.sleep(3000);
		     driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_btnCopyClientEntities']")).click();
		     Thread.sleep(2000);
		     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_3_bench']"))).selectByVisibleText("Yes");
				driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_3_1_bench']")).sendKeys("123456");
				 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_btnSubmit']")).click();		 
			//---------------------------------------------------------------------------------------------------			 
						//Fill ATE / EoD - Other ATE / EoD Provisions
				 driver.findElement(By.linkText("ATE / EoD - Other ATE / EoD Provisions")).click();
				   Thread.sleep(2000);
				     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_1_A_Options']"))).selectByVisibleText("Yes");
				     Thread.sleep(2000);
				     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_1_A_Options_1']"))).selectByVisibleText("1 - Number");
				     driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_1_A_1_Person_1']")).sendKeys("1111");
				     driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_1_Q_identity1']")).sendKeys("1");
				     Thread.sleep(2000);
				     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_1_A_2_Person_1']"))).selectByVisibleText("Additional Termination Event");
				     Thread.sleep(2000);
				     driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_1_Q_identity2']")).sendKeys("2");
				     
				     Thread.sleep(3000);
				     driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_btnCopyClientEntities']")).click();
				     Thread.sleep(2000);
				     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_3_bench']"))).selectByVisibleText("Yes");
						driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_3_1_bench']")).sendKeys("123456");
						 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_btnSubmit']")).click();
				 //-------------------------------------------------------------------------------------------------
		//Fill Elective / Optional Termination Right Provision
		           driver.findElement(By.linkText("Elective / Optional Termination Right")).click();
		           Thread.sleep(2000);
		           new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_1_A']"))).selectByVisibleText("Yes");
		           Thread.sleep(2000);
		           driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_1_Q_identity']")).sendKeys("1"); 
		           Thread.sleep(2000);
		           driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_1_1_A']")).sendKeys("1111");
		           Thread.sleep(2000);
		           driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_1_2_A']")).sendKeys("2222");
		           Thread.sleep(2000);
		           new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_1_3_A']"))).selectByVisibleText("Counterparty");
		           Thread.sleep(2000);
		           new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_1_4_A']"))).selectByVisibleText("Single Affected Party (Party electing the termination)");
		           Thread.sleep(2000);
				     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_3_bench']"))).selectByVisibleText("Yes");
						driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_3_1_bench']")).sendKeys("123456");
						 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_btnSubmit']")).click();
		           
		 //--------------------------------------------------------------------------------------------------------------          
		        //Fill    ATE / EoD and Other Notification Obligations Provision
		  driver.findElement(By.linkText("ATE / EoD and Other Notification Obligations")).click();
		  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_lbl_1_Q_identity']")).sendKeys("1"); 
          Thread.sleep(2000);
          new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_1_A']"))).selectByVisibleText("Yes");
          Thread.sleep(2000);
          driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_lbl_1_Q_Sub1_identity']")).sendKeys("2"); 
          driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_1_1_A']")).sendKeys("2222"); 
          Thread.sleep(2000);
          driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_lbl_2_Q_identity']")).sendKeys("3"); 
          Thread.sleep(2000);
          new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_2_A']"))).selectByVisibleText("Yes");
          Thread.sleep(2000);
          driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_2_1_A_YES']")).sendKeys("3333"); 
          Thread.sleep(2000);
          driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_lbl_3_Q_identify']")).sendKeys("4444"); 
          Thread.sleep(2000);
          new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_3_A']"))).selectByVisibleText("Yes");
          Thread.sleep(2000);
          driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_lbl_3_Q_Sub1_identify']")).sendKeys("5"); 
          driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_3_1_A']")).sendKeys("5555"); 
          driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_btnCopyClientEntities']")).click();
          Thread.sleep(2000);
		     new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_3_bench']"))).selectByVisibleText("Yes");
				driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_3_1_bench']")).sendKeys("123456");
				 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_btnSubmit']")).click();
       //---------------------------------------------------------------------------------------------------------
	   //Fill 	ATE / EoD - Ratings Event (Summary) Provision
				 driver.findElement(By.linkText("ATE / EoD - Ratings Event (Summary)")).click();
				 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_lbl_1_Q_identity']")).sendKeys("1");
				 Thread.sleep(2000);
		          new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_1_A']"))).selectByVisibleText("Yes");
				  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_1_1_A']")).sendKeys("1111"); 
		          Thread.sleep(2000);
		          driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_lbl_1_2_Q_Third_Identity']")).sendKeys("2"); 
		          Thread.sleep(2000);
		          new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_1_2_A']"))).selectByVisibleText("Additional Termination Event");
		          Thread.sleep(2000);
		          driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_lbl_2_Q_Identity']")).sendKeys("3"); 
		          Thread.sleep(2000);
		          new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_2_A']"))).selectByVisibleText("Yes");
		          driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_2_1_A']")).sendKeys("3333"); 
		          Thread.sleep(2000);
		          driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_lbl_2_2_Q_Third_Identity']")).sendKeys("4"); 
		          Thread.sleep(2000);
		          new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_2_2_A']"))).selectByVisibleText("Additional Termination Event");
		          new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_3_bench']"))).selectByVisibleText("Yes");
					driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_3_1_bench']")).sendKeys("123456");
					 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_btnSubmit']")).click();
		//-----------------------------------------------------------------------------------------------------------
		//Fill ATE / EoD - Ratings Event (Detailed) Provision
		/*
		 driver.findElement(By.linkText("ATE / EoD - Ratings Event (Detailed)")).click();
		 
		 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_Q_identity']")).sendKeys("1");
		 Thread.sleep(2000);
          new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_1_A']"))).selectByVisibleText("Yes");
          Thread.sleep(2000);
          new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_1_1_A']"))).selectByVisibleText("Additional Termination Event");
          Thread.sleep(2000);
          new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_1_2_GuarantorsSelection']"))).selectByVisibleText("1 Guarantor");
 		 Thread.sleep(2000);
          driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_CE_LongTermLink1']/a")).click();       
        // 1- GUARANTER
          
          
        
        
			 
          
          
          
			 String parentwindow=driver.getWindowHandle();//For Parent window 

			 for (String Child_Window : driver.getWindowHandles())
			         {
			             driver.switchTo().window(Child_Window);             //Switch to Child window
			                     
						 //Close Child window
						                   //Finally Switch to Parent Window
			          //driver.close();
          
			         }
          
          
          
          
          Thread.sleep(2000);
         // new Select(driver.findElement(By.id("one_uc_ddl_ClientEntities"))).selectByVisibleText("Alpha Convertible Fund Ltd.");  
          new Select(driver.findElement(By.id("one_uc_ddl_ClientEntities"))).selectByVisibleText("Alpha Convertible Fund Ltd."); 
          driver.findElement(By.xpath(".//*[@id='one_uc_txt_ClientEntity_Identify']")).sendKeys("1A");      
          driver.findElement(By.xpath(".//*[@id='one_uc_cbl_1_3_A_0']")).click();
          Thread.sleep(2000);
          driver.findElement(By.xpath(".//*[@id='one_uc_txt_1_3_Q_Identify']")).sendKeys("2B"); 
          Thread.sleep(2000);
          driver.findElement(By.xpath(".//*[@id='one_uc_txt_CE_Moody_Long_Q_1_Identify']")).sendKeys("3C");
          Thread.sleep(2000);
          new Select(driver.findElement(By.xpath(".//*[@id='one_uc_dd_CE_Moody_Long_A_1']"))).selectByVisibleText("Aaa");
          Thread.sleep(2000);
          new Select(driver.findElement(By.xpath(".//*[@id='one_uc_dd_CE_Moody_Long_A_2']"))).selectByVisibleText("1");
          Thread.sleep(2000);
          new Select(driver.findElement(By.xpath(".//*[@id='one_uc_dd_1_4_A']"))).selectByVisibleText("Yes");
          Thread.sleep(2000);
          driver.findElement(By.xpath(".//*[@id='one_uc_dd_4th_third_A_0']")).click();
          
          //new Select(driver.findElement(By.xpath(".//*[@id='one_uc_dd_1_4_A']"))).selectByVisibleText("Yes");  
          Thread.sleep(2000);
          driver.findElement(By.xpath(".//*[@id='one_uc_btnSubSubmit']")).click();
        Thread.sleep(2000);
          driver.close();
          driver.switchTo().window(parentwindow);
		  Thread.sleep(2000);
          driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_2_Q_Identity']")).sendKeys("2");
         // driver.findElement(By.id("ContentPlaceHolder1_ctl00_txt_2_Q_Identity")).sendKeys("2");
          Thread.sleep(2000);
          new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_2_A']"))).selectByVisibleText("Yes"); 
          Thread.sleep(2000);
          new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_2_1_A']"))).selectByVisibleText("Additional Termination Event"); 
          Thread.sleep(2000);
          new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_2_2_Q_GuarantorsSelection']"))).selectByVisibleText("1 Guarantor");
          Thread.sleep(2000);
          driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_CE_ShortTermLink1']/a")).click();
          //GUARANTER-2
          String parentwindow1=driver.getWindowHandle();//For Parent window 

			 for (String Child_Window : driver.getWindowHandles())
			         {
			             driver.switchTo().window(Child_Window); 
			         }
			
          new Select(driver.findElement(By.xpath(".//*[@id='SRCE3_ddl_ClientEntities']"))).selectByVisibleText("Alpha Convertible Fund Ltd.");         
          driver.findElement(By.xpath(".//*[@id='SRCE3_txt_1_3_Q_Identify']")).sendKeys("1A");      
          driver.findElement(By.xpath(".//*[@id='SRCE3_cbl_1_3_A_0']")).click();
          driver.findElement(By.xpath(".//*[@id='SRCE3_txt_CE_Moody_Long_Q_1_Identify']")).sendKeys("2B");
          Thread.sleep(2000);
          new Select(driver.findElement(By.xpath(".//*[@id='SRCE3_dd_CE_Moody_Long_A_1']"))).selectByVisibleText("P-1");  
          Thread.sleep(2000);
          new Select(driver.findElement(By.xpath(".//*[@id='SRCE3_dd_CE_Moody_Long_A_2']"))).selectByVisibleText("1");
          Thread.sleep(2000);
          new Select(driver.findElement(By.xpath(".//*[@id='SRCE3_dd_1_4_A']"))).selectByVisibleText("Yes");
          Thread.sleep(2000);
          driver.findElement(By.xpath(".//*[@id='SRCE3_dd_4th_third_A_0']")).click();
          Thread.sleep(2000);
          driver.findElement(By.xpath(".//*[@id='SRCE3_btnSubSubmit']")).click();
          Thread.sleep(2000);
          driver.close();
          driver.switchTo().window(parentwindow1);
          Thread.sleep(2000);
          driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_3_Q_Identity']")).sendKeys("3");
          Thread.sleep(2000);
          new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_3_A']"))).selectByVisibleText("Yes"); 
          Thread.sleep(2000);
          new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_3_1_A']"))).selectByVisibleText("Additional Termination Event"); 
          Thread.sleep(2000);
          new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl3_2_GuarantorSelection']"))).selectByVisibleText("1 Guarantor"); 
          //GUARANTER-3
          driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_CE_FinancialLink1']/a")).click();
          String parentwindow2=driver.getWindowHandle();//For Parent window 

			 for (String Child_Window : driver.getWindowHandles())
			         {
			             driver.switchTo().window(Child_Window); 
			         }
          new Select(driver.findElement(By.xpath(".//*[@id='Shortterm_Rating_ddl_ClientEntities']"))).selectByVisibleText("Alpha Convertible Fund Ltd.");         
          driver.findElement(By.xpath(".//*[@id='Shortterm_Rating_txt_3_Q_Identify']")).sendKeys("1A");      
          driver.findElement(By.xpath(".//*[@id='Shortterm_Rating_cbl_1_3_A_0']")).click();
          driver.findElement(By.xpath(".//*[@id='Shortterm_Rating_txt_CE_AM_Long_Q_1_Identify']")).sendKeys("2B");
          Thread.sleep(2000);
          new Select(driver.findElement(By.xpath(".//*[@id='Shortterm_Rating_dd_CE_AM_Long_A_1']"))).selectByVisibleText("A++");  
          Thread.sleep(2000);
          new Select(driver.findElement(By.xpath(".//*[@id='Shortterm_Rating_dd_CE_AM_Long_A_2']"))).selectByVisibleText("1");
          Thread.sleep(2000);
          new Select(driver.findElement(By.xpath(".//*[@id='Shortterm_Rating_dd_1_4_A']"))).selectByVisibleText("Yes");
          Thread.sleep(2000);
          driver.findElement(By.xpath(".//*[@id='Shortterm_Rating_dd_4th_third_A_0']")).click();
          Thread.sleep(2000);
          driver.findElement(By.xpath(".//*[@id='Shortterm_Rating_btnSubSubmit']")).click();
          Thread.sleep(2000);
          driver.close();
          driver.switchTo().window(parentwindow2);
          
          
          Thread.sleep(2000);
          driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_4_Q_Identity']")).sendKeys("4");
          Thread.sleep(2000);
          new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_4_A']"))).selectByVisibleText("Yes"); 
          Thread.sleep(2000);
          new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_4_1_A']"))).selectByVisibleText("Additional Termination Event"); 
          Thread.sleep(2000);
          new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_4_2_GuarantorsSelection']"))).selectByVisibleText("1 Guarantor"); 
          //GUARANTER-4
          driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_CP_LongTermLink1']/a")).click();
          String parentwindow3=driver.getWindowHandle();//For Parent window 

			 for (String Child_Window : driver.getWindowHandles())
			         {
			             driver.switchTo().window(Child_Window); 
			         }
          new Select(driver.findElement(By.xpath(".//*[@id='Loginterm_ddl_ClientEntities']"))).selectByVisibleText("ABC Bank AG");
          Thread.sleep(2000);
          driver.findElement(By.xpath(".//*[@id='Loginterm_txt_ClientEntity_Identity']")).sendKeys("1A");
          Thread.sleep(2000);
          driver.findElement(By.xpath(".//*[@id='Loginterm_cbl_1_3_A_0']")).click();
          Thread.sleep(2000);
          driver.findElement(By.xpath(".//*[@id='Loginterm_txt_1_3_Q_Identify']")).sendKeys("2B");
          Thread.sleep(2000);
          driver.findElement(By.xpath(".//*[@id='Loginterm_txt_CE_Moody_Long_Q_1_Identify']")).sendKeys("3C");
          Thread.sleep(2000);
          new Select(driver.findElement(By.xpath(".//*[@id='Loginterm_dd_CE_Moody_Long_A_1']"))).selectByVisibleText("Aaa");  
          Thread.sleep(2000);
          new Select(driver.findElement(By.xpath(".//*[@id='Loginterm_dd_CE_Moody_Long_A_2']"))).selectByVisibleText("1");
          Thread.sleep(2000);
          new Select(driver.findElement(By.xpath(".//*[@id='Loginterm_dd_1_4_A']"))).selectByVisibleText("Yes");
          Thread.sleep(2000);
          driver.findElement(By.xpath(".//*[@id='Loginterm_dd_4th_third_A_0']")).click();
          Thread.sleep(2000);
          driver.findElement(By.xpath(".//*[@id='Loginterm_btnSubSubmit']")).click();
          Thread.sleep(2000);
          driver.close();
          driver.switchTo().window(parentwindow3);
          Thread.sleep(2000);
          driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_5_Q_Identity']")).sendKeys("5");
          Thread.sleep(2000);
          new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_5_A']"))).selectByVisibleText("Yes"); 
          Thread.sleep(2000);
          new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_5_1_A']"))).selectByVisibleText("Additional Termination Event"); 
          Thread.sleep(2000);
          new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_5_2_Q_GuarantorsSelection']"))).selectByVisibleText("1 Guarantor"); 
          //GUARANTER-5
          driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_CP_ShorttermLink1']/a")).click();
          String parentwindow4=driver.getWindowHandle();//For Parent window 

			 for (String Child_Window : driver.getWindowHandles())
			         {
			             driver.switchTo().window(Child_Window); 
			         }
          new Select(driver.findElement(By.xpath(".//*[@id='Shortterm_Rating_ddl_ClientEntities']"))).selectByVisibleText("ABC Bank AG");         
          driver.findElement(By.xpath(".//*[@id='Shortterm_Rating_txt_1_3_Q_Identity']")).sendKeys("1A");      
          driver.findElement(By.xpath(".//*[@id='Shortterm_Rating_cbl_1_3_A_0']")).click();
          driver.findElement(By.xpath(".//*[@id='Shortterm_Rating_txt_CE_Moody_Long_Q_1_Identify']")).sendKeys("2B");
          Thread.sleep(2000);
          new Select(driver.findElement(By.xpath(".//*[@id='Shortterm_Rating_dd_CE_Moody_Long_A_1']"))).selectByVisibleText("P-1");  
          Thread.sleep(2000);
          new Select(driver.findElement(By.xpath(".//*[@id='Shortterm_Rating_dd_CE_Moody_Long_A_2']"))).selectByVisibleText("1");  
          Thread.sleep(2000);
          new Select(driver.findElement(By.xpath(".//*[@id='Shortterm_Rating_dd_1_4_A']"))).selectByVisibleText("Yes");
          Thread.sleep(2000);
          driver.findElement(By.xpath(".//*[@id='Shortterm_Rating_dd_4th_third_A_0']")).click();
          Thread.sleep(2000);
          driver.findElement(By.xpath(".//*[@id='Shortterm_Rating_btnSubSubmit']")).click();
          Thread.sleep(2000);
          driver.close();
          driver.switchTo().window(parentwindow4);
          Thread.sleep(2000);
          driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_6_Q_Identity']")).sendKeys("6");
          Thread.sleep(2000);
          new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_6_A']"))).selectByVisibleText("Yes"); 
          Thread.sleep(2000);
          new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_6_1_A']"))).selectByVisibleText("Additional Termination Event"); 
          Thread.sleep(2000);
          new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_6_2_GuarantorSelection']"))).selectByVisibleText("1 Guarantor"); 
         //GUARANTER-6
          driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_CP_FinancialStrengthLink1']/a")).click();
          String parentwindow5=driver.getWindowHandle();//For Parent window 

			 for (String Child_Window : driver.getWindowHandles())
			         {
			             driver.switchTo().window(Child_Window); 
			         }
          new Select(driver.findElement(By.xpath(".//*[@id='financialRating_ddl_ClientEntities']"))).selectByVisibleText("ABC Bank AG");         
          driver.findElement(By.xpath(".//*[@id='financialRating_txt_3_Q_Identify']")).sendKeys("1A");      
          driver.findElement(By.xpath(".//*[@id='financialRating_cbl_1_3_A_0']")).click();
          driver.findElement(By.xpath(".//*[@id='financialRating_txt_CE_AM_Long_Q_1_Identify']")).sendKeys("2B");
          Thread.sleep(2000);
          new Select(driver.findElement(By.xpath(".//*[@id='financialRating_dd_CE_AM_Long_A_1']"))).selectByVisibleText("A++");  
          Thread.sleep(2000);
          new Select(driver.findElement(By.xpath(".//*[@id='financialRating_dd_CE_AM_Long_A_2']"))).selectByVisibleText("1");  
          Thread.sleep(2000);
          new Select(driver.findElement(By.xpath(".//*[@id='financialRating_dd_1_4_A']"))).selectByVisibleText("Yes");
          Thread.sleep(2000);
          driver.findElement(By.xpath(".//*[@id='financialRating_dd_4th_third_A_0']")).click();
          Thread.sleep(2000);
          driver.findElement(By.xpath(".//*[@id='financialRating_btnSubSubmit']")).click();
          Thread.sleep(2000);
          driver.close();
          driver.switchTo().window(parentwindow4);
         
          Thread.sleep(2000);
         
          new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_3_bench']"))).selectByVisibleText("Yes");
			driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_3_1_bench']")).sendKeys("123456");
			 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_btnSubmit']")).click();
          
          //Fill ATE / EoD - CDS Spread 
          driver.findElement(By.linkText("ATE / EoD - CDS Spread")).click();
		  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_Q_identity']")).sendKeys("1");
		 Thread.sleep(2000);
          new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_1_A']"))).selectByVisibleText("Yes");
          driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_1_Q_Identify']")).sendKeys("2");
          Thread.sleep(2000);
          new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_1_1_A']"))).selectByVisibleText("Additional Termination Event");
          Thread.sleep(2000);
          new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_1_2_GuarantorsSelection']"))).selectByVisibleText("1 Guarantor");
 		 Thread.sleep(2000);
          driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_CDS_Spread_CELink1']/a")).click();       
        // 1- GUARANTER
          String parentwindow5=driver.getWindowHandle();//For Parent window 

			 for (String Child_Window : driver.getWindowHandles())
			         {
			             driver.switchTo().window(Child_Window); 
			         }
			 Thread.sleep(2000);
       new Select(driver.findElement(By.xpath(".//*[@id='Spread_CE_1_ddl_ClientEntities']"))).selectByVisibleText("Alpha Convertible Fund Ltd."); 
       Thread.sleep(2000);
       driver.findElement(By.xpath(".//*[@id='Spread_CE_1_txt_ClientEntity']")).sendKeys("1A");
       Thread.sleep(2000);
        driver.findElement(By.xpath(".//*[@id='Spread_CE_1_txt_1_3_Q_Identity']")).sendKeys("2B");
        Thread.sleep(2000);
        new Select(driver.findElement(By.xpath(".//*[@id='Spread_CE_1_ddl_1_3_A']"))).selectByVisibleText("Yes");  
        Thread.sleep(2000);
        new Select(driver.findElement(By.xpath(".//*[@id='Spread_CE_1_ddl_1_3_Sub_1']"))).selectByVisibleText("50");  
        Thread.sleep(2000);
        new Select(driver.findElement(By.xpath(".//*[@id='Spread_CE_1_ddl_1_3_Sub_2']"))).selectByVisibleText("1");  
        Thread.sleep(2000); 
        driver.findElement(By.xpath(".//*[@id='Spread_CE_1_txt_1_4_Q_Identity']")).sendKeys("3C");
        Thread.sleep(2000);
        new Select(driver.findElement(By.xpath(".//*[@id='Spread_CE_1_ddl_1_4_A']"))).selectByVisibleText("Yes");
        Thread.sleep(2000);
        new Select(driver.findElement(By.xpath(".//*[@id='Spread_CE_1_ddl_1_4_Sub_1']"))).selectByVisibleText("50");  
        Thread.sleep(2000);
        new Select(driver.findElement(By.xpath(".//*[@id='Spread_CE_1_ddl_1_4_Sub_2']"))).selectByVisibleText("1");  
        Thread.sleep(2000);
        new Select(driver.findElement(By.xpath(".//*[@id='Spread_CE_1_ddl_1_4_Sub_3']"))).selectByVisibleText("1");  
        Thread.sleep(2000);
        driver.findElement(By.xpath(".//*[@id='Spread_CE_1_btnSubSubmit']")).click(); 
        Thread.sleep(2000);
        driver.close();
        driver.switchTo().window(parentwindow5);
        
        driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_2_Q_Identity']")).sendKeys("3");
		 Thread.sleep(2000);
         new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_2_A']"))).selectByVisibleText("Yes");
         driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_2_1_Q_Identify']")).sendKeys("2");
         Thread.sleep(2000);
         new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_2_1_A']"))).selectByVisibleText("Additional Termination Event");
         Thread.sleep(2000);
         new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_2_2_GuarantorsSelection']"))).selectByVisibleText("1 Guarantor");
		 Thread.sleep(2000);
         driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_CDS_Spread_CPLink1']/a")).click();       
       // 1- GUARANTER
         String parentwindow6=driver.getWindowHandle();//For Parent window 

			 for (String Child_Window : driver.getWindowHandles())
			         {
			             driver.switchTo().window(Child_Window); 
			         }
			 Thread.sleep(2000);
      new Select(driver.findElement(By.xpath(".//*[@id='Spread_CP_2_ddl_ClientEntities']"))).selectByVisibleText("ABC Bank AG");
      Thread.sleep(2000);
      driver.findElement(By.xpath(".//*[@id='Spread_CP_2_txt_ClientEntity']")).sendKeys("1A"); 
      Thread.sleep(2000);
       driver.findElement(By.xpath(".//*[@id='Spread_CP_2_txt_1_3_Q_Identify']")).sendKeys("2B");
       Thread.sleep(2000);
       new Select(driver.findElement(By.xpath(".//*[@id='Spread_CP_2_ddl_1_3_A']"))).selectByVisibleText("Yes");  
       Thread.sleep(2000);
       new Select(driver.findElement(By.xpath(".//*[@id='Spread_CP_2_ddl_1_3_Sub_1']"))).selectByVisibleText("50");  
       Thread.sleep(2000);
       new Select(driver.findElement(By.xpath(".//*[@id='Spread_CP_2_ddl_1_3_Sub_2']"))).selectByVisibleText("1");  
       Thread.sleep(2000); 
       driver.findElement(By.xpath(".//*[@id='Spread_CP_2_txt_1_4_Q_Identify']")).sendKeys("3C");
       Thread.sleep(2000);
       new Select(driver.findElement(By.xpath(".//*[@id='Spread_CP_2_ddl_1_4_A']"))).selectByVisibleText("Yes");
       Thread.sleep(2000);
       new Select(driver.findElement(By.xpath(".//*[@id='Spread_CP_2_ddl_1_4_Sub_1']"))).selectByVisibleText("50");  
       Thread.sleep(2000);
       new Select(driver.findElement(By.xpath(".//*[@id='Spread_CP_2_ddl_1_4_Sub_2']"))).selectByVisibleText("1");  
       Thread.sleep(2000);
       new Select(driver.findElement(By.xpath(".//*[@id='Spread_CP_2_ddl_1_4_Sub_3']"))).selectByVisibleText("1");  
       Thread.sleep(2000);
       driver.findElement(By.xpath(".//*[@id='Spread_CP_2_btnSubSubmit']")).click(); 
       Thread.sleep(2000);
       driver.close();
       driver.switchTo().window(parentwindow6);
       Thread.sleep(2000);
       
       new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_3_bench']"))).selectByVisibleText("Yes");
			driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_3_1_bench']")).sendKeys("123456");
			 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_btnSubmit']")).click();
			 
			 //Fill Import of Default / Termination Event
		
		driver.findElement(By.linkText("Import of Default / Termination Event")).click();
		 Thread.sleep(2000);
	      new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_1_A']"))).selectByVisibleText("Yes");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_Q_identity']")).sendKeys("1");
		 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_1_1_A']")).sendKeys("1111");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_2_ids']")).sendKeys("2");
		 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_1_2_A']")).sendKeys("2222");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_btnCopyClientEntities']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_btnSubmit']")).click();
		
		//Fill Export of Default / Termination Event
		driver.findElement(By.linkText("Export of Default / Termination Event")).click();
		 Thread.sleep(2000);
	      new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_2_Q']"))).selectByVisibleText("Yes");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_Q_identity']")).sendKeys("1");
		 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_2_Q_1']")).sendKeys("1111");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_2_ids']")).sendKeys("2");
		 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_2_Q_2']")).sendKeys("2222");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_btnCopyClientEntities']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_btnSubmit']")).click();

		 //Fill Calculation Agent
		 //driver.findElement(By.linkText("Calculation Agent")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.partialLinkText("Calculation Agent")).click();
		 Thread.sleep(2000);
	      new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_1_A']"))).selectByVisibleText("Counterparty");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_lbl_1_Q_identity']")).sendKeys("1");
		 Thread.sleep(2000);
	      new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_2_A']"))).selectByVisibleText("Yes");
	      Thread.sleep(2000);
	      driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_lbl_3_Q_identity']")).sendKeys("2");
	      driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_3_A']")).sendKeys("2222"); 
	      Thread.sleep(2000);
	      driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_4_A']")).sendKeys("010203");
	      Thread.sleep(2000);
	      driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_lbl_6_Q_identity']")).sendKeys("3");
	      Thread.sleep(2000);
	      new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl6']"))).selectByVisibleText("Yes");
	      Thread.sleep(2000);
	      new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_3_bench']"))).selectByVisibleText("Yes");
	      Thread.sleep(2000);
	      driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_3_1_bench']")).sendKeys("123456");
	      driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_btnSubmit']")).click();
	      
	      //Fill Credit Support Providers / Guarantors
	      
	      driver.findElement(By.linkText("Credit Support Providers / Guarantors")).click();
			 Thread.sleep(2000);
		      new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_1_A']"))).selectByVisibleText("Yes");
			 Thread.sleep(2000);
			 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_lbl_1_Q_Sub1_identity']")).sendKeys("1");
			 Thread.sleep(2000);
		      new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_1_A_Sub1_1']"))).selectByVisibleText("1 - Client Entity");
		      Thread.sleep(2000);
		      new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_1_A_Sub1_1_1']"))).selectByVisibleText("Alpha Convertible Fund Ltd.");
		      Thread.sleep(2000);
		      new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_1_Q_Sub2']"))).selectByVisibleText("Yes");
		      Thread.sleep(2000);
				 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_lbl_2_Q_identity']")).sendKeys("2");
				 Thread.sleep(2000);
			      new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_2_A']"))).selectByVisibleText("Yes");
			      Thread.sleep(2000);
			      new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_2_A_Sub1_1']"))).selectByVisibleText("1 - Client Entity");
			      Thread.sleep(2000);
			      new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_2_A_Sub1_1_1']"))).selectByVisibleText("Alpha Convertible Fund Ltd.");
			      Thread.sleep(2000);
			      new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_3_A']"))).selectByVisibleText("Yes");
			    
				 Thread.sleep(2000);
				 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_lbl_3_Q_Sub1_identity']")).sendKeys("1");
				 Thread.sleep(2000);
			      new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_3_A_Sub1_1']"))).selectByVisibleText("1 - Counterparty");
			      Thread.sleep(2000);
			      new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_3_A_Sub1_1_1']"))).selectByVisibleText("ABC Bank AG");
			      Thread.sleep(2000);
			      new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_3_Q_Sub2']"))).selectByVisibleText("Yes");
			    
				 Thread.sleep(2000);
				 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_lbl_4_Q_identity']")).sendKeys("2");
				 Thread.sleep(2000);
			      new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_4_A']"))).selectByVisibleText("Yes");
			      Thread.sleep(2000);
			      new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_4_A_Sub1_1']"))).selectByVisibleText("1 - Counterparty");
			      Thread.sleep(2000);
			      new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_4_A_Sub1_1_1']"))).selectByVisibleText("ABC Bank AG");
			      Thread.sleep(2000);
			      new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_3_bench']"))).selectByVisibleText("Yes");
			      driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_3_1_bench']")).sendKeys("123456");
			      driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_btnSubmit']")).click();
			 
			 //Fill Fish or Cut Bait Provision
		 Thread.sleep(2000);
		 driver.findElement(By.linkText("Fish or Cut Bait Provision")).click();
		 Thread.sleep(2000);
	      new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_1_A']"))).selectByVisibleText("Yes");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_lbl_1_Q_Sub1_identity']")).sendKeys("1");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_1_1_A']")).sendKeys("1");
		 Thread.sleep(2000);
	      new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_1_1_A']"))).selectByVisibleText("Calendar Days");
	      Thread.sleep(2000);
			 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_lbl_1_Q_Sub2_identity']")).sendKeys("2");
			 Thread.sleep(2000);
			 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_1_2_A']")).sendKeys("2222");
			 Thread.sleep(2000);
		      new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_3_bench']"))).selectByVisibleText("Yes");
		      Thread.sleep(2000);
				 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_3_1_bench']")).sendKeys("123456");
				 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_btnSubmit']")).click();
			 
			 //Fill Limitation of Liability
				 Thread.sleep(2000);
				 driver.findElement(By.linkText("Limitation of Liability")).click();
				 Thread.sleep(2000);
			      new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_1_A']"))).selectByVisibleText("Yes");
				 Thread.sleep(2000);
				 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_lbl_1_Q_Sub1_identity']")).sendKeys("1");
				 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_1_1_A']")).sendKeys("1111");
				 Thread.sleep(2000);
			      new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_3_bench']"))).selectByVisibleText("Yes");
			      Thread.sleep(2000);
					 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_3_1_bench']")).sendKeys("123456");
					 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_btnSubmit']")).click();
					 
					 //Fill Modifications to Section 2(a)(iii) - Right to Withhold Payments
				Thread.sleep(2000);
			   driver.findElement(By.linkText("Modifications to Section 2(a)(iii) - Right to Withhold Payments")).click();
				Thread.sleep(2000);
				new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_1_A']"))).selectByVisibleText("Yes");
				Thread.sleep(2000);
				 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_lbl_1_Q_identity']")).sendKeys("1");
				 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_1_1_A']")).sendKeys("1111");
			     Thread.sleep(2000);
				 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_lbl_1_Q_Sub1_identity']")).sendKeys("2");
				 Thread.sleep(2000);
				 new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_3_bench']"))).selectByVisibleText("Yes");
				Thread.sleep(2000);
				driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_3_1_bench']")).sendKeys("123456");
				 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_btnSubmit']")).click();
							 
				//Fill Governing Law
				Thread.sleep(2000);
				driver.findElement(By.linkText("Governing Law")).click();
				 Thread.sleep(2000);
				 new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_1_A']"))).selectByVisibleText("New York");
				 Thread.sleep(2000);
				 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_lbl_1_Q_identity']")).sendKeys("1");
				Thread.sleep(2000);
				new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_3_bench']"))).selectByVisibleText("Yes");
				Thread.sleep(2000);
			     driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_3_1_bench']")).sendKeys("123456");
			     driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_btnSubmit']")).click();
									 
			    //Fill Jurisdiction
			 Thread.sleep(2000);
			 driver.findElement(By.linkText("Jurisdiction")).click();
			 Thread.sleep(2000);
			 new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_1_A']"))).selectByVisibleText("Yes");
			 Thread.sleep(2000);
			 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_lbl_1_Q_identity']")).sendKeys("1");
			driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_lbl_1_Q_Sub1_identity']")).sendKeys("2");
			 Thread.sleep(2000);
			 new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_1_A0']"))).selectByVisibleText("New York");
			 Thread.sleep(2000);
			  new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_3_bench']"))).selectByVisibleText("Yes");
			Thread.sleep(2000);
			 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_3_1_bench']")).sendKeys("123456");
		     driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_btnSubmit']")).click();
		     
		     //Fill Netting
		     Thread.sleep(2000);
			 driver.findElement(By.linkText("Netting")).click();
			 Thread.sleep(2000);
			 new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_1_A']"))).selectByVisibleText("Yes");
			 Thread.sleep(2000);
			 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_lbl_1_Q__identity']")).sendKeys("1");
			 Thread.sleep(2000);
			  new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_2_bench']"))).selectByVisibleText("Yes");
			Thread.sleep(2000);
			 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_2_1_bench']")).sendKeys("123456");
		     driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_btnSubmit']")).click();
		     
		     //Fill Set-Off
		     Thread.sleep(2000);
			 driver.findElement(By.linkText("Set-Off")).click();
			 Thread.sleep(2000);
			 new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_1_A']"))).selectByVisibleText("Yes");
			 Thread.sleep(2000);
			 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_lbl_1_Q_identity']")).sendKeys("1");
			 Thread.sleep(2000);
			 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_1_Q_identity']")).sendKeys("2");
			 Thread.sleep(2000);
			  new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_1_1_A']"))).selectByVisibleText("Set off across ALL other agreements");
			  Thread.sleep(2000);
			 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_2_Q_identity']")).sendKeys("3");
			Thread.sleep(2000);
			driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_1_2_A']")).sendKeys("4");
		    Thread.sleep(2000);
			 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_3_Q_identity']")).sendKeys("5");
			 Thread.sleep(2000);
			 new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_1_3_A']"))).selectByVisibleText("Yes");
			Thread.sleep(2000);
			driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_3_1_Q_identity']")).sendKeys("6");
			Thread.sleep(2000);
			 new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_1_3_1_A']"))).selectByVisibleText("1 - Client Entity");
			Thread.sleep(2000);
			new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddlaff_1_3_1_A_1']"))).selectByVisibleText("Alpha Convertible Fund Ltd.");
		     Thread.sleep(2000);
			 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_4_Q_identity']")).sendKeys("5");
			Thread.sleep(2000);
			 new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_1_4_A']"))).selectByVisibleText("Yes");
			 Thread.sleep(2000);
			 new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_1_4_1_A']"))).selectByVisibleText("1 - Counterparty");
			Thread.sleep(2000);
		  new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddlaff_1_4_1_A_1']"))).selectByVisibleText("ABC Bank AG");
			Thread.sleep(2000);
			driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_btnCopyClientEntities']")).click();
			 Thread.sleep(2000);
			 new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_2_3_1_A']"))).selectByVisibleText("1 - Counterparty");
			Thread.sleep(2000);
			new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddlaff_2_3_1_A_1']"))).selectByVisibleText("ABC Bank AG");
			 Thread.sleep(2000);
			 new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_2_4_1_A']"))).selectByVisibleText("1 - Client Entities");
			Thread.sleep(2000);
			 new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddlaff_2_4_1_A_1']"))).selectByVisibleText("Alpha Convertible Fund Ltd.");
			 Thread.sleep(2000);
			new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_3_bench']"))).selectByVisibleText("Yes");
			 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_3_1_bench']")).sendKeys("123456");
		     driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_btnSubmit']")).click();
		     
		     //Fill ISDA Protocols
		     Thread.sleep(2000);
			 driver.findElement(By.linkText("ISDA Protocols")).click();
		     Thread.sleep(2000);
			  new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_1_A']"))).selectByVisibleText("Yes");
			  Thread.sleep(2000);
			  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_lbl_1_1_Q_identity']")).sendKeys("1");
			  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_1_1_A']")).sendKeys("1111");
			  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_btnSubmit']")).click();
			  
			  //Fill Notes Regarding Schedule
			  Thread.sleep(2000);
				 driver.findElement(By.linkText("Notes Regarding Schedule")).click();
				 Thread.sleep(2000);
				  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txtNotes']")).sendKeys("123456");
				  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_btnSubmit']")).click();*/
		
		//ISDA CSA
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_btnCSA']")).click();
			/*	//CSA Operational Mechanisms
				//Fill Definition of Obligation Provision
		
		 Thread.sleep(2000);
		 driver.findElement(By.linkText("Definition of Obligation")).click();
          Thread.sleep(2000);
		  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_Q_identity']")).sendKeys("1");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_1_A']")).sendKeys("1111");
		  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_btnCopyClientEntities']")).click();
		  Thread.sleep(2000);
		  new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_3_bench']"))).selectByVisibleText("Yes");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_3_1_bench']")).sendKeys("123456");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_btnSubmit']")).click();
		  //Fill Definitions of Threshold
		  Thread.sleep(2000);
			 driver.findElement(By.linkText("Definitions of Threshold")).click();
			 Thread.sleep(2000);
			  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_1_Q_identity']")).sendKeys("1");
			  Thread.sleep(2000);
			  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_1_A']")).sendKeys("1111");
			  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_btnCopyClientEntities']")).click();
			  Thread.sleep(2000);
			  new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_3_bench']"))).selectByVisibleText("Yes");
			  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_3_1_bench']")).sendKeys("123456");
			  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_btnSubmit']")).click();
		//Fill Definitions of Minimum Transfer Amount and Rounding
			  Thread.sleep(2000);
				 driver.findElement(By.linkText("Definitions of Minimum Transfer Amount and Rounding")).click();
				 Thread.sleep(2000);
				  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_lbl_1_Q_identity']")).sendKeys("1");
				  Thread.sleep(2000);
				  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_1_A']")).sendKeys("1111");
				  Thread.sleep(2000);
				  new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddlCurrencyType_1']"))).selectByVisibleText("USD");
				  Thread.sleep(2000);
				  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_lbl_2_Q_identity']")).sendKeys("2");
				  Thread.sleep(2000);
				  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_2_A']")).sendKeys("2222");
				  Thread.sleep(2000);
				  new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddlCurrencyType_2']"))).selectByVisibleText("USD");
				  Thread.sleep(2000);
				  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_lbl_3_Q_identity']")).sendKeys("3");
				  Thread.sleep(2000);
				  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_3_A']")).sendKeys("3333");
				  Thread.sleep(2000);
				  new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddlCurrencyType_3']"))).selectByVisibleText("USD");
				  Thread.sleep(2000);
				  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_lbl_4_Q_identity']")).sendKeys("4");
				  Thread.sleep(2000);
				  driver.findElement(By.xpath("././/*[@id='ContentPlaceHolder1_ctl00_tb_4_A']")).sendKeys("4444");
				  Thread.sleep(2000);
				  new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddlCurrencyType_4']"))).selectByVisibleText("USD");
				  Thread.sleep(2000);
				  new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_3_bench']"))).selectByVisibleText("Yes");
				  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_3_1_bench']")).sendKeys("123456");
				  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_btnSubmit']")).click();
				  
				  //Fill Independent Amount
				  Thread.sleep(2000);
					 driver.findElement(By.linkText("Independent Amount")).click();
					 Thread.sleep(2000);
					  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_lbl_1_Q_identity']")).sendKeys("1");
					  Thread.sleep(2000);
					  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_1_A']")).sendKeys("1111");
					  Thread.sleep(2000);
					
						 driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_btnCopyClientEntities']")).click();
			           Thread.sleep(2000);
			           new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_3_bench']"))).selectByVisibleText("Yes");
						  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_3_1_bench']")).sendKeys("123456");
						  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_btnSubmit']")).click();
						  
						  //Fill Independent Amount - FX Transactions
						  Thread.sleep(2000);
							 driver.findElement(By.linkText("Independent Amount - FX Transactions")).click();
							 Thread.sleep(2000);
							  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_lbl_1_Q_identity']")).sendKeys("1");
							  Thread.sleep(2000);
							  new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_1_Answer_Options']"))).selectByVisibleText("Yes");
							  Thread.sleep(2000);
							  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_1_A_1']")).sendKeys("1111");
							  Thread.sleep(2000);
							  new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_1_SelectOptions_3']"))).selectByVisibleText("Yes");
							  Thread.sleep(2000);
							  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_1_3_A']")).sendKeys("2");
							  Thread.sleep(2000);
							  new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_1_3_A_Options']"))).selectByVisibleText("Calendar Days");
							  Thread.sleep(2000);
							  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_lbl_1_Q_CP_identity']")).sendKeys("3");
							  Thread.sleep(2000);
							  new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_1_Answer_Options_CP']"))).selectByVisibleText("Yes");
         driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_1_A_1_CP']")).sendKeys("3333");
         Thread.sleep(2000);
		  new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_1_SelectOptions_3_CP']"))).selectByVisibleText("Yes");	
		  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_1_1_A']")).sendKeys("3333");
	         Thread.sleep(2000);
			  new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_1_1_A']"))).selectByVisibleText("Calendar Days");
			  Thread.sleep(2000);
			  new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_2_bench']"))).selectByVisibleText("Yes");
			  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_2_1_bench']")).sendKeys("123456");
			  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_btnSubmit']")).click();
			  
			  //Fill Independent Amount - Other Transactions
			  Thread.sleep(2000);
				 driver.findElement(By.linkText("Independent Amount - Other Transactions")).click();
				 Thread.sleep(2000);
				  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_lbl_1_Q_identity']")).sendKeys("1");
				  Thread.sleep(2000);
				  new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_1_Answer_Options']"))).selectByVisibleText("Yes");
				  Thread.sleep(2000);
				  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_lbl_1_Q_1_identity']")).sendKeys("2");
				  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_1_A_1']")).sendKeys("2222");
				  Thread.sleep(2000);
				  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_lbl_1_Q_2_identity']")).sendKeys("3");
				  Thread.sleep(2000);
				  new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_1_Q_2_AnswerOptions']"))).selectByVisibleText("Yes");
				  Thread.sleep(2000);
				  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_lbl_1_Q_2_Sub1_identity']")).sendKeys("4");
				  Thread.sleep(2000);
				  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_1_3_A']")).sendKeys("4");
				  Thread.sleep(2000);
				  new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_1_3_A_Options']"))).selectByVisibleText("Calendar Days");
				  Thread.sleep(2000);
				  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_lbl_1_Q_CP_identity']")).sendKeys("5");
				  Thread.sleep(2000);
				  new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_1_Answer_Options_CP']"))).selectByVisibleText("Yes");
				  Thread.sleep(2000);
				  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_lbl_1_Q_1_CP_identity']")).sendKeys("6");
				  Thread.sleep(2000);
				  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_1_A_1_CP']")).sendKeys("6666");
				  Thread.sleep(2000);
				  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_lbl_1_Q_2_CP_identity']")).sendKeys("7");
				  Thread.sleep(2000);
				  new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_1_Q_2_AnswerOptions_CP']"))).selectByVisibleText("Yes");		 
				  Thread.sleep(2000);
				  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_lbl_1_Q_2_Sub1_CP_identity']")).sendKeys("8");
				  Thread.sleep(2000);
				  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_1_3_A']")).sendKeys("8888");
				  Thread.sleep(2000);
				  new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_1_1_A']"))).selectByVisibleText("Calendar Days");		 
				  Thread.sleep(2000);
				  new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_2_bench']"))).selectByVisibleText("Yes");
				  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_2_1_bench']")).sendKeys("123456");
				  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_btnSubmit']")).click();
				  
				  //Fill Super Collateralization
				  Thread.sleep(2000);
					 driver.findElement(By.linkText("Super Collateralization")).click();
					 Thread.sleep(2000);
					  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_lbl_1_Q_identity']")).sendKeys("1");
					  Thread.sleep(2000);
					  new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_1_Answer_Options']"))).selectByVisibleText("Yes");
					  Thread.sleep(2000);
					  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_lbl_1_Q_1_identity']")).sendKeys("2");
					  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_1_A_1']")).sendKeys("2222");
					  Thread.sleep(2000);
					  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_lbl_1_Q_CP_identity']")).sendKeys("3");
					  Thread.sleep(2000);
					  new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_1_Answer_Options_CP']"))).selectByVisibleText("Yes");
					  Thread.sleep(2000);
					  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_lbl_1_Q_1_CP_identity']")).sendKeys("4");
					  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_1_A_1_CP']")).sendKeys("4444");
					  Thread.sleep(2000);
					  new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_3_bench']"))).selectByVisibleText("Yes");
					  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_3_1_bench']")).sendKeys("123456");
					  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_btnSubmit']")).click();
				  //Fill Valuation Agent, Valuation Mechanics, Transfer Timing
					  Thread.sleep(2000);
						 driver.findElement(By.linkText("Valuation Agent, Valuation Mechanics, Transfer Timing")).click();
						 Thread.sleep(2000);
						  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_lbl_1_Q_identity']")).sendKeys("1");
						  Thread.sleep(2000);
						  new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_1_Answer_Options']"))).selectByVisibleText("Counterparty");
						  Thread.sleep(2000);
						  new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_3_Answer_Options']"))).selectByVisibleText("Yes");
						  Thread.sleep(2000);
						  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_3_A']")).sendKeys("1111");
						  Thread.sleep(2000);
						  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_lbl_4_Q_identity']")).sendKeys("2");
						  Thread.sleep(2000);
						  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_4_A']")).sendKeys("2222");
						  Thread.sleep(2000);
						  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_lbl_6_Q_identity']")).sendKeys("3");
						  Thread.sleep(2000);
						  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_6_A']")).sendKeys("33333");
						  Thread.sleep(2000);
						  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_lbl_8_Q_identity']")).sendKeys("4");
						  Thread.sleep(2000);
						  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_8_A']")).sendKeys("4444");
						  Thread.sleep(2000);
						  new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_8_A_ampn']"))).selectByVisibleText("AM");
						  Thread.sleep(2000);
						  new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_8_Answer1_Options']"))).selectByVisibleText("Central Time");
						  Thread.sleep(2000);
						  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_lbl_10_Q_identity']")).sendKeys("5");
						  Thread.sleep(2000);
						  new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_10_Answer_Options']"))).selectByVisibleText("Same Local Business Day if call made by Notification Time, Next Local Business Day if made after Notification Time");
						  Thread.sleep(2000);
						  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_btnCopyClientEntities']")).click();
						  Thread.sleep(2000);
						  new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_3_bench']"))).selectByVisibleText("Yes");
						  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_3_1_bench']")).sendKeys("123456");
						  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_btnSubmit']")).click();*/
				  // Fill Distributions and Interest Amount
				  
						  Thread.sleep(2000);
							 driver.findElement(By.linkText("Distributions and Interest Amount")).click();
							 Thread.sleep(2000);
							  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_lbl_1_Q_identity']")).sendKeys("1");	  
							  Thread.sleep(2000);
							  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_1_A']")).sendKeys("1111");	  
							  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_btnCopyClientEntities']")).click();
							  Thread.sleep(2000);
							  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_lbl_3_Q_identity']")).sendKeys("2");
							  Thread.sleep(2000);
							  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_3_A']")).sendKeys("2222");
							  Thread.sleep(2000);
							  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_lbl_4_Q_identity']")).sendKeys("3");
							  new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_4_Answer_Options']"))).selectByVisibleText("Yes");
							  Thread.sleep(2000);
							  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_txt_4_Answer_1']")).sendKeys("3333");
							  Thread.sleep(2000);
							  new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_3_bench']"))).selectByVisibleText("Yes");
							  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_3_1_bench']")).sendKeys("123456");
							  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_btnSubmit']")).click();
				  
				  //Fill Bilateral / Unilateral CSA
							  Thread.sleep(2000);
								 driver.findElement(By.linkText("Bilateral / Unilateral CSA")).click();
							  new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_1_A']"))).selectByVisibleText("Yes");
							  new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_3_bench']"))).selectByVisibleText("Yes");
							  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_3_1_bench']")).sendKeys("123456");
							  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_btnSubmit']")).click();
				  //Fill Credit Support Obligations - Paragraph 3
				  
							  Thread.sleep(2000);
								 driver.findElement(By.linkText("Credit Support Obligations - Paragraph 3")).click();
								 Thread.sleep(2000);
								  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_lbl_1_Q_identity']")).sendKeys("1");	  
								  Thread.sleep(2000);
								  new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_1_Answer_Options']"))).selectByVisibleText("Yes");
								  Thread.sleep(2000);
								  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_lbl_1_1_Q_identity']")).sendKeys("2");	
								  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_1_A']")).sendKeys("22222");	
								  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_lbl_2_Q_identity']")).sendKeys("3");		  
								  Thread.sleep(2000);
								  new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_2_Answer_Options']"))).selectByVisibleText("Yes");
								  Thread.sleep(2000);
								  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_lbl_2_Q_2_identity']")).sendKeys("4");	
								  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_2_A']")).sendKeys("22222");	
								  new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_3_bench']"))).selectByVisibleText("Yes");
								  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_3_1_bench']")).sendKeys("123456");
								  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_btnSubmit']")).click();
				  
				  
				  //Fill Exposure / Local Business Day Definitions
								  Thread.sleep(2000);
									 driver.findElement(By.linkText("Exposure / Local Business Day Definitions")).click();
									 Thread.sleep(2000);
									  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_lbl_1_Q_identity']")).sendKeys("1");	  
									  Thread.sleep(2000);
									  new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_1_A']"))).selectByVisibleText("Yes");
									  Thread.sleep(2000);
									  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_lbl_1_Q_Sub_identity']")).sendKeys("2");	
									  Thread.sleep(2000);
									  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_1_Sub_A']")).sendKeys("2222");	
				                       Thread.sleep(2000);
									  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_lbl_3_Q_identity']")).sendKeys("3");
									  Thread.sleep(2000);
									  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_3_A']")).sendKeys("3333");
									  new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_3_bench']"))).selectByVisibleText("Yes");
									  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_3_1_bench']")).sendKeys("123456");
									  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_btnSubmit']")).click();
				  //Fill Definition of Eligible Collateral
									  Thread.sleep(2000);
										 driver.findElement(By.linkText("Definition of Eligible Collateral")).click();
										 Thread.sleep(2000);
										  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_lbl_1_Q_identity']")).sendKeys("1");	  
										  Thread.sleep(2000);
										  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_1_A']")).sendKeys("1111");	  
										  Thread.sleep(2000);
										  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_lbl_2_Q_identity']")).sendKeys("2");	  
										  Thread.sleep(2000);
										  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_2_A']")).sendKeys("2222");	  
										  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_btnCopyClientEntities']")).click();
										  new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_3_bench']"))).selectByVisibleText("Yes");
										  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_3_1_bench']")).sendKeys("123456");
										  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_btnSubmit']")).click();
										  
										  //Fill Conditions Precedent and Secured Party's Rights and Remedies - Paragraph 13(d)
				  
				  //dropdown 
		// new Select(driver.findElement(By.id("ContentPlaceHolder1_ddlCounterParty"))).selectByIndex(2);
		 
										  Thread.sleep(2000);
											 driver.findElement(By.linkText("Conditions Precedent and Secured Party's Rights and Remedies - Paragraph 13(d)")).click();
											 Thread.sleep(2000);
											  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_3_1_bench']")).sendKeys("1");	  
											  Thread.sleep(2000);
											  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_1_A']")).sendKeys("1111");	  
											  Thread.sleep(2000);
											  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_lbl_2_Q_identity']")).sendKeys("2");	  
											  Thread.sleep(2000);
											  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_2_A']")).sendKeys("2222");
											  Thread.sleep(2000);
											  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_lbl_3_Q_identity']")).sendKeys("3");
											  new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_3_Answer_Options']"))).selectByVisibleText("Yes");
											  Thread.sleep(2000);
											  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_lbl_4_Q_identity']")).sendKeys("3");
											  new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_4_Answer_Options']"))).selectByVisibleText("Yes");
											  Thread.sleep(2000);
											  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_4_A']")).sendKeys("3333");
											  Thread.sleep(2000);
											  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_lbl_5_Q_identity']")).sendKeys("4");
											  new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_5_Answer_Options']"))).selectByVisibleText("Yes");
											  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_lbl_5_Q_Sub1_identity']")).sendKeys("5");
											  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_5_A']")).sendKeys("5555");
											  new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_ddl_6_Answer_Options']"))).selectByVisibleText("Yes");
											  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_lbl_6_Q_Sub1_identity']")).sendKeys("6");
											  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_6_A']")).sendKeys("6666");
											  new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_dd_3_bench']"))).selectByVisibleText("Yes");
											  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_tb_3_1_bench']")).sendKeys("1223456");
											  driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ctl00_btnSubmit']")).click();
											  
											  
											  
		
											  
											  
											  
											  
											  
											  
											  
											  
											  
											  
											  
											  
											  
											  
											  
											  
											  
											  
											  
											  
											  
											  
											  
											  
											  
											  
											  
											  
											  
											  
											  
		// by visible text new Select(driver.findElement(By.id("ContentPlaceHolder1_ddlCounterParty"))).selectByVisibleText("asd");

		// by value  new Select(driver.findElement(By.id("ContentPlaceHolder1_ddlCounterParty"))).selectByValue("6");
	/*	
       WebDriver driver = new FirefoxDriver();
       driver.get("http://73f03a3c373340a596d220e47e539824.cloudapp.net/");
    
       
       
       
   	   driver.manage().window().maximize();
       driver.findElement(By.id("txtUserName")).sendKeys("karthikadmin");
       driver.findElement(By.id("txtPassword")).sendKeys("123456");
       driver.findElement(By.id("btnSubmit")).click();
       driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);*/
       /*
       
      
       driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[2]/a")).click();
       driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[2]/ul/li[1]/a")).click();
       driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_txtSearchTerm']")).sendKeys("Alpha");
       driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_btnSubmit']")).click();
		
       driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[3]/a/span")).click();	
       driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[3]/ul/li[1]/a")).click();
       driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[3]/ul/li[1]/ul/li[3]/a")).click();
       driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_txtSearchTerm']")).sendKeys("Alpha");
       driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_btnButton']")).click();
       
       driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[3]/ul/li[1]/ul/li[5]/a")).click();
       driver.findElement(By.xpath("..//*[@id='ContentPlaceHolder1_txtSearchTerm']")).sendKeys("Alpha");
       driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_btnButton']")).click();*/
		
		
		
    
       //client
		 
		 
		//Archive code
		 
       /*
        driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[5]/a/span")).click();
		driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[5]/ul/li[1]/a")).click();
		driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[5]/ul/li[1]/ul/li[2]/a")).click();
		driver.findElement(By.xpath(".//*[@id='sample-table-2']/tbody/tr/td[5]/a")).click();
		
		 Set<String> AllWindowHandles = driver.getWindowHandles();
		  String window1 = (String) AllWindowHandles.toArray()[0];
		 // System.out.print("window1 handle code = "+AllWindowHandles.toArray()[0]);
		  String window2 = (String) AllWindowHandles.toArray()[1];
		
		  if( driver.switchTo().window(window2) != null){
		  driver.findElement(By.xpath(".//*[@id='btnClose']")).click();
		
		  System.out.println("Close Window Successfully");
          }
		 else {//if( driver.switchTo().window(window1) != null){
			   driver.findElement(By.xpath(".//*[@id='btnArchive']")).click();
			  driver.findElement(By.xpath(".//*[@id='btnClose']")).click();
			  System.out.println("Archive Successfull");
			 }*/
		  
		  
	
		 
	  }
		  }
	  }
    }
}
   // }

	
		
//}
   // }
    //}

//}
	

       
       
       
    
	
    
