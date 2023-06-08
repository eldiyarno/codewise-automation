package guru;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.AppFlow;
import utilities.Config;
import utilities.Driver;

import java.io.IOException;

public class GuruBankLogin {
    public static void main(String[] args) throws IOException {
        Driver.getDriver().get(Config.getValue("guruBankUrl"));
        Driver.getDriver().findElement(By.linkText("Generate Card Number")).click();
        AppFlow.switchToSecondWindow();
        WebElement cardNumber = Driver.getDriver().findElement(By.xpath("//h4[1]"));
        WebElement cvv = Driver.getDriver().findElement(By.xpath("//h4[2]"));

        WebElement  creditLimit = Driver.getDriver().findElement(By.xpath("//h4[4]"));
        String cardString = cardNumber.getText().substring(14);


        System.out.println(cardString.length());

        if (cardString.length()==16){
            System.out.println("Credit card is valid");
        }else {
            System.out.println("Credit card is not valid");
        }

        String cvvString = cvv.getText().substring(6);
        if (cvvString.length()==3){
            System.out.println("CVV is valid");
        }else {
            System.out.println("CVV is not valid");
        }

        String creditLimitString = creditLimit.getText().substring(13).trim();
        if (creditLimitString.equals("$100.00")){
            System.out.println("Credit limit passed");
        }else {
            System.out.println("Credit limit is not passed");
        }

        Driver.quit();



    }
}
