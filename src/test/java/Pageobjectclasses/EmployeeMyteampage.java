package Pageobjectclasses;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmployeeMyteampage extends Browser {


    private WebDriver driver = null;

    public EmployeeMyteampage(WebDriver driver) {

        this.driver = driver;
    }



    public void Employee_click_Myteammenu() throws Exception{
        Thread.sleep(2000);

        driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/ul[1]/li[3]/a[1]")).click();


    }
    public void employee_can_see_myteammenu_details(){

        Assert.assertTrue(driver.findElement(By.xpath("//li[contains(text(),'My Team')]")).isDisplayed());
        System.out.println("" + driver.findElement(By.xpath("//li[contains(text(),'My Team')]")).isDisplayed() + "");
        System.out.println("Employee IS ON MY TEAM PAGE");



         int a=20, b=10;
//         System.out.println("sum of a and b is:"+(a+b));
//        System.out.println("Diff of a and b is:"+(a-b));
//        System.out.println("Multiplication of a and b is:"+(a*b));
//        System.out.println("division of a and b is:"+(a/b));
//        System.out.println("Percentage/modulo of a and b is:"+(a%b));


        //2.Relational / comaprison operator > >= < <= != ==
        //returns a boolen value--- true or false
//         System.out.println(a>b);//true
//        System.out.println(a<b);//false
//        System.out.println(a>=b);//true here it will check first sign that is greater than.
//        System.out.println(a<=b);//true
//        //now m defining b as 20
//        b=20;
//        System.out.println(a>=b);//true here it will check first greate than & then equal sign
//        System.out.println(a<=b);//true
//        System.out.println(a!=b); // here both a & b value are same or equal so this expression become false
//        System.out.println(a==b);// true as value are same

         //3.Logical Operator  && || ! (and, or ,not)
        // returns boolen value-- True or false
        //works between 2 boolean values


    }
}