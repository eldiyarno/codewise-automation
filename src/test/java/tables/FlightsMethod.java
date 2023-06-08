package tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.ArrayList;
import java.util.List;

public class FlightsMethod {


   public static WebDriver driver;

  public static List <WebElement> empty;
    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("https://blazedemo.com/reserve.php");
        List <WebElement> prices = driver.findElements(By.xpath("//tbody/tr/td[6]"));
        for (WebElement element : priceRange(200,400)){
            System.out.println(element.getText());

        }

      flightInfo(43);
printFlightInfo("12");
    }
    public static List<WebElement> priceRange (double priceFrom, double priceTo){
        List <WebElement> result = new ArrayList<>();
        List <WebElement> prices = driver.findElements(By.xpath("//tbody/tr/td[6]"));
        for (WebElement element : prices){
            String el = element.getText().replace("$","");
            double priceD = Double.parseDouble(el);
            if (priceD>= priceFrom &&priceD<=priceTo){
                String xpath = "//tbody/tr//td[.='$"+priceD + "']/../td[2]";
                WebElement flight = driver.findElement(By.xpath(xpath));
                result.add(flight);

            }
        }return result;
    }

    public static void flightInfo (int flightNumber){
        List <WebElement> prices = driver.findElements(By.xpath("//tbody/tr/td[2]"));
        for (WebElement element: prices){
            String s = element.getText();
            int q = Integer.parseInt(s);
            if (q==flightNumber){
                String xpath = "//tbody/tr/td[2]/..";
                WebElement flight = driver.findElement(By.xpath(xpath));
                System.out.println(flight.getText());
            }
        }

    }
    public static void printFlightInfo(String flightNumber){
        String xpathAirline = "//tbody/tr/td[.='"+ flightNumber + "']/../td[3]";
        String xpathDeparture = "//tbody/tr/td[.='"+ flightNumber + "']/../td[4]";
        String xpathArrival = "//tbody/tr/td[.='"+ flightNumber + "']/../td[5]";
        String xpathPrice = "//tbody/tr/td[.='"+ flightNumber + "']/../td[6]";
        System.out.println("Flight Info for: " + flightNumber);
        String airline = driver.findElement(By.xpath(xpathAirline)).getText();
        String departure = driver.findElement(By.xpath(xpathDeparture)).getText();
        String arrival = driver.findElement(By.xpath(xpathArrival)).getText();
        String price = driver.findElement(By.xpath(xpathPrice)).getText();

        System.out.println("Airline: " + airline);
        System.out.println("Departure: " + departure);
        System.out.println("Arrival: " + arrival);
        System.out.println("Price: " + price);
    }
}
