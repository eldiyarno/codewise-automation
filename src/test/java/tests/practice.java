package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://blazedemo.com");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("destination of the week! The Beach!")).click();
        WebElement text = driver.findElement(By.xpath("(//div[@class='container'])[2]"));
        text.getText();
        String expected = "Hawaii !";
        if (text.getText().contains(expected)){
            System.out.println("Test is passed");
        }else {
            System.out.println("Test is failed");
        }
        System.out.println(text.getText());

    }


}
