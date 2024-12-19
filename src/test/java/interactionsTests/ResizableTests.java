package interactionsTests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Resources.Base;
import Resources.BasicActions;
import elementsLocators.homePageLocators;
import interactionsLocators.ResizableLocators;

public class ResizableTests extends Base {

	@Test
	public void ResizableTest() {

		BasicActions ba = new BasicActions();
		homePageLocators hpl = PageFactory.initElements(driver, homePageLocators.class);
		ResizableLocators rl = PageFactory.initElements(driver, ResizableLocators.class);

		ba.NavToReqModule(hpl.HomePageInteractions(), hpl.Resizable());
		Actions actions = new Actions(driver);

		System.out.println(rl.resizableRestrictionElement().getSize());
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript(
	            "arguments[0].style.width='250px'; arguments[0].style.height='150px';",
	            rl.resizableRestrictionElement()
	        );
		System.out.println(rl.resizableRestrictionElement().getSize());
//		actions.clickAndHold(rl.resizableRestrictionElement()).moveByOffset(300, 400) // Adjust width and height
//				.release().perform();
//		System.out.println(rl.resizableRestrictionElement().getSize());
		ba.ScrollUsingJSE(rl.resizableWORestrictionElement());
		actions.clickAndHold(rl.resizableWORestrictionElement()).moveByOffset(100, 100) // Adjust width and height
				.release().perform();

	}

}
