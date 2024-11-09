package elementsLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Resources.Base;

public class dynamicPropertiesLocators extends Base {

	@FindBy(xpath = "//button[@id='enableAfter']")
	WebElement EnableAfterButton;

	@FindBy(xpath = "//button[@id='colorChange']")
	WebElement ColourChangeButton;

	@FindBy(xpath = "//button[@id='visibleAfter']")
	WebElement visibleAfterButton;

	public WebElement visibleAfterButton() {
		return visibleAfterButton;
	}

	public WebElement ColourChangeButton() {
		return ColourChangeButton;
	}

	public WebElement EnableAfterButton() {
		return EnableAfterButton;
	}

}
