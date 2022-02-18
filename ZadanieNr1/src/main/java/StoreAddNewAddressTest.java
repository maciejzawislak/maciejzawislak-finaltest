import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class StoreAddNewAddressTest {

    private static WebDriver driver;



    @Given("^an open browser on mystore-testlab\\.coderslab\\.pl page$")
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://mystore-testlab.coderslab.pl/index.php");

    }

    @When("user signs in")
    public void userSignsIn() {
        StoreMainPage mainPage = new StoreMainPage(driver);
        StoreAuthPage authPage = new StoreAuthPage(driver);

        mainPage.signIn();
        authPage.logIn("mzfinaltest@email.com", "qwerty123456");
    }
    @And("wants to add new address")
    public void goesToAddressPage() {
        StoreMyAccPage myAccPage = new StoreMyAccPage(driver);
        myAccPage.addNewAddress();
    }

    @And("^fills form alias (.*), address (.*), city (.*), zip\\/postal code ([0-9]{2}-[0-9]{3}), country (.*), phone (.*)$")
    public void fillsForm(String alias, String address, String city, String zipPostalCode,String country, String phone) {
        StoreNewAddrPage newAddrPage = new StoreNewAddrPage(driver);
        newAddrPage.addNewAddr(alias, address, city, zipPostalCode, country, phone);
    }

    @Then("new address is added")
    public void newAddressIsAdded() {
        Assert.assertTrue(driver.findElement(By.cssSelector(".alert.alert-success")).isDisplayed());
    }

    @And("browser is closed")
    public void browserIsClosed() {
        driver.quit();
    }
}
