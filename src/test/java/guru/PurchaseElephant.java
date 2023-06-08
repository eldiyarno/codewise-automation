package guru;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.AppFlow;
import utilities.Config;
import utilities.Driver;

public class PurchaseElephant {
    @Before
    public void testSetup(){
        Driver.getDriver().get(Config.getValue("guruBankUrl"));
        
    }
    @Test
    public void elephantBuy (){

        Driver.getDriver().findElement(By.xpath("//input[@type = 'submit']")).click();
        String credit = "4368420257103265";
        String cvv = "658";
        Driver.getDriver().findElement(By.name("card_nmuber")).sendKeys(credit);
        WebElement dropDownMonth = Driver.getDriver().findElement(By.id("month"));
        Select expMonth = new Select(dropDownMonth);
        expMonth.selectByVisibleText("02");
        WebElement dropDownYear = Driver.getDriver().findElement(By.id("year"));
        Select expYear = new Select(dropDownYear);
        expYear.selectByVisibleText("2027");
        Driver.getDriver().findElement(By.id("cvv_code")).sendKeys(cvv);
       Driver.getDriver().findElement(By.xpath("//input[@type = 'submit']")).click();
       String result =  Driver.getDriver().findElement(By.xpath("//h2[.='Payment successfull!']")).getText();
        Assert.assertEquals("Payment successfull!",result);
        Driver.quit();
    }

    @Test
    public void creditLimitTest (){


        String credit = "4967888553138919";
        String cvv = "613";
        Driver.getDriver().findElement(By.linkText("Check Credit Card Limit")).click();
        Driver.getDriver().findElement(By.id("card_nmuber")).sendKeys(credit+ Keys.ENTER);
        String balance = Driver.getDriver().findElement(By.xpath("//h4/span")).getText();
        int balanceInt = Integer.parseInt(balance);
        Driver.getDriver().findElement(By.linkText("Cart")).click();

        Driver.getDriver().findElement(By.xpath("//input[@type = 'submit']")).click();
        AppFlow.pause(1000);
        Driver.getDriver().findElement(By.name("card_nmuber")).sendKeys(credit);
        WebElement dropDownMonth = Driver.getDriver().findElement(By.id("month"));
        Select expMonth = new Select(dropDownMonth);
        expMonth.selectByVisibleText("08");
        WebElement dropDownYear = Driver.getDriver().findElement(By.id("year"));
        Select expYear = new Select(dropDownYear);
        expYear.selectByVisibleText("2026");
        Driver.getDriver().findElement(By.id("cvv_code")).sendKeys(cvv);
        Driver.getDriver().findElement(By.xpath("//input[@type = 'submit']")).click();


        Driver.getDriver().findElement(By.linkText("Check Credit Card Limit")).click();
        Driver.getDriver().findElement(By.id("card_nmuber")).sendKeys(credit+ Keys.ENTER);
        String balanceAfter = Driver.getDriver().findElement(By.xpath("//h4/span")).getText();
        int afterBalanceInt = Integer.parseInt(balanceAfter);
        AppFlow.pause(1000);
        Assert.assertEquals(afterBalanceInt, (balanceInt-20));


    }
    @After
    public void quit(){
        Driver.quit();
    }
}
