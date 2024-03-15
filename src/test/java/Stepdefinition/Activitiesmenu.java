package Stepdefinition;

import Pageobjectclasses.Actvitiesmenupage;
import Pageobjectclasses.Browser;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Activitiesmenu extends Browser {

   Actvitiesmenupage Activitiesobject =new Actvitiesmenupage(driverThread.get());

    @When("admin click on activitiesmenu")
    public void adminClickOnActivitiesmenu() throws Exception {
        Activitiesobject.admin_click_on_activitiesmenu();
        System.out.println("Admin can click on activities menu");
    }

    @Then("admin can see Add & List activites submenu")
    public void adminCanSeeAddListActivitesSubmenu() {
        Activitiesobject.Admin_see_Add_and_list_activities_submenu();
        System.out.println("Admin can see Add & List activites submenu");
    }

    @When("admin click on Add Activites submenu")
    public void adminClickOnAddActivitesSubmenu() throws Exception{
        Activitiesobject.Add_activities();
        System.out.println("admin click on Add Activites submenu");


    }

    @Then("admin can see the details of Add Activties")
    public void adminCanSeeTheDetailsOfAddActivties() {
        Activitiesobject.admin_can_see_Addactivities_details();
        System.out.println("admin can see the details of Add Activties");
    }
}
