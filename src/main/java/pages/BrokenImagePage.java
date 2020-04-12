package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import framework.SuperPageObject;

public class BrokenImagePage extends SuperPageObject {

	public BrokenImagePage(final WebDriver webDriverInstance, final String domainNameInstance) {
		super(webDriverInstance, domainNameInstance);
	}
	
	public BrokenImagePage navigate() {
		super.navigate("/broken_images");
		return this;
	}

	public boolean isBrokenImage(final int index) {
		final String selector = "#content > div > img";
		WebElement image = webDriver.findElements(By.cssSelector(selector)).get(index - 1);
		return image.getAttribute("naturalWidth").equals("0");
	}

}
