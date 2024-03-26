package Stepdefinition;

import Pageobjectclasses.Browser;
import Pageobjectclasses.Employeedashboardpage;
import Pageobjectclasses.MintHRAdmindashboardpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MintHRAdmindashboard extends Browser {

    MintHRAdmindashboardpage MintDashboard = new MintHRAdmindashboardpage(driverThread.get());
    @Given("Browser is open and Admin is logged in")
    public void browserIsOpenAndAdminIsLoggedIn() throws Exception {
   MintDashboard.AdminDashboardURL();
   System.out.println("Admin Is Logged In");

    }

    @When("Admin Click On Settings Icon")
    public void AdminClickOnSettingsIcon() throws Exception{
        MintDashboard.ClickSettingIcon();
        System.out.println("ADMIN CAN CLICK ON SETTINGS ICON");
    }

    @Then("Admin Can Navigates To Settings Page")
    public void adminCanNavigatesToSettingsPage() throws Exception {
        MintDashboard.ValidateSettingspage();
        System.out.println("ADMIN CAN NAVIAGTES TO SETTINGS PAGE");

    }

    @When("Admin Click On NotiFication Icon")
    public void adminClickOnNotiFicationIcon() {
        MintDashboard.ClickNotificationIcon();
        System.out.println("ADMIN CLICK ON NOTIFICATION ICON");
    }

    @Then("Admin Can Navigates To Notification Page")
    public void adminCanNavigatesToNotificationPage() throws Exception {
        MintDashboard.ValidateNotificationpage();
        System.out.println("ADMIN CAN NAVIGATES TO NOTIFICATION PAGE");
        
    }

    @When("Admin Click On User Profile Icon")
    public void adminClickOnUserProfileIcon() {
        MintDashboard.ClickUserProfileIcon();
        System.out.println("ADMIN CLICK ON USER PROFILE ICON");
    }

    @Then("Admin Can View Different Options To Manage The Profile")
    public void adminCanViewDifferentOptionsToManageTheProfile() throws Exception {
        MintDashboard.ValidateUserProfileBox();
        System.out.println("ADMIN CAN VIEW DIFFERENT OPTIONS TO MANAGE THE PROFILE");


    }
}
