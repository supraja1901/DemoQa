package interactionsTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Resources.Base;
import Resources.BasicActions;
import elementsLocators.homePageLocators;
import interactionsLocators.SortableLocators;

public class SortableTests extends Base {

	@Test
	public void SortableTest() {

		BasicActions ba = new BasicActions();
		homePageLocators hpl = PageFactory.initElements(driver, homePageLocators.class);
		SortableLocators stl = PageFactory.initElements(driver, SortableLocators.class);

		ba.NavToReqModule(hpl.HomePageInteractions(), hpl.Sortable());
		ba.click(stl.List());
		ba.SortElements(stl.ListWebElements().get(0), stl.ListWebElements().get(1));
		ba.AssertWithContains(stl.ListWebElements().get(0), "Two");
		ba.click(stl.Grid());
		ba.SortElements(stl.GridWebElements().get(0), stl.GridWebElements().get(1));
		ba.AssertWithContains(stl.GridWebElements().get(0), "Two");

	}

}
