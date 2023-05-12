package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPositive {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://saucedemo.com");
        driver.manage().window().maximize();
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
       WebElement login =  driver.findElement(By.id("login-button"));
       login.click();
       driver.getCurrentUrl();

       if (driver.getCurrentUrl().equals("https://www.saucedemo.com/inventory.html")){
           System.out.println("Test is passed");
       }else {
           System.out.println("Test is failed");
       }
       driver.findElement(By.id("item_4_title_link")).click();
       driver.navigate().back();

       driver.findElement(By.id("item_0_title_link")).click();
       driver.navigate().back();
       driver.findElement(By.id("item_1_title_link")).click();


       driver.navigate().back();
       driver.findElement(By.id("item_5_title_link")).click();
       driver.navigate().back();

       driver.findElement(By.id("item_2_title_link")).click();
       driver.navigate().back();

       driver.findElement(By.id("item_3_title_link")).click();


    }
}
