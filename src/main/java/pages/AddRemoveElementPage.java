package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import framework.SuperPageObject;

public class AddRemoveElementPage extends SuperPageObject {

	public AddRemoveElementPage(final WebDriver webDriverInstance, final String domainNameInstance) {
		super(webDriverInstance, domainNameInstance);
	}
	
	public AddRemoveElementPage navigate() {
		super.navigate("/add_remove_elements/");
		return this;
	}

	public AddRemoveElementPage addElements(final int toAdd) {
		final String xpathExpression = "//button[text()='Add Element']";
		final WebElement button = webDriver.findElement(By.xpath(xpathExpression));
		for (int i = 0; i < toAdd; ++i) {
			button.click();
		}
		return this;
	}

	public AddRemoveElementPage removeElements(final int toRemove) {
		final String xpathExpression = "//button[text()='Delete']";
		for (int i = 0; i < toRemove; ++i) {
			webDriver.findElement(By.xpath(xpathExpression)).click();
		}
		return this;
	}

	public int addedElementCount() {
		final String selector = "#elements> button";
		return webDriver.findElements(By.cssSelector(selector)).size();
	}

}
