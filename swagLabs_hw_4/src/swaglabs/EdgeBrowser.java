package swaglabs;

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
        //get url
        String baseurl = "https://www.saucedemo.com/";
        // set property and value
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get(baseurl);
        //print title of the page
        System.out.println("Title of the page :" + driver.getTitle());
        // currunt url
        System.out.println("Currunt url is: " + driver.getCurrentUrl());
        //print page source
        System.out.println("The page source is :" + driver.getPageSource());
        //Enter the email field
        WebElement emailid = driver.findElement(By.name("user-name"));
        emailid.sendKeys("Prime123@gmail.com");
        // Enter password field
        WebElement passwordfield = driver.findElement(By.id("password"));
        passwordfield.sendKeys("prime145");
        //close browser
        driver.close();


    }


}
