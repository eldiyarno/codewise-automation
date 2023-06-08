package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GuruLoginPage {
    public GuruLoginPage (){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "(//ol/li)[1]")
    public WebElement userID;
    @FindBy(xpath = "(//ol/li)[2]")
    public WebElement password;
    @FindBy(xpath = "//input[@type = 'text']")
    public WebElement userIDInput;
    @FindBy(xpath = "//input[@type = 'password']")
    public WebElement passwordInput;

    @FindBy(name = "btnLogin")
    public WebElement buttonLogin;
    @FindBy(name = "btnReset")
    public WebElement buttonReset;

    @FindBy(linkText = "Log out")
    public WebElement logOut;

    public void login (String userID, String password){
        userIDInput.sendKeys(userID);
        passwordInput.sendKeys(password);
        buttonLogin.click();
    }

}
