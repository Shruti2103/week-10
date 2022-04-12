package coursebrowsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*   Setup  browser
2. Open URL
3. Print the title of the page
4. Print the current url
5. Print the page source
6. Enter the email to email field
7. Enter the password to password field*/
public class ChromeBrowser {
    public static void main(String[] args) {
        String baseurl = "https://courses.ultimateqa.com/users/sign_in";
        //set system and give value
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(baseurl);
        //Print the title
        System.out.println("Title of the page is :" + driver.getTitle());
        //print url
        System.out.println("Currunt url is :" + driver.getCurrentUrl());
        //Print page source
        System.out.println("Pagesource is :" + driver.getPageSource());
        //get email id
        WebElement emailid = driver.findElement(By.id("user[email]"));
        emailid.sendKeys("Prime123@gmail.com");
        //get passwordfield
        WebElement passwordfield = driver.findElement(By.name("user[password]"));
        passwordfield.sendKeys("prime123");
        //close browser
        driver.close();


    }


}
