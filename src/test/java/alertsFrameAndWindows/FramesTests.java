package alertsFrameAndWindows;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Resources.Base;
import Resources.BasicActions;
import alertFramesNdWindowsLocators.FramesLocators;
import elementsLocators.homePageLocators;

public class FramesTests extends Base {

	@Test
	public void FramesTest() {

		String FramesText = "This is a sample page";
		String ParentFrameText = "Sample Iframe page There are 2 Iframes in this page";

		BasicActions ba = new BasicActions();
		homePageLocators hpl = PageFactory.initElements(driver, homePageLocators.class);
		FramesLocators fl = PageFactory.initElements(driver, FramesLocators.class);

		ba.NavToReqModule(hpl.HomePageAlertsFramesWindows(), hpl.Frames());
		ba.SwitchToFrame(fl.Frame1());
		ba.GetTextNdAssert(fl.FrameText(), FramesText);
		ba.SwitchBackToDefaultFrame();
		ba.AssertWithContains(fl.ParentFrameText(), ParentFrameText);
		ba.SwitchToFrame(fl.frame2());
		ba.GetTextNdAssert(fl.FrameText(), FramesText);
		ba.SwitchBackToDefaultFrame();
		ba.AssertWithContains(fl.ParentFrameText(), ParentFrameText);
	}

}
