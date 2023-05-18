package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://artoftesting.com/samplesiteforselenium");
        driver.manage().window().maximize();
        WebElement male = driver.findElement(By.id("male"));
        WebElement checkbox = driver.findElement(By.className("Automation"));
        System.out.println(male.isSelected());
        male.click();
        System.out.println(male.isSelected());
        System.out.println(checkbox.isSelected());
        checkbox.click();
        System.out.println(checkbox.isSelected());

        WebElement female = driver.findElement(By.id("female"));
        female.click();
        System.out.println(male.isSelected()+"===="+!female.isSelected());
        System.out.println(male.getAttribute("id"));


    }
}
