package tests;

import org.testng.annotations.Test;

import framework.SuperTestClass;
import pages.AutomationPracticeFormPage;

public class FillFormTest extends SuperTestClass {

	@Test
	public void fillFormtest() {
		
		final String url = "https://demoqa.com/automation-practice-form";
		final String firstName = "John";
		final String lastName = "Doe";
		final String sex = "Male";
		final String yearsOfExperience = "5";
		final String date = java.time.LocalDate.now().toString();
		final String tester = "Automation Tester";
		final String automationTool = "Selenium Webdriver";
		final String continent = "North America";
		final String command = "Switch Commands";
		
		AutomationPracticeFormPage page = new AutomationPracticeFormPage(webDriver, url)
			.navigate()
			.enterFirstName(firstName)
			.enterLastName(lastName)
			.enterSex(sex)
			.enterYearsOfExperience(yearsOfExperience)
			.enterDate(date)
			.enterTester(tester)
			.enterAutomationTool(automationTool)
			.enterContinent(continent)
			.enterContinentMultiple(continent)
			.enterCommand(command);
		
		try {Thread.sleep(10000L);} catch (InterruptedException e) {e.printStackTrace();}
		
	}
	
}
