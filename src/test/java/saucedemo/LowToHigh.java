package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class LowToHigh {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://saucedemo.com");
        driver.manage().window().maximize();
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        WebElement login =  driver.findElement(By.id("login-button"));
        login.click();
        WebElement element = driver.findElement(By.className("product_sort_container"));
        element.click();
        Select lowToHigh = new Select(element);
        lowToHigh.selectByValue("lohi");
        List <WebElement> prices = driver.findElements(By.className("inventory_item_price"));

       for (int i =0; i<prices.size(); i++){
            String tempPrice = prices.get(i).getText().replace("$","");
            double priceDouble = Double.parseDouble(tempPrice);
           String tempPriceNext = prices.get(i+1).getText().replace("$","");
           double priceDoubleNext = Double.parseDouble(tempPriceNext);
           if (priceDoubleNext<=priceDoubleNext){
               System.out.println("Sorting low to high passed");
           }else {
               System.out.println("Sorting is failed");
           }
            }


    }

}
