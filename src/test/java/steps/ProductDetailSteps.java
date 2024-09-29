package steps;

import io.cucumber.java.en.And;
import pagesObject.ProductDetailPO;
import tests.TestBase;
import utility.SeleniumHelpers;

public class ProductDetailSteps extends TestBase {

    private SeleniumHelpers selenium = new SeleniumHelpers(driver);
    private ProductDetailPO detail = new ProductDetailPO(driver);

    @And("user add the product to cart")
    public void userAddTheProductToCart() throws InterruptedException {
        detail.clickOnAddToCartBtn();
    }
}
