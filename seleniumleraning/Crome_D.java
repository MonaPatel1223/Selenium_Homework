package seleniumleraning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Crome_D {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/monapatel/IdeaProjects/SeleniumLerning/src/test/resources/Driver/chromedriver");
        //WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.nopcommerce.com");
        driver.manage().window().maximize();
        driver.navigate().back();
        driver.navigate().refresh();
        driver.close();

    }
}
