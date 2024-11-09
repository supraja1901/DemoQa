package elementsLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Resources.Base;

public class CheckBoxLocators extends Base {

	@FindBy(xpath = "//h1[text()='Check Box']")
	WebElement checkBox;

	@FindBy(xpath = "//button[@aria-label='Expand all']")
	WebElement expandAll;

	@FindBy(xpath = "//button[@aria-label='Collapse all']")
	WebElement collapseAll;

	@FindBy(xpath = "//label[@for='tree-node-home']")
	WebElement homeChkBox;
	@FindBy(xpath = "//input[@id='tree-node-home']")
	WebElement ValidatehomeChkBox;

	@FindBy(xpath = "//label[@for='tree-node-home']/../button")
	WebElement homeToggle;

	@FindBy(xpath = "//label[@for='tree-node-desktop']")
	WebElement desktopChkBox;

	@FindBy(xpath = "//label[@for='tree-node-notes']")
	WebElement notesChkBox;

	@FindBy(xpath = "//label[@for='tree-node-documents']")
	WebElement documentsChkBox;

	@FindBy(xpath = "//label[@for='tree-node-workspace']")
	WebElement workspaceChkBox;

	@FindBy(xpath = "//label[@for='tree-node-office']")
	WebElement officeChkBox;

	@FindBy(xpath = "//label[@for='tree-node-wordFile']")
	WebElement wordFileChkBox;

	@FindBy(xpath = "//label[@for='tree-node-downloads']")
	WebElement downloadsChkBox;

	@FindBy(xpath = "//label[@for='tree-node-excelFile']")
	WebElement excelFileChkBox;

	@FindBy(xpath = "//label[@for='tree-node-downloads']/../button")
	WebElement downloadsToggle;

	@FindBy(xpath = "//label[@for='tree-node-office']/../button")
	WebElement officeToggle;

	@FindBy(xpath = "//label[@for='tree-node-workspace']/../button")
	WebElement workspaceToggle;

	@FindBy(xpath = "//label[@for='tree-node-desktop']/../button")
	WebElement desktopToggle;

	@FindBy(xpath = "//label[@for='tree-node-documents']/../button")
	WebElement documentsToggle;

	@FindBy(xpath = "//div[@id='result']")
	WebElement Result;

	public WebElement ValidatehomeChkBox() {
		return ValidatehomeChkBox;
	}

	public WebElement Result() {
		return Result;
	}

	public WebElement desktopToggle() {
		return desktopToggle;
	}

	public WebElement documentsToggle() {
		return documentsToggle;
	}

	public WebElement workspaceToggle() {
		return workspaceToggle;
	}

	public WebElement officeToggle() {
		return officeToggle;
	}

	public WebElement downloadsToggle() {
		return downloadsToggle;
	}

	public WebElement excelFileChkBox() {
		return excelFileChkBox;
	}

	public WebElement wordFileChkBox() {
		return wordFileChkBox;
	}

	public WebElement downloadsChkBox() {
		return downloadsChkBox;
	}

	public WebElement officeChkBox() {
		return officeChkBox;
	}

	public WebElement workspaceChkBox() {
		return workspaceChkBox;
	}

	public WebElement documentsChkBox() {
		return documentsChkBox;
	}

	public WebElement notesChkBox() {
		return notesChkBox;
	}

	public WebElement desktopChkBox() {
		return desktopChkBox;
	}

	public WebElement homeToggle() {
		return homeToggle;
	}

	public WebElement homeChkBox() {
		return homeChkBox;
	}

	public WebElement collapseAll() {
		return collapseAll;
	}

	public WebElement expandAll() {
		return expandAll;
	}

	public WebElement checkBox() {
		return checkBox;
	}

}
