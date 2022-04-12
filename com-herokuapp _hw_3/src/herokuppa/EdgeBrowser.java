package herokuppa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

/*   Setup  browser
2. Open URL
3. Print the title of the page
4. Print the current url
5. Print the page source
6. Enter the email to email field
7. Enter the password to password field*/
public class EdgeBrowser {
    public static void main(String[] args) {
        // Get the url
        String baseurl = "http:\\the-internet.herokuapp.com\\login";
        //  set value of url
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get(baseurl);
        //title of the page
        System.out.println("The title of the page is:" + driver.getTitle());
        //print currunt url
        System.out.println("The currunt url is: " + driver.getCurrentUrl());
        // print the page source
        System.out.println("The page source is: " + driver.getPageSource());
        //print emailid
        WebElement emailid = driver.findElement(By.name("username"));
        emailid.sendKeys("Prime123@gmail.com");
        // print emailaddress
        WebElement emailaddress = driver.findElement(By.name("password"));
        emailaddress.sendKeys("prime123");
        //close the browser
        driver.close();


    }


}
