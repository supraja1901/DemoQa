package elementsLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Resources.Base;

public class linksLocators extends Base {

	@FindBy(xpath = "//a[@id='simpleLink']")
	WebElement HomeLink;

	@FindBy(xpath = "//a[@id='dynamicLink']")
	WebElement Home5KfbGLink;

	@FindBy(xpath = "//a[@id='created']")
	WebElement Created;

	@FindBy(xpath = "//a[@id='no-content']")
	WebElement NoContent;

	@FindBy(xpath = "//a[@id='moved']")
	WebElement moved;

	@FindBy(xpath = "//a[@id='bad-request']")
	WebElement BadRequest;

	@FindBy(xpath = "//a[@id='unauthorized']")
	WebElement unauthorized;

	@FindBy(xpath = "//a[@id='forbidden']")
	WebElement forbidden;

	@FindBy(xpath = "//a[@id='invalid-url']")
	WebElement NotFound;

	@FindBy(xpath = "//p[@id='linkResponse']")
	WebElement linkResponse;

	@FindBy(xpath = "//h1[text()='Links']")
	WebElement LinksHeading;

	public WebElement LinksHeading() {
		return LinksHeading;
	}

	public WebElement NotFound() {
		return NotFound;
	}

	public WebElement linkResponse() {
		return linkResponse;
	}

	public WebElement forbidden() {
		return forbidden;
	}

	public WebElement unauthorized() {
		return unauthorized;
	}

	public WebElement BadRequest() {
		return BadRequest;
	}

	public WebElement moved() {
		return moved;
	}

	public WebElement NoContent() {
		return NoContent;
	}

	public WebElement Created() {
		return Created;
	}

	public WebElement Home5KfbGLink() {
		return Home5KfbGLink;
	}

	public WebElement HomeLink() {
		return HomeLink;
	}

}
