package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SAd {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        m1(driver);
    }
    public static void m1 (WebDriver driver) throws InterruptedException {
        driver.get("https://magento.softwaretestingboard.com");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//span[.='Men']")).click();
        driver.findElement(By.xpath("(//span[.='Shop Tees'])[2]")).click();
        List<WebElement> teesList= driver.findElements(By.xpath("//img[@class='product-image-photo']"));
        int counter=0;
        List <WebElement> pricesList=driver.findElements(By.xpath("//span[@class='price-container price-final_price tax weee']"));
        for ( int i=0; i<pricesList.size(); i++) {
            pricesList=driver.findElements(By.xpath("//span[@class='price-container price-final_price tax weee']"));
            int p = Integer.parseInt(pricesList.get(i).getText().substring(11, 13));
            if (p >= 30) {
                teesList.get(i).click();
                Thread.sleep(1000);
                driver.findElement(By.xpath("//div[@id='option-label-size-143-item-166']")).click();
                driver.findElement(By.xpath("//div[@id='option-label-color-93-item-49']")).click();
                driver.findElement(By.xpath("//span[.='Add to Cart']")).click();
                counter++;
                driver.navigate().back();
                Thread.sleep(1000);
                driver.navigate().refresh();
                teesList = driver.findElements(By.xpath("//img[@class='product-image-photo']"));
            }
        }
        System.out.println(counter);
        int cart= Integer.parseInt(driver.findElement(By.xpath("//span[@class='counter-number']")).getText());
        Thread.sleep(3000);
        if (counter==cart){
            System.out.println("Passed");
        }else {
            System.out.println("Failed");
        }
    }
}
