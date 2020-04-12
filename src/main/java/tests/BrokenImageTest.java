package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import framework.SuperTestClass;
import pages.BrokenImagePage;

public class BrokenImageTest extends SuperTestClass {

	@Test
	public void brokenImageTest() {
		
		final String url = "http://the-internet.herokuapp.com";
		
		BrokenImagePage page = new BrokenImagePage(webDriver, url)
			.navigate();
		
		Assert.assertEquals(page.isBrokenImage(1), true);
		Assert.assertEquals(page.isBrokenImage(2), true);
		Assert.assertEquals(page.isBrokenImage(3), false);
		
	}
	
}
