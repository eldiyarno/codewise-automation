package guru;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.GuruHomePage;
import pages.GuruLoginPage;
import utilities.AppFlow;
import utilities.Config;
import utilities.Driver;

public class LoginGurua {
    GuruLoginPage guruLoginPage = new GuruLoginPage();
    GuruHomePage guruHomePage = new GuruHomePage();
    @Test
    public void Login() {
        Driver.getDriver().get(Config.getValue("guruUrl"));
        Driver.getDriver().findElement(By.linkText("Agile Project")).click();
        WebElement login = Driver.getDriver().findElement(By.xpath("(//ol/li)[1]"));
        WebElement password = Driver.getDriver().findElement(By.xpath("(//ol/li)[2]"));
        String loginString = login.getText().substring(9);
        String passwordStr = password.getText().substring(11);
        Driver.getDriver().findElement(By.xpath("//input[@type = 'text']")).sendKeys(loginString);
        Driver.getDriver().findElement(By.xpath("//input[@type = 'password']")).sendKeys(passwordStr + Keys.ENTER);
        AppFlow.pause(500);
        String resultUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals("https://demo.guru99.com/Agile_Project/Agi_V1/customer/Customerhomepage.php",resultUrl);


    }
    @Test public void LogOut() {
        Driver.getDriver().get(Config.getValue("guruUrl"));
        Driver.getDriver().findElement(By.linkText("Agile Project")).click();
        WebElement login = Driver.getDriver().findElement(By.xpath("(//ol/li)[1]"));
        WebElement password = Driver.getDriver().findElement(By.xpath("(//ol/li)[2]"));
        String loginString = login.getText().substring(9);
        String passwordStr = password.getText().substring(11);
        Driver.getDriver().findElement(By.xpath("//input[@type = 'text']")).sendKeys(loginString);
        Driver.getDriver().findElement(By.xpath("//input[@type = 'password']")).sendKeys(passwordStr + Keys.ENTER);
        AppFlow.pause(500);
        String resultUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals("https://demo.guru99.com/Agile_Project/Agi_V1/customer/Customerhomepage.php",resultUrl);
        Driver.getDriver().findElement(By.linkText("Log out")).click();
        Alert alert = Driver.getDriver().switchTo().alert();
        String expectedAlert = "You Have Succesfully Logged Out!!";
        Assert.assertEquals("LogOut alert message failed",expectedAlert, alert.getText());
        alert.accept();
        String expectedUrlLog = "https://demo.guru99.com/Agile_Project/Agi_V1/index.php";
        Assert.assertEquals("LogOut Failed",expectedUrlLog,Driver.getDriver().getCurrentUrl());

    }
    @Test
    public void pomTest(){
        Driver.getDriver().get(Config.getValue("guruUrl"));
        guruHomePage.agileProjectLink.click();
        String strUserID =guruLoginPage.userID.getText().substring(9);
        String strPassword = guruLoginPage.password.getText().substring(11);
        guruLoginPage.userIDInput.sendKeys(strUserID);
        guruLoginPage.passwordInput.sendKeys(strPassword);
        guruLoginPage.buttonLogin.click();
        String expectedResultUrl = "https://demo.guru99.com/Agile_Project/Agi_V1/customer/Customerhomepage.php";
        Assert.assertEquals(expectedResultUrl,Driver.getDriver().getCurrentUrl());

    }

    @Test
    public void logoutPom(){
        Driver.getDriver().get(Config.getValue("guruUrl"));
        guruHomePage.agileProjectLink.click();
        String strUserID =guruLoginPage.userID.getText().substring(9);
        String strPassword = guruLoginPage.password.getText().substring(11);
        guruLoginPage.login(strUserID,strPassword);
        guruLoginPage.logOut.click();
       Alert alert = Driver.getDriver().switchTo().alert();
        String expectedAlert = "You Have Succesfully Logged Out!!";
        Assert.assertEquals("LogOut alert message failed",expectedAlert, alert.getText());
        alert.accept();


    }
    @After
    public void quit(){
        Driver.quit();
    }
}
