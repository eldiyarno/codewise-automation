package tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alertss {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://artoftesting.com/samplesiteforselenium");
        driver.manage().window().maximize();
        WebElement click = driver.findElement(By.xpath("//button[.='Generate Alert Box']"));
        click.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        Thread.sleep(1000);





    }
}
