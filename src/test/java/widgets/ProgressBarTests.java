package widgets;

import java.time.Duration;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Resources.Base;
import Resources.BasicActions;
import WidgetsLocators.ProgressBarLocators;
import elementsLocators.homePageLocators;

public class ProgressBarTests extends Base {

	@Test
	public void ProgressBarTest() {

		BasicActions ba = new BasicActions();
		homePageLocators hpl = PageFactory.initElements(Driver(), homePageLocators.class);
		ProgressBarLocators pbl = PageFactory.initElements(Driver(), ProgressBarLocators.class);

		ba.NavToReqModule(hpl.HomePageWidgets(), hpl.ProgressBar());
		ba.click(pbl.StartStopBtn());
		WebDriverWait wait = new WebDriverWait(Driver(), Duration.ofSeconds(5000));
		boolean progressStatus = wait
				.until(ExpectedConditions.attributeToBe(pbl.progressBar(), "aria-valuenow", "100"));
		if (progressStatus == true) {
			wait.until(ExpectedConditions.elementToBeClickable(pbl.ResetBtn())).click();
		}
		ba.click(pbl.StartStopBtn());
		boolean progressStatus1 = wait
				.until(ExpectedConditions.attributeToBe(pbl.progressBar(), "aria-valuenow", "10"));
		if (progressStatus1 == true) {
			wait.until(ExpectedConditions.elementToBeClickable(pbl.StartStopBtn())).click();
		}

	}

}
