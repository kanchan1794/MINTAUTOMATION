package Pageobjectclasses;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Documentsmenupage extends Browser {

    private WebDriver driver = null;

    public Documentsmenupage(WebDriver driver) {

        this.driver = driver;

    }

    public void employee_click_on_documentmenu() {
        driver.findElement(By.xpath("//a[normalize-space()='Documents']")).click();

    }

    public void employee_cansee_submenu() {
        Assert.assertTrue(driver.findElement(By.xpath("//ul[contains(text(),'New org')]")).isDisplayed());
        System.out.println("" + driver.findElement(By.xpath("//ul[contains(text(),'New org')]")).isDisplayed());
        System.out.println("employee can see submenu");

    }

    public void employee_clickon_Mypayslip_Submenu() {
        driver.findElement(By.xpath("//a[contains(text(),'My Payslips')]")).click();

    }

    public void employee_cansee_listof_payslip() {
        Assert.assertTrue(driver.findElement(By.xpath("//li[contains(text(),'My Payslips')]")).isDisplayed());
        System.out.println("" + driver.findElement(By.xpath("//li[contains(text(),'My Payslips')]")).isDisplayed());
        System.out.println("Employee is on My Payslip page");


    }

    public void employee_enter_searchkeyword() throws Exception {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='filter-input-focus']")).sendKeys("August-2023");

        Actions actions = new Actions(driver);

        actions.click(driver.findElement(By.xpath("//input[@Id='filter-input-focus']")))
                .keyDown(Keys.CONTROL)
                .sendKeys("a")
                .keyUp(Keys.CONTROL)
                .sendKeys(Keys.BACK_SPACE)
                .build()
                .perform();


    }

    public void relevant_search_is_generated() {
        Assert.assertTrue(driver.findElement(By.xpath(" //span[contains(text(),'Search:')]")).isDisplayed());
        System.out.println("" + driver.findElement(By.xpath(" //span[contains(text(),'Search:')]")).isDisplayed());
        System.out.println("employee is on Mypayslip search page");


    }


    public void employee_clickon_Pdficon_to_openpayslip() {

        driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[1]/div[1]/div[1]/a[1]/*[1]")).click();

    }

    public void employee_can_see_preview_dialouge_box() throws Exception {
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.xpath(" //h5[normalize-space()='Preview']")).isDisplayed());
        System.out.println("" + driver.findElement(By.xpath(" //h5[normalize-space()='Preview']")).isDisplayed());
        System.out.println("employee is on Preview dialogue box");


//         driver.findElement(By.xpath("//button[contains(text(),'View')]")).click();
//
//         JavascriptExecutor js =(JavascriptExecutor) driver;
//         js.executeScript("scrollBy(0, 500);");
//

        driver.findElement(By.xpath("//button[contains(text(),'Close')]")).click();

    }

     public void employee_click_on_my_document(){

        driver.findElement(By.xpath("//a[contains(text(),'My Documents')]")).click();


    }
  public void employee_can_see_the_list_of_document(){
        Assert.assertTrue(driver.findElement(By.xpath("//li[contains(text(),'User Document')]")).isDisplayed());
        System.out.println("" + driver.findElement(By.xpath("//li[contains(text(),'User Document')]")).isDisplayed());
        System.out.println("Employee is on document page");


    }

    public void employee_enter_search_keywords()throws Exception{
        Thread.sleep(2000);
        driver.findElement(By.id("filter-input-focus")).sendKeys("Identity Card");


        Actions actions = new Actions(driver);

        actions.click(driver.findElement(By.id("filter-input-focus")))
                .keyDown(Keys.CONTROL)
                .sendKeys("a")
                .keyUp(Keys.CONTROL)
                .sendKeys(Keys.BACK_SPACE)
                .build()
                .perform();

    }

       public void relevant_search_generated()throws Exception{

        Thread.sleep(2000);

           Assert.assertTrue(driver.findElement(By.xpath("//h3[contains(text(),'Documents')]")).isDisplayed());
           System.out.println("" + driver.findElement(By.xpath("//h3[contains(text(),'Documents')]")).isDisplayed());
           System.out.println("Employee is document page");

    }

    public void employee_click_on_organization_document() throws Exception{

        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(text(),'Organization Documents')]")).click();


    }

   public void employee_can_see_list_of_view_and_update_policy(){

       Assert.assertTrue(driver.findElement(By.xpath("//li[contains(text(),'View and update policy')]")).isDisplayed());
       System.out.println("" + driver.findElement(By.xpath("//li[contains(text(),'View and update policy')]")).isDisplayed());
       System.out.println("Employee is on View & update policy page");

   }

   public void employee_enter_keyword_in_searchtextbox() throws Exception{
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@id='filter-input-focus']")).sendKeys("Rules & Guidenlines");

       Actions actions = new Actions(driver);

       actions.click(driver.findElement(By.id("filter-input-focus")))
               .keyDown(Keys.CONTROL)
               .sendKeys("a")
               .keyUp(Keys.CONTROL)
               .sendKeys(Keys.BACK_SPACE)
               .build()
               .perform();


       driver.findElement(By.xpath("//thead/tr[3]/th[1]/div[1]/input[1]")).sendKeys("test");

       Thread.sleep(2000);

       Actions actions1 = new Actions(driver);

       actions1.click(driver.findElement(By.xpath("//thead/tr[3]/th[1]/div[1]/input[1]")))
               .keyDown(Keys.CONTROL)
               .sendKeys("a")
               .keyUp(Keys.CONTROL)
               .sendKeys(Keys.BACK_SPACE)
               .build()
               .perform();

   }


     public void generate_relevant_search(){
         Assert.assertTrue(driver.findElement(By.xpath("//h3[contains(text(),'Document List')]")).isDisplayed());
         System.out.println("" + driver.findElement(By.xpath("//h3[contains(text(),'Document List')]")).isDisplayed());
         System.out.println("Employee is on organization document page");



    }
}
