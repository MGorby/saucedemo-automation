package steps;

import io.cucumber.java.en.And;
import pagesObject.ProductListPO;
import tests.TestBase;
import utility.SeleniumHelpers;

public class ProductListSteps extends TestBase {

    private SeleniumHelpers selenium = new SeleniumHelpers(driver);
    private ProductListPO list = new ProductListPO(driver);


    @And("user select product {string}")
    public void userSelectProduct(String product) throws InterruptedException {
        list.clickOnProductText(product);
    }
}
