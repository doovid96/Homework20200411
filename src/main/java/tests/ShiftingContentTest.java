package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import framework.SuperTestClass;
import pages.ShiftingContentPage;

public class ShiftingContentTest extends SuperTestClass {

	@Test
	public void shiftingContentTest() {
		
		final String text = "Important Information You're Looking For";
		
		ShiftingContentPage page = new ShiftingContentPage(webDriver, "http://the-internet.herokuapp.com/")
			.navigate();
		
		Assert.assertTrue(page.canFindText(text), "Unable to locate text.");
		
	}
	
}
