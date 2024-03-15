package Stepdefinition;

import Pageobjectclasses.Browser;
import Pageobjectclasses.Documentsmenupage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmployeeDocumentsmenu extends Browser {

    Documentsmenupage documentobject =new Documentsmenupage(driverThread.get());

    @When("employee click on Document menu")
    public void employeeClickOnDocumentMenu() {
        documentobject.employee_click_on_documentmenu();
        System.out.println("employee click on Document menu");

    }

    @Then("employee can see the submenu")
    public void employeeCanSeeTheSubmenu() {
        documentobject.employee_cansee_submenu();
        System.out.println("employee can see the submenu");
    }

    @When("employee click on my payslip submenu")
    public void employeeClickOnMyPayslipSubmenu() {
        documentobject.employee_clickon_Mypayslip_Submenu();
        System.out.println("employee click on my payslip submenu");
        
    }

    @Then("employee can see list of payslip & other document")
    public void employeeCanSeeListOfPayslipOtherDocument() {
        documentobject.employee_cansee_listof_payslip();
        System.out.println("employee can see list of payslip & other document");
    }

    @When("employee enter the  search keywords")
    public void employeeEnterTheSearchKeywords() throws Exception{
        documentobject.employee_enter_searchkeyword();
        System.out.println("employee enter the  search keywords");
    }

    @Then("relevant search is generated")
    public void relevantSearchIsGenerated() {
        documentobject.relevant_search_is_generated();
        System.out.println("relevant search is generated");
    }

    @When("employee click on PDf icon to open payslip")
    public void employeeClickOnPDfIconToOpenPayslip() {
        documentobject.employee_clickon_Pdficon_to_openpayslip();
        System.out.println("employee click on PDf icon to open payslip");
        
    }


    @Then("employee can see preview dialouge box")
    public void employeeCanSeePreviewDialougeBox() throws Exception{
        documentobject.employee_can_see_preview_dialouge_box();
        System.out.println("employee can see preview dialouge box");
    }

    @When("employee click on my document")
    public void employeeClickOnMyDocument() {
        documentobject.employee_click_on_my_document();
        System.out.println("employee click on my document");
        
    }

    @Then("employee can see the list of document")
    public void employeeCanSeeTheListOfDocument() {
        documentobject.employee_can_see_the_list_of_document();
        System.out.println("employee can see the list of document");
    }

    @When("employee enter search keywords")
    public void employeeEnterSearchKeywords() throws Exception {
        documentobject.employee_enter_search_keywords();
        System.out.println("employee enter search keywords");



    }

    @Then("relevant search generated")
    public void relevantSearchGenerated() throws Exception{
        documentobject.relevant_search_generated();
        System.out.println("relevant search generated");
    }

    @When("employee click on organization document")
    public void employeeClickOnOrganizationDocument() throws Exception{
        documentobject.employee_click_on_organization_document();
        System.out.println("employee click on organization document");

    }

    @Then("employee can see list of view & update policy")
    public void employeeCanSeeListOfViewUpdatePolicy() {
        documentobject.employee_can_see_list_of_view_and_update_policy();
        System.out.println("employee click on organization document");
    }

    @When("employee enter keyword in search text box")
    public void employeeEnterKeywordInSearchTextBox() throws Exception{
        documentobject.employee_enter_keyword_in_searchtextbox();
        System.out.println("employee enter keyword in search text box");
        
    }

    @Then("it generate relevant search")
    public void itGenerateRelevantSearch() {
        documentobject.generate_relevant_search();
        System.out.println("it generate relevant search");
    }
}

