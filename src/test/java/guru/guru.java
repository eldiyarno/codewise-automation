package guru;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import utilities.AppFlow;

import java.time.Duration;

public class guru {
    public static void main(String[] args) {
        Faker faker = new Faker();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://demo.guru99.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(12));
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys(faker.internet().emailAddress() + Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
        WebElement userID = driver.findElement(By.xpath("(//td[@class='accpage'])[1]/../td[2]"));
       WebElement password = driver.findElement(By.xpath("(//td[@class='accpage'])[2]/../td[2]"));
       String userIdString = userID.getText();
       String passwordString = password.getText();
       driver.findElement(By.linkText("Bank Project")).click();
       driver.findElement(By.name("uid")).sendKeys(userIdString);
       driver.findElement(By.name("password")).sendKeys(passwordString);
       driver.findElement(By.name("btnLogin")).click();
        String expectedURL = "https://demo.guru99.com/V1/html/Managerhomepage.php";
        AppFlow.pause(1000);
        if (expectedURL.equals(driver.getCurrentUrl())){
            System.out.println("Bank login is Passed");
        }else {
            System.out.println("Bank login is Not passed");
        }
        driver.quit();


    }
}
