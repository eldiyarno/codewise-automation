package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drop {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://artoftesting.com/samplesiteforselenium");
        driver.manage().window().maximize();
        Actions actions = new Actions(driver);
        WebElement clickAndHold1 = driver.findElement(By.xpath("//a[.='Selenium Sample Script']"));
        WebElement text = driver.findElement(By.id("fname"));

        actions.clickAndHold(clickAndHold1).perform();
        Thread.sleep(1000);

    }
}
