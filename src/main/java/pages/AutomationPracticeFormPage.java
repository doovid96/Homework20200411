package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import framework.SuperPageObject;

public class AutomationPracticeFormPage extends SuperPageObject {

	public AutomationPracticeFormPage(final WebDriver webDriverInstance, final String domainNameInstance) {
		super(webDriverInstance, domainNameInstance);
	}
	
	public AutomationPracticeFormPage navigate() {
		super.navigate("");
		return this;
	}

	public AutomationPracticeFormPage enterFirstName(final String firstName) {
		final String xpathExpression = "//*[@id=\"content\"]/div[2]/div/form/fieldset/div[8]/input";
		webDriver.findElement(By.xpath(xpathExpression)).sendKeys(firstName);
		return this;
	}

	public AutomationPracticeFormPage enterLastName(final String lastName) {
		final String xpathExpression = "//*[@id=\"lastname\"]";
		webDriver.findElement(By.xpath(xpathExpression)).sendKeys(lastName);
		return this;
	}

	public String getFirstName() {
		final String xpathExpression = "//*[@id=\"content\"]/div[2]/div/form/fieldset/div[8]/input";
		return webDriver.findElement(By.xpath(xpathExpression)).getAttribute("value");
	}

	public String getLastName() {
		final String xpathExpression = "//*[@id=\"lastname\"]";
		return webDriver.findElement(By.xpath(xpathExpression)).getAttribute("value");
	}

	public AutomationPracticeFormPage enterSex(final String sex) {
		final String xpathExpression = String.format("//*[@class='control-group']/input[@value='%s']", sex);
		webDriver.findElement(By.xpath(xpathExpression)).click();
		return this;
	}

	public AutomationPracticeFormPage enterYearsOfExperience(final String years) {
		final String xpathExpression = String.format("//*[@class='control-group']/input[@value='%s']", years);
		webDriver.findElement(By.xpath(xpathExpression)).click();
		return this;
	}

	public AutomationPracticeFormPage enterDate(final String date) {
		final String xpathExpression = "//*[@id='datepicker']";
		webDriver.findElement(By.xpath(xpathExpression)).sendKeys(date);
		return this;
	}

	public AutomationPracticeFormPage enterTester(final String tester) {
		final String xpathExpression = String.format("//*[@class='control-group']/input[@value='%s']", tester);
		webDriver.findElement(By.xpath(xpathExpression)).click();
		return this;
	}

	public AutomationPracticeFormPage enterAutomationTool(final String automationTool) {
		final String xpathExpression = String.format("//*[@class='control-group']/input[@value='%s']", automationTool);
		webDriver.findElement(By.xpath(xpathExpression)).click();
		return this;
	}

	public AutomationPracticeFormPage enterContinent(final String continent) {
		final String xpathExpression = "//*[@id=\"continents\"]";
		Select selection = new Select(webDriver.findElement(By.xpath(xpathExpression)));
		selection.selectByVisibleText(continent);
		return this;
	}

	public AutomationPracticeFormPage enterContinentMultiple(final String continent) {
		final String xpathExpression = String.format("//*[@id='continentsmultiple']/option[text()='%s']", continent);
		webDriver.findElement(By.xpath(xpathExpression)).click();
		return this;
	}

	public AutomationPracticeFormPage enterCommand(final String command) {
		final String xpathExpression = String.format("//*[@id='selenium_commands']/option[text()='%s']", command);
		webDriver.findElement(By.xpath(xpathExpression)).click();
		return this;
	}

}
