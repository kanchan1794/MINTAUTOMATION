package Pageobjectclasses;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.pagefactory.ByAll;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.naming.CommunicationException;
import java.time.Duration;

public class OragnizationMenuPage extends Browser {
    private WebDriver driver = null;

    public OragnizationMenuPage(WebDriver driver) {

        this.driver = driver;

    }

    public void OrganizationMenu() throws Exception {

        Thread.sleep(3000);

        driver.findElement(By.linkText("Organizations")).click();
        driver.findElement(By.linkText("Add Organization")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id=\"company\"]")).sendKeys("ABC PVTLTD");
        driver.findElement(By.xpath("//input[@id='gst_number']")).sendKeys("27AAACH7409R1Z1");
        driver.findElement(By.cssSelector("#bd-email")).sendKeys("abc1@gmail.com");
        driver.findElement(By.xpath("//input[@id='bd-pan-number']")).sendKeys("AAOCS4553K");
        driver.findElement(By.cssSelector("#company_code")).sendKeys("123445678ab_c");
        driver.findElement(By.cssSelector("#street")).sendKeys("Shree krupa Apt,Roadno.-2,sector-12");
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("#landmark")).sendKeys("Near Aayppa Mandir");
        driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[9]/div[1]/div[1]/input[1]")).sendKeys("NaviMumbai");
        driver.findElement(By.cssSelector("#postal-code")).sendKeys("400703");
        driver.findElement(By.cssSelector("#state")).sendKeys("Maharashtra");
        Thread.sleep(3000);

        driver.findElement(By.cssSelector("#country")).click();
        Select testDropDown = new Select(driver.findElement(By.cssSelector("#country")));
        testDropDown.selectByVisibleText("Austria");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scrollBy(0,500)", "");

        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        // Thread.sleep(3000);


        js.executeScript("scrollBy(0,800)", "");
        //driver.findElement(By.xpath("//input[@type='submit']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@class='float-right mb-3 mt-3 btn btn-primary']")).click();


    }

    public void ViewOrganization() throws Exception {
        Thread.sleep(3000);

        driver.findElement(By.xpath("//a[contains(text(),'View Organizations')]")).click();

    }
    public void serachoption() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@Id='filter-input-focus']")));
        driver.findElement(By.xpath("//input[@Id='filter-input-focus']")).sendKeys("1234567");
    }
    public void statusoption() {

        driver.findElement(By.xpath("//select[@class='form-select']")).click();
    }

    public void Statusdropdownoption() {

        //Thread.sleep(2000);
        WebElement Status_dropdown = driver.findElement(By.xpath("//select[@class='form-select']"));
        Select Status_d = new Select(Status_dropdown);
        Status_d.selectByVisibleText("Active");
    }
    public void viewiconoption() {


        driver.findElement(By.xpath("//tbody/tr[1]/td[4]/a[1]/*[1]")).click();
    }
        public void createadminuserbutton() {
            driver.findElement(By.xpath("//button[contains(text(),'Create Admin User')]")).click();
        }

    public void basicemployeedetails() throws InterruptedException {

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

        //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);","//input[@id='react-select-2-input']");

        // Actions actions = new Actions(driver);
        //actions.moveToElement(driver.findElement(By.xpath("//input[@id='react-select-2-input']")));
        //actions.click();
        //actions.sendKeys("Accounts");
        // actions.build().perform();


        //driver.findElement(By.xpath("//input[@id='react-select-2-input']")).sendKeys("Accounts");
        //driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]")).sendKeys("sales");
        // driver.findElement(By.className("class=\" css-19bb58m\"")).sendKeys("Accounts");

        driver.findElement(By.xpath("//input[@id='flat_number']")).sendKeys("402");
        driver.findElement(By.xpath("//input[@id='building_name']")).sendKeys("Vishal Apt");
        driver.findElement(By.xpath("//input[@id='street']")).sendKeys("Kotwal nagar karjat");


        js.executeScript("scrollBy(0,900)", "");

        driver.findElement(By.xpath("//input[@id='landmark']")).sendKeys("Near Shri Ram bridge");
        driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Raigarh");
        driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("410201");
        driver.findElement(By.xpath("//input[@id='state']")).sendKeys("Maharashtra");

        Thread.sleep(2500);

        driver.findElement(By.cssSelector("#country")).click();
        Select drpCountry = new Select(driver.findElement(By.cssSelector("#country")));
        drpCountry.selectByValue("Brazil");

        js.executeScript("scrollBy(0,500)", "");

        driver.findElement(By.xpath("//span[@class='MuiIconButton-label']")).click();

        driver.findElement(By.linkText("Save & Next")).click();
    }

        //WebDriverWait wait1= new WebDriverWait(driver, Duration.ofSeconds(20));
        // WebElement Communication = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]/*[1]"));
        //js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]/*[1]")));
        //Communication.click();


public void FillCommunication_details() {


    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".float-right.my-3.btn.btn-primary")));
    WebElement communicationdetails = driver.findElement(By.cssSelector(".float-right.my-3.btn.btn-primary"));
    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", communicationdetails);


    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", communicationdetails);

    // Phone Number
    //driver.findElement(By.xpath("//div[@class='tab-pane active fade show']//div[@class='row form-group']//div[1]//div[1]//input[1]")).sendKeys("9820313358");

    //personal Emailid
    //driver.findElement(By.xpath("//div[@class='tab-pane active fade show']//div[@class='row form-group']//div[1]//div[1]//input[1]")).sendKeys("neha.lenka@gmail.com");

    //Previous button
    //driver.findElement(By.xpath("//div[@class='tab-pane active fade show']//button[@type='button'][normalize-space()='Previous']")).click();

    //Save & next button on communication page
    //driver.findElement(By.xpath("//div[@class='tab-pane active fade show']//button[@class='float-right btn btn-primary'][normalize-space()='Save & Next']")).click();

}

public void Identity(){
     // driver.findElement(By.xpath("super admin can add Bank details")).sendKeys("6781 5338 1876");
    // driver.findElement(By.xpath("//input[@placeholder='Enter PAN Number']")).sendKeys("BNZPM2501F");
    // driver.findElement(By.xpath("//input[@id='driving-license']")).sendKeys("MH03 20080022135");
    // driver.findElement(By.xpath("//input[@id='driving-license']")).sendKeys("MHBAN00187340000053518");
    //driver.findElement(By.xpath("//input[@id='vehicle-number']")).sendKeys("MH 40BP 4231");
    //driver.findElement(By.xpath("//input[@id='passport-number']")).sendKeys("L9630722");

    //WebElement Browse = driver.findElement(By.xpath("//body//div[@id='root']//div[@class='card-body']//div[@class='card-body']//div[1]//div[2]//div[1]//div[1]//div[3]//div[1]"));
    //Browse.sendKeys("E:\\Aparna Photos\\Other Document\\Adhar card");



}

public void Bank(){


}















       // driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/button[1]")).click();















}


