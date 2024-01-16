package Pageobjectclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Minthrdashboardpage extends Browser {
    private WebDriver driver = null;

    public Minthrdashboardpage(WebDriver driver) {

        this.driver = driver;
    }


    public void MintHrdashboard() throws Exception {

        //BrowserConfig.SetDriver();
        driver.get("https://staging.dx0oqxblmo7a7.amplifyapp.com/dashboard");

        //driver.navigate().to("https://staging.dh8h2bodd8qh6.amplifyapp.com/login");
        Thread.sleep(2000);
        //VALIDATE PAGE URL

        driver.findElement(By.id("login_username_input")).sendKeys("superadmin@myorganization");
        driver.findElement(By.id("loging_password_input")).sendKeys("Admin@123");
        Thread.sleep(3000);
        driver.findElement(By.id("login_submit_button")).click();

    }
}

