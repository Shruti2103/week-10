package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/*   Setup  browser
2. Open URL
3. Print the title of the page
4. Print the current url
5. Print the page source
6. Enter the email to email field
7. Enter the password to password field*/
public class FirefoxOrange {
    public static void main(String[] args) {
        // get url
        String baseurl = "https://opensource-demo.orangehrmlive.com/";
        // set property get key value
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        // launch driver
        driver.get(baseurl);
        //print title of the page
        System.out.println("The title of the page :" + driver.getTitle());
        //Print currunt url
        String currunt = driver.getCurrentUrl();
        System.out.println("The currunt url is :" + driver.getCurrentUrl());
        // print page source
        System.out.println("The page source for given url is: " + driver.getPageSource());
        //Enter email id
        WebElement emailid = driver.findElement(By.name("Email"));
        emailid.sendKeys("Prime123@gmail.com");
        // enter password id
        WebElement passwordfield = driver.findElement(By.name("Password"));
        passwordfield.sendKeys("password123");

        // close the object
        driver.close();


    }


}
