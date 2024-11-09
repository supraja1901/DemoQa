package WidgetsLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Resources.Base;

public class TabsLocators extends Base {

	@FindBy(xpath = "//a[@id='demo-tab-what']")
	WebElement WhatTab;

	@FindBy(xpath = "//a[@id='demo-tab-origin']")
	WebElement OriginTab;

	@FindBy(xpath = "//a[@id='demo-tab-use']")
	WebElement UseTab;

	@FindBy(xpath = "//a[@id='demo-tab-more']")
	WebElement MoreTab;

	@FindBy(xpath = "//div[@id='demo-tabpane-what']/p")
	WebElement WhatTabText;

	@FindBy(xpath = "//div[@id='demo-tabpane-origin']/p[1]")
	WebElement originTabText;

	@FindBy(xpath = "//div[@id='demo-tabpane-use']/p")
	WebElement useTabText;

	public WebElement useTabText() {
		return useTabText;
	}

	public WebElement originTabText() {
		return originTabText;
	}

	public WebElement WhatTabText() {
		return WhatTabText;
	}

	public WebElement MoreTab() {
		return MoreTab;
	}

	public WebElement UseTab() {
		return UseTab;
	}

	public WebElement OriginTab() {
		return OriginTab;
	}

	public WebElement WhatTab() {
		return WhatTab;
	}

}
