package timeOuts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class HerokuApp {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("http://the-internet.herokuapp.com/dynamic_loading/2");
        driver.findElement(By.xpath("//button[.= 'Start']")).click();

        WebElement message = driver.findElement(By.xpath("//h4[. = 'Hello World!']"));

        System.out.println(message.getText());

    }
}
