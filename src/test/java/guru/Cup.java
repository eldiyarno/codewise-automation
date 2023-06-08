package guru;

import org.openqa.selenium.By;
import utilities.AppFlow;
import utilities.Driver;

public class Cup {
    public static void main(String[] args) {
        Driver.getDriver().get("https://www.letskodeit.com");
        Driver.getDriver().findElement(By.linkText("PRACTICE")).click();
        AppFlow.switchToSecondWindow();
        System.out.println(Driver.getDriver().getTitle());
    }
}
