package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CashWise {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://cashwise.us");
        String cashWiseTitle = "CashWise is the best";
        if (cashWiseTitle.equals(driver.getTitle())){
            System.out.println("Title test passed");
        }else {
            System.out.println("Title test failed");
        }
        String cashwise = "https://cashwise.us/home";
        if(cashwise.equals(driver.getCurrentUrl())){
            System.out.println("URL Test passed");
        }else {
            System.out.println("URL Test failed");
        }

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());
        driver.manage().window().maximize();
        
    }
}
