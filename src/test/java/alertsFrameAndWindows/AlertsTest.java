package alertsFrameAndWindows;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Resources.Base;
import Resources.BasicActions;
import alertFramesNdWindowsLocators.AlertsLocators;
import elementsLocators.homePageLocators;

public class AlertsTest extends Base {

	@Test
	public void AlertTests() {

		String PromptInput="Supraja";
		
		BasicActions ba = new BasicActions();

		homePageLocators hpl = PageFactory.initElements(driver, homePageLocators.class);
		AlertsLocators al = PageFactory.initElements(driver, AlertsLocators.class);

		ba.NavToReqModule(hpl.HomePageAlertsFramesWindows(), hpl.Alerts());
		ba.click(al.AlertBtn());
		ba.GetTextAlert();
		ba.acceptAlert();
		ba.click(al.timerAlertButton());
		ba.GetTextAlert();
		ba.acceptAlert();
		ba.click(al.confirmButton());
		ba.GetTextAlert();
		ba.acceptAlert();
		ba.click(al.confirmButton());
		ba.GetTextAlert();
		ba.DismissAlert();
		ba.click(al.promtButton());
		ba.GetTextAlert();
		ba.PromptAlert(PromptInput);

	}
}
