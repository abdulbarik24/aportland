package parameters;

import command_providers.ActOn;
import data_provider.DataProviderClass;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page_objects.Home;

public class CalculateAprRatesParameterized {
        WebDriver driver;

        @BeforeMethod
        public void openBrowser() {
            String url = "https://www.mortgagecalculator.org/";
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            ActOn.browser(driver).openBrowser(url);
        }
        @Test (dataProvider = "RealAprRates", dataProviderClass = DataProviderClass.class)
        public void calculateRealApr(String homePrice, String downPayment, String interestRate, String aprRate) {
            new Home(driver)
                    .mouseHoverToRates()
                    .navigateToRealApr()
                    .typeHomePrice(homePrice)
                    .typeDownPayment(downPayment)
                    .selectDownPaymentInDollar()
                    .typeInterestRate(interestRate)
                    .clickOnTheCalculateButton()
                    .validateAprRate(aprRate);
        }
        @AfterMethod
        public void closeBrowser() {
            ActOn.browser(driver).closeBrowser();
        }
    }

