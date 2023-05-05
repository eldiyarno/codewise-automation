package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        String expectedGoogleTitle = "Hi, google";
        if (expectedGoogleTitle.equals(driver.getTitle())){
            System.out.println("Google title test is passed");
        }else {
            System.out.println("Google title test is failed");
        }

        String expectedAmazonTitle = "Hey, Amazon";
        driver.navigate().to("https://amazon.com");
        if (expectedAmazonTitle.equals(driver.getTitle())){
            System.out.println("Amazon title test is passed");
        }else {
            System.out.println("Amazon title test is passed");
        }

        driver.navigate().back();
        driver.navigate().refresh();
        driver.close();





    }
}
