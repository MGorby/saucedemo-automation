package pagesObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import utility.SeleniumHelpers;

public class LoginPO {

    WebDriver driver;
    SeleniumHelpers selenium;

    public LoginPO(WebDriver driver) {
        this.driver = driver;
        selenium = new SeleniumHelpers(driver);
        // This initElements method will create all WebElements
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }

    @FindBy(css = "#user-name")
    private WebElement usernameTxtBox;

    @FindBy(css = "#password")
    private WebElement passwordTxtBox;

    @FindBy(css = "#login-button")
    private WebElement loginBtn;


    /**
     * Fill Username textbox
     */
    public void fillUsernameTxtBox(String username){
        selenium.enterText(usernameTxtBox, username, false);
    }

    /**
     * Fill Password textbox
     */
    public void fillPasswordTxtBox(String password){
        selenium.enterText(passwordTxtBox, password, false);
    }

    /**
     * Click on Login button
     * @throws InterruptedException
     */
    public void clickOnLoginBtn() throws InterruptedException {
        selenium.clickOn(loginBtn);
    }
}
