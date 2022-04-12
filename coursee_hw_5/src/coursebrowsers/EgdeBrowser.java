package coursebrowsers;

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
public class EgdeBrowser {
    public static void main(String[] args) {
        // get the url
        String baseurl = "https://courses.ultimateqa.com/users/sign_in";
        //set value
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
        // make object
        WebDriver driver = new EdgeDriver();
        driver.get(baseurl);
        // title of the page
        System.out.println("title of the page is :" + driver.getTitle());
        //currunt url
        System.out.println("Currunt url" + driver.getCurrentUrl());
        //get page source
        System.out.println("Page source is :" + driver.getPageSource());
        //email id get
        WebElement emailid = driver.findElement(By.name("user[email]"));
        emailid.sendKeys("prime123@gmail.com");
        // get password field
        WebElement passwordfield = driver.findElement(By.name("user[password]"));
        passwordfield.sendKeys("prime123");
        // close the browser
        driver.close();


    }


}
