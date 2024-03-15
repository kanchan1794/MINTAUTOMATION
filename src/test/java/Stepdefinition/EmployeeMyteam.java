package Stepdefinition;

import Pageobjectclasses.Browser;
import Pageobjectclasses.EmployeeMyteampage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmployeeMyteam extends Browser {

    EmployeeMyteampage Myteamobject =new EmployeeMyteampage(driverThread.get());

    @When("employee click on myteam menu")
    public void employeeClickOnMyteamMenu()throws Exception{
        Myteamobject.Employee_click_Myteammenu();
        System.out.println("employee click on myteam menu");

    }

    @Then("employee can see myteam menu details")
    public void employeeCanSeeMyteamMenuDetails() {
        Myteamobject.employee_can_see_myteammenu_details();
        System.out.println("employee can see myteam menu details");
    }
}
