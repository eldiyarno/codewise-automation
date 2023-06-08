package guru;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FakeData {
    public static void main(String[] args) {
        Faker faker = new Faker();
        System.out.println(faker.leagueOfLegends().rank());
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/");
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys(faker.internet().emailAddress() + Keys.ENTER);
        System.out.println(driver.findElement(By.xpath("(//tbody)[2]")).getText());


    }
}
