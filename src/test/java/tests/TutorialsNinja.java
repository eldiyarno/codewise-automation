package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TutorialsNinja {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/");
        driver.findElement(By.className("caret")).click();
        driver.findElement(By.xpath("//a[.='Register']")).click();
        driver.findElement(By.id("input-firstname")).sendKeys("Domingo");
        driver.findElement(By.name("lastname")).sendKeys("Kongo");
        driver.findElement(By.name("email")).sendKeys("Domingo@domingo1.com");
        driver.findElement(By.name("telephone")).sendKeys("132457688");
        driver.findElement(By.name("password")).sendKeys("1232455E");
        driver.findElement(By.name("confirm")).sendKeys("1232455E");
        driver.findElement(By.name("agree")).click();
        driver.findElement(By.xpath("//input[@type = 'submit']")).click();



        List<WebElement> elements = driver.findElements(By.xpath("//ul [@class = 'nav navbar-nav']/li"));
        for (WebElement element : elements){
            System.out.println(element.getText());
        }

        List <WebElement> elements1 = driver.findElements(By.xpath("//ul[@class = 'dropdown-menu']/li"));
        for (WebElement element: elements){
            System.out.println(element.getText());
        }




    }
}
