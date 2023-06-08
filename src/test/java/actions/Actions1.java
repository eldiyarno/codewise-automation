package actions;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://artoftesting.com/samplesiteforselenium");
        driver.manage().window().maximize();
        Actions actions = new Actions(driver);

        WebElement doubleclick = driver.findElement(By.id("dblClkBtn"));
        actions.doubleClick(doubleclick).perform();




    }
}
