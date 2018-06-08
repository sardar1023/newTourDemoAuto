package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helper.Credentials;
import helper.Log;
import pageobjects.BuyFlightPage;
import pageobjects.FlightFindPage;
import pageobjects.LoginPage;
import pageobjects.ReserveFlightPage;

public class NewTourSteps {

	@Given("^user open the page$")
	public void user_open_the_page() throws Throwable {

		LoginPage.startAPP();
		Log.info("Application Started");
		LoginPage.Wait();
	}

	@When("^user insert username$")
	public void user_insert_username() throws Throwable {
		LoginPage.txt_userName().sendKeys(Credentials.username);
		Log.info("userName inserted");
	}

	@Then("^user insert password$")
	public void user_insert_password() throws Throwable {
		LoginPage.txt_password().sendKeys(Credentials.password);
		Log.info("password inserted");
	}

	@Then("^user click login button$")
	public void user_click_login_button() throws Throwable {
		LoginPage.btn_login().click();
		Log.info("Login button clicked");
	}

	@Then("^user select the passenger count$")
	public void user_select_the_passenger_count() throws Throwable {
		FlightFindPage.SelectItem(FlightFindPage.slc_Pass(), 1);
		Log.info("Passenger count Selected");
	}

	@Then("^user select departure$")
	public void user_select_departure() throws Throwable {
		FlightFindPage.SelectItem(FlightFindPage.slc_fromPort(), 6);
		Log.info("Departure port selected");
	}

	@Then("^user select the destination$")
	public void user_select_the_destination() throws Throwable {
		FlightFindPage.SelectItem(FlightFindPage.slc_toPort(), 3);
		Log.info("Destination port selected");
	}

	@Then("^user select the airline$")
	public void user_select_the_airline() throws Throwable {
		FlightFindPage.SelectItem(FlightFindPage.slc_airLines(), 1);
		Log.info("Airline Company Selected");
	}

	@Then("^user click find flight button$")
	public void user_click_find_flight_button() throws Throwable {
		FlightFindPage.btnClick(FlightFindPage.btn_findFlights());
		Log.info("Continue Button clicked");
	}

	@Then("^user click reserve flight button$")
	public void user_click_reserve_flight_button() throws Throwable {
		FlightFindPage.btnClick(ReserveFlightPage.btn_reserveFlights());
		Log.info("ReserveFlight button clicked");
	}

	@Then("^user insert first passenger first name$")
	public void user_insert_first_passenger_first_name() throws Throwable {
		BuyFlightPage.txt_passFirst0().sendKeys("mike");
		Log.info("First Passenger first name inserted");
	}

	@Then("^user insert first passenger last name$")
	public void user_insert_first_passenger_last_name() throws Throwable {
		BuyFlightPage.txt_passLast0().sendKeys("johns");
		Log.info("First Passenger last name inserted");
	}

	@Then("^user insert second passenger first name$")
	public void user_insert_second_passenger_first_name() throws Throwable {
		BuyFlightPage.txt_passFirst1().sendKeys("hasan");
		Log.info("Second Passenger first name inserted");
	}

	@Then("^user insert second passenger last name$")
	public void user_insert_second_passenger_last_name() throws Throwable {
		BuyFlightPage.txt_passLast1().sendKeys("rehman");
		Log.info("Second Passenger last name inserted");
	}

	@Then("^user select the credit card type$")
	public void user_select_the_credit_card_type() throws Throwable {
		FlightFindPage.SelectItem(BuyFlightPage.slc_creditCard(), 1);
		Log.info("Credit Card Type is selected");
	}

	@Then("^user insert the credit card number$")
	public void user_insert_the_credit_card_number() throws Throwable {
		BuyFlightPage.txt_creditnumber().sendKeys("1234567896541");
		Log.info("Credit Card number is inserted");
	}

	@Then("^user select the credeit card expiration month$")
	public void user_select_the_credeit_card_expiration_month() throws Throwable {
		FlightFindPage.SelectItem(BuyFlightPage.slc_creditMnth(), 10);
		Log.info("Credit Card Expiration month is selected");
	}

	@Then("^user select the credeit card expiration year$")
	public void user_select_the_credeit_card_expiration_year() throws Throwable {
		FlightFindPage.SelectItem(BuyFlightPage.slc_creditYear(), 7);
		Log.info("Credit Card Expiration year is selected");
	}

	@Then("^user click buy flight button$")
	public void user_click_buy_flight_button() throws Throwable {
		BuyFlightPage.btn_buyFlights().click();
		Log.info("Buy flight button clicked");
	}

	@Then("^user close the browser$")
	public void user_close_the_browser() throws Throwable {
		ReserveFlightPage.tearDown();
	}

}
