package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import framework.SuperTestClass;
import pages.EntryAdPage;

public class EntryAdTest extends SuperTestClass {

	@Test
	public void entryAdTest() {
		
		final String expectedText = "Entry Ad";
		
		EntryAdPage page = new EntryAdPage(webDriver, "http://the-internet.herokuapp.com/")
			.navigate()
			.closeModalWindow()
			.switchToActiveWindow();
		
		Assert.assertEquals(page.getTitle(), expectedText);
		
	}
	
}
