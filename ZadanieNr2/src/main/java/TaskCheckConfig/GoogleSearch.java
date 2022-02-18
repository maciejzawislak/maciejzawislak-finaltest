package TaskCheckConfig;


import net.jodah.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//        driver.get("https://hotel-testlab.coderslab.pl/en/login?back=my-account");
//        driver.findElement(By.id("email")).sendKeys("123456@123.com");
//        driver.findElement(By.id("passwd")).sendKeys("123456");
//        driver.findElement(By.id("SubmitLogin")).click();
//        driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div/ul/li[4]/a")).click();
        driver.get("https://pl.wikipedia.org/");
        WebElement search = driver.findElement(By.id("searchInput"));
        if(search.isEnabled()) {
            search.sendKeys("Selenium");
            search.submit();
        }else {
            Ass
        }




//        Thread.sleep(4000);
//
//        WebElement firstName = driver.findElement(By.xpath("//input[@id='customer_firstname']"));
//        if(firstName.isDisplayed()){
//            firstName.sendKeys("fdsfdg");
//        }else {
//            System.out.println("Element not displayd");
//        }
//        WebElement lastName = driver.findElement(By.xpath("//input[@id='customer_lastname']"));
//        if (lastName.isDisplayed()){
//            lastName.sendKeys("fgdhdfgh");
//        }else {
//            System.out.println("Element not displayd");
//        }
//
//        WebElement password = driver.findElement(By.xpath("//input[@id='passwd']"));
//        if(password.isDisplayed()){
//            password.sendKeys("ghfjfghjfghj");
//        }else {
//            System.out.println("Element not displayd");
//        }
//
//        WebElement register = driver.findElement(By.xpath("//button[@id='submitAccount']"));
//        if(register.isDisplayed()){
//            register.click();
//        }else {
//            System.out.println("Element not displayd");
//        }

//        driver.quit();
    }
}
