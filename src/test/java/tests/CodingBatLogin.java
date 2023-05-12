package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CodingBatLogin {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://codingbat.com/java");
        driver.manage().window().maximize();
        driver.findElement(By.name("uname")).sendKeys("eldiyarnoe@gmail.com");
        driver.findElement(By.name("pw")).sendKeys("E547858e");
        driver.findElement(By.name("dologin")).click();
        driver.findElement(By.xpath("//span [@class = 'h2']")).click();
        driver.findElement(By.xpath("//a [.='sleepIn']")).click();
        driver.findElement(By.className("go")).click();

    }
}
