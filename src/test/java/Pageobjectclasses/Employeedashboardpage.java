package Pageobjectclasses;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Employeedashboardpage extends Browser {

    private WebDriver driver = null;

    public Employeedashboardpage(WebDriver driver) {

        this.driver = driver;
    }


    public void Employeedashboard() throws Exception{
        //BrowserConfig.SetDriver();
        driver.get("https://staging.dx0oqxblmo7a7.amplifyapp.com/dashboard");

        Thread.sleep(2000);

        driver.findElement(By.id("login_username_input")).sendKeys("aparnathombare02@gmail.com");
        driver.findElement(By.id("loging_password_input")).sendKeys("AlkaAppu@2590");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("div.fade.show:nth-child(1) div.c-app.c-default-layout.flex-row.align-items-center.hide-text-selection div.container div.justify-content-center.row div.col-md-8 div.card-group div.p-4.card div.card-body form:nth-child(1) div.mb-4:nth-child(4) div.input-group div.input-group-prepend:nth-child(3) > div.input-group-text")).click();
        Thread.sleep(2000);

//        driver.findElement(By.xpath("//button[contains(text(),'Forgot password?')]")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("aparnathombare02@gmail.com");
//        driver.findElement(By.xpath("//button[contains(text(),'Get OTP')]")).click();

        driver.findElement(By.id("login_submit_button")).click();


    }

    public void Employee_can_see_dashboardpage ()throws Exception{

        Thread.sleep(2000);

        Assert.assertTrue(driver.findElement(By.xpath("//li[contains(text(),'Dashboard')]")).isDisplayed());
        System.out.println("" + driver.findElement(By.xpath("//li[contains(text(),'Dashboard')]")).isDisplayed() + "");
        System.out.println("Employee IS ON DASHBOARD PAGE");

       //driver.findElement(By.xpath("//a[@href=\"/addressBook\"]")).click();

//        Assert.assertTrue(driver.findElement(By.xpath("//li[contains(text(),'Address Book')]")).isDisplayed());
//        System.out.println("" + driver.findElement(By.xpath("//li[contains(text(),'Address Book')]")).isDisplayed() + "");
//        System.out.println("Employee IS ON Address Book PAGE");
//
//        Thread.sleep(2000);
//
//     driver.findElement(By.xpath("//input[@type='Text']")).sendKeys("Afzal kazi");
//
//        Actions actions = new Actions(driver);
//
//        actions.click(driver.findElement(By.xpath("//input[@type='Text']")))
//                .keyDown(Keys.CONTROL)
//                .sendKeys("a")
//                .keyUp(Keys.CONTROL)
//                .sendKeys(Keys.BACK_SPACE)
//                .build()
//                .perform();
//
//        Thread.sleep(2500);
//       driver.findElement(By.xpath("//a[@class='nav-link']")).click();


    }

    }
