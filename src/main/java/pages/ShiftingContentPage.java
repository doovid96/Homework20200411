package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import framework.SuperPageObject;

public class ShiftingContentPage extends SuperPageObject {

	public ShiftingContentPage(final WebDriver webDriverInstance, final String domainNameInstance) {
		super(webDriverInstance, domainNameInstance);
	}

	public ShiftingContentPage navigate() {
		super.navigate("/shifting_content/list");
		return this;
	}

	public boolean canFindText(final String substring) {
		final String xpathExpression = "//*[@id=\"content\"]/div/div/div";
		return webDriver.findElement(By.xpath(xpathExpression)).getText().contains(substring);
	}
	
}
