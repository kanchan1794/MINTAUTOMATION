package Pageobjectclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Browser {

    public static ThreadLocal<WebDriver> driverThread=new InheritableThreadLocal<WebDriver>();
    //public  WebDriver driver=new ChromeDriver();
    static{
        try{
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            WebDriver driver = new ChromeDriver(options);


            driverThread.set(driver);
            driver.manage().window().maximize();

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}

