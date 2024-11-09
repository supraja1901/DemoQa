package ElementsTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Resources.Base;
import Resources.BasicActions;
import elementsLocators.homePageLocators;
import elementsLocators.textBoxLocators;

public class textBoxTest extends Base {

	@Test
	public void TextBox() {

		String FullName = "Suppu";
		String email = "suppu@gmail.com";
		String currentAddress = "Ieeja";
		String PermanemtAddress = "Ieeja";

//		we should invoke openBrowser first and then we should create objects for classes or write code because if we invoke objects first, 
//		then it invokes driver but driver is defined as chromeDriver in OpenBrowser only so invoking browser make driver null

		BasicActions ba = new BasicActions();
		homePageLocators hpl = PageFactory.initElements(driver, homePageLocators.class);
		textBoxLocators tbl = PageFactory.initElements(driver, textBoxLocators.class);
		ba.NavToReqModule(hpl.HomePageElement(), hpl.TextBox());
		ba.GetTextNdAssert(tbl.textBox(), "Text Box");
		ba.SendKeys(tbl.fullName(), FullName);
		ba.SendKeys(tbl.email(), email);
		ba.SendKeys(tbl.currentAddress(), currentAddress);
		ba.SendKeys(tbl.permanentAddress(), PermanemtAddress);
		ba.ScrollUsingJSE(tbl.submit());
		ba.click(tbl.submit());
		ba.AssertWithContains(tbl.NameOutput(), FullName);
		ba.AssertWithContains(tbl.emailOutput(), email);
		ba.AssertWithContains(tbl.currentAddressOutput(), currentAddress);
		ba.AssertWithContains(tbl.permanentAddressOutput(), PermanemtAddress);

	}

}
