package elementsLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Resources.Base;

public class textBoxLocators extends Base {

	@FindBy(xpath = "//h1[text()='Text Box']")
	WebElement textBox;

	@FindBy(xpath = "//input[@placeholder='Full Name']")
	WebElement fullName;

	@FindBy(xpath = "//input[@id='userEmail']")
	WebElement email;

	@FindBy(xpath = "//textarea[@id='currentAddress']")
	WebElement currentAddress;

	@FindBy(xpath = "//textarea[@id='permanentAddress']")
	WebElement permanentAddress;

	@FindBy(xpath = "//button[@id='submit']")
	WebElement submit;

	@FindBy(xpath = "//p[@id='name']")
	WebElement NameOutput;

	@FindBy(xpath = "//p[@id='email']")
	WebElement emailOutput;

	@FindBy(xpath = "//p[@id='currentAddress']")
	WebElement currentAddressOutput;

	@FindBy(xpath = "//p[@id='permanentAddress']")
	WebElement permanentAddressOutput;

	public WebElement NameOutput() {
		return NameOutput;
	}

	public WebElement emailOutput() {
		return emailOutput;
	}

	public WebElement currentAddressOutput() {
		return currentAddressOutput;
	}

	public WebElement permanentAddressOutput() {
		return permanentAddressOutput;
	}

	public WebElement submit() {
		return submit;
	}

	public WebElement permanentAddress() {
		return permanentAddress;
	}

	public WebElement currentAddress() {
		return currentAddress;
	}

	public WebElement email() {
		return email;
	}

	public WebElement fullName() {
		return fullName;
	}

	public WebElement textBox() {
		return textBox;
	}

}
