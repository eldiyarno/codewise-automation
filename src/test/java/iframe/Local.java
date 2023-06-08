package iframe;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Local {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("file:///C:/Users/Eldiyar/Desktop/iFrame.html");


        List<WebElement> texts = driver.findElements(By.xpath("//h1"));
        WebElement secondFrame = driver.findElement(By.xpath("//iframe[2]"));
        driver.switchTo().frame(secondFrame);

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        driver.switchTo().defaultContent();
        WebElement thirdFrame = driver.findElement(By.xpath("//iframe[3]"));



        driver.switchTo().parentFrame();
        driver.switchTo().frame(thirdFrame);
        driver.findElement(By.id("confirmbtn")).click();

        Alert alert = driver.switchTo().alert();
        alert.accept();

        Actions actions = new Actions(driver);
        List<WebElement> menuList = driver.findElements(By.xpath("//ul[@class = 'nav navbar-nav pull-center dynamic_menu_texts']/li"));
        for (WebElement menu : menuList){
            actions.moveToElement(menu).perform();
            Thread.sleep(800);
        }

    }
}
