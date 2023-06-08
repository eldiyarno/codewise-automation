package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enter {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.manage().window().maximize();

        driver.findElement(By.name("q")).sendKeys("Selenium" + Keys.ENTER);
    }
}
