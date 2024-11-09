package elementsLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Resources.Base;

public class UploadNdDownloadLocators extends Base {

	@FindBy(xpath = "//a[@id='downloadButton']")
	WebElement DownloadLink;

	@FindBy(xpath = "//input[@id='uploadFile']")
	WebElement UploadBtn;

	public WebElement UploadBtn() {
		return UploadBtn;
	}

	public WebElement DownloadLink() {
		return DownloadLink;
	}

}
