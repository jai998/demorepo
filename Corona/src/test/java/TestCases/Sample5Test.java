package TestCases;

import org.testng.annotations.Test;

public class Sample5Test {

	@Test(groups = {"sanity"})
	public void facebook() {
		System.out.println("Hello im facebook");
	}
	@Test(groups = {"smoke"})
	public void hangouts() {
		System.out.println("Hello im hangouts");
	}
}
