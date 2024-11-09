package WidgetsLocators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Resources.Base;

public class AutoCompleteLocators extends Base {

	@FindBy(xpath = "//input[@id='autoCompleteMultipleInput']")
	WebElement MultipleColourInput;

	@FindBy(xpath = "//input[@id='autoCompleteSingleInput']")
	WebElement SingleColourInput;

	@FindBy(xpath = "//div[starts-with(@id, 'react-select-2-option-')]")
	List<WebElement> MultiColourOptions;

	@FindBy(xpath = "//div[starts-with(@id, 'react-select-3-option-')]")
	List<WebElement> singleColourOptions;

	public List<WebElement> singleColourOptions() {
		return singleColourOptions;
	}

	public List<WebElement> MultiColourOptions() {
		return MultiColourOptions;
	}

	public WebElement SingleColourInput() {
		return SingleColourInput;
	}

	public WebElement MultipleColourInput() {
		return MultipleColourInput;
	}

}
