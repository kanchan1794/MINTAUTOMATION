package Stepdefinition;

import Pageobjectclasses.Browser;
import Pageobjectclasses.OragnizationMenuPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrganizationMenu extends Browser {
    OragnizationMenuPage OrganizationObject= new OragnizationMenuPage(driverThread.get());

    @When("Superadmin click on organization menu")
    public void Superadminclickonorganizationmenu() throws Exception{
        OrganizationObject.OrganizationMenu();
        System.out.println("User click on Organization menu");
        
    }

    @Then("Superadmin is able to see View and Add Organization submenu")
    public void SuperadminisabletoseeViewandAddOrganizationsubmenu() throws Exception{
        //OrganizationObject .Addorganization();
        System.out.println("Superadmin is able to see View and Add Organization submenu");
    }

    @When("SuperAdmin clicks on Vieworganization submenu")
    public void superadminClicksOnVieworganizationSubmenu() throws Exception {
     OrganizationObject.ViewOrganization();
        System.out.println("SuperAdmin clicks on Vieworganization submenu");
    }

    @Then("superAdmin  see The details of oragnization")
    public void superadminSeeTheDetailsOfOragnization() {
        System.out.println("superAdmin  see The details of oragnization");
    }

    @When("superAdmin Enters Search Keywords")
    public void superadminEntersSearchKeywords() {
     OrganizationObject.serachoption();
        System.out.println("superAdmin Enters Search Keywords");

    }

    @Then("Relevant Search Results Generated")
    public void relevantSearchResultsGenerated() {

    }

    @When("superadmin click on view icon")
    public void superadminClcikOnViewIcon() {
     OrganizationObject.viewiconoption();
        System.out.println("superadmin click on view icon");
    }


    @Then("superadmin can see organization details")
    public void superadminCanSeeOrganizationDetails() {

    }

    @When("superadmin click on create admin button")
    public void superadminClickOnCreateAdminButton() {
    OrganizationObject.createadminuserbutton();
        System.out.println("superadmin click on create admin button");

    }

    @Then("superadmin can add Employee details")
    public void superadminCanAddEmployeeDetails() {
    }

    @And("super admin can add communication details")
    public void superAdminCanAddCommunicationDetails() {
        OrganizationObject.FillCommunication_details();
        System.out.println("super admin can add communication details");
    }

    @Then("superadmin can navigate to add Employee details form")
    public void superadminCanNavigateToAddEmployeeDetailsForm() {

    }

    @And("superadmin can add basic employee details")
    public void superadminCanAddBasicEmployeeDetails() throws Exception{
        OrganizationObject.basicemployeedetails();
        System.out.println("superadmin can add basic employee details");
    }

    @When("superAdmin click on status dropdown")
    public void superadminClickOnStatusDropdown() {
    OrganizationObject.statusoption();
    System.out.println("superAdmin click on status dropdown");
        
    }

    @Then("dropdown list is visible and admin is able to click on dropdown option.")
    public void dropdownListIsVisibleAndAdminIsAbleToClickOnDropedownOption() {
      OrganizationObject.Statusdropdownoption();
        System.out.println("dropdown list is visible and admin is able to click on dropdown option.");
    }

    @And("super admin add Identity Details")
    public void superAdminAddIdentityDetails() {
    OrganizationObject.Identity();
    System.out.println("super admin add Identity Details");
    }


    @And("super admin can add Bank details")
    public void superAdminCanAddBankDetails() {
    OrganizationObject.Bank();
        System.out.println("super admin can add Bank details");

    }

    @And("Super admin can add Job Details")
    public void superAdminCanAddJobDetails() {

    }

    @And("Super admin can add Emergency Contact details")
    public void superAdminCanAddEmergencyContactDetails() {

    }

    @And("Super admin can add Assets details")
    public void superAdminCanAddAssetsDetails() {

    }

    @And("super admin can Salary details")
    public void superAdminCanSalaryDetails() {

    }

    @And("super admin can others details")
    public void superAdminCanOthersDetails() {
    }
}

