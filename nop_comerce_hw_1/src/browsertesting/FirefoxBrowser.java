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
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {
    public static void main(String[] args) {
       // select url
        String baseurl="https://demo.nopcommerce.com/login?returnUrl=%2F%22";
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        // launch url
        driver.get(baseurl);
        // Get the title of the page
      //  String title=driver.getTitle(); one way to get title
      //  System.out.println(title);
        System.out.println("The title of the page is :"+driver.getTitle());

        // curunt url
        System.out.println("Curunt url is:"+driver.getCurrentUrl());
        // print the page source
        System.out.println("The source of the page :"+driver.getPageSource());
        // email field to enter
        WebElement emailfield=driver.findElement(By.name("Email"));
        emailfield.sendKeys("prime123@gmail.com");
        //Enter pasword to password key
        WebElement passwordkey=driver.findElement(By.name("Password"));
        passwordkey.sendKeys("Prime123");



      // close browser
      driver.close();;

    }









}
