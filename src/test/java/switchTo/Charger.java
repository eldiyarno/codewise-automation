package switchTo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Charger {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.letskodeit.com/practice");
        String mainWindowId = driver.getWindowHandle();
        driver.findElement(By.id("opentab")).click();
        Set<String> windowHandles =  driver.getWindowHandles();
        List<String> IDs = new ArrayList<>(windowHandles);
        driver.switchTo().window(IDs.get(1));
        System.out.println(driver.getCurrentUrl());
    }
}
