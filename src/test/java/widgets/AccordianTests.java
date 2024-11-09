package widgets;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Resources.Base;
import Resources.BasicActions;
import WidgetsLocators.AccordianLocators;
import elementsLocators.homePageLocators;

public class AccordianTests extends Base {

	@Test
	public void AccordianTest() {
		String Section1Text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry";
		String Section2Text = "Contrary to popular belief, Lorem Ipsum is not simply random text";
		String Section3Text = "It is a long established fact that a reader will be distracted";

		BasicActions ba = new BasicActions();

		homePageLocators hpl = PageFactory.initElements(driver, homePageLocators.class);
		AccordianLocators al = PageFactory.initElements(driver, AccordianLocators.class);

		ba.NavToReqModule(hpl.HomePageWidgets(), hpl.Accordian());
//		ba.click(al.section1Heading());
		ba.AssertWithContains(al.section1Content(), Section1Text);
		ba.click(al.section1Heading());
		ba.WaitForElementToDisappear(al.section1Content());
		ba.click(al.section2Heading());
		ba.AssertWithContains(al.section2Content(), Section2Text);
		ba.click(al.section3Heading());
		ba.WaitForElementToDisappear(al.section2Content());
		ba.AssertWithContains(al.section3Content(), Section3Text);

	}
}
