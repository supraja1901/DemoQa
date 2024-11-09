package WidgetsLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Resources.Base;

public class ToolTipsLocators extends Base {

	@FindBy(xpath = "//div[@id='textFieldToolTip']/div[2]")
	WebElement TxtFieldHoverTxt;

	@FindBy(xpath = "//div[@id='buttonToolTip']/div[2]")
	WebElement BtnHoverTxt;

	@FindBy(xpath = "//button[@id='toolTipButton']")
	WebElement BtnHover;

	@FindBy(xpath = "//input[@placeholder='Hover me to see']")
	WebElement TextFieldHover;

	public WebElement TextFieldHover() {
		return TextFieldHover;
	}

	public WebElement BtnHover() {
		return BtnHover;
	}

	public WebElement BtnHoverTxt() {
		return BtnHoverTxt;
	}

	public WebElement TxtFieldHoverTxt() {
		return TxtFieldHoverTxt;
	}

}
