package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import framework.SuperTestClass;
import pages.KeyPressPage;

public class KeyPressTest extends SuperTestClass {

	@Test
	public void keyPressTest() {
		
		final char[] inputKeyArray = "abcdefghijklmnopqrstuvwxyz0123456789".toCharArray();
		final String preText = "You entered: ";
		
		final KeyPressPage page = new KeyPressPage(webDriver, "http://the-internet.herokuapp.com")
			.navigate()
			.initializeTextBoxWebElement()
			.clickOnTextBox();
		
		for (final char inputKey : inputKeyArray) {
			page.sendLetter(inputKey);
			final String actualText = page.getResult();
			final String expectedText = preText.concat(Character.toString(inputKey).toUpperCase());
			Assert.assertEquals(actualText, expectedText);
		}
	}
	
}
