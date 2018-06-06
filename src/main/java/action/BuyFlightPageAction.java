package action;

import helper.Log;
import pageobjects.BuyFlightPage;
import pageobjects.FlightFindPage;
import pageobjects.LoginPage;
import pageobjects.ReserveFlightPage;

public class BuyFlightPageAction {

	public static void Execute() throws Exception {
		LoginPage.Wait();
		BuyFlightPage.txt_passFirst0().sendKeys("mike");
		Log.info("First Passenger first name inserted");
		BuyFlightPage.txt_passLast0().sendKeys("johns");
		Log.error("First Passenger last name inserted");
		BuyFlightPage.txt_passFirst1().sendKeys("hasan");
		Log.warn("Second Passenger first name inserted");
		BuyFlightPage.txt_passLast1().sendKeys("rehman");
		Log.fatal("Second Passenger last name inserted");
		FlightFindPage.SelectItem(BuyFlightPage.slc_creditCard(), 1);
		Log.info("Credit Card Type is selected");
		BuyFlightPage.txt_creditnumber().sendKeys("1234567896541");
		Log.info("Credit Card number is inserted");
		FlightFindPage.SelectItem(BuyFlightPage.slc_creditMnth(), 10);
		Log.info("Credit Card Expiration month is selected");
		FlightFindPage.SelectItem(BuyFlightPage.slc_creditYear(), 7);
		Log.info("Credit Card Expiration year is selected");
		LoginPage.captureScreenShot();
		BuyFlightPage.btn_buyFlights().click();
		Log.info("Buy flight button clicked");
		ReserveFlightPage.tearDown();
	}
}
