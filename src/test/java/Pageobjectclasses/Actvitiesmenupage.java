package Pageobjectclasses;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class Actvitiesmenupage extends Browser {

    private WebDriver driver = null;

    public Actvitiesmenupage(WebDriver driver) {

        this.driver = driver;
    }

    public void admin_click_on_activitiesmenu() throws Exception {

        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[text()='Activities']")).click();


    }

    public void Admin_see_Add_and_list_activities_submenu() {
        Assert.assertTrue(driver.findElement(By.xpath("//h4[contains(text(),'Total Organizations')]")).isDisplayed());
        System.out.println("" + driver.findElement(By.xpath("//h4[contains(text(),'Total Organizations')] ")).isDisplayed() + "");
        System.out.println("ADMIN IS ABlE To SEE ADD & LIST ACTIVITIES ");


    }

    public void Add_activities() throws Exception {
        driver.findElement(By.xpath("//a[contains(text(),'Add Activities')]")).click();

        Thread.sleep(2000);

        driver.findElement(By.id("title")).sendKeys(" Yoga");
        driver.findElement(By.id("frequency")).sendKeys("15 days");

        driver.findElement(By.id("start_time")).sendKeys("09:30AM");
        driver.findElement(By.id("end_time")).sendKeys("10:00AM");
        driver.findElement(By.id("description")).sendKeys("Yoga activity every 15 days ");
        driver.findElement(By.id("total_points")).sendKeys("10");

        Thread.sleep(2000);

        //for uploading lottie file
        driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[4]/div[2]/div[1]/div[1]/div[2]")).click();
        Robot rb = new Robot();
        rb.delay(2000);

        StringSelection ss = new StringSelection("file:///C:/Users/Admin/Downloads/sample1.json");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

// to paste the link & then to release the button
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);
        rb.delay(2000);

        rb.keyRelease(KeyEvent.VK_CONTROL);
        rb.keyRelease(KeyEvent.VK_V);
        rb.delay(2000);

        //Enter
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);


        driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[4]/div[3]/div[1]/div[1]/div[3]/div[1]")).click();
        Robot rb1 = new Robot();
        rb1.delay(2500);

        StringSelection ss1 = new StringSelection("C:\\Users\\Admin\\Downloads\\Yoga image.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss1, null);

        rb1.keyPress(KeyEvent.VK_CONTROL);
        rb1.keyPress(KeyEvent.VK_V);
        rb1.delay(2000);

        rb1.keyRelease(KeyEvent.VK_CONTROL);
        rb1.keyRelease(KeyEvent.VK_V);
        rb1.delay(2000);
//Enter
        rb1.keyPress(KeyEvent.VK_ENTER);
        rb1.keyRelease(KeyEvent.VK_ENTER);

        driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();

    }

public void admin_can_see_Addactivities_details(){
    Assert.assertTrue(driver.findElement(By.xpath("//li[contains(text(),'Add Activities')]")).isDisplayed());
    System.out.println("" + driver.findElement(By.xpath("//li[contains(text(),'Add Activities')] ")).isDisplayed() + "");
    System.out.println("ADMIN IS ABlE To SEE ADDACTIVITIES DETAILS ");


    }
}