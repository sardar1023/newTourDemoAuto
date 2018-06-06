package pageobjects;

import org.openqa.selenium.WebDriver;

public abstract class BasePage {

	static WebDriver driver;
	
	public BasePage(WebDriver driver){
		BasePage.driver = driver;
	}
}
