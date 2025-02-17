package Resources;

import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BasicActions extends Base {
	WebDriver driver = Driver();

	WebDriverWait wait = new WebDriverWait(Driver(), Duration.ofSeconds(30));
	JavascriptExecutor js = (JavascriptExecutor) Driver();
	Actions actions = new Actions(Driver());
//	Alert alert = driver.switchTo().alert();

	public void waitForPageLoad(WebDriver driver) {
		wait.until(new ExpectedCondition<Boolean>() {
			@Override
			public Boolean apply(WebDriver driver) {
				return (js.executeScript("return document.readyState").equals("complete"));
			}
		});
	}

	public void waitForElementTextToBe(WebElement element, String expectedText) {
		wait.until(ExpectedConditions.textToBePresentInElement(element, expectedText));
	}

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

	public void UnSelectWthGetAttribute(WebElement Element) {
		WaitForElementToBeClickable(Element);
		String ActualAttributeValue = Element.getDomAttribute("class");
		if (ActualAttributeValue.contains("active")) {
			click(Element);
		}
	}

	public void SelectWthGetAttribute(WebElement Element) {
		WaitForElementToBeClickable(Element);
		String ActualAttributeValue = Element.getDomAttribute("class");
		if (!ActualAttributeValue.contains("active")) {
			click(Element);
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
		String newTabHandle = Driver().getWindowHandles().stream()
				.filter(handle -> !handle.equals(Driver().getWindowHandle())).findFirst()
				.orElseThrow(() -> new RuntimeException("New tab not found"));

		Driver().switchTo().window(newTabHandle);

	}

	public void SwitchToFrame(WebElement FrameElement) {
		Driver().switchTo().frame(FrameElement);
	}

	public void SwitchBackToDefaultFrame() {
		Driver().switchTo().defaultContent();
	}

	public void WaitForAlert() {
//		wait.until(ExpectedConditions.jsReturnsValue("return document.readyState === 'complete';"));
		wait.until(ExpectedConditions.alertIsPresent());
	}

	public void acceptAlert() {
		WaitForAlert();
		Alert alert = Driver().switchTo().alert();
		alert.accept();
	}

	public void DismissAlert() {
		WaitForAlert();
		Alert alert = Driver().switchTo().alert();
		alert.dismiss();
	}

	public void PromptAlert(String Prompt) {
		WaitForAlert();
		Alert alert = Driver().switchTo().alert();
		alert.sendKeys(Prompt);
		alert.accept();
	}

	public void GetTextAlert() {
		WaitForAlert();
		Alert alert = Driver().switchTo().alert();
		System.out.println(alert.getText());
	}

	public void SelectElementFromList(List<WebElement> ElementsList, String Value) {
		WaitForElementsToBeVisibile(ElementsList);
		ElementsList.stream().filter(s -> s.getText().contains(Value)).findAny().get().click();
	}

	public void SelectElementFromDropdown(WebElement DropdownElement, List<WebElement> ElementsList, String Value) {
		click(DropdownElement);
		SelectElementFromList(ElementsList, Value);

	}

	public void MoveSlider(WebElement SliderElement, int targetValue) {
		WaitForElementToBeVisibile(SliderElement);
//		js.executeScript("arguments[0].value = arguments[1];" + "arguments[0].dispatchEvent(new Event('change'));",
//				SliderElement, targetValue);
		int minValue = Integer.parseInt(SliderElement.getDomAttribute("min"));
		int maxValue = Integer.parseInt(SliderElement.getDomAttribute("max"));
		int currentValue = Integer.parseInt(SliderElement.getDomAttribute("value")); // Current slider value

		// Calculate the offset to move the slider to the target value
		int sliderWidth = SliderElement.getSize().getWidth();
		int range = maxValue - minValue;
		double pixelsPerUnit = (double) sliderWidth / range;
//		int offset = (int) ((targetValue) * pixelsPerUnit);
		int offsetMin = (int) ((currentValue) * pixelsPerUnit);

		actions.dragAndDropBy(SliderElement, -offsetMin, 0).perform();
//		actions.clickAndHold(SliderElement).moveByOffset((-offsetMin), 0).release().perform();
//		actions.clickAndHold(SliderElement).moveByOffset(offset, 0).release().perform();
	}

	public void hoverOverElement(List<WebElement> elements, int index) {

		// Verify index is within bounds
		if (index >= 0 && index < elements.size()) {
			WebElement elementToHover = elements.get(index);

			// Use Actions class to hover over the specific element
			actions.moveToElement(elementToHover).perform();
		} else {
			System.out.println("Index out of bounds for WebElements list");
		}
	}

	public void HoverOverElement(WebElement HoverElement) {
		WaitForElementToBeVisibile(HoverElement);
		actions.moveToElement(HoverElement).perform();
	}

	public void HoverOverElementNdGetText(WebElement HoverElement, WebElement HoverTxtElement, String HoverTxt) {
		WaitForElementToBeVisibile(HoverElement);
		actions.moveToElement(HoverElement).perform();
		AssertWithContains(HoverTxtElement, HoverTxt);
	}

	public void SortElements(WebElement Element1, WebElement Element2) {
		WaitForElementToBeVisibile(Element1);
		WaitForElementToBeVisibile(Element2);
//		We cannot use actions.draganddrop because Lists that change positions or styles dynamically can 
//		cause dragAndDrop() to lose track of targets.
		actions.clickAndHold(Element1).moveToElement(Element2).release().perform();
	}

	public void DragAndDrop(WebElement Source, WebElement Target) {
		WaitForElementToBeVisibile(Source);
		WaitForElementToBeVisibile(Target);
		actions.dragAndDrop(Source, Target).perform();
//		here .build() is not used for dragAndDrop action because 
//		The .build() method is used to create a composite action when you chain multiple actions together. 
//		Like actions.moveToElement(element).click().build().perform();. 
//		The dragAndDrop() method is already a single, self-contained action. You can directly use .perform() without .build()

	}

	public void BrokenImage(WebElement ImageLocator) {
		WaitForElementToBeVisibile(ImageLocator);

		Boolean isImageBroken = (Boolean) js.executeScript("return arguments[0].naturalWidth == 0", ImageLocator);

		if (isImageBroken) {
			System.out.println("The image is broken.");
		}

		// Depricated
//		if (ImageLocator.getAttribute("naturalWidth").equals("0")) {
//			System.out.println("Image is broken");
//		}
	}

	public void brokenLink(WebElement Link) {
		String HrefAttValue = Link.getDomAttribute("href");
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
		ScrollUsingJSE(TestCaseLocator);
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

	public void scrollByPixels(int pixels) {
		js.executeScript("window.scrollBy(0," + pixels + ");");
	}

	public void SelectJSChkbox(WebElement ShadowHost, String StringShadowDom, String AttributeKey,
			String ExpectedAttributeValue) {
		WebElement ShadowDom = (WebElement) js
				.executeScript("return arguments[0].shadowRoot.querySelector('" + StringShadowDom + "')", ShadowHost);
		String ActualAttributeValue = ShadowDom.getDomAttribute(AttributeKey);
		if (ActualAttributeValue.contains(ExpectedAttributeValue)) {
			click(ShadowHost);
		}

	}

	public void UnSelectJSChkbox(WebElement ShadowHost, String StringShadowDom, String AttributeKey,
			String ExpectedAttributeValue) {
		WebElement ShadowDom = (WebElement) js
				.executeScript("return arguments[0].shadowRoot.querySelector('" + StringShadowDom + "')", ShadowHost);
		String ActualAttributeValue = ShadowDom.getDomAttribute(AttributeKey);
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
