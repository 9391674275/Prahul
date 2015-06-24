package com.koya.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EditProfile {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://73f03a3c373340a596d220e47e539824.cloudapp.net/newclient.aspx");
		driver.findElement(By.xpath(".//*[@id='txtUserName']")).sendKeys("sivaemployee");
		driver.findElement(By.xpath(".//*[@id='txtPassword']")).sendKeys("123456");
		driver.findElement(By.xpath(".//*[@id='login-box']/div[1]/div[1]/fieldset/div[3]/label/input")).click();
		driver.findElement(By.xpath(".//*[@id='btnSubmit']")).click();
		Thread.sleep(5000);
		
		for(int i=0;i<10;i++)
        {
                 driver.findElement(By.tagName("body")).sendKeys(Keys.DOWN);
        }
		

		driver.findElement(By.xpath(".//*[@id='main-container']/div/div/div[2]/div/div/div/div/div/div[1]/div[2]/div[1]/div[2]/div/div[1]/a")).click();
		WebElement fname=driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_txtfname']"));
		fname.clear();
		fname.sendKeys("Siva Rama Krishna");
		WebElement lname=driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_txtlname']"));
		lname.clear();
		lname.sendKeys("A");
		WebElement phno=driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_txtTelePhoneNo']"));
		phno.clear();
		phno.sendKeys("0866-2471");
		WebElement element = driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_txtMobile']"));
		element.clear();
		element.sendKeys("9368527410");
		
		driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_btnSubmit']")).click();
		Thread.sleep(3000);
		
		

		  driver.findElement(By.tagName("html")).sendKeys(
		    Keys.chord(Keys.CONTROL, Keys.ADD));
		 
		  driver.findElement(By.tagName("html")).sendKeys(
		    Keys.chord(Keys.CONTROL, Keys.SUBTRACT));
		  
		  driver.findElement(By.tagName("html")).sendKeys(
				    Keys.chord(Keys.CONTROL, Keys.SUBTRACT));
	}
}