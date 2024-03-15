package Stepdefinition;

import Pageobjectclasses.Browser;
import Pageobjectclasses.EmployeeAddressbookpage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmployeeAddressbook extends Browser {

    EmployeeAddressbookpage addressobject =new EmployeeAddressbookpage(driverThread.get());

    @When("employee click on Address book menu")
    public void employeeClickOnAddressBookMenu() throws Exception{
       addressobject.addressbook();
        System.out.println("Employee click on address menu");

    }

    @Then("employee can see the address book details")
    public void employeeCanSeeTheAddressBookDetails() throws Exception {
        addressobject.employee_can_see_addressbook_details();
        System.out.println("employee can see the address book details");
    }
}
