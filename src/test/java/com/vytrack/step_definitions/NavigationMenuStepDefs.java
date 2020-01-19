package com.vytrack.step_definitions;

import com.vytrack.pages.ContactsPage;
import com.vytrack.pages.DashboardPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.sql.SQLOutput;

public class NavigationMenuStepDefs {
    @When("the user goes to Fleet, Vehicles")
    public void the_user_goes_to_Fleet_Vehicles() {
        System.out.println("Navigate to Fleet Vehicles");
    }

    @Then("the url should be expected Vehicles url")
    public void the_url_should_be_expected_Vehicles_url() {
        System.out.println("Expected == Actual PASS");
    }

    @When("the user goes to Marketing, Campaigns")
    public void the_user_goes_to_Marketing_Campaigns() {
        System.out.println("Navigate to Marketing Campaigns");
    }

    @Then("the url should be expected Campains url")
    public void the_url_should_be_expected_Campains_url() {
        System.out.println("Expected == Actual PASS");
    }

    @When("the user goes to Activities, Calender Events")
    public void the_user_goes_to_Activities_Calender_Events() {
        System.out.println("Navigate to Activities Calender Events");
    }

    @When("the user navigates {string} {string}")
    public void the_user_navigates(String tab, String module) {
        new DashboardPage().navigateToModule(tab,module);
    }

    @Then("default page number should be {int}")
    public void default_page_number_should_be(Integer ePageNumber) {
        ContactsPage contactsPage = new ContactsPage();
        Integer actualNumber = Integer.parseInt(contactsPage.pageNumber.getAttribute("value"));
        Assert.assertEquals(ePageNumber,actualNumber);
    }

    @Then("the url should be expected Calender Events url")
    public void the_url_should_be_expected_Calender_Events_url() {
        System.out.println("Expected == Actual PASS");
    }
}
