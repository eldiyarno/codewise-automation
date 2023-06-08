package tests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionPractice {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.wikipedia.org/");
        driver.findElement(By.xpath("//input[@id = 'searchInput']")).sendKeys("Muhammed Ali"+ Keys.ENTER);
        Actions actions = new Actions(driver);
         actions.keyDown(Keys.CONTROL).sendKeys("a","c").keyUp(Keys.CONTROL).perform();
         driver.get("https://wordcounter.net/");
         driver.findElement(By.xpath("//textarea[@class='form-control table-data finalResult textarea_revision processed']")).click();
         actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();

    }
}
