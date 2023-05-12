package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WarmUp {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        WebElement login =  driver.findElement(By.id("login-button"));
        login.click();
       WebElement element = driver.findElement(By.xpath("//button[@class = 'btn btn_primary btn_small btn_inventory']"));
       element.click();
      WebElement button = driver.findElement(By.xpath("(//div[@class = 'pricebar'])[1]/button"));
        System.out.println(button.getText());
        if (button.getText().equals("Remove")){
            System.out.println("Test is passed");
        }else {
            System.out.println("Test is not passed");
        }
    }

}
