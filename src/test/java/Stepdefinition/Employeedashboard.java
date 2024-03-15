package Stepdefinition;

import Pageobjectclasses.Browser;
import Pageobjectclasses.Employeedashboardpage;
import Pageobjectclasses.Employeedashboardpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Employeedashboard extends Browser {

    Employeedashboardpage Employeeobject = new Employeedashboardpage(driverThread.get());
    @Given("browser is open and user is logged in")
    public void browserIsOpenAndUserIsLoggedIn() throws Exception {
   Employeeobject.Employeedashboard();
   System.out.println("Employee Logged in");

    }

    @Then("employee can see the dashboard page")
    public void employeeCanSeeTheDashboardPage() throws Exception{
        Employeeobject.Employee_can_see_dashboardpage();
        System.out.println("Employee can see the dashboard page");
    }
}
