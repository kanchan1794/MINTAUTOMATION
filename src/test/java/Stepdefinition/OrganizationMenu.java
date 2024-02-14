package Stepdefinition;

import Pageobjectclasses.Browser;
import Pageobjectclasses.OragnizationMenuPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrganizationMenu extends Browser {
    OragnizationMenuPage OrganizationObject = new OragnizationMenuPage(driverThread.get());

    @When("Superadmin click on organization menu")
    public void Superadminclickonorganizationmenu() throws Exception {
        OrganizationObject.OrganizationMenu();
        System.out.println("User click on Organization menu");

    }


    @Then("Superadmin is able to see Add Organization and View Organization submenu")
    public void SuperadminisabletoseeAddOrganizationandViewOrganizationsubmenu() throws Exception {
        //OrganizationObject.AddOrganizationandViewOrganizationsubmenu();
        System.out.println("Superadmin is able to see View and Add Organization submenu");
    }


//    @When("super admin click on Add organization menu")
//    public void superAdminClickOnAddOrganizationMenu() throws Exception{
//        OrganizationObject.Add_organization_menu();
//        System.out.println("super admin click on Add organization menu");
//    }
//
//    @Then("super admin see the details of Add organization")
//    public void superAdminSeeTheDetailsOfAddOrganization() throws Exception {
//        OrganizationObject.super_admin_see_the_detail_of_Add_organization();
//        System.out.println("super admin see the details of Add organization");
//
//    }


    @When("user click on ViewOrganization submenu then information is display")
    public void userclickonViewOrganizationsubmenutheninformationisdisplay() throws Exception {
        OrganizationObject.ViewOrganization();
        System.out.println("User click on Organization menu");

    }

    @Then("User can see organization details")
    public void userCanSeeOrganizationDetails() {
        OrganizationObject.view_organization_details();
        System.out.println("User can see  organization details");
    }


    @When("superAdmin Enters Search Keywords")
    public void superadminEntersSearchKeywords() throws Exception {
        OrganizationObject.searchoption();
        System.out.println("superAdmin Enters Search Keywords");

    }

    @Then("Relevant Search Results Generated")
    public void relevantSearchResultsGenerated() {
        OrganizationObject.Relevant_Search_Results_Generated();
        System.out.println("Relevant Search Results Generated");

    }

    @When("superadmin click on view icon")
    public void superadminClcikOnViewIcon() throws Exception {
        OrganizationObject.viewiconoption();
        System.out.println("superadmin click on view icon");
    }


    @Then("superadmin can see organization details")
    public void superadminCanSeeOrganizationDetails() throws Exception {
        OrganizationObject.superadmin_can_see_organization_details();
        System.out.println("superadmin can see organization details");

    }

    @When("superadmin click on create admin button")
    public void superadminClickOnCreateAdminButton() throws Exception {
        OrganizationObject.createadminuserbutton();
        System.out.println("superadmin click on create admin button");


    }

    //
//    @And("super admin can add communication details")
//    public void superAdminCanAddCommunicationDetails() {
//        //OrganizationObject.FillCommunication_details();
//        System.out.println("super admin can add communication details");
//    }
//
    @Then("superadmin can navigate to add Employee details form")
    public void superadminCanNavigateToAddEmployeeDetailsForm() throws Exception {
        OrganizationObject.can_navigate_to_add_Employee_details_form();
        System.out.println("superadmin can navigate to add Employee details form");


    }

    @And("superadmin can add basic employee details")
    public void superadminCanAddBasicEmployeeDetails() throws Exception {
        OrganizationObject.add_basic_employee_details();
        System.out.println("superadmin can add basic employee details");
    }

    @When("superAdmin click on status dropdown")
    public void superadminClickOnStatusDropdown() {
        //  OrganizationObject.statusoption();
        System.out.println("superAdmin click on status dropdown");

    }

    @Then("dropdown list is visible and admin is able to click on dropdown option.")
    public void dropdownListIsVisibleAndAdminIsAbleToClickOnDropedownOption() throws Exception {
        OrganizationObject.Statusdropdownoption();
        System.out.println("dropdown list is visible and admin is able to click on dropdown option.");
    }

    //
//    @And("super admin add Identity Details")
//    public void superAdminAddIdentityDetails() throws Exception {
//     OrganizationObject.admin_add_Identity_Details();
//
//    System.out.println("super admin add Identity Details");
//    }
//
//    @And("super admin can add Bank details")
//    public void superAdminCanAddBankDetails() {
//        //OrganizationObject.Bank_Details();
//        System.out.println("super admin can add Bank details");
//    }


//    @And("Super admin can add Job Details")
//    public void superAdminCanAddJobDetails() {
//
//    }
//
//    @And("Super admin can add Emergency Contact details")
//    public void superAdminCanAddEmergencyContactDetails() {
//
//    }
//
//    @And("Super admin can add Assets details")
//    public void superAdminCanAddAssetsDetails() {
//
//    }
//
//    @And("super admin can Salary details")
//    public void superAdminCanSalaryDetails() {
//
//    }
//
//    @And("super admin can others details")
//    public void superAdminCanOthersDetails() {
//    }
//
//    @Then("Superadmin is able to see Add Organization and View Organization submenu")
//    public void superadminIsAbleToSeeAddOrganizationAndViewOrganizationSubmenu() throws Exception{
//     OrganizationObject.AddOrganizationandViewOrganizationsubmenu();
//        System.out.println("Superadmin is able to see Add Organization and View Organization submenu");
//    }

    @When("superadmin click on Organizationstatus Submenu then information is display")
    public void superadminClickOnOrganizationstatusSubmenuThenInformationIsDisplay() {
        OrganizationObject.Organization_status_details();
        System.out.println("superadmin click on Organizationstatus Submenu then information is display");
//    }
    }

    @Then("superadmin  can see organizationstatus details")
    public void superadminCanSeeOrganizationstatusDetails() throws Exception {
        OrganizationObject.can_see_organizationstatus_details();
        System.out.println("superadmin can see organizationstatus details");
    }

    @When("superadmin click on calendar")
    public void superadminClickOnCalendar() throws Exception {
        OrganizationObject.click_on_calendar();
        System.out.println("superadmin click on calendar");
    }

    @Then("superadmin able to click on year & month")
    public void superadminAbleToClickOnYearMonth() {

    }

    @When("superadmin enter the search keyword")
    public void superadminEnterTheSearchKeyword() throws Exception {
        OrganizationObject.enter_the_search_keyword();
        System.out.println("superadmin enter the search keyword");


    }

    @Then("Relevant search is generated")
    public void relevantSearchIsGenerated() throws Exception {
        //OrganizationObject.Relevant_search_is_generated();
        System.out.println("Relevant search is generated");
    }
}
//    @When("admin click on activities menu")
//    public void adminClickOnActivitiesMenu() throws Exception {
//        OrganizationObject.activities_menu();
//        System.out.println("admin click on activities menu");
//
//    }
//
//    @Then("Admin can see add & list activities submenu.")
//    public void adminCanSeeAddListActivitiesSubmenu() {
//        //OrganizationObject.Admin_see_add_and_list_activities_submenu();
//        System.out.println("Admin can see add & list activities submenu.");
//
//    }
//
//    @When("admin click on Add activities submenu")
//    public void adminClickOnAddActivitiesSubmenu() throws Exception{
//        OrganizationObject.Add_activities();
//        System.out.println("admin click on Add activities submenu");
//
//    }
//
//    @Then("relevant search is generated of submenu")
//    public void relevantSearchIsGeneratedOfSubmenu() {
//    }
//}

