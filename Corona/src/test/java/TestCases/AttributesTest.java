package TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class AttributesTest {
	
	@Test(priority=1 , dependsOnMethods="three")
	public void one() {
		System.out.println("one");
	}

	@Test( priority=2)
	public void two() {
		System.out.println("two");
	}
	@Test(priority=3 , invocationCount=3 , threadPoolSize =2 , alwaysRun=true , timeOut = (2000) )
	public void three() {
		System.out.println("three");
	}
	@Test(priority=4)
	public void four() {
		System.out.println("four");
	}
	
}
