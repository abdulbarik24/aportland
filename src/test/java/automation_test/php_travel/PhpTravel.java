package automation_test.php_travel;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PhpTravel {
    WebDriver driver;

    @BeforeMethod
    public void browserInitialization() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://phptravels.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void ValidateTitle() {

        String title = "PHPTRAVELS booking script and system for hotels airline flights tours cars online application - PHPTRAVELS";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, title);
        driver.quit();
    }

    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }

}
