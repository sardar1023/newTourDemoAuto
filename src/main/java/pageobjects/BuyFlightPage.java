package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BuyFlightPage extends BasePage {

	static WebElement element = null;
	
	public BuyFlightPage(WebDriver driver) {
		super(driver);
	}

	public static WebElement txt_passFirst0() {
		try {
			element = driver.findElement(By.name("passFirst0"));
		} catch (Exception e) {
			e.getStackTrace();
		}
		return element;
	}
	
	public static WebElement txt_passLast0() {
		try {
			element = driver.findElement(By.name("passLast0"));
		} catch (Exception e) {
			e.getStackTrace();
		}
		return element;
	}
	
	public static WebElement txt_passFirst1() {
		try {
			element = driver.findElement(By.name("passFirst1"));
		} catch (Exception e) {
			e.getStackTrace();
		}
		return element;
	}
	
	public static WebElement txt_passLast1() {
		try {
			element = driver.findElement(By.name("passFirst1"));
		} catch (Exception e) {
			e.getStackTrace();
		}
		return element;
	}
	
	public static WebElement slc_creditCard() {
		try {
			element = driver.findElement(By.name("creditCard"));
		} catch (Exception e) {
			e.getStackTrace();
		}
		return element;
	}
	
	public static WebElement txt_creditnumber() {
		try {
			element = driver.findElement(By.name("creditnumber"));
		} catch (Exception e) {
			e.getStackTrace();
		}
		return element;
	}
	
	public static WebElement slc_creditMnth() {
		try {
			element = driver.findElement(By.name("cc_exp_dt_mn"));
		} catch (Exception e) {
			e.getStackTrace();
		}
		return element;
	}
	
	public static WebElement slc_creditYear() {
		try {
			element = driver.findElement(By.name("cc_exp_dt_yr"));
		} catch (Exception e) {
			e.getStackTrace();
		}
		return element;
	}
	
	public static WebElement btn_buyFlights() {
		try {
			element = driver.findElement(By.name("buyFlights"));
		} catch (Exception e) {
			e.getStackTrace();
		}
		return element;
	}
}
