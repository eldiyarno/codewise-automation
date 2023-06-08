package switchTo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class SwitchPractice {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.letskodeit.com");
        driver.findElement(By.className("dynamic-link")).click();
        String mainWindowId = driver.getWindowHandle();
        Set<String> windowHandles =  driver.getWindowHandles();
        for (String id : windowHandles){
            if (!id.equals(mainWindowId)){
                driver.switchTo().window(id);
                break;
            }
        }

        driver.findElement(By.id("opentab")).click();
        String secondPage = driver.getWindowHandle();
        Set <String> windowHandles1 = driver.getWindowHandles();
        for (String id : windowHandles1){
            if (!id.equals(mainWindowId)&&!id.equals(secondPage)){
                driver.switchTo().window(id);
                break;
            }
        }
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
    }
}
