package browsertesting;

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
public class ChromeOrange {
    public static void main(String[] args) {
        // get url
        String baseurl = "https://opensource-demo.orangehrmlive.com/";
        // set property get key value
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(baseurl);
        // Print the title
        String title = driver.getTitle();
        System.out.println("The title of url is: " + title);
        // print the currunt url
        System.out.println("Currunt url is :" + driver.getCurrentUrl());
        // print the page source
        System.out.println("The page source of url is :" + driver.getPageSource());
        //Enter the email to emailfield
        WebElement emailid = driver.findElement(By.name("txtUsername"));
        emailid.sendKeys("Prime123@gmail.com");
        // Enter the password keys
        WebElement passwordfield = driver.findElement(By.name("txtPassword"));
        passwordfield.sendKeys("Prime123@gmail.com");


        // close the browser
        driver.close();


    }


}
