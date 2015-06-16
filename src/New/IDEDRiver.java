package New;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IDEDRiver {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://www.google.com");
		System.out.println("Title is: "+driver.getTitle());
		System.out.println("Title is: "+driver.getCurrentUrl());
		System.out.println("Title is: "+driver.getWindowHandle());
		System.out.println("Title is: "+driver.hashCode());
		System.out.println("Title is: "+driver.toString());
		
		
		
		
		//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

	}

}
