package Pageobjectclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class KYC_MintHRAdmindashboardpage extends Browser {

    private WebDriver driver = null;

    public KYC_MintHRAdmindashboardpage(WebDriver driver) {

        this.driver = driver;
    }


    public void AdminDashboardURL() throws Exception {
        driver.get("https://staging.dx0oqxblmo7a7.amplifyapp.com/login");

        //driver.navigate().to("https://staging.dh8h2bodd8qh6.amplifyapp.com/login");
        Thread.sleep(2000);
        //VALIDATE PAGE URL

//        String ActualResult = driver.getCurrentUrl();
//        String ExpectedResult = "https://staging.dx0oqxblmo7a7.amplifyapp.com/login\");";
//        System.out.println("ExpectedResult :-" + ExpectedResult);
//        System.out.println("ActualResult :-" + ActualResult);
//        junit.framework.Assert.assertEquals(ActualResult, ExpectedResult);
//        //driver.get(ExpectedResult);
//

        //VALIDATE LOGIN TEXT ON PAGE
        Thread.sleep(4000);
        junit.framework.Assert.assertTrue(driver.findElement(By.xpath("//h1[contains(text(),'Login')]")).isDisplayed());
        System.out.println("**********" + driver.findElement(By.xpath("//h1[contains(text(),'Login')]")).isDisplayed() + "**********");


        //Thread.sleep(2000);
        //new WebDriverWait(driver,timeout).until(ExpectedConditions.visibilityOf(element));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login_username_input")));
        driver.findElement(By.id("login_username_input")).sendKeys("himanshu.bisht430@gmail.com");
        driver.findElement(By.id("loging_password_input")).sendKeys("Admin@123");
        driver.findElement(By.id("login_submit_button")).click();
        ValidateDBPage();

    }

    public void ValidateDBPage() throws Exception {
        //AFTER LOGGEDIN DASHBOARD PAGE VALIDATION
        Thread.sleep(4000);
        junit.framework.Assert.assertTrue(driver.findElement(By.xpath("//li[contains(text(),'Dashboard')]")).isDisplayed());
        System.out.println("**********" + driver.findElement(By.xpath("//li[contains(text(),'Dashboard')]")).isDisplayed() + "**********");
    }
    public void ClickSettingIcon()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//header/ul[2]/span[1]/*[1]")));
        WebElement SettingIcon =  driver.findElement(By.xpath("//header/ul[2]/span[1]/*[1]"));
        SettingIcon.click();
        }
    public void ValidateSettingspage() throws Exception {
        //AFTER LOGGEDIN DASHBOARD PAGE VALIDATION
        Thread.sleep(4000);
        junit.framework.Assert.assertTrue(driver.findElement(By.xpath("//div[contains(text(),'List of Leave policies')]")).isDisplayed());
        System.out.println("**********" + driver.findElement(By.xpath("//div[contains(text(),'List of Leave policies')]")).isDisplayed() + "**********");
    driver.navigate().back();
    }

    public void ClickNotificationIcon()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//header/ul[2]/li[1]/div[1]/*[1]")));
        WebElement NotificationIcon =  driver.findElement(By.xpath("//header/ul[2]/li[1]/div[1]/*[1]"));
        NotificationIcon.click();
    }
    public void ValidateNotificationpage() throws Exception {
        //AFTER LOGGEDIN DASHBOARD PAGE VALIDATION
        Thread.sleep(4000);
        junit.framework.Assert.assertTrue(driver.findElement(By.xpath("//h1[contains(text(),'No notification found')]")).isDisplayed());
        System.out.println("**********" + driver.findElement(By.xpath("//h1[contains(text(),'No notification found')]")).isDisplayed() + "**********");
        driver.navigate().back();
    }
    public void ClickUserProfileIcon()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//header/ul[2]/li[2]/a[1]/div[1]/*[1]")));
        WebElement UserProfileIcon =  driver.findElement(By.xpath("//header/ul[2]/li[2]/a[1]/div[1]/*[1]"));
        UserProfileIcon.click();
    }

    public void ValidateUserProfileBox() throws Exception {
        //AFTER LOGGEDIN DASHBOARD PAGE VALIDATION
        Thread.sleep(4000);
        junit.framework.Assert.assertTrue(driver.findElement(By.xpath("//strong[contains(text(),'Account')]")).isDisplayed());
        //junit.framework.Assert.assertTrue(driver.findElement(By.xpath("//strong[contains(text(),'Account')]").isDisplayed()));
        System.out.println("**********" + driver.findElement(By.xpath("//strong[contains(text(),'Account')]")).isDisplayed() + "**********");
        //driver.navigate().back();
    }



    }

