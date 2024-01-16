package Stepdefinition;

import Pageobjectclasses.Browser;
import Pageobjectclasses.Minthrdashboardpage;
import io.cucumber.java.en.Given;

public class MinthrDashboard extends Browser {
    Minthrdashboardpage MintHrobject=new Minthrdashboardpage(driverThread.get());
    @Given("Browser is open and user is logged in")
    public void browserIsOpenAndUserIsLoggedIn() throws Exception{
        MintHrobject.MintHrdashboard();
        System.out.println("Superadmin_browser_open");
    }
}
