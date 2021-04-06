package mortgage_calculator;

import command_providers.ActOn;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page_objects.Home;
public class CalculateRates {
    WebDriver driver;
    @BeforeMethod
    public void openBrowser() {
        String url = "https://www.mortgagecalculator.org/";
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        ActOn.browser(driver).openBrowser(url);
    }
    @Test
    public void calculateRealApr() {
        new Home(driver)
                .mouseHoverToRates()
                .navigateToRealApr()
                .typeHomePrice("200000")
                .typeDownPayment("15000")
                .selectDownPaymentInDollar()
                .typeInterestRate("3")
                .clickOnTheCalculateButton()
                .validateAprRate("3.139%");
    }
    @AfterMethod
    public void closeBrowser() {
        ActOn.browser(driver).closeBrowser();
    }
}