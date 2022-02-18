import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StoreNewAddrPage {

    private WebDriver driver;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div/form/section/div[1]/div[1]/input")
    private WebElement addAlias;
    @FindBy(xpath = "//*[@id=\"content\"]/div/div/form/section/div[6]/div[1]/input")
    private WebElement addAddress;
    @FindBy(xpath = "//*[@id=\"content\"]/div/div/form/section/div[8]/div[1]/input")
    private WebElement addCity;
    @FindBy(xpath = "//*[@id=\"content\"]/div/div/form/section/div[9]/div[1]/input")
    private WebElement addZipPostalCode;
    @FindBy(xpath = "//*[@id=\"content\"]/div/div/form/section/div[10]/div[1]/select")
    private WebElement addCountry;
    @FindBy(xpath = "//*[@id=\"content\"]/div/div/form/section/div[11]/div[1]/input")
    private WebElement addPhone;
    @FindBy(xpath = "//*[@id=\"content\"]/div/div/form/footer/button")
    private WebElement saveBtn;

    public StoreNewAddrPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void addNewAddr(String alias, String address, String city, String zipPostalCode,String country, String phone){
        addAlias.sendKeys(alias);
        addAddress.sendKeys(address);
        addCity.sendKeys(city);
        addCountry.sendKeys(country);
        addZipPostalCode.sendKeys(zipPostalCode);
        addPhone.sendKeys(phone);
        saveBtn.click();
    }
}
