package WidgetsLocators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Resources.Base;

public class SelectMenuLocators extends Base {

	@FindBy(xpath = "//div[contains(@id,'react-select-2-option-')]")
	List<WebElement> SelectValueList;

	@FindBy(xpath = "//div[contains(@id,'react-select-3-option-')]")
	List<WebElement> SelectTitleList;

	@FindBy(xpath = "//select[@id='oldSelectMenu']/option")
	List<WebElement> OldSelectMenuList;

	@FindBy(xpath = "//div[contains(@id,'react-select-4-option-')]")
	List<WebElement> MultiSelectDropdownList;

	@FindBy(xpath = "//select[@id='cars']/option")
	List<WebElement> StandardMultiSelect;

	@FindBy(xpath = "//div[@id='withOptGroup']")
	WebElement SelectValue;

	@FindBy(xpath = "//div[@id='selectOne']")
	WebElement SelectOne;

	@FindBy(xpath = "//select[@id='oldSelectMenu']")
	WebElement OldSelectMenu;

	@FindBy(xpath = "//p/b[contains(text(), 'Multiselect drop down')]/../following-sibling::div")
	WebElement MultiSelectDropdown;

	@FindBy(xpath = "//div[@id='selectOne']/div/div[1]/div[1]")
	WebElement SelectTitle;

	public WebElement SelectTitle() {
		return SelectTitle;
	}

	public WebElement MultiSelectDropdown() {
		return MultiSelectDropdown;
	}

	public WebElement OldSelectMenu() {
		return OldSelectMenu;
	}

	public WebElement SelectOne() {
		return SelectOne;
	}

	public WebElement SelectValue() {
		return SelectValue;
	}

	public List<WebElement> StandardMultiSelect() {
		return StandardMultiSelect;
	}

	public List<WebElement> MultiSelectDropdownList() {
		return MultiSelectDropdownList;
	}

	public List<WebElement> OldSelectMenuList() {
		return OldSelectMenuList;
	}

	public List<WebElement> SelectTitleList() {
		return SelectTitleList;
	}

	public List<WebElement> SelectValueList() {
		return SelectValueList;
	}

}
