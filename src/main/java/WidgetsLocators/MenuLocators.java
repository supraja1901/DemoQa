package WidgetsLocators;

import Resources.Base;

public class MenuLocators extends Base{
	
	@FindBy(xpath="//ul[@id='nav']/li[2]/ul/li[3]/ul/li[1]/a")
	WebElement SubSubItem1;

	@FindBy(xpath="//ul[@id='nav']/li[2]/ul/li[3]/ul/li[2]/a")
	WebElement SubSubItem2;
	

}
