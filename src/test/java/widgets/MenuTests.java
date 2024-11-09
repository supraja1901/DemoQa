package widgets;

import org.openqa.selenium.support.PageFactory;

import Resources.Base;
import Resources.BasicActions;
import WidgetsLocators.MenuLocators;
import elementsLocators.homePageLocators;

public class MenuTests extends Base{
	
	BasicActions ba=new BasicActions();
	homePageLocators hpl=PageFactory.initElements(driver, homePageLocators.class);
	MenuLocators ml=PageFactory.initElements(driver, MenuLocators.class);
	
	
//	 Actions actions = new Actions(driver);
//     actions.moveToElement(menu).perform(); // Hover over the menu
//     actions.moveToElement(submenu).click().perform(); // Click the submenu item


}
