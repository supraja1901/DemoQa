package elementsLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Resources.Base;

public class brokenImagesLinksLocators extends Base {

	@FindBy(xpath = "//img[@src='/images/Toolsqa_1.jpg']")
	WebElement Image2;

	@FindBy(xpath = "//img[@src='/images/Toolsqa.jpg']")
	WebElement Image1;

	@FindBy(xpath = "//a[text()='Click Here for Broken Link']")
	WebElement BrokenLink;

	@FindBy(xpath = "//a[text()='Click Here for Valid Link']")
	WebElement ValidLink;

	public WebElement ValidLink() {
		return ValidLink;
	}

	public WebElement BrokenLink() {
		return BrokenLink;
	}

	public WebElement Image1() {
		return Image1;
	}

	public WebElement Image2() {
		return Image2;
	}

}
