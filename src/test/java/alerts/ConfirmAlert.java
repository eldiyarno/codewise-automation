package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmAlert {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://artoftesting.com/samplesiteforselenium");
        driver.manage().window().maximize();
        WebElement confirm = driver.findElement(By.id("demo"));
        driver.findElement(By.xpath("//button[.='Generate Confirm Box']")).click();
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
        System.out.println(confirm.getText());

    }
}
