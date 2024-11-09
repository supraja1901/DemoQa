package alertFramesNdWindowsLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Resources.Base;

public class AlertsLocators extends Base{
	
	@FindBy(xpath="//button[@id='alertButton']")
	WebElement AlertBtn;

	@FindBy(xpath="//button[@id='timerAlertButton']")
	WebElement timerAlertButton;

	@FindBy(xpath="//button[@id='confirmButton']")
	WebElement confirmButton;

	@FindBy(xpath="//button[@id='promtButton']")
	WebElement promtButton;
//
//	@FindBy(xpath="//button[@id='alertButton']")
//	WebElement AlertBtn;
//	
//	public WebElement AlertBtn() {
//		return AlertBtn;
//	}

	public WebElement promtButton() {
		return promtButton;
	}

	public WebElement confirmButton() {
		return confirmButton;
	}

	public WebElement timerAlertButton() {
		return timerAlertButton;
	}

	public WebElement AlertBtn() {
		return AlertBtn;
	}

}
