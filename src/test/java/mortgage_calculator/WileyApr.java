package mortgage_calculator;

import command_providers.ActOn;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WileyApr {
    WebDriver driver;

    private final By Rateslink = By.linkText("Rates");
    private final By RealAprLink = By.linkText("Real APR");
    private final By RealAprHeader = By.xpath("//*[@id='calc']//input[@value ='money']");
    private final By HomeValueInputField = By.name("HomeValue");
    private final By DownPaymentInputField = By.name("DownPayment");
    private final By DownPaymentInDollarRadioButton = By.id("DownPaymentSel8");
    private final By InterestRateInputField =By.name("Interest");
    private final By CalculateButton = By.name("calculate");
    private final By ActualApr = By.xpath("//*[@id='calc']//input[@value ='money']");
    private By HomePrice;
    private By DownPaymentInDollar;
    private By InterestRate;


    @BeforeTest
    public void openBrowser() {
        String url = "https://www.mortgagecalculator.org/";
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        ActOn.browser(driver).openBrowser(url);
        driver.manage().window().maximize();
    }

    public void navigateToRatesPage() {
        //Mouse Hover to the Rates Link
        ActOn.element(driver, Rateslink).mouseHover();
        ActOn.element(driver, Rateslink).click();
    }

    private void enterRealAprDate() {
//Enter Home Price
        ActOn.element(driver, HomePrice).setValue("200000");

// Enter Down Payment
        //driver.findElement(DownPayment).clear();
        ActOn.element(driver, DownPaymentInDollar).setValue("15000");

// Enter Interest Rate
        ActOn.element(driver, InterestRate).setValue("3");
    }


    @Test

    public void calculateRealApr() {
        navigateToRatesPage();

        //Wait until the locator is visible in the page
        WebDriverWait wait = new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(RealAprHeader));

        //Set timeOut 15 seconds on every single test steps to be completed
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.NANOSECONDS);


        ActOn.element(driver, HomeValueInputField).selectValue("200000");

        ActOn.element(driver, DownPaymentInputField).selectValue("15000");
        ActOn.element(driver, DownPaymentInDollarRadioButton).click();

        ActOn.element(driver, InterestRateInputField).selectValue("3");

        ActOn.element(driver, CalculateButton).click();

        String aprRate = ActOn.element(driver, ActualApr).getTextValue();
        Assert.assertEquals(aprRate, "3.111%");
    }

    @AfterMethod
    public void closeBrowser() {ActOn.browser(driver).closeBrowser();}


}


