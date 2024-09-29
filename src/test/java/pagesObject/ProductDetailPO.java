package pagesObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import utility.SeleniumHelpers;

public class ProductDetailPO {

    WebDriver driver;
    SeleniumHelpers selenium;

    public ProductDetailPO(WebDriver driver) {
        this.driver = driver;
        selenium = new SeleniumHelpers(driver);
        // This initElements method will create all WebElements
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }

    @FindBy(css = "#add-to-cart")
    private WebElement addToCartBtn;

    /**
     * Click on Add to cart button
     * @throws InterruptedException
     */
    public void clickOnAddToCartBtn() throws InterruptedException {
        selenium.clickOn(addToCartBtn);
    }
}
