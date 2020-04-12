package tests;

import java.util.concurrent.ThreadLocalRandom;

import org.testng.Assert;
import org.testng.annotations.Test;

import framework.SuperTestClass;
import pages.AddRemoveElementPage;

public class AddRemoveElementTest extends SuperTestClass {

	@Test
	public void addRemoveElementTest() {
		
		final int lowerBound = 1;
		final int upperBound = 10;
		final int elementsToAdd = ThreadLocalRandom.current().nextInt(lowerBound, upperBound);
		final int elementsToDelete = ThreadLocalRandom.current().nextInt(elementsToAdd);
		
		AddRemoveElementPage page = new AddRemoveElementPage(webDriver, "http://the-internet.herokuapp.com/")
			.navigate()
			.addElements(elementsToAdd)
			.removeElements(elementsToDelete);
		
		final int actualRemainingElements = page.addedElementCount();
		final int expectedRemainingElements = elementsToAdd - elementsToDelete;
		Assert.assertEquals(actualRemainingElements, expectedRemainingElements);
	}
	
}
