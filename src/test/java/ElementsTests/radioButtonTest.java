package ElementsTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Resources.Base;
import Resources.BasicActions;
import elementsLocators.homePageLocators;
import elementsLocators.radioButtonsLocators;

public class radioButtonTest extends Base {

	@Test
	public void RadioBtnTest() {

		String YesResult = "You have selected Yes";
		String ImpressiveResult = "You have selected Impressive";
		BasicActions ba = new BasicActions();
		homePageLocators hpl = PageFactory.initElements(driver, homePageLocators.class);
		radioButtonsLocators rbl = PageFactory.initElements(driver, radioButtonsLocators.class);

		ba.NavToReqModule(hpl.HomePageElement(), hpl.RadioButton());
		ba.ScrollUsingJSE(rbl.RadioButton());
		ba.GetTextNdAssert(rbl.RadioButton(), "Radio Button");
		ba.ClickRadioBtn(rbl.YesBtn(), rbl.ValidateYesBtn());
		ba.GetTextNdAssert(rbl.Result(), YesResult);
		ba.ClickRadioBtn(rbl.ImpressiveBtn(), rbl.ValidateImpressiveBtn());
		ba.GetTextNdAssert(rbl.Result(), ImpressiveResult);
		ba.ClickRadioBtn(rbl.NoBtn(), rbl.ValidateNoBtn());

	}

}
