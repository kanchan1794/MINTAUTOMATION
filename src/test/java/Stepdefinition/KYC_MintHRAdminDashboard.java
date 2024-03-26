package Stepdefinition;

import Pageobjectclasses.Browser;
import Pageobjectclasses.KYC_MintHRAdmindashboardpage;
import Pageobjectclasses.MintHRAdmindashboardpage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class KYC_MintHRAdminDashboard extends Browser {

    KYC_MintHRAdmindashboardpage ObjMintAdminKYC = new KYC_MintHRAdmindashboardpage(driverThread.get());

    @When("Admin clicks on KYC menu")
    public void browserIsOpenAndAdminIsLoggedIn() throws Exception {
        //ObjMintAdminKYC.ClickKYCMenu();
        System.out.println("Admin Is Logged In");



    }

    @Then("Admin Can See KYC Details")
    public void adminCanSeeKYCDetails() {
        
    }

    @And("Admin Can Scroll Inside KYC Table Vertically")
    public void adminCanScrollInsideKYCTableVertically() {
        
    }

    @And("Admin Can Scroll Inside KYC Table Horizantally")
    public void adminCanScrollInsideKYCTableHorizantally() {
    }


}