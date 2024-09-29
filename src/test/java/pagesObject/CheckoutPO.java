package pagesObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import utility.SeleniumHelpers;

public class CheckoutPO {

    WebDriver driver;
    SeleniumHelpers selenium;

    public CheckoutPO(WebDriver driver) {
        this.driver = driver;
        selenium = new SeleniumHelpers(driver);
        // This initElements method will create all WebElements
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }

    @FindBy(css = "#first-name")
    private WebElement firstNameTxtBox;

    @FindBy(css = "#last-name")
    private WebElement lastNameTxtBox;

    @FindBy(css = "#postal-code")
    private WebElement postalCodeTxtBox;

    @FindBy(css = "#continue")
    private WebElement continueBtn;

    @FindBy(css = "#finish")
    private WebElement finishBtn;

    @FindBy(css = ".title")
    private WebElement checkoutStatusTxt;


    /**
     * Fill First Name textbox
     */
    public void fillFirstNameTxtBox(String firstname){
        selenium.enterText(firstNameTxtBox, firstname, false);
    }

    /**
     * Fill Last Name textbox
     */
    public void fillLastNameTxtBox(String lastname){
        selenium.enterText(lastNameTxtBox, lastname, false);
    }

    /**
     * Fill Postal Code textbox
     */
    public void fillPostalCodeTxtBox(String postalCode){
        selenium.enterText(postalCodeTxtBox, postalCode, false);
    }

    /**
     * Click on Continue button
     * @throws InterruptedException
     */
    public void clickOnContinueBtn() throws InterruptedException {
        selenium.clickOn(continueBtn);
    }

    /**
     * Click on Finish button
     * @throws InterruptedException
     */
    public void clickOnFinishBtn() throws InterruptedException {
        selenium.clickOn(finishBtn);
    }

    /**
     * Get Search Result Title Text
     *
     * @return variable
     */
    public String getCheckoutStatusTitleText() {
        String name = selenium.getText(checkoutStatusTxt);
        return name.toLowerCase();
    }
}
