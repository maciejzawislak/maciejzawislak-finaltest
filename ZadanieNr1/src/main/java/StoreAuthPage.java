import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StoreAuthPage {

    private final WebDriver driver;

    @FindBy(xpath = "/html/body/main/section/div/div/section/section/section/form/section/div[1]/div[1]/input")
    private WebElement emailField;

    @FindBy(xpath = "/html/body/main/section/div/div/section/section/section/form/section/div[2]/div[1]/div/input")
    private WebElement passwordField;

    @FindBy(id = "submit-login")
    private WebElement signInBtn;


    public StoreAuthPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void logIn(String email, String password){
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        signInBtn.click();
    }


}
