package interactionsTests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Resources.Base;
import Resources.BasicActions;
import elementsLocators.homePageLocators;
import interactionsLocators.SelectableLocators;
import interactionsLocators.SortableLocators;

public class SelectableTests extends Base {

	@Test
	public void SelectableTest() {

		BasicActions ba = new BasicActions();
		homePageLocators hpl = PageFactory.initElements(driver, homePageLocators.class);
		SortableLocators stl = PageFactory.initElements(driver, SortableLocators.class);
		SelectableLocators scl = PageFactory.initElements(driver, SelectableLocators.class);
		Actions actions=new Actions(driver);
		
		ba.NavToReqModule(hpl.HomePageInteractions(), hpl.Selectable());
		ba.click(stl.List());
		ba.SelectWthGetAttribute(null);
		
		

	}

}
