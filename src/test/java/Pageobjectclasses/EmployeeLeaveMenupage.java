package Pageobjectclasses;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class EmployeeLeaveMenupage extends Browser {


    private WebDriver driver = null;

    public EmployeeLeaveMenupage(WebDriver driver) {

        this.driver = driver;
    }

    public void employee_click_on_Leave_menu() {
        driver.findElement(By.xpath("//a[normalize-space()='Leaves']")).click();


    }

    public void employee_can_see_submenu() {
        Assert.assertTrue(driver.findElement(By.xpath("//ul[contains(text(),'New org')]")).isDisplayed());
        System.out.println("" + driver.findElement(By.xpath("//ul[contains(text(),'New org')]")).isDisplayed());
        System.out.println("employee can see submenu");


    }


    public void employee_clickon_applyfor_leave_submenu() {
        driver.findElement(By.xpath("//a[contains(text(),'Apply for leave')]")).click();

    }

    public void employee_cansee_the_listof_leave_type() throws Exception {
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.xpath("//h3[contains(text(),'List of Leave types')]")).isDisplayed());
        System.out.println("" + driver.findElement(By.xpath("//h3[contains(text(),'List of Leave types')]")).isDisplayed());
        System.out.println("Employee is on List of Leave type page");


    }

    public void employee_enter_keyword_search_textbox() {
        driver.findElement(By.xpath("//input[@id='filter-input-focus']")).sendKeys("sick");

        Actions actions = new Actions(driver);

        actions.click(driver.findElement(By.xpath("//input[@Id='filter-input-focus']")))
                .keyDown(Keys.CONTROL)
                .sendKeys("a")
                .keyUp(Keys.CONTROL)
                .sendKeys(Keys.BACK_SPACE)
                .build()
                .perform();

    }
    public void relevant_search_result_is_generated() {

        Assert.assertTrue(driver.findElement(By.xpath("//span[contains(text(),'Search:')]")).isDisplayed());
        System.out.println("" + driver.findElement(By.xpath("//span[contains(text(),'Search:')]")).isDisplayed());
        System.out.println("Employee is on search page");

    }


//    public void employee_click_on_applybutton() {
//        driver.findElement(By.xpath("//tbody/tr[1]/td[4]/a[1]/button[1]")).click();

    }
