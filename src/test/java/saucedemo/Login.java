package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

            driver.get("https://saucedemo.com");
            driver.manage().window().maximize();
            WebElement username = driver.findElement(By.id("user-name"));
            WebElement password = driver.findElement(By.name("password"));
            username.sendKeys("login");
            password.sendKeys("password");
        Thread.sleep(2000);
            driver.findElement(By.id("login-button")).click();


            WebElement errorMessage =driver.findElement(By.tagName("h3"));
            String message = errorMessage.getText();

            String expectedErrorMessage = "Epic sadface: Username and password do not match any user in this service";
            if (expectedErrorMessage.equals(message)){
                System.out.println("Error message passed");
            }else {
                System.out.println("Error message failed");
            }




         }
}
