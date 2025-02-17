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
		homePageLocators hpl = PageFactory.initElements(Driver(), homePageLocators.class);
		AutoCompleteLocators acl = PageFactory.initElements(Driver(), AutoCompleteLocators.class);

		ba.NavToReqModule(hpl.HomePageWidgets(), hpl.AutoComplete());
		ba.ScrollUsingJSE(acl.MultipleColourInput());
		ba.SendKeys(acl.MultipleColourInput(), MultiColour1);
		ba.ScrollUsingJSE(acl.MultipleColourInput());
		ba.SelectElementFromList(acl.MultiColourOptions(), MultiColour1);
		ba.ScrollUsingJSE(acl.MultipleColourInput());
		ba.SendKeys(acl.MultipleColourInput(), MultiColour2);
		ba.ScrollUsingJSE(acl.MultipleColourInput());
		ba.SelectElementFromList(acl.MultiColourOptions(), MultiColour2);
		ba.ScrollUsingJSE(acl.SingleColourInput());
		ba.SendKeys(acl.SingleColourInput(), SingleColour);
		ba.ScrollUsingJSE(acl.SingleColourInput());
		ba.SelectElementFromList(acl.singleColourOptions(), SingleColour);

	}

}
