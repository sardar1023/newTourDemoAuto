package action;

import helper.Log;
import pageobjects.FlightFindPage;
import pageobjects.LoginPage;
import pageobjects.ReserveFlightPage;

public class ReserveFlightPageAction {

	public static void Execute() throws Exception{
		LoginPage.Wait();
		LoginPage.captureScreenShot();
		FlightFindPage.btnClick(ReserveFlightPage.btn_reserveFlights());
		Log.info("ReserveFlight button clicked");
		
	}
}


