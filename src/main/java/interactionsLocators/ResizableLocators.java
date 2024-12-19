package interactionsLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Resources.Base;

public class ResizableLocators extends Base {

	@FindBy(xpath = "//div/div[@id='resizableBoxWithRestriction']")
	WebElement resizableRestrictionElement;

	@FindBy(xpath = "//div[@id='resizable']/span")
	WebElement resizableWORestrictionElement;

	public WebElement resizableWORestrictionElement() {
		return resizableWORestrictionElement;
	}

	public WebElement resizableRestrictionElement() {
		return resizableRestrictionElement;
	}

}
