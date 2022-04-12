package coursebrowsers;

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

        String baseurl = "https://courses.ultimateqa.com/users/sign_in";
        //set property value
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        //get object
        WebDriver driver = new FirefoxDriver();
        driver.get(baseurl);
        //print title of the page
        System.out.println("The title of the page is :" + driver.getTitle());
        //currunt url
        System.out.println("Currunt URL is :" + driver.getCurrentUrl());
        //Print page spource
        System.out.println("The page source is :" + driver.getPageSource());
        //Enter email id
        WebElement emailid = driver.findElement(By.name("user[email]"));
        emailid.sendKeys("Prime123@gmail.com");
        // Enter password field
        WebElement passwordfield = driver.findElement(By.name("user[password]"));
        passwordfield.sendKeys("prime123");
        // close the browser
        driver.close();


    }


}
