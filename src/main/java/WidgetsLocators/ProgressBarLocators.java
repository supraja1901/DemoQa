package WidgetsLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Resources.Base;

public class ProgressBarLocators extends Base {

	@FindBy(xpath = "//div[@role='progressbar']")
	WebElement progressBar;

	@FindBy(xpath = "//button[@id='startStopButton']")
	WebElement StartStopBtn;

	@FindBy(xpath = "//button[@id='resetButton']")
	WebElement ResetBtn;

	public WebElement ResetBtn() {
		return ResetBtn;
	}

	public WebElement StartStopBtn() {
		return StartStopBtn;
	}

	public WebElement progressBar() {
		return progressBar;
	}

}
