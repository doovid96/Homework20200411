package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import framework.SuperPageObject;

public class DragAndDropPage extends SuperPageObject {

	public DragAndDropPage(final WebDriver webDriverInstance, final String domainNameInstance) {
		super(webDriverInstance, domainNameInstance);
	}
	
	public DragAndDropPage navigate() {
		super.navigate("/drag_and_drop");
		return this;
	}

	public DragAndDropPage dragAndDrop() {
		final String sourceSelector = "#column-a > header";
		final String destinationSelector = "#column-b > header";
		final WebElement sourceElement = webDriver.findElement(By.cssSelector(sourceSelector));
		final WebElement destinationElement = webDriver.findElement(By.cssSelector(destinationSelector));
		new Actions(webDriver)
			.moveToElement(sourceElement)
			.clickAndHold()
			.moveToElement(destinationElement)
			.release()
			.build()
			.perform();
		return this;
	}

	public String getColumnAText() {
		final String columnASelector = "#column-a";
		return webDriver.findElement(By.cssSelector(columnASelector)).getText();
	}

	public String getColumnBText() {
		final String columnBSelector = "#column-b";
		return webDriver.findElement(By.cssSelector(columnBSelector)).getText();
	}

}
