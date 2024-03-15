package Pageobjectclasses;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class EmployeeAddressbookpage extends Browser{

    private WebDriver driver= null;

    public EmployeeAddressbookpage(WebDriver driver){

        this.driver = driver;

    }


public void addressbook ()throws Exception{

 //Thread.sleep(2000);
    driver.findElement(By.xpath("//a[@href=\"/addressBook\"]")).click();

    Thread.sleep(2000);

    driver.findElement(By.xpath("//input[@type='Text']")).sendKeys("Afzal kazi");

    Actions actions = new Actions(driver);

    actions.click(driver.findElement(By.xpath("//input[@type='Text']")))
            .keyDown(Keys.CONTROL)
            .sendKeys("a")
            .keyUp(Keys.CONTROL)
            .sendKeys(Keys.BACK_SPACE)
            .build()
            .perform();

    Thread.sleep(2500);

    driver.findElement(By.xpath("//a[@class='nav-link']")).click();


    }

    public void employee_can_see_addressbook_details(){
        Assert.assertTrue(driver.findElement(By.xpath("//li[contains(text(),'Address Book')]")).isDisplayed());
        System.out.println("" + driver.findElement(By.xpath("//li[contains(text(),'Address Book')]")).isDisplayed() + "");
        System.out.println("Employee IS ON Address Book PAGE");




    }
}
