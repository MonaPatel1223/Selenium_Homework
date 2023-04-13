package seleniumleraning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Safari_D {
    public static void main(String[] args) {
        WebDriverManager.safaridriver().setup();
        WebDriver driver=new SafariDriver();
        driver.get("https://demo.nopcommerce.com");
        driver.manage().window().maximize();
        driver.navigate().refresh();
        //driver.close();
        driver.quit();




    }
}
