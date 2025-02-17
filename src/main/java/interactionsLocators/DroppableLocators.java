package interactionsLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Resources.Base;

public class DroppableLocators extends Base {

	@FindBy(xpath = "//div[@id='draggable']")
	WebElement SimpleDraggable;

	@FindBy(xpath = "//div[@id='simpleDropContainer']/div[@id='droppable']")
	WebElement SimpleDroppable;

	@FindBy(xpath = "//div[@id='acceptDropContainer']/div[@id='droppable']")
	WebElement AcceptDroppable;

	@FindBy(xpath = "//div[@id='acceptable']")
	WebElement AcceptDraggable;

	@FindBy(xpath = "//div[@id='notAcceptable']")
	WebElement NotAcceptDraggable;

	@FindBy(xpath = "//a[@id='droppableExample-tab-accept']")
	WebElement AcceptTab;

	@FindBy(xpath = "//a[@id='droppableExample-tab-preventPropogation']")
	WebElement PreventPropagatnTab;

	@FindBy(xpath = "//div[@id='dragBox']")
	WebElement PreventDraggable;

	@FindBy(xpath = "//div[@id='notGreedyDropBox']")
	WebElement notGreedyDropBox;

	@FindBy(xpath = "//div[@id='notGreedyInnerDropBox']")
	WebElement notGreedyInnerDropBox;

	@FindBy(xpath = "//div[@id='greedyDropBox']")
	WebElement greedyDropBox;

	@FindBy(xpath = "//div[@id='greedyDropBoxInner']")
	WebElement greedyDropBoxInner;

	@FindBy(xpath = "//a[@id='droppableExample-tab-revertable']")
	WebElement revertableTab;

	@FindBy(xpath = "//div[@id='revertable']")
	WebElement revertDraggable;

	@FindBy(xpath = "//div[@id='notRevertable']")
	WebElement notRevertableDraggable;

	@FindBy(xpath = "//div[@id='revertableDropContainer']/div[@id='droppable']")
	WebElement RevertDroppable;

	public WebElement RevertDroppable() {
		return RevertDroppable;
	}

	public WebElement notRevertableDraggable() {
		return notRevertableDraggable;
	}

	public WebElement revertDraggable() {
		return revertDraggable;
	}

	public WebElement revertableTab() {
		return revertableTab;
	}

	public WebElement greedyDropBoxInner() {
		return greedyDropBoxInner;
	}

	public WebElement greedyDropBox() {
		return greedyDropBox;
	}

	public WebElement notGreedyInnerDropBox() {
		return notGreedyInnerDropBox;
	}

	public WebElement notGreedyDropBox() {
		return notGreedyDropBox;
	}

	public WebElement PreventDraggable() {
		return PreventDraggable;
	}

	public WebElement PreventPropagatnTab() {
		return PreventPropagatnTab;
	}

	public WebElement AcceptTab() {
		return AcceptTab;
	}

	public WebElement NotAcceptDraggable() {
		return NotAcceptDraggable;
	}

	public WebElement AcceptDraggable() {
		return AcceptDraggable;
	}

	public WebElement AcceptDroppable() {
		return AcceptDroppable;
	}

	public WebElement SimpleDroppable() {
		return SimpleDroppable;
	}

	public WebElement SimpleDraggable() {
		return SimpleDraggable;
	}

}
