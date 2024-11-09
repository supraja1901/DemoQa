package widgets;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Resources.Base;
import Resources.BasicActions;
import WidgetsLocators.ToolTipsLocators;
import elementsLocators.homePageLocators;

public class ToolTipTests extends Base {

	@Test
	public void ToolTipTest() {

		String BtnHoverText = "You hovered over the Button";
		String TxtFieldHoverTxt = "You hovered over the text field";

		BasicActions ba = new BasicActions();
		homePageLocators hpl = PageFactory.initElements(driver, homePageLocators.class);
		ToolTipsLocators ttl = PageFactory.initElements(driver, ToolTipsLocators.class);
		Actions actions = new Actions(driver);

		ba.NavToReqModule(hpl.HomePageWidgets(), hpl.ToolTips());
		actions.moveToElement(ttl.BtnHover()).perform();
		ba.AssertWithContains(ttl.BtnHoverTxt(), BtnHoverText);
		actions.moveToElement(ttl.TextFieldHover()).perform();
		ba.AssertWithContains(ttl.TxtFieldHoverTxt(), TxtFieldHoverTxt);

	}

}
