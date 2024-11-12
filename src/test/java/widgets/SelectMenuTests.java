package widgets;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Resources.Base;
import Resources.BasicActions;
import WidgetsLocators.SelectMenuLocators;
import elementsLocators.homePageLocators;

public class SelectMenuTests extends Base {

	@Test
	public void SelectMenuTest() {

		BasicActions ba = new BasicActions();
		homePageLocators hpl = PageFactory.initElements(driver, homePageLocators.class);
		SelectMenuLocators sml = PageFactory.initElements(driver, SelectMenuLocators.class);

		ba.NavToReqModule(hpl.HomePageWidgets(), hpl.SelectMenu());
		ba.SelectElementFromDropdown(sml.SelectValue(), sml.SelectValueList(), "Group 1, option 2");
		ba.SelectElementFromDropdown(sml.SelectTitle(), sml.SelectTitleList(), "Mrs.");
		ba.SelectElementFromDropdown(sml.OldSelectMenu(), sml.OldSelectMenuList(), "Green");
		ba.ScrollUsingJSE(sml.MultiSelectDropdown());
		ba.SelectElementFromDropdown(sml.MultiSelectDropdown(), sml.MultiSelectDropdownList(), "Green");
		ba.SelectElementFromList(sml.StandardMultiSelect(), "Saab");

	}

}
