package elementsLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Resources.Base;

public class homePageLocators extends Base {

//	WebDriver driver;
//	public homePageLocators(WebDriver driver) {
//		this.driver = driver;
//		PageFactory.initElements(driver, this);
//	}

	@FindBy(xpath = "//div[@class='header-text'][text() ='Elements']")
	WebElement Elements;

	@FindBy(xpath = "//div[@class='header-text'][text() ='Forms']")
	WebElement Forms;

	@FindBy(xpath = "//div[@class='header-text'][text() ='Alerts, Frame & Windows']")
	WebElement AlertsFramesWindows;

	@FindBy(xpath = "//div[@class='header-text'][text() ='Widgets']")
	WebElement Widgets;

	@FindBy(xpath = "//div[@class='header-text'][text() ='Interactions']")
	WebElement Interactions;

	@FindBy(xpath = "//div[@class='header-text'][text() ='Book Store Application']")
	WebElement BookStoreApplication;

	@FindBy(xpath = "//h5[text()='Elements']")
	WebElement HomePageElement;

	@FindBy(xpath = "//h5[text()='Forms']")
	WebElement HomePageForms;

	@FindBy(xpath = "//h5[text()='Alerts, Frame & Windows']")
	WebElement HomePageAlertsFramesWindows;

	@FindBy(xpath = "//h5[text()='Widgets']")
	WebElement HomePageWidgets;

	@FindBy(xpath = "//h5[text()='Interactions']")
	WebElement HomePageInteractions;

	@FindBy(xpath = "//h5[text()='Book Store Application']")
	WebElement HomePageBookStoreApplication;

	@FindBy(xpath = "//div[text() ='Elements']/../../../div/ul/li[1]")
	WebElement TextBox;

	@FindBy(xpath = "//div[text() ='Elements']/../../../div/ul/li[2]")
	WebElement CheckBox;

	@FindBy(xpath = "//div[text() ='Elements']/../../../div/ul/li[3]")
	WebElement RadioButton;

	@FindBy(xpath = "//div[text() ='Elements']/../../../div/ul/li[4]")
	WebElement WebTables;

	@FindBy(xpath = "//div[text() ='Elements']/../../../div/ul/li[5]")
	WebElement Buttons;

	@FindBy(xpath = "//div[text() ='Elements']/../../../div/ul/li[6]")
	WebElement Links;

	@FindBy(xpath = "//div[text() ='Elements']/../../../div/ul/li[7]")
	WebElement brokenLinksImages;

	@FindBy(xpath = "//div[text() ='Elements']/../../../div/ul/li[8]")
	WebElement uploadNdDownload;

	@FindBy(xpath = "//div[text() ='Elements']/../../../div/ul/li[9]")
	WebElement dynamicProperties;

	@FindBy(xpath = "//div[text() ='Forms']/../../../div/ul/li[1]")
	WebElement PracticeForm;

	@FindBy(xpath = "//div[text() ='Alerts, Frame & Windows']/../../../div/ul/li[1]")
	WebElement BrowserWindow;

	@FindBy(xpath = "//div[text() ='Alerts, Frame & Windows']/../../../div/ul/li[2]")
	WebElement Alerts;

	@FindBy(xpath = "//div[text() ='Alerts, Frame & Windows']/../../../div/ul/li[3]")
	WebElement Frames;

	@FindBy(xpath = "//div[text() ='Alerts, Frame & Windows']/../../../div/ul/li[4]")
	WebElement NestedFrames;

	@FindBy(xpath = "//div[text() ='Alerts, Frame & Windows']/../../../div/ul/li[5]")
	WebElement ModalDialogs;

	@FindBy(xpath = "//div[text() ='Widgets']/../../../div/ul/li[1]")
	WebElement Accordian;

	@FindBy(xpath = "//div[text() ='Widgets']/../../../div/ul/li[2]")
	WebElement AutoComplete;

	@FindBy(xpath = "//div[text() ='Widgets']/../../../div/ul/li[3]")
	WebElement DatePicker;

	@FindBy(xpath = "//div[text() ='Widgets']/../../../div/ul/li[4]")
	WebElement Slider;

	@FindBy(xpath = "//div[text() ='Widgets']/../../../div/ul/li[5]")
	WebElement ProgressBar;

	@FindBy(xpath = "//div[text() ='Widgets']/../../../div/ul/li[6]")
	WebElement Tabs;

	@FindBy(xpath = "//div[text() ='Widgets']/../../../div/ul/li[7]")
	WebElement ToolTips;

	@FindBy(xpath = "//div[text() ='Widgets']/../../../div/ul/li[8]")
	WebElement Menu;

	@FindBy(xpath = "//div[text() ='Widgets']/../../../div/ul/li[9]")
	WebElement SelectMenu;

	@FindBy(xpath = "//div[text() ='Interactions']/../../../div/ul/li[1]")
	WebElement Sortable;

	@FindBy(xpath = "//div[text() ='Interactions']/../../../div/ul/li[2]")
	WebElement Selectable;

	@FindBy(xpath = "//div[text() ='Interactions']/../../../div/ul/li[3]")
	WebElement Resizable;

	@FindBy(xpath = "//div[text() ='Interactions']/../../../div/ul/li[4]")
	WebElement Droppable;

	@FindBy(xpath = "//div[text() ='Interactions']/../../../div/ul/li[5]")
	WebElement Dragabble;

	@FindBy(xpath = "//div[text() ='Book Store Application']/../../../div/ul/li[1]")
	WebElement Login;

	@FindBy(xpath = "//div[text() ='Book Store Application']/../../../div/ul/li[2]")
	WebElement BookStore;

	@FindBy(xpath = "//div[text() ='Book Store Application']/../../../div/ul/li[3]")
	WebElement Profile;

	@FindBy(xpath = "//div[text() ='Book Store Application']/../../../div/ul/li[4]")
	WebElement BookStoreAPI;

	public WebElement BookStoreAPI() {
		return BookStoreAPI;
	}

	public WebElement Profile() {
		return Profile;
	}

	public WebElement BookStore() {
		return BookStore;
	}

	public WebElement Login() {
		return Login;
	}

	public WebElement Dragabble() {
		return Dragabble;
	}

	public WebElement Droppable() {
		return Droppable;
	}

	public WebElement Resizable() {
		return Resizable;
	}

	public WebElement Selectable() {
		return Selectable;
	}

	public WebElement Sortable() {
		return Sortable;
	}

	public WebElement SelectMenu() {
		return SelectMenu;
	}

	public WebElement Menu() {
		return Menu;
	}

	public WebElement ToolTips() {
		return ToolTips;
	}

	public WebElement Tabs() {
		return Tabs;
	}

	public WebElement ProgressBar() {
		return ProgressBar;
	}

	public WebElement Slider() {
		return Slider;
	}

	public WebElement DatePicker() {
		return DatePicker;
	}

	public WebElement AutoComplete() {
		return AutoComplete;
	}

	public WebElement Accordian() {
		return Accordian;
	}

	public WebElement ModalDialogs() {
		return ModalDialogs;
	}

	public WebElement NestedFrames() {
		return NestedFrames;
	}

	public WebElement Frames() {
		return Frames;
	}

	public WebElement Alerts() {
		return Alerts;
	}

	public WebElement PracticeForm() {
		return PracticeForm;
	}

	public WebElement BrowserWindow() {
		return BrowserWindow;
	}

	public WebElement dynamicProperties() {
		return dynamicProperties;
	}

	public WebElement uploadNdDownload() {
		return uploadNdDownload;
	}

	public WebElement brokenLinksImages() {
		return brokenLinksImages;
	}

	public WebElement Links() {
		return Links;
	}

	public WebElement Buttons() {
		return Buttons;
	}

	public WebElement WebTables() {
		return WebTables;
	}

	public WebElement RadioButton() {
		return RadioButton;
	}

	public WebElement CheckBox() {
		return CheckBox;
	}

	public WebElement TextBox() {
		return TextBox;
	}

	public WebElement HomePageBookStoreApplication() {
		return HomePageBookStoreApplication;
	}

	public WebElement HomePageInteractions() {
		return HomePageInteractions;
	}

	public WebElement HomePageWidgets() {
		return HomePageWidgets;
	}

	public WebElement HomePageAlertsFramesWindows() {
		return HomePageAlertsFramesWindows;
	}

	public WebElement HomePageForms() {
		return HomePageForms;
	}

	public WebElement HomePageElement() {
		return HomePageElement;
	}

	public WebElement BookStoreApplication() {
		return BookStoreApplication;
	}

	public WebElement Interactions() {
		return Interactions;
	}

	public WebElement Widgets() {
		return Widgets;
	}

	public WebElement AlertsFramesWindows() {
		return AlertsFramesWindows;
	}

	public WebElement Forms() {
		return Forms;
	}

	public WebElement Elements() {
		return Elements;
	}

}
