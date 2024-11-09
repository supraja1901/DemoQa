package widgets;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Resources.Base;
import Resources.BasicActions;
import WidgetsLocators.AutoCompleteLocators;
import elementsLocators.homePageLocators;

public class AutoCompleteTests extends Base {

	@Test
	public void AutoCompleteTest() {

		String MultiColour1 = "Yellow";
		String MultiColour2 = "Blue";
		String SingleColour = "Yellow";

		BasicActions ba = new BasicActions();
		homePageLocators hpl = PageFactory.initElements(driver, homePageLocators.class);
		AutoCompleteLocators acl = PageFactory.initElements(driver, AutoCompleteLocators.class);

		ba.NavToReqModule(hpl.HomePageWidgets(), hpl.AutoComplete());
		ba.SendKeys(acl.MultipleColourInput(), MultiColour1);
		ba.SelectElementFromList(acl.MultiColourOptions(), MultiColour1);
		ba.SendKeys(acl.MultipleColourInput(), MultiColour2);
		ba.SelectElementFromList(acl.MultiColourOptions(), MultiColour2);
		ba.SendKeys(acl.SingleColourInput(), SingleColour);
		ba.SelectElementFromList(acl.singleColourOptions(), SingleColour);

	}

}
