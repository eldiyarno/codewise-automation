package tests;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Down {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/upload");


        driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\Eldiyar\\Downloads\\foto2.png");
        driver.findElement(By.id("file-submit")).click();
    }
}
