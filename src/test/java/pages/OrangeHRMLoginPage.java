package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class OrangeHRMLoginPage {
    public OrangeHRMLoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(name = "username")
    public WebElement usernameInput;

    @FindBy(name = "password")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[@type = 'submit']")
    public WebElement loginBtn;

    @FindBy(xpath = "//input[@name = 'username']/../../span")
    public WebElement requiredTextUsername;
    @FindBy(xpath = "//input[@name = 'password']/../../span")
    public WebElement requiredTextPassword;

    @FindBy(xpath = "//li/a")
    public List<WebElement> menuBtn;

    @FindBy(xpath = "//button[@type = 'button']")
    public List<WebElement> maintenance;






}
