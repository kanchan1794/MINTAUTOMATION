package Pageobjectclasses;

import com.sun.source.tree.CatchTree;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EmployeeAttendancepage extends Browser {

    private WebDriver driver = null;

    public EmployeeAttendancepage(WebDriver driver) {

        this.driver = driver;
    }

    public void Attendancemenu() {

        driver.findElement(By.xpath("//*[text()='Attendance']")).click();

    }

    public void Employee_see_Myattendance_and_Teamattendance() {
        Assert.assertTrue(driver.findElement(By.xpath("//ul[contains(text(),'New org')]")).isDisplayed());
        System.out.println("" + driver.findElement(By.xpath("//ul[contains(text(),'New org')] ")).isDisplayed() + "");
        System.out.println("EMPLOYEE IS ABlE To SEE MY ATTENDANCE & TEAM ATTENDANCE ");

    }

    public void Myattendance_menu() {
        driver.findElement(By.xpath("//a[contains(text(),'My Attendance')]")).click();

    }

    public void employee_can_see_details_of_myattendance() {
        Assert.assertTrue(driver.findElement(By.xpath("//a[contains(text(),'Employee Attendance')]")).isDisplayed());
        System.out.println("" + driver.findElement(By.xpath("//a[contains(text(),'Employee Attendance')]")).isDisplayed());
        System.out.println("EMPLOYEE IS ABLE TO SEE MY ATTENDANCE DETAILS");

    }

    public void employee_canclickon_calendarbox() throws Exception {
        // pls ask this to kanchan or rajnish click operation is getting executed but calendar is not getting open
        Thread.sleep(2000);


        WebElement calendarbox = driver.findElement(By.xpath("//input[@type='month']"));
        calendarbox.click();

//        Actions actions = new Actions(driver);
//        actions.moveToElement(driver.findElement(By.cssSelector("tr[role='row'] th:nth-child(1) span:nth-child(1)")));
//        actions.click();
//        actions.build().perform();


//        WebElement Datedropdown =driver.findElement(By.xpath("//*[@role=\"columnheader\" and @title=\"Toggle SortBy\"][1]"));
//        Datedropdown.click();
//
//        WebElement Checkin = driver.findElement(By.xpath("//th[normalize-space()='Check In Time - Check Out Time']"));
//        Checkin.click();


        // driver.findElement(By.xpath("//*[@role='columnheader' and @title='Toggle SortBy' and contains(text(), 'Overtime')]")).click();

        /// From here code are for adding the attendance of current date
//        driver.findElement(By.xpath("//button[contains(text(),'Add')]")).click();
//        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abcd");
//
//        driver.findElement(By.xpath("//select[@name='select']")).click();
//        Select drpworkmode = new Select(driver.findElement(By.xpath("//select[@name='select']")));
//        drpworkmode.selectByVisibleText("Work from home");
//
//        Thread.sleep(2000);
//
//        //Cancel button
//        //driver.findElement(By.xpath("//button[normalize-space()='Cancel']")).click();
//
//        driver.findElement(By.xpath("//button[normalize-space()='Check In']")).click();

    }


    //from here it for edit button
    public void employee_click_on_edit_button() throws Exception {
        Thread.sleep(2000);

        driver.findElement(By.xpath(" //tbody/tr[1]/td[4]/a[1]/button[1]")).click();


    }

    public void emplpyee_can_see_edit_employee_attendance_page() {

        Assert.assertTrue(driver.findElement(By.xpath("//li[contains(text(),'Edit Employee Attendance')]")).isDisplayed());
        System.out.println("" + driver.findElement(By.xpath("//li[contains(text(),'Edit Employee Attendance')]")).isDisplayed());
        System.out.println("EMPLOYEE IS ABLE TO SEE EDIT EMPLOYEE ATTENDANCE DETAILS");
    }

    public void employee_click_on_another_edit_button() throws Exception {
        Thread.sleep(2500);
        driver.findElement(By.cssSelector("#edit-0")).click();

        //driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Check out time");

        Thread.sleep(2500);
        // driver.findElement(By.xpath("//button[contains(text(),'Cancel')]")).click();

        //driver.findElement(By.xpath("//button[contains(text(),'Check Out')]")).click();

        driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/input[1]")).sendKeys("04:36PM");
        driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
        Thread.sleep(3000);
        //This is for cancel button nex to submit button
        //driver.findElement(By.cssSelector(".btn-danger.btn.btn-primary")).click();


    }

    public void employee_click_on_delete_button() throws Exception {

        driver.findElement(By.cssSelector("#delete-0")).click();


    }

    public void Dialouge_appear_to_delete_the_attendance() throws Exception{
        Thread.sleep(2000);

        //driver.findElement(By.xpath("//button[normalize-space()='Cancel']")).click();

        driver.findElement(By.xpath("//button[@class='default-btn']")).click();

    }
}





//    public void Add_Attendance() throws Exception {
//        Thread.sleep(2500);
//
//        driver.findElement(By.xpath("//button[contains(text(),'Add Attendance')]")).click();
//        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Login Time");
//
//     Thread.sleep(2000);
//        driver.findElement(By.xpath("//select[@id='']")).click();
//        Select workmode = new Select(driver.findElement(By.xpath("//select[@id='']")));
//        workmode.selectByVisibleText("Work from home");

        //Negative test as we have already enter the check in time & we are getting error msg.
        //driver.findElement(By.xpath("//button[contains(text(),'Check In')]")).click();


//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Cancel']")));
//        driver.findElement(By.xpath("//button[normalize-space()='Cancel']")).click();






