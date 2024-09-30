package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.testng.Assert;
import pagesObject.LoginPO;
import pagesObject.NavbarPO;
import tests.TestBase;
import utility.SeleniumHelpers;

import java.util.List;
import java.util.Map;

public class LoginSteps extends TestBase{

    private SeleniumHelpers selenium = new SeleniumHelpers(driver);
    private LoginPO login = new LoginPO(driver);
    private NavbarPO navbar = new NavbarPO(driver);

    private List<Map<String, String>> usernameCredential;

    @When("user login")
    public void userLogin(DataTable table) throws InterruptedException {
        usernameCredential = table.asMaps(String.class, String.class);
        String username = usernameCredential.get(0).get("username");
        String password = usernameCredential.get(0).get("password");
        login.fillUsernameTxtBox(username);
        login.fillPasswordTxtBox(password);
        login.clickOnLoginBtn();
    }

    @Then("user is successfully logged in")
    public void userIsSuccessfullyLoggedIn() {
        Assert.assertTrue(navbar.isCartIconDisplayed(), "Failed to login");
    }

    @When("user fill username {string}")
    public void userFillUsername(String username) {
        login.fillUsernameTxtBox(username);
    }

    @When("user fill password {string}")
    public void userFillPassword(String password) {
        login.fillPasswordTxtBox(password);
    }

    @And("user click login button")
    public void userClickLoginButton() throws InterruptedException {
        login.clickOnLoginBtn();
    }
}
