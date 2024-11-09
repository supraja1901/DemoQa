package elementsLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Resources.Base;

public class webTablesLocators extends Base {

	@FindBy(xpath = "//h1[text()='Web Tables']")
	WebElement WebTables;

	@FindBy(xpath = "//button[@id='addNewRecordButton']")
	WebElement AddBtn;

	@FindBy(xpath = "//input[@id='firstName']")
	WebElement FirstName;

	@FindBy(xpath = "//input[@id='lastName']")
	WebElement LastName;

	@FindBy(xpath = "//input[@id='userEmail']")
	WebElement UserEmail;

	@FindBy(xpath = "//input[@id='age']")
	WebElement age;

	@FindBy(xpath = "//input[@id='salary']")
	WebElement salary;

	@FindBy(xpath = "//input[@id='department']")
	WebElement department;

	@FindBy(xpath = "//button[@id='submit']")
	WebElement submit;
//
//	@FindBy(xpath = "//button[@id='submit']")
//	WebElement submit;
//
//	public WebElement submit() {
//		return submit;
//	}
//	
	public WebElement submit() {
		return submit;
	}
	
	public WebElement department() {
		return department;
	}
	
	public WebElement salary() {
		return salary;
	}
	
	public WebElement age() {
		return age;
	}
	
	public WebElement UserEmail() {
		return UserEmail;
	}
	
	public WebElement LastName() {
		return LastName;
	}
	
	public WebElement FirstName() {
		return FirstName;
	}
	
	public WebElement AddBtn() {
		return AddBtn;
	}
	
	public WebElement WebTables() {
		return WebTables;
	}
}
