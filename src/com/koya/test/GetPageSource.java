package com.koya.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetPageSource {

	public static void main(String[] args) throws Exception{
		
			String url="http://73f03a3c373340a596d220e47e539824.cloudapp.net";
			WebDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();			
			driver.get(url);
			
			driver.findElement(By.xpath(".//*[@id='txtUserName']")).sendKeys("chiruadmin");
			driver.findElement(By.xpath(".//*[@id='txtPassword']")).sendKeys("123456");
			driver.findElement(By.xpath(".//*[@id='login-box']/div[1]/div[1]/fieldset/div[3]/label/input")).click();
			driver.findElement(By.xpath(".//*[@id='btnSubmit']")).click();
			Thread.sleep(5000);
			
			driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[4]/a/span")).click();
			System.out.println(" Clicking On Reports");
			driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[4]/ul/li[1]/a")).click();
			System.out.println(" Clicking On Predefined Reports");
			driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[4]/ul/li[1]/ul/li[1]/a")).click();
			System.out.println("Selecting ISDA");
			Thread.sleep(5000);
			if(driver.getPageSource().contains("Krishna March 2015")==true)
			{
				System.out.println("Yes");
			}
			//WebElement q=  driver.findElement(By.xpath("Krishna March 2015"));
			driver.findElement(By.xpath("//td[contains(.,'Krishna March 2015')]/following-sibling::.//*[@id='sample-table-2']/tbody/tr/td/a")).click();
			
	}
}

