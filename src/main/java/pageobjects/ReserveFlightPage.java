package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReserveFlightPage extends BasePage {

	static WebElement element = null;

	public ReserveFlightPage(WebDriver driver) {
		super(driver);
	}

	public static WebElement btn_reserveFlights() {
		try {
			element = driver.findElement(By.name("reserveFlights"));
		} catch (Exception e) {
			e.getStackTrace();
		}
		return element;
	}

	public static void tearDown() {
		driver.close();
	}
}
