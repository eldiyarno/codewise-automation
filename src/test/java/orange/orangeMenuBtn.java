package orange;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import pages.OrangeHRMLoginPage;
import utilities.AppFlow;
import utilities.Config;
import utilities.Driver;

public class orangeMenuBtn {
    OrangeHRMLoginPage orangeHRMLoginPage =new OrangeHRMLoginPage();
    @Test
    public void menuBtn(){
        Driver.getDriver().get(Config.getValue("orangeUrl"));
        orangeHRMLoginPage.usernameInput.sendKeys(Config.getValue("usernameOrange"));
        orangeHRMLoginPage.passwordInput.sendKeys(Config.getValue("passwordOrange"));
        orangeHRMLoginPage.loginBtn.click();

        for (int i = 0; i<orangeHRMLoginPage.menuBtn.size(); i++){
            String maintenance = Driver.getDriver().getCurrentUrl();
            orangeHRMLoginPage.menuBtn.get(i).click();
            Assert.assertNotSame(Driver.getDriver().getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
        }

    }
    @After
    public void quit(){
        Driver.quit();
    }
}
