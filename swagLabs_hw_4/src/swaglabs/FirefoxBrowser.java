package swaglabs;

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
public class FirefoxBrowser {
    public static void main(String[] args) {
        //get url
        String baseurl = "https://www.saucedemo.com/";
        //set property value
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get(baseurl);
        //print title of the page
        System.out.println("Title of the page is :" + driver.getTitle());
        //print currunt url
        System.out.println("Currunt url is : " + driver.getCurrentUrl());
        //print page source
        System.out.println("Page source is :" + driver.getPageSource());
        //Enter email address
        WebElement eamilid = driver.findElement(By.name("user-name"));
        eamilid.sendKeys("Prime123@gmail.com");
        // Enter password field
        WebElement passwordfield = driver.findElement(By.name("password"));
        passwordfield.sendKeys("password123");
        //close browser
        driver.close();


    }


}
