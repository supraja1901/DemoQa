package ElementsTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Resources.Base;
import Resources.BasicActions;
import Resources.DriverFactory;
import elementsLocators.brokenImagesLinksLocators;
import elementsLocators.homePageLocators;

public class BrokenLInksImagesTest extends Base {

	@Test
	public void BrokenImagesTest() {

		BasicActions ba = new BasicActions();
		homePageLocators hpl = PageFactory.initElements(DriverFactory.getInstance().getDriver(),
				homePageLocators.class);
		brokenImagesLinksLocators bli = PageFactory.initElements(DriverFactory.getInstance().getDriver(),
				brokenImagesLinksLocators.class);

		ba.NavToReqModule(hpl.HomePageElement(), hpl.brokenLinksImages());
		ba.ScrollUsingJSE(bli.Image1());
		ba.BrokenImage(bli.Image1());
		ba.BrokenImage(bli.Image2());

	}

//	broken link is a link which doesnot have any resource in the server

	@Test
	public void BrokenLinkTest() {
		BasicActions ba = new BasicActions();
		homePageLocators hpl = PageFactory.initElements(DriverFactory.getInstance().getDriver(),
				homePageLocators.class);
		brokenImagesLinksLocators bli = PageFactory.initElements(DriverFactory.getInstance().getDriver(),
				brokenImagesLinksLocators.class);

		ba.NavToReqModule(hpl.HomePageElement(), hpl.brokenLinksImages());
		ba.brokenLink(bli.BrokenLink());
		ba.brokenLink(bli.ValidLink());

	}

}
