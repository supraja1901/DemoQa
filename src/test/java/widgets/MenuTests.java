package widgets;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Resources.Base;
import Resources.BasicActions;
import WidgetsLocators.MenuLocators;
import elementsLocators.homePageLocators;

public class MenuTests extends Base {

	@Test
	public void MenuTest() {

		BasicActions ba = new BasicActions();
		homePageLocators hpl = PageFactory.initElements(Driver(), homePageLocators.class);
		MenuLocators ml = PageFactory.initElements(Driver(), MenuLocators.class);

//		Actions actions = new Actions(Driver());

		ba.NavToReqModule(hpl.HomePageWidgets(), hpl.Menu());
		ba.hoverOverElement(ml.MenuList(), 1);
		ba.hoverOverElement(ml.MenuItem2List(), 2);
		ba.hoverOverElement(ml.SubSubList(), 1);
		System.out.println(ba.GetText(ml.SubSubList().get(1)));
//		actions.moveToElement().perform(); // Hover over the menu
//		actions.moveToElement(submenu).click().perform(); // Click the submenu item

	}
}
