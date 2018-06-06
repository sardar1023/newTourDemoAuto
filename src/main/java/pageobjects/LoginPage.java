package pageobjects;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import helper.Credentials;

public class LoginPage extends BasePage {

	static WebElement element = null;

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public static WebElement txt_userName() {
		try {
			element = driver.findElement(By.name("userName"));
		} catch (Exception e) {
			e.getStackTrace();
		}
		return element;
	}

	public static WebElement txt_password() {
		try {
			element = driver.findElement(By.name("password"));
		} catch (Exception e) {
			e.getStackTrace();
		}
		return element;
	}

	public static WebElement btn_login() {
		try {
			element = driver.findElement(By.name("login"));
		} catch (Exception e) {
			e.getStackTrace();
		}
		return element;
	}

	public static void startAPP() {
		String driverPath = Credentials.chromeDriverPath;
		String url = Credentials.url;
		System.setProperty("wedriver.chrome.driver", driverPath);
		//driver = new FirefoxDriver();
		driver = new ChromeDriver();
		driver.get(url);
	}

	public static void Wait() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public static void captureScreenShot() {
		// Take screenshot and store as a file format
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			// now copy the screenshot to desired location using copyFile method

			FileUtils.copyFile(src, new File(System.getProperty("user.dir") + "/Screesnshot/" + System.currentTimeMillis() + ".png"));
		} catch (IOException e)

		{
			System.out.println(e.getMessage());
		}
	}
}
