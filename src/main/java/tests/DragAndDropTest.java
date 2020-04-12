package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import framework.SuperTestClass;
import pages.DragAndDropPage;

public class DragAndDropTest extends SuperTestClass {

	@Test
	public void dragAndDropTest() {
		
		final String expectedColumnAText = "B";
		final String expectedColumnBText = "A";
		
		DragAndDropPage page = new DragAndDropPage(webDriver, "http://the-internet.herokuapp.com")
			.navigate()
			.dragAndDrop();
		
		final String actualColumnAText = page.getColumnAText();
		final String actualColumnBText = page.getColumnBText();
		Assert.assertEquals(actualColumnAText, expectedColumnAText);
		Assert.assertEquals(actualColumnBText, expectedColumnBText);
		
	}
	
}
