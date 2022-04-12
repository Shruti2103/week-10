package browsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multibrowser {
    public static void main(String[] args) {
        String baseurl = "https://opensource-demo.orangehrmlive.com/";
        String browser = "Firefox";
        if (browser.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get(baseurl);
        } else if (browser.equalsIgnoreCase("Firefox")) {
            System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
            WebDriver driver = new FirefoxDriver();
            driver.get(baseurl);
        } else if (browser.equalsIgnoreCase("Edge")) {
            System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
            WebDriver driver = new EdgeDriver();
            driver.get(baseurl);
        } else {
            System.out.println("This is wrong code");
        }


    }


}
