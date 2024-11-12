package interactionsLocators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Resources.Base;

public class SortableLocators extends Base {

	@FindBy(xpath = "//a[@id='demo-tab-list']")
	WebElement List;

	@FindBy(xpath = "//a[@id='demo-tab-grid']")
	WebElement Grid;

	@FindBy(xpath = "//div[contains(@class, 'vertical-list-container')]/div")
	List<WebElement> ListWebElements;

	@FindBy(xpath = "//div[contains(@class, 'create-grid')]/div")
	List<WebElement> GridWebElements;

	public List<WebElement> GridWebElements() {
		return GridWebElements;
	}

	public List<WebElement> ListWebElements() {
		return ListWebElements;
	}

	public WebElement Grid() {
		return Grid;
	}

	public WebElement List() {
		return List;
	}

}
