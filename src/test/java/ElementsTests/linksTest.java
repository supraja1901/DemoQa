package ElementsTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Resources.Base;
import Resources.BasicActions;
import elementsLocators.homePageLocators;
import elementsLocators.linksLocators;

public class linksTest extends Base {

	@Test
	public void LinksTest() throws InterruptedException {
		if (driver != null) {
			System.out.println("I'm not null");
		} else {
			System.out.println("I'm null");
		}

		String LinkText = "Links";
		String CreatedResponse = "Link has responded with staus 201 and status text Created";
		String NoContent = "Link has responded with staus 204 and status text No Content";
		String Moved = "Link has responded with staus 301 and status text Moved Permanently";
		String BadRequest = "Link has responded with staus 400 and status text Bad Request";
		String UnAuthorized = "Link has responded with staus 401 and status text Unauthorized";
		String Forbidden = "Link has responded with staus 403 and status text Forbidden";
		String NotFound = "Link has responded with staus 404 and status text Not Found";

		BasicActions ba = new BasicActions();
		homePageLocators hpl = PageFactory.initElements(Driver(), homePageLocators.class);
		linksLocators ll = PageFactory.initElements(Driver(), linksLocators.class);

		ba.NavToReqModule(hpl.HomePageElement(), hpl.Links());
		ba.GetTextNdAssert(ll.LinksHeading(), LinkText);
		ba.click(ll.HomeLink());
		ba.switchWindowHandles();
		ba.NavToReqModule(hpl.HomePageElement(), hpl.Links());
		ba.GetTextNdAssert(ll.LinksHeading(), LinkText);
		ba.ScrollUsingJSE(ll.Created());
		ba.click(ll.Created());
		ba.GetTextNdAssert(ll.linkResponse(), CreatedResponse);
		ba.click(ll.NoContent());
		Thread.sleep(1000);
		ba.GetTextNdAssert(ll.linkResponse(), NoContent);
		ba.click(ll.moved());
		Thread.sleep(1000);
		ba.GetTextNdAssert(ll.linkResponse(), Moved);
		ba.click(ll.BadRequest());
		Thread.sleep(1000);
		ba.GetTextNdAssert(ll.linkResponse(), BadRequest);
		ba.click(ll.unauthorized());
		Thread.sleep(1000);
		ba.GetTextNdAssert(ll.linkResponse(), UnAuthorized);
		ba.click(ll.forbidden());
		Thread.sleep(1000);
		ba.GetTextNdAssert(ll.linkResponse(), Forbidden);
		ba.click(ll.NotFound());
		Thread.sleep(1000);
		ba.GetTextNdAssert(ll.linkResponse(), NotFound);

	}

}
