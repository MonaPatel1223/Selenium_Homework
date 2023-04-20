package seleniumleraning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register_Demo {



    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");


        //Register Functionality
        driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"gender\"]/span[2]/label")).click();

        driver.findElement(By.name("FirstName")).sendKeys("Mona");
        driver.findElement(By.name("LastName")).sendKeys("Patel");

        driver.findElement(By.name("DateOfBirthDay")).sendKeys("26");
        driver.findElement(By.name("DateOfBirthMonth")).sendKeys("May");
        driver.findElement(By.name("DateOfBirthYear")).sendKeys("1996");

        driver.findElement(By.id("Email")).sendKeys("dhavalpatel1223.dp@gmail.com");
        driver.findElement(By.cssSelector("input[id='Company']")).sendKeys("Unify testing Company");
        Thread.sleep(2000);

        driver.findElement(By.id("Password")).sendKeys("Monapatel@123");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Monapatel@123");

        driver.findElement(By.id("register-button")).click();

        //Login Functionality

        driver.findElement(By.xpath("//a[text()='Log in']")).click();
        driver.findElement(By.id("Email")).sendKeys("Dhavalpatel1223.dp@gmail.com");
        driver.findElement(By.name("Password")).sendKeys("Monapatel@123");
        driver.findElement(By.xpath("//button[@class='button-1 login-button']")).click();

        driver.findElement(By.xpath("//a[text()='Log out']")).click();//Logout

        Thread.sleep(2000);

        driver.close();

    }
}
