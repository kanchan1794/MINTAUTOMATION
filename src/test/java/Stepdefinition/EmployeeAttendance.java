package Stepdefinition;

import Pageobjectclasses.Browser;
import Pageobjectclasses.EmployeeAttendancepage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmployeeAttendance extends Browser {

    EmployeeAttendancepage Attendanceobject = new EmployeeAttendancepage(driverThread.get());
    @When("employee click on Attendance menu")
    public void employeeClickOnAttendanceMenu() {
        Attendanceobject.Attendancemenu();
        System.out.println("employee click on Attendance menu");

    }

    @Then("employee can see my attendance & team attendance menu")
    public void employeeCanSeeMyAttendanceTeamAttendanceMenu() {
        Attendanceobject.Employee_see_Myattendance_and_Teamattendance();
        System.out.println("employee can see my attendance & team attendance menu");

    }

    @When("employee click on myattendance submenu")
    public void employeeClickOnMyattendanceSubmenu() {
       Attendanceobject.Myattendance_menu();
        System.out.println("employee click on myattendance submenu");
        
    }

    @Then("employee can see detail of Myattendance submenu")
    public void employeeCanSeeDetailOfMyattendanceSubmenu() {
        Attendanceobject.employee_can_see_details_of_myattendance();
        System.out.println("employee can see detail of Myattendance submenu");
    }

    @When("employee click on calendar")
    public void employeeClickOnCalendar() throws Exception{
        Attendanceobject.employee_canclickon_calendarbox();
        System.out.println("employee click on calendar");

    }

    @When("employee click on edit button")
    public void employeeClickOnEditButton() throws Exception{
        Attendanceobject.employee_click_on_edit_button();
        System.out.println("employee click on edit button");
        
    }

    @Then("emplooyee can see edit employee attendance page")
    public void emplooyeeCanSeeEditEmployeeAttendancePage() {
        Attendanceobject.emplpyee_can_see_edit_employee_attendance_page();
        System.out.println("emplooyee can see edit employee attendance page");
        
    }

    @And("can click on another edit button from where he  can add check out time")
    public void canClickOnAnotherEditButtonFromWhereHeCanCanAddCheckOutTime() throws Exception {
        Attendanceobject.employee_click_on_another_edit_button();
        System.out.println(" can click on another edit button from where he can can add check out time");

    }


    @When("employee click on delete button")
    public void employeeClickOnDeleteButton() throws Exception{
        Attendanceobject.employee_click_on_delete_button();
        System.out.println(" employee click on delete button");

    }


    @Then("Dialouge appear to delete the attendance")
    public void dialougeAppearToDeleteTheAttendance() throws Exception{
        Attendanceobject.Dialouge_appear_to_delete_the_attendance();
        System.out.println("Dialouge appear to delete the attendance");
    }


    //@When("Employee click on Add Attendance Button")
    public void employeeClickOnAddAttendanceButton() throws Exception{
        //Attendanceobject.Add_Attendance();
        System.out.println("Employee click on Add Attendance Button");
        
    }



}


//    @Then("employee able to click on year & month")
//    public void employeeAbleToClickOnYearMonth() {
//
//    }
//
//    @When("employee enter the search keyword")
//    public void employeeEnterTheSearchKeyword() {
//
//    }
//
//    @Then("relevant search is generated")
//    public void relevantSearchIsGenerated() {

