package alertFramesNdWindowsLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Resources.Base;

public class NestedFramesLocators extends Base {

	@FindBy(xpath = "//div[@id='framesWrapper']/div[1]")
	WebElement DefaultFrameText;

	@FindBy(xpath = "//html/body")
	WebElement ParentFrameText;

	@FindBy(xpath = "//html/body/p")
	WebElement ChildFrameText;

	@FindBy(xpath = "//iframe[@id='frame1']")
	WebElement ParentFrame;

	@FindBy(xpath = "//iframe[@srcdoc]")
	WebElement ChildFrame;

	public WebElement ChildFrame() {
		return ChildFrame;
	}

	public WebElement ParentFrame() {
		return ParentFrame;
	}

	public WebElement ChildFrameText() {
		return ChildFrameText;
	}

	public WebElement ParentFrameText() {
		return ParentFrameText;
	}

	public WebElement DefaultFrameText() {
		return DefaultFrameText;
	}

}
