package Resources;

import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BasicActions extends Base {

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	static JavascriptExecutor js = (JavascriptExecutor) driver;
	Actions actions = new Actions(driver);

	public void WaitForElementToBeVisibile(WebElement Element) {
		wait.until(ExpectedConditions.visibilityOf(Element));
	}

	public void WaitForElementsToBeVisibile(List<WebElement> Elements) {
		wait.until(ExpectedConditions.visibilityOfAllElements(Elements));
	}

	public void WaitForElementToDisappear(WebElement Element) {
		wait.until(ExpectedConditions.invisibilityOf(Element));

	}

	public void WaitForElementToBeClickable(WebElement Element) {
		wait.until(ExpectedConditions.elementToBeClickable(Element));
	}

	public void click(WebElement Element) {
		WaitForElementToBeVisibile(Element);
		WaitForElementToBeClickable(Element);
		Element.click();
	}

	public void SendKeys(WebElement Element, String Value) {
		WaitForElementToBeVisibile(Element);
		Element.sendKeys(Value);
		;
	}

	public String GetText(WebElement Element) {
		WaitForElementToBeVisibile(Element);
		String Text = Element.getText();
		return Text;
	}

	public void GetTextNdAssert(WebElement Element, String Value) {
		WaitForElementToBeVisibile(Element);
		Assert.assertEquals(GetText(Element), Value);
	}

	public void AssertWithContains(WebElement Element, String Value) {
		ScrollUsingJSE(Element);
		WaitForElementToBeVisibile(Element);
		Assert.assertTrue(GetText(Element).contains(Value));
	}

//	isEnabled(): Verifies if the checkbox is enabled (clickable).
//	isSelected(): Confirms the checkbox is not already selected before clicking.

	public void SelectCheckbox(WebElement checkbox) {
		WaitForElementToBeVisibile(checkbox);
		if (checkbox.isEnabled()) {
			if (!checkbox.isSelected()) {
				click(checkbox);
			}

		}
	}

	public void UnselectCheckbox(WebElement checkbox) {
		WaitForElementToBeVisibile(checkbox);
		if (checkbox.isEnabled()) {
			if (checkbox.isSelected()) {
				click(checkbox);
			}
		}
	}

	public void ClickRadioBtn(WebElement RadioBtn, WebElement ValidateRadioBtn) {
		WaitForElementToBeVisibile(RadioBtn);
		if (ValidateRadioBtn.isEnabled()) {
			if (!ValidateRadioBtn.isSelected()) {
				click(RadioBtn);
			}

		} else {
			System.out.println("RadioBtn is disabled");
		}
	}

	public void rightClick(WebElement elementToRightClick) {
		WaitForElementToBeVisibile(elementToRightClick);
		WaitForElementToBeClickable(elementToRightClick);
		actions.contextClick(elementToRightClick).perform();
	}

	public void DoubleClick(WebElement elementToDoubleClick) {
		WaitForElementToBeVisibile(elementToDoubleClick);
		WaitForElementToBeClickable(elementToDoubleClick);
		actions.doubleClick(elementToDoubleClick).perform();
	}

	public void UploadDoc(WebElement Element, String FilePath) {
		WaitForElementToBeVisibile(Element);
		Element.sendKeys(FilePath);
	}

	public void switchWindowHandles() {
		String newTabHandle = driver.getWindowHandles().stream()
				.filter(handle -> !handle.equals(driver.getWindowHandle())).findFirst()
				.orElseThrow(() -> new RuntimeException("New tab not found"));

		driver.switchTo().window(newTabHandle);

	}

	public void SwitchToFrame(WebElement FrameElement) {
		driver.switchTo().frame(FrameElement);
	}

	public void SwitchBackToDefaultFrame() {
		driver.switchTo().defaultContent();
	}

	public void WaitForAlert() {
//		wait.until(ExpectedConditions.jsReturnsValue("return document.readyState === 'complete';"));
		wait.until(ExpectedConditions.alertIsPresent());
	}

	public void acceptAlert() {
		WaitForAlert();
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	public void DismissAlert() {
		WaitForAlert();
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}

	public void PromptAlert(String Prompt) {
		WaitForAlert();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(Prompt);
		alert.accept();
	}

	public void GetTextAlert() {
		WaitForAlert();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
	}

	public void SelectElementFromList(List<WebElement> ElementsList, String Value) {
		WaitForElementsToBeVisibile(ElementsList);
		ElementsList.stream().filter(s -> s.getText().contains(Value)).findAny().get().click();
	}

	public void MoveSlider(WebElement SliderElement, int targetValue) {
		WaitForElementToBeVisibile(SliderElement);
//		js.executeScript("arguments[0].value = arguments[1];" + "arguments[0].dispatchEvent(new Event('change'));",
//				SliderElement, targetValue);
		int minValue = Integer.parseInt(SliderElement.getAttribute("min"));
		int maxValue = Integer.parseInt(SliderElement.getAttribute("max"));
		int currentValue = Integer.parseInt(SliderElement.getAttribute("value")); // Current slider value

		// Calculate the offset to move the slider to the target value
		int sliderWidth = SliderElement.getSize().getWidth();
		int range = maxValue - minValue;
		double pixelsPerUnit = (double) sliderWidth / range;
		int offset = (int) ((targetValue) * pixelsPerUnit);
		int offsetMin = (int) ((currentValue) * pixelsPerUnit);

		actions.dragAndDropBy(SliderElement, -offsetMin, 0).perform();
//		actions.clickAndHold(SliderElement).moveByOffset((-offsetMin), 0).release().perform();
//		actions.clickAndHold(SliderElement).moveByOffset(offset, 0).release().perform();
	}

	public void ProgressBar() {

	}

	public void HoverOverElementNdGetText(WebElement HoverElement, WebElement HoverTxtElement, String HoverTxt) {
		WaitForElementToBeVisibile(HoverElement);
		actions.moveToElement(HoverElement).perform();
		AssertWithContains(HoverTxtElement, HoverTxt);
	}

	public void BrokenImage(WebElement ImageLocator) {
		WaitForElementToBeVisibile(ImageLocator);
		if (ImageLocator.getAttribute("naturalWidth").equals("0")) {
			System.out.println("Image is broken");
		}
	}

	public void brokenLink(WebElement Link) {
		String HrefAttValue = Link.getAttribute("href");
		if (HrefAttValue == null || HrefAttValue.isEmpty()) {
			System.out.println("href attribulte value is null or empty");
		}
		try {

			URI uri = new URI(HrefAttValue);
			URL LinkUrl = uri.toURL();
			HttpURLConnection conn = (HttpURLConnection) LinkUrl.openConnection();
			conn.connect();
			if (conn.getResponseCode() >= 400) {
				System.out.println(HrefAttValue + "===> Broken Link");
			} else {
				System.out.println(HrefAttValue + "===> not a broken link");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public void NavToReqModule(WebElement HomePageLocator, WebElement TestCaseLocator) {
		ScrollUsingJSE(HomePageLocator);
		click(HomePageLocator);
		click(TestCaseLocator);
	}

	public void zoom(int zoomPercentage) {
		js.executeScript("document.body.style.zoom='" + zoomPercentage + "%'");
	}

	public void ScrollUsingJSE(WebElement Element) {
		WaitForElementToBeVisibile(Element);

		js.executeScript("arguments[0].scrollIntoView();", Element);
	}

//	Here, the +pixels+ concatenation is used to insert the value of the pixels variable into the string.

//	" + pixels + " is used because Java does not automatically replace variable names with their values inside strings 
//		(unlike template literals in some languages like JavaScript itself).

//	You need to concatenate the value of pixels to form the final JavaScript code string that will be executed by the browser.

//	If you directly write pixels without concatenation, it won’t work, as Java doesn't support interpolation inside plain strings 
//		like some other languages.

//	public void scrollPageUsingJSE(int pixels) {
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollby(0," + pixels + ")");
//	}

	public void SelectJSChkbox(WebElement ShadowHost, String StringShadowDom, String AttributeKey,
			String ExpectedAttributeValue) {
		WebElement ShadowDom = (WebElement) js
				.executeScript("return arguments[0].shadowRoot.querySelector('" + StringShadowDom + "')", ShadowHost);
		String ActualAttributeValue = ShadowDom.getAttribute(AttributeKey);
		if (ActualAttributeValue.contains(ExpectedAttributeValue)) {
			click(ShadowHost);
		}

	}

	public void UnSelectJSChkbox(WebElement ShadowHost, String StringShadowDom, String AttributeKey,
			String ExpectedAttributeValue) {
		WebElement ShadowDom = (WebElement) js
				.executeScript("return arguments[0].shadowRoot.querySelector('" + StringShadowDom + "')", ShadowHost);
		String ActualAttributeValue = ShadowDom.getAttribute(AttributeKey);
		if (!ActualAttributeValue.contains(ExpectedAttributeValue)) {
			click(ShadowHost);
		}

	}

//	shadowElements checkbox:
//	WebElement shadowHost = driver.findElement(By.xpath("//label[@for='tree-node-home']"));
//
//	// Get the svg element within shadow DOM
//	WebElement svg = (WebElement) js.executeScript("return arguments[0].shadowRoot.querySelector('svg')", shadowHost);
//
//	// Check if the checkbox is selected or not
//	String checkboxClass = svg.getAttribute("class");
//
//	if (checkboxClass.contains("rct-icon-check")) {
//	    System.out.println("Checkbox is already selected.");
//	} else if (checkboxClass.contains("rct-icon-uncheck")) {
//	    System.out.println("Checkbox is not selected. Clicking to select.");
//	    shadowHost.click();  // Click the label or checkbox to change its state
//	} else {
//	    System.out.println("Checkbox state could not be determined.");
//	}

}
