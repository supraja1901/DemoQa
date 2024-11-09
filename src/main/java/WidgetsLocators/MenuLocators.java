package WidgetsLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Resources.Base;

public class MenuLocators extends Base {

	@FindBy(xpath = "//ul[@id='nav']/li[2]/ul/li[3]/ul/li[1]/a")
	WebElement SubSubItem1;

	@FindBy(xpath = "//ul[@id='nav']/li[2]/ul/li[3]/ul/li[2]/a")
	WebElement SubSubItem2;

	public WebElement SubSubItem1() {
		return SubSubItem1;
	}

	public WebElement SubSubItem2() {
		return SubSubItem2;
	}

}
