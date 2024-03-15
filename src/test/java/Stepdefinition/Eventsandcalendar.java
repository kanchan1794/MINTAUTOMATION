package Stepdefinition;

import Pageobjectclasses.Browser;
import Pageobjectclasses.Eventsandcalendarmenupage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Eventsandcalendar extends Browser {

    Eventsandcalendarmenupage holidayobject = new Eventsandcalendarmenupage(driverThread.get());

    @When("employee click on Event & Calendar menu")
    public void employeeClickOnEventCalendarMenu() {
        holidayobject.Eventsandcalendarmenu();
        System.out.println("User click on Eventsandcalendarmenu");
    }

    @Then("employee can see the details of holiday & events")
    public void employeeCanSeeTheDetailsOfHolidayEvents() throws Exception{
        holidayobject.employee_can_see_the_details_of_holiday_and_events();
        System.out.println("employee can see the details of holiday & events");
    }

    @When("employee click on navigation arrow to change next month")
    public void employeeClickOnNavigationArrowToChangeNextMonth() throws Exception{
        holidayobject.Employee_click_on_navigationwrrow_tochange_month();
        System.out.println("employee click on navigation arrow to change next month");
    }

    @Then("employee can click on another navigation arrow to change next year")
    public void employeeCanClickOnAnotherNavigationArrowToChangeNextYear() {
        holidayobject.Employee_click_on_navigationarrow_tochange_year();
        System.out.println("employee can click on another navigation arrow to change next year");
    }
}
