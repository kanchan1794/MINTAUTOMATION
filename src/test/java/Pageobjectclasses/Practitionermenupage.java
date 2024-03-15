package Pageobjectclasses;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;

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

    public void Superadmin_can_add_details()throws Exception{

        driver.findElement(By.xpath("//input[@id='full_name']")).sendKeys("Nikhita");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Nikhita01@gmail.com");
        driver.findElement( By.xpath("//input[@id='description']")).sendKeys("ABCD");

      WebElement Skill_dropdown =driver.findElement(By.id("skill_set"));
       Skill_dropdown.click();
       Robot robot = new Robot();

        // Press down arrow key three times to navigate to the 3rd option
        for (int i = 0; i < 1; i++) {
            robot.keyPress(KeyEvent.VK_DOWN);
            Thread.sleep(1000); // Add a small delay between key presses
            robot.keyRelease(KeyEvent.VK_DOWN);
        }

        //Press Enter to select the option
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);


        //div[@class=' css-taurng-control']

//        WebElement dropdown_element= driver.findElement(By.id("skill_set"));
//        Select dropdown = new Select(dropdown_element);
//        dropdown.selectByVisibleText("HTML");

//        JavascriptExecutor js = (JavascriptExecutor) driver;
//
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//        Select Skillset = new Select(driver.findElement(By.id("skill_set")));
//        js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.id("skill_set")));
//        Skillset.selectByVisibleText("CSS");

        driver.findElement(By.id("qualification")).sendKeys("B.Tech");
        driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();


    }

    }

