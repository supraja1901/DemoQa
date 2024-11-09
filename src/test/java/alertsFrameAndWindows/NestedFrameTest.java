package alertsFrameAndWindows;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Resources.Base;
import Resources.BasicActions;
import alertFramesNdWindowsLocators.NestedFramesLocators;
import elementsLocators.homePageLocators;

public class NestedFrameTest extends Base {

	@Test
	public void NestedFramesTest() {

		String defaultFrameText = "Sample Nested Iframe page";
		String ParentFrameText = "Parent frame";
		String ChildFrameText = "Child Iframe";

		BasicActions ba = new BasicActions();
		homePageLocators hpl = PageFactory.initElements(driver, homePageLocators.class);
		NestedFramesLocators nfl = PageFactory.initElements(driver, NestedFramesLocators.class);

		ba.NavToReqModule(hpl.HomePageAlertsFramesWindows(), hpl.NestedFrames());
		ba.AssertWithContains(nfl.DefaultFrameText(), defaultFrameText);
		ba.SwitchToFrame(nfl.ParentFrame());
		ba.GetTextNdAssert(nfl.ParentFrameText(), ParentFrameText);
		ba.SwitchToFrame(nfl.ChildFrame());
		ba.GetTextNdAssert(nfl.ChildFrameText(), ChildFrameText);
		ba.SwitchBackToDefaultFrame();
		ba.AssertWithContains(nfl.DefaultFrameText(), defaultFrameText);
	}
}
