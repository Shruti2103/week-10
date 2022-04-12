package swaglabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*   Setup chrome browser
2. Open URL
3. Print the title of the page
4. Print the current url
5. Print the page source
6. Enter the email to email field
7. Enter the password to password field*/
public class ChromeBrowser {
    public static void main(String[] args) {
        // get url
        String baseurl = "https://www.saucedemo.com/";
        // set  key value properties
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        // create object
        WebDriver driver = new ChromeDriver();
        driver.get(baseurl);
        // print the title
        System.out.println("Title of the pafe :" + driver.getTitle());
        //print currunt url
        System.out.println("Currunt url is :" + driver.getCurrentUrl());
        //print page source
        System.out.println("Page source is: " + driver.getPageSource());
        //get emailid
        WebElement emailid = (driver.findElement(By.name("user-name")));
        emailid.sendKeys("Prime123@gmail.com");
        // get password field
        WebElement passwordfield = driver.findElement(By.name("password"));
        passwordfield.sendKeys("password123");
        //close the browser
        driver.close();


    }


}
