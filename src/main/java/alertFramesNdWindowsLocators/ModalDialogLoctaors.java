package alertFramesNdWindowsLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Resources.Base;

public class ModalDialogLoctaors extends Base {

	@FindBy(xpath = "//button[@id='showSmallModal']")
	WebElement SmallModal;

	@FindBy(xpath = "//button[@id='showLargeModal']")
	WebElement LargeModal;

	@FindBy(xpath = "//div[@class='modal-body']")
	WebElement SmallModalText;

	@FindBy(xpath = "//button[@id='closeSmallModal']")
	WebElement CloseSmallModal;

	@FindBy(xpath = "//div[@class='modal-body']/p")
	WebElement LargeModalText;

	@FindBy(xpath = "//button[@id='closeLargeModal']")
	WebElement closeLargeModal;

	public WebElement closeLargeModal() {
		return closeLargeModal;
	}

	public WebElement LargeModalText() {
		return LargeModalText;
	}

	public WebElement CloseSmallModal() {
		return CloseSmallModal;
	}

	public WebElement SmallModalText() {
		return SmallModalText;
	}

	public WebElement LargeModal() {
		return LargeModal;
	}

	public WebElement SmallModal() {
		return SmallModal;
	}

}
