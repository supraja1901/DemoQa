package Resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class Base {
	protected static WebDriver driver;
//	Static driver: By making driver static, it’s initialized only once and shared among all instances that extend Base.
//	visibility of driver is changed to protected because it has a scope of classes in its package and the inherited classes
//	by default the visibility is default where the scope is only till classes of its package
//	we should declare the variable driver outside openBrowser because then only it can be accessed by 
//		inherited classes and other methods defined in the same class
//	we should just declare driver, we should not define it. defining it outside openBrowser invokes multiple drivers while code execution

//	src/main folder has locators and resources packages 
//	resources package has base and basic actions
//	in base we initialize driver and open chrome and open the website
//	in basic actions we write all the reusable methods
//	in locators package we give all locators files each file has locators related to a particular page
//	src/test folder has package for each module to be tested and the test cases related to each module are written in separate files

	public void StartDriver() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@BeforeMethod
	public void StartBrowser() {
		StartDriver();
		driver.get("https://demoqa.com/");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
