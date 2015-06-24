package com.koya.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClientArchive {

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
			
			driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[5]/a/span")).click();
			driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[5]/ul/li[1]/a")).click();
			driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[5]/ul/li[1]/ul/li[2]/a")).click();
			Thread.sleep(5000);
			String parentwindow=driver.getWindowHandle();
			driver.findElement(By.xpath("//a[@href='ArchiveClient.aspx?ID=10']")).click();
			Thread.sleep(3000);
			for (String Child_Window : driver.getWindowHandles())
	        {
	            driver.switchTo().window(Child_Window);             
	                       
	        }
			driver.findElement(By.xpath(".//*[@id='btnClose']")).click();
			driver.switchTo().window(parentwindow);
			Thread.sleep(3000);
			driver.findElement(By.xpath(".//*[@id='main-container']/div/div/div[2]/div/div/div/div/div/div/div[1]/div/a")).click();
			driver.close();
			
			
	
	}
}