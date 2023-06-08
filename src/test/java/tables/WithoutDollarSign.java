package tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WithoutDollarSign {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://blazedemo.com/reserve.php");
        List <WebElement> prices = driver.findElements(By.xpath("//tbody/tr/td[6]"));
        for (WebElement element : prices){
            System.out.println(element.getText().replace("$",""));
        }
        }
    }

