/***
Created by Javier Advani
on May 29, 2018
***/
package es.wata.example;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ValetParkingSteps {

	@When("I park my car in the Valet Parking Lot for {int} minutes")
	public void i_park_my_car_in_the_Valet_Parking_Lot_for_minutes(Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("I will have to pay ${int}")
	public void i_will_have_to_pay_$(Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

}
