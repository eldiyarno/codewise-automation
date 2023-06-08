package orange;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import pages.OrangeHRMLoginPage;
import utilities.AppFlow;
import utilities.Config;
import utilities.Driver;

public class OrangeLogin {
    OrangeHRMLoginPage orangeHRMLoginPage =new OrangeHRMLoginPage();
    @Test
    public void happyLogin(){
        Driver.getDriver().get(Config.getValue("orangeUrl"));
        orangeHRMLoginPage.usernameInput.sendKeys(Config.getValue("usernameOrange"));
        orangeHRMLoginPage.passwordInput.sendKeys(Config.getValue("passwordOrange"));
        orangeHRMLoginPage.loginBtn.click();
        String expectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
        Assert.assertEquals(expectedUrl,Driver.getDriver().getCurrentUrl());
    }

    @Test
    public void negativeNoUsernameLogin() {
        Driver.getDriver().get(Config.getValue("orangeUrl"));



        try {
            orangeHRMLoginPage.passwordInput.sendKeys(Config.getValue("passwordOrange"));
            orangeHRMLoginPage.loginBtn.click();
            Assert.assertTrue(orangeHRMLoginPage.requiredTextUsername.isDisplayed());
        }catch (Exception e){
            System.out.println("There is no text Required ");
            Assert.fail();
        }


    }
    @Test
    public void negativeNoPassword() {
        Driver.getDriver().get(Config.getValue("orangeUrl"));

        try {
            orangeHRMLoginPage.usernameInput.sendKeys(Config.getValue("passwordOrange"));
            orangeHRMLoginPage.loginBtn.click();
            Assert.assertTrue(orangeHRMLoginPage.requiredTextPassword.isDisplayed());
        }catch (Exception e){
            System.out.println("There is no text Required ");
            Assert.fail();
        }

    }
    @Test
    public void negativeNoCredentials() {
        Driver.getDriver().get(Config.getValue("orangeUrl"));
        orangeHRMLoginPage.loginBtn.click();
        Assert.assertTrue(orangeHRMLoginPage.requiredTextUsername.isDisplayed());
        Assert.assertTrue(orangeHRMLoginPage.requiredTextPassword.isDisplayed());
    }


    @After
    public void quit(){
        Driver.quit();
    }
}
