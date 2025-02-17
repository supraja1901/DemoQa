package ElementsTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Resources.Base;
import Resources.BasicActions;
import elementsLocators.CheckBoxLocators;
import elementsLocators.homePageLocators;

public class checkBoxTest extends Base {

	@Test
	public void CheckBox() throws InterruptedException {

		String SelectHome = "You have selected :\n" + "home\n" + "desktop\n" + "notes\n" + "commands\n" + "documents\n"
				+ "workspace\n" + "react\n" + "angular\n" + "veu\n" + "office\n" + "public\n" + "private\n"
				+ "classified\n" + "general\n" + "downloads\n" + "wordFile\n" + "excelFile";
		String SelectDesktop = "You have selected :\n" + "desktop\n" + "notes\n" + "commands";
//		String ShadowDom="svg";
//		String attributeKey="class";
//		String ExpectedAttributeValue="rct-icon-check";
		BasicActions ba = new BasicActions();
		CheckBoxLocators cbl = PageFactory.initElements(Driver(), CheckBoxLocators.class);
		homePageLocators hpl = PageFactory.initElements(Driver(), homePageLocators.class);
		ba.NavToReqModule(hpl.HomePageElement(), hpl.CheckBox());
		ba.SelectCheckbox(cbl.homeChkBox());
		System.out.println(cbl.ValidatehomeChkBox().isSelected());
		Thread.sleep(3000);
		ba.AssertWithContains(cbl.Result(), SelectHome);
		Thread.sleep(3000);
//		ba.UnselectCheckbox(cbl.homeChkBox());
		ba.click(cbl.homeChkBox());
		System.out.println(cbl.ValidatehomeChkBox().isSelected());
		Thread.sleep(3000);
		ba.click(cbl.expandAll());
		Thread.sleep(3000);
		ba.SelectCheckbox(cbl.desktopChkBox());
		ba.AssertWithContains(cbl.Result(), SelectDesktop);

	}

}
