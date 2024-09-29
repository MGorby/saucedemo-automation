package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pagesObject.CheckoutPO;
import tests.TestBase;
import utility.SeleniumHelpers;

import java.util.Locale;

public class CheckoutSteps extends TestBase {

    private SeleniumHelpers selenium = new SeleniumHelpers(driver);
    private CheckoutPO checkout = new CheckoutPO(driver);


    @And("user fill First Name {string}")
    public void userFillFirstName(String firstname) {
        checkout.fillFirstNameTxtBox(firstname);
    }

    @And("user fill Last Name {string}")
    public void userFillLastName(String lastname) {
        checkout.fillLastNameTxtBox(lastname);
    }

    @And("user fill Postal Code {string}")
    public void userFillPostalCode(String postalCode) {
        checkout.fillPostalCodeTxtBox(postalCode);
    }

    @And("user click on continue button")
    public void userClickOnContinueButton() throws InterruptedException {
        checkout.clickOnContinueBtn();
    }

    @And("user finishes the checkout")
    public void userFinishesTheCheckout() throws InterruptedException {
        checkout.clickOnFinishBtn();
    }

    @Then("user checkout status is {string}")
    public void userCheckoutStatusIs(String title) {
        Assert.assertTrue(checkout.getCheckoutStatusTitleText().toLowerCase().contains(title.toLowerCase()), "Status is not expected");
    }
}
