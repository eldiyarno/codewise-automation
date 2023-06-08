package switchTo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.AppFlow;

import java.util.Set;

public class Screen {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.switchTo().newWindow(WindowType.TAB).get("https://www.letskodeit.com/");
        driver.switchTo().newWindow(WindowType.TAB).get("https://www.etsy.com/");
        driver.switchTo().newWindow(WindowType.TAB).get("https://www.facebook.com/");
        driver.switchTo().newWindow(WindowType.TAB).get("https://www.instagram.com/");
        Set<String> handles = driver.getWindowHandles();



        for (String id : handles){
            driver.switchTo().window(id);
            String title = driver.getTitle();
            if (title.contains("Etsy")){
                break;
            }
        }


        System.out.println(driver.getCurrentUrl());
    }
}
