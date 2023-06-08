package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Dropdown {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://artoftesting.com/samplesiteforselenium");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.id("testingDropdown"));
        Select dropdown = new Select(element);
        String actualDefaultOption = dropdown.getFirstSelectedOption().getText();
        String expectedDefaultOption = "Automation Testing";
        if (expectedDefaultOption.equals(actualDefaultOption)){
            System.out.println("Default option passed\n");
        }else {
            System.out.println("Default option failed\n");
        }

        List <WebElement> dropdowns = dropdown.getOptions();
        for (WebElement element1 : dropdowns){
            System.out.println(element1.getText());
        }

        dropdown.selectByVisibleText("Manual Testing");
        driver.findElement(By.id("male")).click();
        driver.findElement(By.className("Automation")).click();

    }
}
