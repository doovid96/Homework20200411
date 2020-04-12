package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import framework.SuperTestClass;
import pages.AutomationPracticeFormPage;

public class FillNameTest extends SuperTestClass {

	@Test
	public void fillNameTest() {
		
		final String firstName = "John";
		final String lastName = "Doe";
		
		AutomationPracticeFormPage page = new AutomationPracticeFormPage(webDriver, "https://demoqa.com/automation-practice-form")
			.navigate()
			.enterFirstName(firstName)
			.enterLastName(lastName);
		
		Assert.assertEquals(page.getFirstName(), firstName);
		Assert.assertEquals(page.getLastName(), lastName);
		
	}
	
}
