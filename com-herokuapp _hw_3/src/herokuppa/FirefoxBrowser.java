package herokuppa;

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
        //  Setup chrome browser
        String baseurl = "http:\\the-internet.herokuapp.com\\login";
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        WebDriver obj = new FirefoxDriver();
        // launch url
        obj.get(baseurl);
        // title of the page
        System.out.println("Title of the page is: " + obj.getTitle());
        //print currunt page
        System.out.println("Currunt url is :" + obj.getCurrentUrl());
        //page source print
        System.out.println("The page source is :" + obj.getPageSource());
        //get email id
        WebElement emailid = obj.findElement(By.name("username"));
        emailid.sendKeys("Prime123@gmail.com");
        WebElement passwordfield = obj.findElement(By.name("password"));
        // close the obj
        obj.close();


    }


}
