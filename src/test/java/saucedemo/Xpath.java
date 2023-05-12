package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Xpath {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.xpath("//input[@class='input_error form_input']")).sendKeys("problem_user");
        driver.findElement(By.xpath("(//input[@class='input_error form_input'])[2]")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("(//input[@class='submit-button btn_action'])")).click();

        List<WebElement> elements = driver.findElements(By.xpath("//button[.='Add to cart']"));
        for (WebElement element : elements){
            element.click();

        }
        driver.findElement(By.xpath("//a[@class = 'shopping_cart_link']")).click();
        if (driver.findElements(By.xpath("//div[@class = 'cart_item']")).size()==elements.size()){
            System.out.println("Pass");
        }else {
            System.out.println("No");
        }

    }
}
