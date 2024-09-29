package steps;

import io.cucumber.java.en.And;
import pagesObject.YourCartPO;
import tests.TestBase;
import utility.SeleniumHelpers;

public class YourCrartSteps extends TestBase {

    private SeleniumHelpers selenium = new SeleniumHelpers(driver);
    private YourCartPO cart = new YourCartPO(driver);

    @And("user checkout the product")
    public void userCheckoutTheProduct() throws InterruptedException {
        cart.clickOnCheckoutBtn();
    }
}
