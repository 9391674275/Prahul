package com.koya.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Signin {
	public static void sign(String user,String pass,String url)
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.xpath(".//*[@id='txtUserName']")).sendKeys(user);
		driver.findElement(By.xpath(".//*[@id='txtPassword']")).sendKeys(pass);
		driver.findElement(By.xpath(".//*[@id='login-box']/div[1]/div[1]/fieldset/div[3]/label/input")).click();
		driver.findElement(By.xpath(".//*[@id='btnSubmit']")).click();
		driver.close();
	}

	

}
