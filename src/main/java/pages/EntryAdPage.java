package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import framework.SuperPageObject;

public class EntryAdPage extends SuperPageObject {

	public EntryAdPage(final WebDriver webDriverInstance, final String domainNameInstance) {
		super(webDriverInstance, domainNameInstance);
	}
	
	public EntryAdPage navigate() {
		super.navigate("/entry_ad");
		return this;
	}

	public EntryAdPage closeModalWindow() {
		WebDriverWait wait = new WebDriverWait(webDriver, 10);
		final String selector = "#modal > div.modal > div.modal-footer > p";
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(selector)));
		return this;
	}

	public String getTitle() {
		final String selector = "#content > div.example > h3";
		return webDriver.findElement(By.cssSelector(selector)).getText();
	}

	public EntryAdPage switchToActiveWindow() {
		webDriver.switchTo().activeElement();
		return this;
	}
	
	
}
