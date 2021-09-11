package com.MMT.stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import com.MMT.pageobject.*;

public class ListOfFlightStepDefinition {
	 @Given("^navigate to list of flight page$")
	    public void navigate_to_list_of_flight_page() throws Throwable {
		 	ListOfFlight.navpage();
	    }

	    @Then("^display all the flights$")
	    public void display_all_the_flights() throws Throwable {
	    	ListOfFlight.listofflights();
	    }

}
