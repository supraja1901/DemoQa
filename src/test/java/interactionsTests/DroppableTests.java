package interactionsTests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import Resources.Base;
import Resources.BasicActions;
import elementsLocators.homePageLocators;
import interactionsLocators.DroppableLocators;

public class DroppableTests extends Base {

	String DropHere = "Drop here";
	String Dropped = "Dropped!";

	public void DragAndDropWithTxtAssertn(WebElement DraggableLocator, WebElement DroppableLocator,
			String BeforeDropTxt, String AfterDropTxt) {

		BasicActions ba = new BasicActions();

		ba.GetTextNdAssert(DroppableLocator, BeforeDropTxt);
		ba.DragAndDrop(DraggableLocator, DroppableLocator);
		ba.waitForElementTextToBe(DroppableLocator, AfterDropTxt);
		ba.GetTextNdAssert(DroppableLocator, AfterDropTxt);
	}

	@Test
	public void DropTest() {

		BasicActions ba = new BasicActions();
		homePageLocators hpl = PageFactory.initElements(Driver(), homePageLocators.class);
		DroppableLocators dl = PageFactory.initElements(Driver(), DroppableLocators.class);

		ba.NavToReqModule(hpl.HomePageInteractions(), hpl.Droppable());
		DragAndDropWithTxtAssertn(dl.SimpleDraggable(), dl.SimpleDroppable(), DropHere, Dropped);
		ba.click(dl.AcceptTab());
		DragAndDropWithTxtAssertn(dl.NotAcceptDraggable(), dl.AcceptDroppable(), DropHere, DropHere);

		DragAndDropWithTxtAssertn(dl.AcceptDraggable(), dl.AcceptDroppable(), DropHere, Dropped);

	}

}
