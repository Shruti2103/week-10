package browsertesting;

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
public class EdgeOrange {
    public static void main(String[] args) {
       // select url
        String mainurl="https://opensource-demo.orangehrmlive.com/";
        System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
        WebDriver orange=new EdgeDriver();
       // launch url
        orange.get(mainurl);
        //print title of the page
        System.out.println("The title of the page is:"+orange.getTitle());
        // Print the page source
        String page=orange.getPageSource();
        System.out.println("The page source is: "+page);
        //print emailid
        WebElement emailid= orange.findElement(By.id("txtUsername"));
        emailid.sendKeys("Prime123@gmail.com");
        WebElement passwordfield=orange.findElement(By.id("txtPassword"));
        passwordfield.sendKeys("prime123");
        // close the browser
        orange.close();














    }







}
