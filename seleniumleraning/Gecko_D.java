package seleniumleraning;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gecko_D {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","/Users/monapatel/IdeaProjects/SeleniumLerning/src/test/resources/Driver/geckodriver");
        //WebDriverManager.firefoxdriver().setup();
        // Create instance of  Web driver
        WebDriver driver = new FirefoxDriver();
        //Open a URL
        driver.get("https://demo.nopcommerce.com");
        driver.manage().window().maximize();
        driver.getCurrentUrl();
        System.out.println("Current Url:"+driver.getCurrentUrl());
        //Close the Website

        driver.navigate().refresh();
        driver.navigate().forward();
        driver.close();
       // driver.quit();
    }


}
