package pagesObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import utility.SeleniumHelpers;

public class ProductListPO {

    WebDriver driver;
    SeleniumHelpers selenium;

    public ProductListPO(WebDriver driver) {
        this.driver = driver;
        selenium = new SeleniumHelpers(driver);
        // This initElements method will create all WebElements
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }


    /**
     * Click on Text
     *
     * @throws InterruptedException
     */
    public void clickOnProductText(String product) throws InterruptedException {
        selenium.hardWait(3);
//        String element = "//*[contains(text(),'"+menu+"')]";
        String element = "//div[.='"+product+"']";
        selenium.clickOn(By.xpath(element));
//        selenium.hardWait(1);
    }
}
