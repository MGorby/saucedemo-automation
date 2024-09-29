package pagesObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import utility.SeleniumHelpers;

public class YourCartPO {

    WebDriver driver;
    SeleniumHelpers selenium;

    public YourCartPO(WebDriver driver) {
        this.driver = driver;
        selenium = new SeleniumHelpers(driver);
        // This initElements method will create all WebElements
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }

    @FindBy(css = "#checkout")
    private WebElement checkoutBtn;

    /**
     * Click on Add to cart button
     * @throws InterruptedException
     */
    public void clickOnCheckoutBtn() throws InterruptedException {
        selenium.clickOn(checkoutBtn);
    }
}
