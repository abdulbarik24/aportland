package mortgage_calculator;

import command_providers.ActOn;
import command_providers.AssertThat;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MortgageCalculator {
    private final By HomeValue = By.id("homeval");
    private final By DownPayment = By.id("downpayment");
    private final By DollerSigne = By.xpath("//*[@id='calc']//input[@value ='money']");
    private final By EnterDivisionSigne = By.xpath("//*[@id=\"calc\"]//input[@value =\"percent\"]");
    private final By LoneAmount = By.id("loanamt");
    private final By InterestRate = By.id("intrstsrate");
    private final By LoneTerms = By.id("loanterm");
    private final By StartDate = By.name("param[start_month]");
    private final By StartYear = By.id("start_year");
    private final By PropertyTax = By.id("pptytax");
    private final By PMI =By.id("pmi");
    private final By HomeOwnerInsurance = By.id("hoi");
    private final By HOA = By.id("hoa");
    private final By LoneType = By.name("param[milserve]");
    private final By BuyOrRefi = By.name("param[refiorbuy]");
    private final By Calculate = By.name("cal");
    private final String MonthlyPayment = "$1,611.85";
    private final By MonthlyPaymentText = By.xpath("//*[@id='calc']//h3[text()='" + MonthlyPayment + "']");


    WebDriver driver;
    Select select;

    @BeforeMethod
    public void openBrowser() {
        String url = "https://www.mortgagecalculator.org/";
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        ActOn.browser(driver).openBrowser(url);

    }
    public void enterMortgageDate() {
        //Enter Home Value
        ActOn.element(driver, HomeValue).setValue("300000");

        //Enter Down Payment
        ActOn.element(driver, DownPayment).setValue("60000");

        //Enter Doller Signe
        driver.findElement(DollerSigne).click();

        //Enter Division Signe
        ActOn.element(driver, EnterDivisionSigne).click();

        //Enter loan Amount
        ActOn.element(driver, LoneAmount).setValue("240000");

        //Enter Interest Rate
        ActOn.element(driver, InterestRate).setValue("3.0");

        //Enter Loan Term
        ActOn.element(driver, LoneTerms).setValue("30");

        //Select Start Date
        ActOn.element(driver, StartDate).selectValue("Apr");
        ActOn.element(driver, StartYear).setValue("2021");

        //Enter Property Tax
        ActOn.element(driver, PropertyTax).setValue("5000");

        //Enter PMI
        ActOn.element(driver, PMI).setValue("0.5");

        //Enter HomeOwner Ins
        ActOn.element(driver, HomeOwnerInsurance).setValue("1000");

        //Enter Monthly HOA
        ActOn.element(driver, HOA).setValue("100");

        //Enter Loan Type
        ActOn.element(driver, LoneType).selectValue("FHA");

        //Select Buy or Refi
        ActOn.element(driver, BuyOrRefi).selectValue("Buy");
    }
    @Test
    public void calculateMortgage() {
        enterMortgageDate();

        //Click on Calculate button
       ActOn.wait(driver, Calculate).waitForElementToBeVisible();
       driver.findElement(Calculate).click();

        AssertThat.elementAssertions(driver, MonthlyPaymentText).elementExist();
    }
    @AfterMethod
    public void closeBrowser() {
     ActOn.browser(driver).closeBrowser();

    }
}

