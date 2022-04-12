package browsertesting;
/*   Setup chrome browser
2. Open URL
3. Print the title of the page
4. Print the current url
5. Print the page source
6. Enter the email to email field
7. Enter the password to password field*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTest {
    public static void main(String[]args){
       // select url
       String baseUrl="https://demo.nopcommerce.com/login?returnUrl=%2F%22";
       // set the property provide key and value
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe" );
        // launch URL
        WebDriver driver=new ChromeDriver();
        // get the titile of the page
        String title=driver.getTitle();
        System.out.println(title);
        // get currunt URL
       String currunturl= driver.getCurrentUrl();
        System.out.println("The currunt URL: "+currunturl);
        // print the pagesource
        driver.getPageSource();
        System.out.println("The page source is :"+driver.getPageSource());
       // Enter to email to emailfield
        WebElement emailField =driver.findElement(By.name("Email"));// find id in string element
        emailField.sendKeys("prime123@gmail.com");
        // Enter password in password field
        WebElement passwordfield= driver.findElement(By.name("Password"));// find id in string element
        passwordfield.sendKeys("Prime123");










        // close the browser

        driver.close();






    }



 /*   Setup chrome browser
2. Open URL
3. Print the title of the page
4. Print the current url
5. Print the page source
6. Enter the email to email field
7. Enter the password to password field*/




}
