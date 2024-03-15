package Stepdefinition;

import Pageobjectclasses.Browser;
import Pageobjectclasses.EmployeeLeaveMenupage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class EmployeeLeavemenu extends Browser {

    EmployeeLeaveMenupage Leaveobject = new EmployeeLeaveMenupage(driverThread.get());

    @When("employee click on Leave menu")
    public void employeeClickOnLeaveMenu() {
        Leaveobject.employee_click_on_Leave_menu();
        System.out.println("employee click on Leave menu");

    }

    @Then("employee can see submenu")
    public void employeeCanSeeSubmenu() {
        Leaveobject.employee_can_see_submenu();
        System.out.println("employee can see submenu");
    }

    @When("employee click on apply for leave sub menu")
    public void employeeClickOnApplyForLeaveSubMenu() {
        Leaveobject.employee_clickon_applyfor_leave_submenu();
        System.out.println("employee click on apply for leave sub menu");

    }

    @Then("employee can see the list of leave type")
    public void employeeCanSeeTheListOfLeaveType() throws Exception{
        Leaveobject.employee_cansee_the_listof_leave_type();
        System.out.println("employee can see the list of leave type");
    }

    @When("employee enter the keyword in search textbox")
    public void employeeEnterTheKeywordInSearchTextbox() {
        Leaveobject.employee_enter_keyword_search_textbox();
        System.out.println("employee enter the keyword in search textbox");

    }

    @Then("relevant search result is generated")
    public void relevantSearchResultIsGenerated() {
        Leaveobject.relevant_search_result_is_generated();
        System.out.println("relevant search result is generated");

    }

    //@When("employee click on apply button")
    public void employeeClickOnApplyButton() {
        //Leaveobject.employee_click_on_applybutton();
        System.out.println("employee click on apply button");

    }

    @Then("employee can see apply for leave page")
    public void employeeCanSeeApplyForLeavePage() {
    }
}
