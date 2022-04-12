package browsertesting;
/*   Setup  browser
2. Open URL
3. Print the title of the page
4. Print the current url
5. Print the page source
6. Enter the email to email field
7. Enter the password to password field*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowser {
    public static void main(String[] args) {
        // get url
        String baseurl = "https://demo.nopcommerce.com/login?returnUrl=%2F%22";
        //   set property get key value
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        // launch url
        driver.get(baseurl);
        //title of the page
        String title = driver.getTitle();
        System.out.println("The title of the page is:" + title);
        // currunt url
        System.out.println("The currunt URL is: " + driver.getCurrentUrl());
        //page source
        String source = driver.getPageSource();
        System.out.println("The page source is :" + source);
        // Enter email to email field
        WebElement emailid = driver.findElement(By.name("Email"));
        emailid.sendKeys("Prime123@gmail.com");
        // get password field
        WebElement passwordfield = driver.findElement(By.name("Password"));

        // close the browser
        driver.close();


    }


}
