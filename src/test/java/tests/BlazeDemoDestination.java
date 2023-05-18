package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BlazeDemoDestination {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://blazedemo.com/");
        WebElement element = driver.findElement(By.xpath("//select [@name = 'toPort']"));
        Select destination = new Select(element);
        destination.selectByVisibleText("Berlin");
        String expected = "Berlin";
        destination.getFirstSelectedOption().getText();

        if (expected.equals( destination.getFirstSelectedOption().getText())){
            System.out.println("pass");

        }else {
            System.out.println("No");
        }
    }
}
