package elementsLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Resources.Base;

public class PractiseFormLocators extends Base {

	@FindBy(xpath = "//button[@id='closeLargeModal']")
	WebElement CloseButton;

	@FindBy(xpath = "//input[@id='firstName']")
	WebElement FirstName;

	@FindBy(xpath = "//input[@id='lastName']")
	WebElement lastName;

	@FindBy(xpath = "//input[@id='userEmail']")
	WebElement userEmail;

	@FindBy(xpath = "//input[@value='Female']")
	WebElement FemaleRadioBtn;

	@FindBy(xpath = "//input[@id='userNumber']")
	WebElement userNumber;

//	@FindBy(xpath = "//input[@id='userNumber']")
//	WebElement userNumber;
//
//	public WebElement userNumber() {
//		return userNumber;
//	}

	public WebElement userNumber() {
		return userNumber;
	}

	public WebElement FemaleRadioBtn() {
		return FemaleRadioBtn;
	}

	public WebElement userEmail() {
		return userEmail;
	}

	public WebElement lastName() {
		return lastName;
	}

	public WebElement FirstName() {
		return FirstName;
	}

	public WebElement CloseButton() {
		return CloseButton;
	}

}
