package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import framework.SuperPageObject;

public class KeyPressPage extends SuperPageObject {
	
	private WebElement inputElement;
	
	public KeyPressPage(final WebDriver webDriverInstance, final String domainNameInstance) {
		super(webDriverInstance, domainNameInstance);
	}

	public KeyPressPage navigate() {
		super.navigate("/key_presses");
		return this;
	}

	public KeyPressPage initializeTextBoxWebElement() {
		final String selector = "#target";
		inputElement = webDriver.findElement(By.cssSelector(selector));
		return this;
	}
	
	public KeyPressPage clickOnTextBox() {
		inputElement.click();
		return this;
	}

	public void sendLetter(final char letter) {
		inputElement.sendKeys(Character.toString(letter));
	}

	public String getResult() {
		final String selector = "#result";
		return webDriver.findElement(By.cssSelector(selector)).getText();
	}

	
}
