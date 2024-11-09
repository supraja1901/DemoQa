package alertFramesNdWindowsLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Resources.Base;

public class FramesLocators extends Base {

	@FindBy(xpath = "//iframe[@id='frame1']")
	WebElement Frame1;

	@FindBy(xpath = "//iframe[@id='frame2']")
	WebElement frame2;

	@FindBy(xpath = "//html/body/h1")
	WebElement FrameText;

	@FindBy(xpath = "//div[@id='framesWrapper']/div[1]")
	WebElement ParentFrameText;

	public WebElement ParentFrameText() {
		return ParentFrameText;
	}

	public WebElement FrameText() {
		return FrameText;
	}

	public WebElement frame2() {
		return frame2;
	}

	public WebElement Frame1() {
		return Frame1;
	}

}
