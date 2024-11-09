package ElementsTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Resources.Base;
import Resources.BasicActions;
import elementsLocators.homePageLocators;
import elementsLocators.webTablesLocators;

public class WebTablesTest extends Base {

	@Test
	public void FillForm() {

		String FirstName = "Supraja";
		String LastName = "Maile";
		String Email = "supraja@gmail.com";
		String age = "24";
		String salary = "150000";
		String Department = "Testing";

		BasicActions ba = new BasicActions();
		homePageLocators hpl = PageFactory.initElements(driver, homePageLocators.class);
		webTablesLocators wtl = PageFactory.initElements(driver, webTablesLocators.class);

		ba.NavToReqModule(hpl.HomePageElement(), hpl.WebTables());
		ba.click(wtl.AddBtn());
		ba.SendKeys(wtl.FirstName(), FirstName);
		ba.SendKeys(wtl.LastName(), LastName);
		ba.SendKeys(wtl.UserEmail(), Email);
		ba.SendKeys(wtl.age(), age);
		ba.SendKeys(wtl.salary(), salary);
		ba.SendKeys(wtl.department(), Department);
		ba.click(wtl.submit());

	}

}
