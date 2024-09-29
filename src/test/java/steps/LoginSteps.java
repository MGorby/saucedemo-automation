package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.testng.Assert;
import pagesObject.LoginPO;
import tests.TestBase;
import utility.SeleniumHelpers;

import java.util.List;
import java.util.Map;

public class LoginSteps extends TestBase{

    private SeleniumHelpers selenium = new SeleniumHelpers(driver);
    private LoginPO login = new LoginPO(driver);

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
}
