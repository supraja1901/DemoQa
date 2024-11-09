package WidgetsLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Resources.Base;

public class AccordianLocators extends Base {

	@FindBy(xpath = "//div[@id='section1Heading']")
	WebElement section1Heading;

	@FindBy(xpath = "//div[@id='section2Heading']")
	WebElement section2Heading;

	@FindBy(xpath = "//div[@id='section3Heading']")
	WebElement section3Heading;

	@FindBy(xpath = "//div[@id='section1Content']/p")
	WebElement section1Content;

	@FindBy(xpath = "//div[@id='section2Content']")
	WebElement section2Content;

	@FindBy(xpath = "//div[@id='section3Content']/p")
	WebElement section3Content;

	public WebElement section3Content() {
		return section3Content;
	}

	public WebElement section2Content() {
		return section2Content;
	}

	public WebElement section1Content() {
		return section1Content;
	}

	public WebElement section3Heading() {
		return section3Heading;
	}

	public WebElement section2Heading() {
		return section2Heading;
	}

	public WebElement section1Heading() {
		return section1Heading;
	}

}
