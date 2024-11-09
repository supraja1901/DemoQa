package alertFramesNdWindowsLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Resources.Base;

public class browserWindowsLocators extends Base {

	@FindBy(xpath = "//button[@id='tabButton']")
	WebElement NewTabBtn;

	@FindBy(xpath = "//button[@id='windowButton']")
	WebElement NewWindowBtn;

	@FindBy(xpath = "//button[@id='messageWindowButton']")
	WebElement NewWindowMsgBtn;

	@FindBy(xpath = "//h1[@id='sampleHeading']")
	WebElement NewWTabMsg;

	@FindBy(xpath = "//body/text()")
	WebElement NewWindowMsg;

	public WebElement NewWindowMsg() {
		return NewWindowMsg;
	}

	public WebElement NewWTabMsg() {
		return NewWTabMsg;
	}

	public WebElement NewWindowMsgBtn() {
		return NewWindowMsgBtn;
	}

	public WebElement NewWindowBtn() {
		return NewWindowBtn;
	}

	public WebElement NewTabBtn() {
		return NewTabBtn;
	}

}
