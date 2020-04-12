package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import framework.SuperTestClass;
import pages.TablesPage;

public class SortByLastNameTest extends SuperTestClass {

	@Test
	public void sortByLastNameTest() {
		
		TablesPage page = new TablesPage(webDriver, "http://the-internet.herokuapp.com/")
			.navigate()
			.sortByLastName();
		
		Assert.assertTrue(page.isSortedByLastName(), "The table is not sorted.");
	}
	
}
