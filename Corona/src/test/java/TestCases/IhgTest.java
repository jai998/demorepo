package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class IhgTest {
	WebDriver driver;
	@BeforeClass
	public void methods() {
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		 driver = new ChromeDriver();
	}
	@Test
	public void methods1() {
	
	
		driver.get("https://www.ihg.com/rewardsclub/gb/en/enrollment/join");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("firstName")).sendKeys("jai");
		
		
		
	}

}
