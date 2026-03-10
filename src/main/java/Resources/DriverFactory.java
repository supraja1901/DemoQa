package Resources;

import org.openqa.selenium.WebDriver;

public class DriverFactory {

	private DriverFactory() {

	}

	private static DriverFactory instance = new DriverFactory();

	public static DriverFactory getInstance() {
		return instance;
	}

	private static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();

	public WebDriver getDriver() {
		return driver.get();
	}

	public void setDriver(WebDriver driverPraram) {
		driver.set(driverPraram);
	}

	public void removeDriver() {
		driver.get().quit();
		driver.remove();
	}

}
