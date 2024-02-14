package Pageobjectclasses;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Practitionermenupage extends Browser{

private WebDriver driver =null;

    public Practitionermenupage(WebDriver driver) {

        this.driver = driver;
    }

public void Practitioner_Persons() throws Exception{
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[normalize-space()='Practitioner Persons']")).click();

    }


    public void admin_see_relevant_page() throws Exception{

        Assert.assertTrue(driver.findElement(By.xpath("//a[contains(text(),'Home')]")).isDisplayed());
        System.out.println("" + driver.findElement(By.xpath("//a[contains(text(),'Home')] ")).isDisplayed() + "");
        System.out.println("ADMIN IS ON THE pratitioner persons PAGE");
    }

    public void superadmin_click_on_Add_person(){
        driver.findElement(By.xpath("//button[contains(text(),'Add Person')]")).click();

    }

    public void Superadmin_can_add_details(){

        driver.findElement(By.xpath("//input[@id='full_name']")).sendKeys("Aniket");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("aniket01@gmail.com");
        driver.findElement( By.xpath("//input[@id='description']")).sendKeys("ABCD");

        driver.findElement(By.id("react-select-2-input")).click();
//        Select drpskill= new Select(driver.findElement(By.id("react-select-2-input")));
//        drpskill.selectByVisibleText("HTML");

    }

    }

