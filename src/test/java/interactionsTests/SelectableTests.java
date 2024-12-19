package interactionsTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Resources.Base;
import Resources.BasicActions;
import elementsLocators.homePageLocators;
import interactionsLocators.SelectableLocators;
import interactionsLocators.SortableLocators;

public class SelectableTests extends Base {

	@Test
	public void SelectableTest() {

		BasicActions ba = new BasicActions();
		homePageLocators hpl = PageFactory.initElements(driver, homePageLocators.class);
		SortableLocators stl = PageFactory.initElements(driver, SortableLocators.class);
		SelectableLocators scl = PageFactory.initElements(driver, SelectableLocators.class);

		ba.NavToReqModule(hpl.HomePageInteractions(), hpl.Selectable());
		ba.click(stl.List());
		ba.SelectWthGetAttribute(scl.ListWebElements().get(0));
		ba.UnSelectWthGetAttribute(scl.ListWebElements().get(0));
		ba.SelectWthGetAttribute(scl.ListWebElements().get(1));
		ba.UnSelectWthGetAttribute(scl.ListWebElements().get(1));
		ba.SelectWthGetAttribute(scl.ListWebElements().get(2));
		ba.UnSelectWthGetAttribute(scl.ListWebElements().get(2));
		ba.SelectWthGetAttribute(scl.ListWebElements().get(3));
		ba.UnSelectWthGetAttribute(scl.ListWebElements().get(3));
		ba.SelectWthGetAttribute(scl.ListWebElements().get(0));
		ba.SelectWthGetAttribute(scl.ListWebElements().get(1));
		ba.SelectWthGetAttribute(scl.ListWebElements().get(2));
		ba.SelectWthGetAttribute(scl.ListWebElements().get(3));
		ba.click(stl.Grid());
		ba.SelectWthGetAttribute(scl.Row1Grid().get(0));
		ba.UnSelectWthGetAttribute(scl.Row1Grid().get(0));
		ba.SelectWthGetAttribute(scl.Row1Grid().get(1));
		ba.UnSelectWthGetAttribute(scl.Row1Grid().get(1));
		ba.SelectWthGetAttribute(scl.Row1Grid().get(2));
		ba.UnSelectWthGetAttribute(scl.Row1Grid().get(2));
		ba.SelectWthGetAttribute(scl.Row2Grid().get(0));
		ba.UnSelectWthGetAttribute(scl.Row2Grid().get(0));
		ba.SelectWthGetAttribute(scl.Row2Grid().get(1));
		ba.UnSelectWthGetAttribute(scl.Row2Grid().get(1));
		ba.SelectWthGetAttribute(scl.Row2Grid().get(2));
		ba.UnSelectWthGetAttribute(scl.Row2Grid().get(2));
		ba.ScrollUsingJSE(scl.Row3Grid().get(0));
		ba.SelectWthGetAttribute(scl.Row3Grid().get(0));
		ba.UnSelectWthGetAttribute(scl.Row3Grid().get(0));
		ba.SelectWthGetAttribute(scl.Row3Grid().get(1));
		ba.UnSelectWthGetAttribute(scl.Row3Grid().get(1));
		ba.SelectWthGetAttribute(scl.Row3Grid().get(2));
		ba.UnSelectWthGetAttribute(scl.Row3Grid().get(2));
		ba.SelectWthGetAttribute(scl.Row1Grid().get(0));
		ba.SelectWthGetAttribute(scl.Row1Grid().get(1));
		ba.SelectWthGetAttribute(scl.Row1Grid().get(2));
		ba.SelectWthGetAttribute(scl.Row2Grid().get(0));
		ba.SelectWthGetAttribute(scl.Row2Grid().get(1));
		ba.SelectWthGetAttribute(scl.Row2Grid().get(2));
		ba.SelectWthGetAttribute(scl.Row3Grid().get(0));
		ba.SelectWthGetAttribute(scl.Row3Grid().get(1));
		ba.SelectWthGetAttribute(scl.Row3Grid().get(2));

	}

}
