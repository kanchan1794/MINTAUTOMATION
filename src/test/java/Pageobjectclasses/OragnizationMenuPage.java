package Pageobjectclasses;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.pagefactory.ByAll;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.naming.CommunicationException;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class OragnizationMenuPage extends Browser {
    private WebDriver driver = null;

    public OragnizationMenuPage(WebDriver driver) {

        this.driver = driver;

    }

    public void OrganizationMenu() throws Exception {

        Thread.sleep(3000);

        driver.findElement(By.linkText("Organizations")).click();

    }


//    public void AddOrganizationandViewOrganizationsubmenu() throws Exception {
//        driver.navigate().to("https://staging.dx0oqxblmo7a7.amplifyapp.com/dashboard");
//        String Actual_title = driver.getTitle();
//        String Expected_Title = "https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css";
//        Assert.assertEquals(Actual_title, Expected_Title);
//    }
//
//    public void Add_organization_menu() throws Exception {
//
//        driver.findElement(By.linkText("Add Organization")).click();
//    }
//
//    public void super_admin_see_the_detail_of_Add_organization() throws Exception {
//
//        driver.findElement(By.xpath("//input[@id=\"company\"]")).sendKeys("ABC PVTLTD");
//        driver.findElement(By.xpath("//input[@id='gst_number']")).sendKeys("27AAACH7409R1Z1");
//        driver.findElement(By.cssSelector("#bd-email")).sendKeys("abc1@gmail.com");
//        driver.findElement(By.xpath("//input[@id='bd-pan-number']")).sendKeys("AAOCS4553K");
//        driver.findElement(By.cssSelector("#company_code")).sendKeys("123445678ab_c");
//        driver.findElement(By.cssSelector("#street")).sendKeys("Shree krupa Apt,Roadno.-2,sector-12");
//        Thread.sleep(2000);
//
//        driver.findElement(By.cssSelector("#landmark")).sendKeys("Near Aayppa Mandir");
//        driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[9]/div[1]/div[1]/input[1]")).sendKeys("NaviMumbai");
//        driver.findElement(By.cssSelector("#postal-code")).sendKeys("400703");
//        driver.findElement(By.cssSelector("#state")).sendKeys("Maharashtra");
//        Thread.sleep(3000);
//
//        driver.findElement(By.cssSelector("#country")).click();
//        Select testDropDown = new Select(driver.findElement(By.cssSelector("#country")));
//        testDropDown.selectByVisibleText("Austria");
//
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("scrollBy(0,500)", "");
//
//        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//        Thread.sleep(3000);
//
//        //Save & Next button
//
//        // js.executeScript("scrollBy(0,800)", "");
//        //driver.findElement(By.xpath("//input[@type='submit']")).click();
//        //Thread.sleep(3000);
//        //driver.findElement(By.xpath("//button[@class='float-right mb-3 mt-3 btn btn-primary']")).click();
//
//    }

    public void ViewOrganization() throws Exception {
        Thread.sleep(3000);

        driver.findElement(By.xpath("//a[normalize-space()='View Organizations']")).click();
    }

    public void view_organization_details() {

        Assert.assertTrue(driver.findElement(By.xpath("//li[contains(text(),'List Organizations')]")).isDisplayed());
        System.out.println("" + driver.findElement(By.xpath("//li[contains(text(),'List Organizations')] ")).isDisplayed() + "");
        System.out.println("ADMIN IS ON THE View_organization page");
    }

    public void searchoption() throws Exception {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@Id='filter-input-focus']")));
        driver.findElement(By.xpath("//input[@Id='filter-input-focus']")).sendKeys("1234567");
        Thread.sleep(3000);




        //driver.findElement(By.xpath("//input[@Id='filter-input-focus']")).clear();
    }

    public void Relevant_Search_Results_Generated() {

        Assert.assertTrue(driver.findElement(By.xpath("//span[contains(text(),'Search:')]")).isDisplayed());
        System.out.println("" + driver.findElement(By.xpath("//span[contains(text(),'Search:')] ")).isDisplayed() + "");
        System.out.println("ADMIN IS ON THE View_organization Search page");
    }
//
//    public void statusoption() {
//
//        driver.findElement(By.xpath("//select[@class='form-select']")).click();
//    }

    public void Statusdropdownoption() throws Exception {
        Thread.sleep(2000);
        WebElement Status_dropdown = driver.findElement(By.xpath("//select[@class='form-select']"));
        Status_dropdown.click();
        Select Status_d = new Select(Status_dropdown);
        Status_d.selectByVisibleText("Active");
    }

    public void viewiconoption() throws Exception {

//        Actions actions = new Actions(driver);
//        actions.moveToElement(driver.findElement(By.xpath("//tbody/tr[3]/td[4]/a[1]/*[1]")));
//        actions.click();
//        actions.build().perform();

//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
////       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tbody/tr[3]/td[4]/a[1]")));
        Thread.sleep(2500);
        driver.findElement(By.cssSelector("#root > div.c-app.c-default-layout > div.c-wrapper > div > main > div > div > div > div > div > div > div > div.table-responsive > table > tbody > tr:nth-child(3) > td.d-flex.flex-row.align-items-center > a > svg")).click();
////
//
    }

    public void superadmin_can_see_organization_details() throws Exception {
        Thread.sleep(3000);

        Assert.assertTrue(driver.findElement(By.xpath("//li[contains(text(),'Edit Organization')]")).isDisplayed());
        System.out.println("" + driver.findElement(By.xpath(" //li[contains(text(),'Edit Organization')]")).isDisplayed() + "");
        System.out.println("ADMIN IS ABlE To VIEW EDIT ORGANIZATION TITLE");
    }

    public void createadminuserbutton() throws Exception {
        Thread.sleep(2500);
        driver.findElement(By.xpath("//button[normalize-space()='Create Admin User']")).click();
    }

    public void can_navigate_to_add_Employee_details_form() {
        Assert.assertTrue(driver.findElement(By.xpath("//li[contains(text(),'Add Admin')]")).isDisplayed());
        System.out.println("" + driver.findElement(By.xpath(" //li[contains(text(),'Add Admin')]")).isDisplayed() + "");
        System.out.println("ADMIN IS ABlE To VIEW ADD EMPLOYEE DETAILS");
    }


    public void add_basic_employee_details() throws InterruptedException {

        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("Neha");
        driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("Lenka");

        WebElement datebox = driver.findElement(By.xpath("//input[@Id='date-input']"));
        datebox.sendKeys("05/02/1990");

        Select gender = new Select(driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/select[1]")));
        gender.selectByVisibleText("Male");

        Select Status = new Select(driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/select[1]")));
        Status.selectByVisibleText("Admin");

        driver.findElement(By.cssSelector("#employee-code")).sendKeys("12345");
        driver.findElement(By.xpath("//input[@id='office-email']")).sendKeys("nehalenka123@gmail.com");

        WebElement JoiningDate = driver.findElement(By.xpath("//input[@id='date_of_joining']"));
        JoiningDate.sendKeys("12/01/2023");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scrollBy(0,500)", "");


//        WebElement Dep= new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='react-select-2-input']")));
//        Dep.click();
//        Dep.sendKeys("Accounts");
//
        WebElement Dep = driver.findElement(By.xpath("//input[@id='react-select-2-input']"));
        Dep.sendKeys("Accounts");
        Dep.sendKeys(Keys.ENTER);


        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='flat_number']")).sendKeys("402");
        driver.findElement(By.xpath("//input[@id='building_name']")).sendKeys("Vishal Apt");
        driver.findElement(By.xpath("//input[@id='street']")).sendKeys("Kotwal nagar karjat");


        js.executeScript("scrollBy(0,500)", "");

        driver.findElement(By.xpath("//input[@id='landmark']")).sendKeys("Near Shri Ram bridge");
        driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Dadar");
        driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("400014");
        driver.findElement(By.xpath("//input[@id='state']")).sendKeys("Maharashtra");

        //Thread.sleep(2000);
//
//        driver.findElement(By.id("country")).click();
//        Select drpCountry = new Select(driver.findElement(By.id("country")));
//        drpCountry.selectByVisibleText("Brazil");
//
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        Select drpCountry = new Select(driver.findElement(By.id("country")));
        //JavascriptExecutor executor = (JavascriptExecutor)driver;
        //executor.executeScript("arguments[0].click();", driver.findElement(By.id("country")));
        js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.id("country")));
        drpCountry.selectByVisibleText("India");


//        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
//       wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("country")));
//        driver.findElement(By.id("country")).click();
//        Select drpCountry = new Select(driver.findElement(By.id("country")));
//        drpCountry.selectByVisibleText("Brazil");

        //js.executeScript("scrollBy(0,500)", "");

        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='MuiIconButton-label']")));
        driver.findElement(By.xpath("//span[@class='MuiIconButton-label']")).click();


        js.executeScript("scrollBy(0,700)", "");

        Thread.sleep(3000);


        driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/button[1]")).click();
//        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='float-right my-3 btn btn-primary']")));
//        driver.findElement(By.xpath("//button[@class='float-right my-3 btn btn-primary']")).click();
    }


    //WebDriverWait wait1= new WebDriverWait(driver, Duration.ofSeconds(20));
    // WebElement Communication = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]/*[1]"));
    //js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]/*[1]")));
    //Communication.click();


//    public void FillCommunication_details() {
//
//
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".float-right.my-3.btn.btn-primary")));
//        WebElement communicationdetails = driver.findElement(By.cssSelector(".float-right.my-3.btn.btn-primary"));
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", communicationdetails);
//
//
//        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", communicationdetails);
//
//        //Phone Number
//        driver.findElement(By.xpath("//div[@class='tab-pane active fade show']//div[@class='row form-group']//div[1]//div[1]//input[1]")).sendKeys("9820313358");
//
//        //personal Emailid
//        driver.findElement(By.xpath("//div[@class='tab-pane active fade show']//div[@class='row form-group']//div[1]//div[1]//input[1]")).sendKeys("neha.lenka@gmail.com");
//
//        //Edit Button
//        driver.findElement(By.xpath("//button[contains(text(),'Edit')]")).click();
//
//        //Action Button
//        WebElement Action_dropdown=driver.findElement(By.xpath("//button[contains(text(),'Actions')]"));
//        Action_dropdown.click();
//        Select Status_A=new Select(Action_dropdown);
//        Status_A.selectByVisibleText("Resst Password");

//        //Previous button
//        driver.findElement(By.xpath("//div[@class='tab-pane active fade show']//button[@type='button'][normalize-space()='Previous']")).click();
//
//        //Save & next button on communication page
//        driver.findElement(By.xpath("//div[@class='tab-pane active fade show']//button[@class='float-right btn btn-primary'][normalize-space()='Save & Next']")).click();
//
//    }

//  public void admin_add_Identity_Details() throws Exception{
//
//    driver.findElement(By.xpath("//button[contains(text(),'Edit')]")).click();
//
//    driver.findElement(By.xpath("//input[@placeholder='Enter Aadhar Number']")).sendKeys("5247 8003 4511");
//      //File uplodaing browse
//      String file_path= "E:\\Aparna Photos\\Other Document\\Adhar Card";
//      driver.findElement(By.xpath("//body//div[@id='root']//div[@class='card-body']//div[@class='card-body']//div[1]//div[2]//div[1]//div[1]//div[3]")).sendKeys(file_path);
//
//    driver.findElement(By.xpath(" //input[@placeholder='Enter PAN Number']")).sendKeys("BPKPP7828D");
//      //File uplodaing browse
//      String filepath= "E:\\Aparna Photos\\Other Document\\Pan Card";
//      driver.findElement(By.xpath("E:\\Aparna Photos\\Other Document\\Pan Card"));
//
//
//      driver.findElement(By.xpath("//input[@id='driving-license']")).sendKeys("MH03 20080022135");
//      //File uplodaing browse
//      String choosefile ="E:\\Aparna Photos\\Educational Document\\SSC";
//      driver.findElement(By.xpath("/div[@class='card card-accent-primary']//div[2]//div[2]//div[1]//div[1]//div[3]//div[1]")).sendKeys(choosefile);
//
//
//      JavascriptExecutor js= (JavascriptExecutor) driver;
//     js.executeScript("ScrollBy(0,500)");
//
//    driver.findElement(By.xpath("//input[@id='pf-number']")).sendKeys("MHBAN00187340000052518");
//    driver.findElement(By.xpath("//input[@id='vehicle-number']")).sendKeys("MH 10DV 3456");
//    driver.findElement(By.xpath("//input[@id='passport-number']")).sendKeys("J8369854");
//
//
//    //Previou Button
//      driver.findElement(By.xpath("//div[@class='tab-pane active fade show']//button[@type='button'][normalize-space()='Previous']")).click();
//
//      //Save & Next button
//      driver.findElement(By.xpath("//div[@class='tab-pane active fade show']//button[@class='float-right btn btn-primary'][normalize-space()='Save & Next']")).click();
//
//    }
//}

//    public void Bank_Details() {
//    driver.findElement(By.xpath("//button[contains(text(),'Edit')]")).click();
//
//    driver.findElement(By.xpath("//input[@id='bank-name']")).sendKeys("HDFC BANK");
//    driver.findElement(By.xpath("//input[@id='ifsc-code']")).sendKeys("HFDC00026");
//    driver.findElement(By.xpath("//input[@id='account-number']")).sendKeys("123456789");
//    //previous button
//     driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/div[2]/form[1]/div[1]/button[1]")).click();
//     //Save & Next Button
//        driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/div[2]/form[1]/div[1]/button[2]")).click();
//
//
//    }

    public void Organization_status_details() {
        driver.findElement(By.xpath("//a[contains(text(),'Organization Stats')]")).click();
    }

    public void can_see_organizationstatus_details() throws Exception {
        Assert.assertTrue(driver.findElement(By.xpath("//a[contains(text(),'Home')]")).isDisplayed());
        System.out.println("" + driver.findElement(By.xpath("//a[contains(text(),'Home')] ")).isDisplayed() + "");
        System.out.println("ADMIN IS ABlE To VIEW ORGANIZATION STATUS DETAILS");
    }

    public void click_on_calendar() throws Exception {

//        WebElement calendarIcon = driver.findElement(By.id("monthYear"));
//        calendarIcon.click();

//        WebElement calendarbox = driver.findElement(By.id("monthYear"));
//        calendarbox.click();
//        calendarbox.sendKeys("April 2022");

        //driver.findElement(By.linkText("Clear")).click();
        //((JavascriptExecutor) driver).executeScript("arguments[0].scrollTop += 100", calendarElement);
    }

    public void enter_the_search_keyword() throws Exception {
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@id='filter-input-focus']")).sendKeys("14");

        Actions actions = new Actions(driver);

        actions.click(driver.findElement(By.xpath("//input[@id='filter-input-focus']")))
                .keyDown(Keys.CONTROL)
                .sendKeys("a")
                .keyUp(Keys.CONTROL)
                .sendKeys(Keys.BACK_SPACE)
                .build()
                .perform();


    }

    public void Relevant_search_is_generated() throws Exception {

        Assert.assertTrue(driver.findElement(By.xpath("//h3[contains(text(),'Organization Stats')]")).isDisplayed());
        System.out.println("" + driver.findElement(By.xpath("//h3[contains(text(),'Organization Stats')] ")).isDisplayed() + "");
        System.out.println("ADMIN IS ABlE To VIEW RELEVANT SEARCH DETAILS");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scrollBy(0,500)", "");
    }
}
        //driver.findElement(By.xpath("//a[contains(text(),'11')]")).click();














