package Pageobjectclasses;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Eventsandcalendarmenupage extends Browser{

    private WebDriver driver = null;

    public Eventsandcalendarmenupage(WebDriver driver) {

        this.driver = driver;

    }
public void Eventsandcalendarmenu(){
        driver.findElement(By.xpath("//a[normalize-space()='Events and Calendar']")).click();


    }
public void employee_can_see_the_details_of_holiday_and_events()throws Exception{
    Assert.assertTrue(driver.findElement(By.xpath("//li[contains(text(),'Employee Holidays')]")).isDisplayed());
    System.out.println(""+ driver.findElement(By.xpath("//li[contains(text(),'Employee Holidays')]")).isDisplayed());
    System.out.println("Employee is on Holidays & Event page");



    }
public void Employee_click_on_navigationwrrow_tochange_month() throws Exception{
        Thread.sleep(2000);
    driver.findElement(By.cssSelector("button[class='react-calendar__navigation__arrow react-calendar__navigation__next-button']")).click();


    }
public void Employee_click_on_navigationarrow_tochange_year(){
        driver.findElement(By.cssSelector("button[class='react-calendar__navigation__arrow react-calendar__navigation__next2-button']")).click();


    }
}
