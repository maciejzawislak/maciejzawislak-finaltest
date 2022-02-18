import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StoreMainPage {

    private final WebDriver driver;

    @FindBy(xpath = "/html/body/main/header/nav/div/div/div[1]/div[2]/div[2]/div/a/span")
    private WebElement signInButton;

    public StoreMainPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void signIn(){
        signInButton.click();
    }

}
