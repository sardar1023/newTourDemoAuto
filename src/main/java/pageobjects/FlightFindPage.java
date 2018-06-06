package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FlightFindPage extends BasePage {

	static WebElement element = null;

	public FlightFindPage(WebDriver driver) {
		super(driver);
	}
//select the passenger count
	public static WebElement slc_Pass() {
		try {
			element = driver.findElement(By.name("passCount"));
		} catch (Exception e) {
			e.getStackTrace();
		}
		return element;
	}

	public static WebElement slc_fromPort() {
		try {
			element = driver.findElement(By.name("fromPort"));
		} catch (Exception e) {
			e.getStackTrace();
		}
		return element;
	}
	
	// select to port
	public static WebElement slc_toPort() {
		try {
			element = driver.findElement(By.name("toPort"));
		} catch (Exception e) {
			e.getStackTrace();
		}
		return element;
	}

	//select airline company
	public static WebElement slc_airLines() {
		try {
			element = driver.findElement(By.name("airline"));
		} catch (Exception e) {
			e.getStackTrace();
		}
		return element;
	}

	//continue button
	public static WebElement btn_findFlights() {
		try {
			element = driver.findElement(By.name("findFlights"));
		} catch (Exception e) {
			e.getStackTrace();
		}
		return element;
	}

	public static void SelectItem(WebElement element, int index) {
		Select slc = new Select(element);
		slc.selectByIndex(index);
	}

	public static void btnClick(WebElement element) {
		element.click();
	}
}
