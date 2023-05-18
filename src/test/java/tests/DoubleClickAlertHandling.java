package tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class DoubleClickAlertHandling {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://artoftesting.com/samplesiteforselenium");
        driver.manage().window().maximize();
        WebElement dblclick = driver.findElement(By.id("dblClkBtn"));
        String expectedMsg = "Welcome to Art of Testing!";
        Actions actions = new Actions(driver);
        actions.doubleClick(dblclick).perform();
        Alert alert =driver.switchTo().alert();

        if (expectedMsg.equals(alert.getText())){
            System.out.println("Passed");
        }else {
            System.out.println("Failed");
        }
        alert.accept();
    }
}
