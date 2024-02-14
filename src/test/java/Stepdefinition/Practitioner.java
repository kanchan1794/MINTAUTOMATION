package Stepdefinition;

import Pageobjectclasses.Browser;
import Pageobjectclasses.Practitionermenupage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Practitioner extends Browser {

    Practitionermenupage Pobject= new Practitionermenupage(driverThread.get());

    @When("superadmin click on Practitionerpersons menu")
    public void superadminClickOnPractitionerpersonsMenu() throws Exception {
        Pobject.Practitioner_Persons();
        System.out.println("superadmin click on Practitionerpersons menu");
    }

    @Then("admin is able to see the relevant page.")
    public void adminIsAbleToSeeTheRelevantPage() throws Exception{
        Pobject.admin_see_relevant_page();
        System.out.println("admin is able to see the relevant page");
    }

    @When("Superadmin click on Add person")
    public void superadminClickOnAddPerson() {
        Pobject.superadmin_click_on_Add_person();
        System.out.println("Superadmin click on Add person");
    }


    @Then("Superadmin can add the details of practitioner persons")
    public void superadminCanAddTheDetailsOfPractitionerPersons() {
        Pobject.Superadmin_can_add_details();
        System.out.println("Superadmin can add the details of practitioner persons");
    }
}

