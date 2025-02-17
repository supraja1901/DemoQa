package widgets;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Resources.Base;
import Resources.BasicActions;
import WidgetsLocators.SliderLocators;
import elementsLocators.homePageLocators;

public class SliderTests extends Base {

	@Test
	public void SliderTest() {

		BasicActions ba = new BasicActions();
		homePageLocators hpl = PageFactory.initElements(Driver(), homePageLocators.class);
		SliderLocators sl = PageFactory.initElements(Driver(), SliderLocators.class);

		ba.NavToReqModule(hpl.HomePageWidgets(), hpl.Slider());
		System.out.println(sl.Slider().getDomAttribute("value"));
		System.out.println(sl.Slider().getSize().getWidth());
		ba.MoveSlider(sl.Slider(), 20);
		System.out.println(sl.Slider().getDomAttribute("value"));
	}

}
