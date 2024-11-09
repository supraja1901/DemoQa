package elementsLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Resources.Base;

public class radioButtonsLocators extends Base {

	@FindBy(xpath = "//h1[text()='Radio Button']")
	WebElement RadioButton;

	@FindBy(xpath = "//label[@for='yesRadio']")
	WebElement YesBtn;

	@FindBy(xpath = "//input[@id='yesRadio']")
	WebElement ValidateYesBtn;

	@FindBy(xpath = "//h1[text()='Radio Button']/../div/p")
	WebElement Result;

	@FindBy(xpath = "//input[@id='impressiveRadio']")
	WebElement ValidateImpressiveBtn;

	@FindBy(xpath = "//label[@for='impressiveRadio']")
	WebElement ImpressiveBtn;

	@FindBy(xpath = "//input[@id='noRadio']")
	WebElement ValidateNoBtn;

	@FindBy(xpath = "//label[@for='noRadio']")
	WebElement NoBtn;

	public WebElement ValidateNoBtn() {
		return ValidateNoBtn;
	}

	public WebElement NoBtn() {
		return NoBtn;
	}

	public WebElement ImpressiveBtn() {
		return ImpressiveBtn;
	}

	public WebElement ValidateImpressiveBtn() {
		return ValidateImpressiveBtn;
	}

	public WebElement Result() {
		return Result;
	}

	public WebElement ValidateYesBtn() {
		return ValidateYesBtn;
	}

	public WebElement YesBtn() {
		return YesBtn;
	}

	public WebElement RadioButton() {
		return RadioButton;
	}
}
