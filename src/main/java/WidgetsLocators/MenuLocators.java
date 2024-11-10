package WidgetsLocators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Resources.Base;

public class MenuLocators extends Base {

	@FindBy(xpath = "//ul[@id='nav']/li[2]/ul/li")
	List<WebElement> MenuItem2List;

	@FindBy(xpath = "//ul[@id='nav']/li")
	List<WebElement> MenuList;

	@FindBy(xpath = "//ul[@id='nav']/li[2]/ul/li[3]/ul/li")
	List<WebElement> SubSubList;

	public List<WebElement> SubSubList() {
		return SubSubList;
	}

	public List<WebElement> MenuList() {
		return MenuList;
	}

	public List<WebElement> MenuItem2List() {
		return MenuItem2List;
	}

}
