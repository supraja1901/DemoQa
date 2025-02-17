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
//		String NewWindowMsg = "Knowledge increases by sharing but not by saving.";
		String originalTab = Driver().getWindowHandle();

		BasicActions ba = new BasicActions();
		homePageLocators hpl = PageFactory.initElements(Driver(), homePageLocators.class);
		browserWindowsLocators bwl = PageFactory.initElements(Driver(), browserWindowsLocators.class);

		ba.NavToReqModule(hpl.HomePageAlertsFramesWindows(), hpl.BrowserWindow());
//		ba.click(bwl.NewWindowMsgBtn());
//
//		ba.switchWindowHandles();
//		System.out.println(ba.GetText(bwl.NewWindowMsg()));
//		ba.GetTextNdAssert(bwl.NewWindowMsg(), NewWindowMsg);
//		String pageText = (String) ((JavascriptExecutor) Driver()).executeScript("return document.body.innerText;");
//		System.out.println(pageText);
//        if (pageText.contains(NewWindowMsg)) {
//            System.out.println("Text found in new window/tab.");
//        }
//		Driver().close();
//		Driver().switchTo().window(originalTab);

		ba.click(bwl.NewTabBtn());

		ba.switchWindowHandles();
		System.out.println(bwl.NewWTabMsg().getText());
		ba.GetTextNdAssert(bwl.NewWTabMsg(), NewTabMsg);
		Driver().close();
		Driver().switchTo().window(originalTab);

		ba.click(bwl.NewWindowBtn());
		ba.switchWindowHandles();
		System.out.println(bwl.NewWTabMsg().getText());
		ba.GetTextNdAssert(bwl.NewWTabMsg(), NewTabMsg);

		Driver().close();
		Driver().switchTo().window(originalTab);

	}

}
