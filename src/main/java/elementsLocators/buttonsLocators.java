package elementsLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Resources.Base;

public class buttonsLocators extends Base {

	@FindBy(xpath = "//h1[text()='Buttons']")
	WebElement ButtonText;

	@FindBy(xpath = "//button[@id='doubleClickBtn']")
	WebElement DoubleClickButton;

	@FindBy(xpath = "//button[@id='rightClickBtn']")
	WebElement RightClickButton;

	@FindBy(xpath = "//button[text()='Click Me']")
	WebElement DynamicClick;

	@FindBy(xpath = "//p[@id='doubleClickMessage']")
	WebElement DoubleClickMsg;

	@FindBy(xpath = "//p[@id='rightClickMessage']")
	WebElement rightClickMessage;

	@FindBy(xpath = "//p[@id='dynamicClickMessage']")
	WebElement dynamicClickMessage;

	public WebElement dynamicClickMessage() {
		return dynamicClickMessage;
	}

	public WebElement rightClickMessage() {
		return rightClickMessage;
	}

	public WebElement DoubleClickMsg() {
		return DoubleClickMsg;
	}

	public WebElement DynamicClick() {
		return DynamicClick;
	}

	public WebElement RightClickButton() {
		return RightClickButton;
	}

	public WebElement DoubleClickButton() {
		return DoubleClickButton;
	}

	public WebElement ButtonText() {
		return ButtonText;
	}
}
