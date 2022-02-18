import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StoreMyAccPage {

    private final WebDriver driver;

    public StoreMyAccPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addNewAddress() {

        if (driver.findElements(By.xpath("//*[@id=\"address-link\"]/span")).size() > 0) {
            driver.findElement(By.xpath("//*[@id=\"address-link\"]/span")).click();
        } else if (driver.findElements(By.xpath("//*[@id=\"addresses-link\"]/span")).size() > 0) {
            driver.findElement(By.xpath("//*[@id=\"addresses-link\"]/span")).click();
            driver.findElement(By.xpath("//*[@id=\"content\"]/*/a/span")).click();
        }

    }
}

