package WidgetsLocators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Resources.Base;

public class SliderLocators extends Base {

	@FindBy(xpath = "//input[starts-with(@class,'range-slider')]")
	WebElement Slider;

	@FindBy(xpath = "//input[@id='sliderValue']")
	WebElement SliderValue;

	public WebElement SliderValue() {
		return SliderValue;
	}

	public WebElement Slider() {
		return Slider;
	}

}
