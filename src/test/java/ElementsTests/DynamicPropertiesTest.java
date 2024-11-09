package ElementsTests;

import java.time.Duration;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Resources.Base;
import Resources.BasicActions;
import elementsLocators.dynamicPropertiesLocators;
import elementsLocators.homePageLocators;

public class DynamicPropertiesTest extends Base {

	@Test
	public void DynamicPropTest() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		BasicActions ba = new BasicActions();
		homePageLocators hpl = PageFactory.initElements(driver, homePageLocators.class);
		dynamicPropertiesLocators dpl = PageFactory.initElements(driver, dynamicPropertiesLocators.class);

		ba.NavToReqModule(hpl.HomePageElement(), hpl.dynamicProperties());
		System.out.println(dpl.EnableAfterButton().isEnabled());
//		System.out.println(dpl.visibleAfterButton().isDisplayed());
		System.out.println(dpl.ColourChangeButton().getAttribute("class").contains("danger"));
		wait.until(ExpectedConditions.visibilityOf(dpl.visibleAfterButton()));
		System.out.println(dpl.EnableAfterButton().isEnabled());
		System.out.println(dpl.visibleAfterButton().isDisplayed());
		System.out.println(dpl.ColourChangeButton().getAttribute("class").contains("danger"));

	}

}
