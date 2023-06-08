package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;

public class PaymentGateWayPage {

    public PaymentGateWayPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(linkText = "Cart")
    public WebElement cartLink;

    @FindBy(linkText = "Generate Card Number")
    public WebElement generateCartLink;

    @FindBy(linkText = "Credit Card Limit")
    public WebElement creditCardLimitLink;

    @FindBy(xpath = "//li/input")
    public WebElement buyBtn;

    @FindBy(id = "card_nmuber")
    public WebElement cardNumberInput;

    @FindBy(id = "month")
    public WebElement monthDropdown;

    @FindBy(id = "year")
    public WebElement yearDropdown;

    @FindBy(id = "cvv_code")
    public WebElement cvvInput;

    @FindBy(name = "submit")
    public WebElement payBtn;

    public void selectMonth(String month){
        Select select = new Select(monthDropdown);
        select.selectByVisibleText(month);
    }

    public void selectYear(String year){
        Select select = new Select(yearDropdown);
        select.selectByVisibleText(year);
    }

}
