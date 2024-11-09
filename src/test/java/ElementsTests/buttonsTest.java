package ElementsTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Resources.Base;
import Resources.BasicActions;
import elementsLocators.buttonsLocators;
import elementsLocators.homePageLocators;

public class buttonsTest extends Base {

	@Test
	public void ButtonsTest() {

		String DoubleClickMsg = "You have done a double click";
		String RightClkMsg = "You have done a right click";
		String DynamicClkMsg = "You have done a dynamic click";

		BasicActions ba = new BasicActions();
		homePageLocators hpl = PageFactory.initElements(driver, homePageLocators.class);
		buttonsLocators bl = PageFactory.initElements(driver, buttonsLocators.class);

		ba.NavToReqModule(hpl.HomePageElement(), hpl.Buttons());
		ba.DoubleClick(bl.DoubleClickButton());
		ba.ScrollUsingJSE(bl.DoubleClickMsg());
		ba.GetTextNdAssert(bl.DoubleClickMsg(), DoubleClickMsg);
		ba.rightClick(bl.RightClickButton());
		ba.ScrollUsingJSE(bl.rightClickMessage());
		ba.GetTextNdAssert(bl.rightClickMessage(), RightClkMsg);
		ba.ScrollUsingJSE(bl.DynamicClick());
		ba.click(bl.DynamicClick());
		ba.ScrollUsingJSE(bl.dynamicClickMessage());
		ba.GetTextNdAssert(bl.dynamicClickMessage(), DynamicClkMsg);

	}

}
