package alertsFrameAndWindows;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Resources.Base;
import Resources.BasicActions;
import Resources.DriverFactory;
import alertFramesNdWindowsLocators.ModalDialogLoctaors;
import elementsLocators.homePageLocators;

public class ModalDialogTests extends Base {

	@Test
	public void ModalTest() {

		String SmallModalText = "This is a small modal. It has very less content";
		String LargeModalText = "Lorem Ipsum is simply dummy text of the printing and typesetting industry";

		BasicActions ba = new BasicActions();

		homePageLocators hpl = PageFactory.initElements(DriverFactory.getInstance().getDriver(),
				homePageLocators.class);
		ModalDialogLoctaors mdl = PageFactory.initElements(DriverFactory.getInstance().getDriver(),
				ModalDialogLoctaors.class);

		ba.NavToReqModule(hpl.HomePageAlertsFramesWindows(), hpl.ModalDialogs());
		ba.click(mdl.SmallModal());
		ba.GetTextNdAssert(mdl.SmallModalText(), SmallModalText);
		ba.click(mdl.CloseSmallModal());
		ba.WaitForElementToDisappear(mdl.SmallModalText());
		ba.click(mdl.LargeModal());
		ba.AssertWithContains(mdl.LargeModalText(), LargeModalText);
		ba.click(mdl.closeLargeModal());
		ba.WaitForElementToDisappear(mdl.LargeModalText());

	}

}
