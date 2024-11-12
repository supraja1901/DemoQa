package interactionsLocators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Resources.Base;

public class SelectableLocators extends Base {

	@FindBy(xpath = "//div[@id='demo-tabpane-list']/ul/li")
	List<WebElement> ListWebElements;

	@FindBy(xpath = "//div[@id='row1']/li")
	List<WebElement> Row1Grid;

	@FindBy(xpath = "//div[@id='row2']/li")
	List<WebElement> Row2Grid;

	@FindBy(xpath = "//div[@id='row3']/li")
	List<WebElement> Row3Grid;

	public List<WebElement> Row3Grid() {
		return Row3Grid;
	}

	public List<WebElement> Row2Grid() {
		return Row2Grid;
	}

	public List<WebElement> Row1Grid() {
		return Row1Grid;
	}

	public List<WebElement> ListWebElements() {
		return ListWebElements;
	}

}
