package herokuppa;

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
public class ChromBrowser {
    public static void main(String[] args) {
        String mainurl = "http:\\the-internet.herokuapp.com\\login";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        // create object
        WebDriver driver = new ChromeDriver();
        driver.get(mainurl);
        // print title of the page
        System.out.println("The title of the page is: " + driver.getTitle());
        //print currunt page
        System.out.println("Currunt page url is :" + driver.getCurrentUrl());
        //Print page source
        System.out.println("The page source is :" + driver.getPageSource());
        //email id get
        WebElement emailid = driver.findElement(By.id("username"));
        emailid.sendKeys("Prime123@gmail.com");
        // Enter  password field
        WebElement passwordfield = driver.findElement(By.name("password"));
        passwordfield.sendKeys("prime123");
        // close the browser
        driver.close();


    }


}
