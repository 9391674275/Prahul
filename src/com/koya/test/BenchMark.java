package com.koya.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BenchMark {

	
	public static void main(String[] args) throws Exception {
		String url="http://clientdemo.cloudapp.net/";
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.navigate().refresh();
		driver.get(url);
		
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("sivaemployee");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("123456");
		driver.findElement(By.cssSelector("input[class='ace']")).click();
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		Thread.sleep(8000);
		
		driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[3]/a/span")).click();
		driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[3]/ul/li[1]/a")).click();
		driver.findElement(By.xpath(".//*[@id='sidebar']/ul/li[3]/ul/li[1]/ul/li[2]/a")).click();
		Thread.sleep(5000);
		
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddlClient']"))).selectByVisibleText("Alpha Advisors LLC");
		Thread.sleep(4000);
		new Select(driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ddlClientEntityList']"))).selectByVisibleText("Alpha Convertible Fund Ltd");
		Thread.sleep(4000);
		
		String parentwindow=driver.getWindowHandle();
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_btnPreview']")).click();
		for (String Child_Window : driver.getWindowHandles())
        {
            driver.switchTo().window(Child_Window);
                                    
        }
		Thread.sleep(15000);
		driver.findElement(By.xpath(".//*[@id='form1']/div[4]/div/div/div[2]/div/a")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='btnGeneratePDF']")).click();
		Thread.sleep(5000);
		driver.close();
		driver.switchTo().window(parentwindow);

		
		
	}

}
