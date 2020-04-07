package TestCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample1Test {
	WebDriver driver;
	
	@Test 
	public void apple() {
		System.out.println("Hello apple");
		
	}

	@BeforeClass
	public void mango() {
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		
		}
	
	@BeforeMethod
	public void orange() {
		driver.get("https://www.ihg.com/rewardsclub/gb/en/enrollment/join");
		driver.manage().window().maximize();
	}
	

	
	@AfterSuite
	public void lussy() {
		driver.close();
		
	}
	@AfterTest
	public void grapes() {
		System.out.println(driver.getCurrentUrl());
		
	}

}
