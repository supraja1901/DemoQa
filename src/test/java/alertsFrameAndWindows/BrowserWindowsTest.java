package alertsFrameAndWindows;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Resources.Base;
import Resources.BasicActions;
import alertFramesNdWindowsLocators.browserWindowsLocators;
import elementsLocators.homePageLocators;

public class BrowserWindowsTest extends Base {

	@Test
	public void BrowserWindow() {

		String NewTabMsg = "This is a sample page";
		String NewWindowMsg = "Knowledge increases by sharing but not by saving.";

		BasicActions ba = new BasicActions();
		homePageLocators hpl = PageFactory.initElements(driver, homePageLocators.class);
		browserWindowsLocators bwl = PageFactory.initElements(driver, browserWindowsLocators.class);

		ba.NavToReqModule(hpl.HomePageAlertsFramesWindows(), hpl.BrowserWindow());
		ba.click(bwl.NewTabBtn());

		String originalTab = driver.getWindowHandle();

		ba.switchWindowHandles();
		System.out.println(bwl.NewWTabMsg().getText());
		ba.GetTextNdAssert(bwl.NewWTabMsg(), NewTabMsg);
		driver.close();
		driver.switchTo().window(originalTab);

		ba.click(bwl.NewWindowBtn());
		ba.switchWindowHandles();
		System.out.println(bwl.NewWTabMsg().getText());
		ba.GetTextNdAssert(bwl.NewWTabMsg(), NewTabMsg);

		driver.close();
		driver.switchTo().window(originalTab);

		ba.click(bwl.NewWindowMsgBtn());
		ba.switchWindowHandles();
		System.out.println(ba.GetText(bwl.NewWindowMsg()));
		ba.GetTextNdAssert(bwl.NewWindowMsg(), NewWindowMsg);

	}

}
