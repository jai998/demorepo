package TestCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleTest {
	
	@Test
	public void apple() {
		System.out.println("Hello apple");
		
	}

	@BeforeClass
	public void mango() {
		System.out.println("hello mango");
	}
	
	@BeforeMethod
	public void orange() {
		System.out.println("Hello orange");
	}
	
	@AfterClass
	public void carrot() {
		System.out.println("Hello carrot");
	}
	
	@AfterSuite
	public void lussy() {
		System.out.println("Hello lussy");
	}
	@AfterTest
	public void grapes() {
		System.out.println("Hello grapes");
	}
	
}


