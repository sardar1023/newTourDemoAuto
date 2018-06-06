package action;

import helper.Log;
import pageobjects.FlightFindPage;
import pageobjects.LoginPage;

public class FlightFindPageAction {

	public static void Execute() throws Exception {
		
		LoginPage.Wait();
		FlightFindPage.SelectItem(FlightFindPage.slc_Pass(), 1);
		Log.info("Passenger count Selected");
		FlightFindPage.SelectItem(FlightFindPage.slc_fromPort(), 6);
		Log.info("Departure port selected");
		FlightFindPage.SelectItem(FlightFindPage.slc_toPort(), 3);
		Log.info("Destination port selected");
		FlightFindPage.SelectItem(FlightFindPage.slc_airLines(), 1);
		Log.info("Airline Company Selected");
		LoginPage.captureScreenShot();
		FlightFindPage.btnClick(FlightFindPage.btn_findFlights());
		Log.info("Continue Button clicked");
	}
}
