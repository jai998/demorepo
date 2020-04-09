package TestCases;

import org.testng.annotations.Test;

public class Sample4Test {
	
	@Test(groups = {"regression"})
	public void mail() {
		System.out.println("Hello im mail");
	}
	@Test(groups = {"regression"})
	public void inbox() {
		System.out.println("Hello im inbox");
	}
	@Test(groups = {"sanity"})
	public void sentbox() {
		System.out.println("Hello im sentbox");
	}

}
