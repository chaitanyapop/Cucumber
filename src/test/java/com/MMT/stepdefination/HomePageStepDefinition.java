package com.MMT.stepdefination;






import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.MMT.pageobject.*;


public class HomePageStepDefinition {

    @Given("^navigate to the makemytrip website$")
    public void navigate_to_the_makemytrip_website() throws Throwable {
    	HomePage.navigatetopage();
    }

    /*@When("^user enters all details $")
    public void user_enters_all_details() throws Throwable {
    	System.out.println("hello");
    }*/

    @Then("^click on submit$")
    public void click_on_submit() throws Throwable {
    	HomePage.clickonsubmit();
    }

    @And("^select source location$")
    public void select_source_location() throws Throwable {
        HomePage.source();
    }

    @And("^select destination location$")
    public void select_destination_location() throws Throwable {
    	HomePage.destination();
    }

    @And("^select date and month$")
    public void select_date_and_month() throws Throwable {
       HomePage.month();
    }

    @When("^select number of travellers$")
    public void select_number_of_travellers() throws Throwable {
    	HomePage.selecttraveller();
    }

}
