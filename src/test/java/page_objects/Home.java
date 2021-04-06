package page_objects;

import command_providers.ActOn;
import command_providers.AssertThat;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Home extends NavigationBar {
    private final By HomeValue = By.id("homeval");
    private final By DownPayment = By.id("downpayment");
    private final By DownPaymentInDollar = By.xpath("//*[@id='calc']//input[@name='param[downpayment_type]'][@value='money']");
    private final By LoanAmount = By.id("loanamt");
    private final By InterestRate = By.id("intrstsrate");
    private final By LoanTerm = By.id("loanterm");
    private final By StartMonth = By.name("param[start_month]");
    private final By StartYear = By.id("start_year");
    private final By PropertyTax = By.id("pptytax");
    private final By PMI = By.id("pmi");
    private final By HomeOwnerInsurance = By.id("hoi");
    private final By HOA = By.id("hoa");
    private final By LoanType = By.name("param[milserve]");
    private final By BuyOrRefi = By.name("param[refiorbuy]");
    private final By Calculate = By.name("cal");
    //private final String MonthlyPayment = "$1,611.85";
    //private final By MonthlyPaymentText = By.xpath("//*[@id='calc']//h3[text()='" + MonthlyPayment + "']");
    private static final Logger LOGGER = LogManager.getLogger(NavigationBar.class);
    public Home(WebDriver driver) {
        super(driver);
    }
    public Home typeHomePrice(String value) {
        LOGGER.debug("Enter home Price " + value);
        ActOn.element(driver, HomeValue).setValue(value);
        return this;
    }
    public Home typeDownPayment(String value) {
        LOGGER.debug("Enter Down Payment " + value);
        ActOn.element(driver, DownPayment).setValue(value);
        return this;
    }
    public Home clickDownPaymentInDollar() {
        LOGGER.debug("Click on the DP IN $");
        ActOn.element(driver, DownPaymentInDollar).click();
        return this;
    }
    public Home typeLoanAmount(String value) {
        LOGGER.debug("Enter Loan Amount " + value);
        ActOn.element(driver, LoanAmount).setValue(value);
        return this;
    }
    public Home typeInterestRate(String value) {
        LOGGER.debug("Enter InterestRate " + value);
        ActOn.element(driver, InterestRate).setValue(value);
        return this;
    }
    public Home typeLoanTermYears(String value) {
        LOGGER.debug("Enter Loan Term in year" + value);
        ActOn.element(driver, LoanTerm).setValue(value);
        return this;
    }
    public Home selectMonth(String month) {
        LOGGER.debug("Select Month " + month);
        ActOn.element(driver, StartMonth).selectValue(month);
        return this;
    }
    public Home selectYear(String year) {
        LOGGER.debug("Select Year " + year);
        ActOn.element(driver, StartYear).setValue(year);
        return this;
    }
    public Home typePropertyTax(String value) {
        LOGGER.debug("Enter Property Type " + value);
        ActOn.element(driver, PropertyTax).setValue(value);
        return this;
    }
    public Home typePMI(String value) {
        LOGGER.debug("Enter PMI " + value);
        ActOn.element(driver, PMI).setValue(value);
        return this;
    }
    public Home typeHomeOwnerInsurance(String value) {
        LOGGER.debug("Enter Home Owner Insurance " + value);
        ActOn.element(driver, HomeOwnerInsurance).setValue(value);
        return this;
    }
    public Home typeMonthlyHoa(String value) {
        LOGGER.debug("Enter Monthly HOA " + value);
        ActOn.element(driver, HOA).setValue(value);
        return this;
    }
    public Home selectLoanType(String value) {
        LOGGER.debug("Enter Select Loan Type " + value);
        ActOn.element(driver, LoanType).selectValue(value);
        return this;
    }
    public Home selectBuyOrRefinance(String value) {
        LOGGER.debug("Enter Buy or Refinance " + value);
        ActOn.element(driver, BuyOrRefi).selectValue(value);
        return this;
    }
    public Home clickOnCalculateButton() {
        LOGGER.debug("Click on the Calculate Button" );
        driver.findElement(Calculate).click();
        return this;
    }
    public  Home validateTotalMonthlyPayment(String totalMonthlyPayment){
        String MonthlyPayment = totalMonthlyPayment;
        By MonthlyPaymentText = By.xpath("//*[@id='calc']//h3[text()='" + MonthlyPayment + "']");
        LOGGER.debug("Validate the monthly Rate is :" + totalMonthlyPayment );
        AssertThat.elementAssertions(driver,MonthlyPaymentText).elementExist();
        return  this;
    }

    public Home TypeLoanAmount(String loanamount) {
        LOGGER.debug("Click on the Calculate Button" );
        driver.findElement(Calculate).click();
        return this;
    }
}