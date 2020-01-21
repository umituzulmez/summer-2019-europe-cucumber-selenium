package com.vytrack.step_definitions;

import com.vytrack.pages.DashboardPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class ContactsStepDefs {

    @Then("the user should see following menu options")
    public void the_user_should_see_following_menu_options(List<String> menuOptions) {
        System.out.println("menuOptions.size = " + menuOptions.size());
        System.out.println("menuOptions = " + menuOptions);

        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.waitUntilLoaderScreenDisappear();

        List<String> actualMenuOptions = BrowserUtils.getElementsText(dashboardPage.menuOptions);

        Assert.assertEquals(menuOptions,actualMenuOptions);
    }

    @When("the user logs in using following credential")
    public void the_user_logs_in_using_following_credential(Map<String,String> userData) {
        new LoginPage().login(userData.get("username"),userData.get("password"));

        //verify fullname on the top right corner from website with firstname,lastname from map

        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.waitUntilLoaderScreenDisappear();
        String actualFullname = dashboardPage.getUserName();
        String expectedFullname= userData.get("firstname")+" "+userData.get("lastname");
        Assert.assertEquals(expectedFullname,actualFullname);

    }
}
