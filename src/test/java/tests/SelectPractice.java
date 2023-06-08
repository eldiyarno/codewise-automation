package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectPractice {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
        WebElement products = driver.findElement(By.className("col-lg-3"));
        Select pr = new Select(products);
        pr.selectByValue("Yahoo");
        List<WebElement> products1 = pr.getOptions();
        if (products1.size()==4){
            System.out.println("Passed");
        }else {
            System.out.println("No");

        }
        WebElement animals = driver.findElement(By.xpath("//select[@id = 'animals']"));
        Select an = new Select(animals);
        an.selectByValue("babycat");
        List<WebElement> ani = an.getOptions();
        if (ani.size()==4){
            System.out.println("Passed");
        }else {
            System.out.println("No");

        }
        WebElement food = driver.findElement(By.className("col-lg-3"));
        Select f1 = new Select(food);
        List<WebElement> f = f1.getOptions();
        for (WebElement food1 : f){
            food1.click();
            System.out.println(food1.isSelected());

        }


    }
}
