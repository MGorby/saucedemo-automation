package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pagesObject.NavbarPO;
import tests.TestBase;
import utility.SeleniumHelpers;

public class CommonSteps extends TestBase {

    private SeleniumHelpers selenium = new SeleniumHelpers(driver);
    private NavbarPO navbar = new NavbarPO(driver);

    @Given("user navigates to {string}")
    public void userNavigatesTo(String url) {
        selenium.navigateToPage(url);
    }

    @And("user open your cart page")
    public void userOpenYourCartPage() throws InterruptedException {
        navbar.clickOnCartIcon();
    }
}
