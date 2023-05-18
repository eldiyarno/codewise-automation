package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class BlazeDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://blazedemo.com/");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.xpath("//select [@name = 'fromPort']"));
        System.out.println(element.getText());
        WebElement element1 = driver.findElement(By.xpath("//select [@name = 'toPort']"));
        System.out.println(element1.getText());
        Select departureCities = new Select(element);
        Select destinationCities = new Select(element1);
        System.out.println(departureCities.getFirstSelectedOption().getText());
        System.out.println(destinationCities.getFirstSelectedOption().getText());
        departureCities.getOptions();
        List <WebElement> departureCitiesElements = departureCities.getOptions();
        List <String> expectedDeparture = new ArrayList<>();
        expectedDeparture.add("Paris");
        expectedDeparture.add("Philadelphia");
        expectedDeparture.add("Boston");
        expectedDeparture.add("Portland");
        expectedDeparture.add("San Diego");
        expectedDeparture.add("Mexico City");
        expectedDeparture.add("São Paolo");
        if (departureCitiesElements.size() == expectedDeparture.size()){
            System.out.println("Departure city options size passed");
        }else {
            System.out.println("Not passed");
        }
        for (WebElement webElement : departureCitiesElements){

          if (expectedDeparture.contains(webElement.getText())){
              System.out.println("Pass");
          }else {
              System.out.println("Not passed");
          }

            }
        departureCities.selectByVisibleText("Boston");
        Thread.sleep(500);
        departureCities.selectByVisibleText("San Diego");

        }


    }

