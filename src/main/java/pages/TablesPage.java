package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import framework.SuperPageObject;

public class TablesPage extends SuperPageObject {

	public TablesPage(WebDriver webDriverInstance, String domainNameInstance) {
		super(webDriverInstance, domainNameInstance);
	}

	public TablesPage navigate() {
		super.navigate("/tables");
		return this;
	}

	public TablesPage sortByLastName() {
		final String xpathExpression = "//*[@id=\"table1\"]/thead/tr/th/span[text()='Last Name']";
		webDriver.findElement(By.xpath(xpathExpression)).click();
		return this;
	}

	public boolean isSortedByLastName() {
		final String xpathExpression = "//*[@id=\"table1\"]/tbody/tr/td[1]";
		List<WebElement> lastNameElements = webDriver.findElements(By.xpath(xpathExpression));
		if (lastNameElements.size() <= 1) {
			return true;
		}
		String current = lastNameElements.get(0).getText();
		for (int i = 1; i < lastNameElements.size(); ++i) {
			final String compareTo = lastNameElements.get(i).getText();
			if (current.compareToIgnoreCase(compareTo) > 0) {
				return false;
			}
			current = compareTo;
		}
		return true;
	}
	
}
