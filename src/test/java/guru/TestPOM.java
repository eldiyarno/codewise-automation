package guru;

import org.junit.Test;
import pages.GuruHomePage;
import utilities.AppFlow;
import utilities.Config;
import utilities.Driver;

public class TestPOM {

    @Test
    public void menuTest(){
        Driver.getDriver().get(Config.getValue("guruUrl"));
        GuruHomePage guruHomePage = new GuruHomePage();
        guruHomePage.agileProjectLink.click();
        AppFlow.pause(1000);
        guruHomePage.bankProjectLink.click();
        AppFlow.pause(1000);
        guruHomePage.buttonLogin.click();
        AppFlow.pause(1000);
        guruHomePage.telecomProjectLink.click();
    }
}
