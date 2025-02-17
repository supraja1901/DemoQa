package widgets;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Resources.Base;
import Resources.BasicActions;
import WidgetsLocators.TabsLocators;
import elementsLocators.homePageLocators;

public class TabTests extends Base {

	@Test
	public void TabTest() {

		String WhatTabText = "Lorem Ipsum is simply dummy text of the printing and typesetting industry";
		String OriginTabText = "Contrary to popular belief,";
		String UseTabText = "It is a long established fact that a reader";

		BasicActions ba = new BasicActions();
		homePageLocators hpl = PageFactory.initElements(Driver(), homePageLocators.class);
		TabsLocators tl = PageFactory.initElements(Driver(), TabsLocators.class);

		ba.NavToReqModule(hpl.HomePageWidgets(), hpl.Tabs());
		ba.click(tl.WhatTab());
		ba.AssertWithContains(tl.WhatTabText(), WhatTabText);
		ba.click(tl.OriginTab());
		ba.AssertWithContains(tl.originTabText(), OriginTabText);
		ba.click(tl.UseTab());
		ba.AssertWithContains(tl.useTabText(), UseTabText);

	}

}
