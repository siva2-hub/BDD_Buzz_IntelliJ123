package stepdefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.cdimascio.dotenv.Dotenv;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.PageObjects;

import java.lang.reflect.Array;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class AllPages {
    public PageObjects pos;
    public WebDriver driver;
    public WebDriverWait wait;
    public Actions actions;

    @Given("^I open the browser with url$")
    public void i_open_the_browser_with_url() throws Throwable {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        Map<String, Boolean> value = new java.util.HashMap<>();
        value.put("credentials_enable_service", false);
        value.put("profile.password_manager_enabled", false);
        options.setExperimentalOption("prefs", value);
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        Dotenv dotenv = Dotenv.load();
        String url = dotenv.get("pageURL");
        driver.get(url);
    }

    @When("^I close the browser$")
    public void i_close_the_browser() throws Throwable {
        driver.close();
    }

    @Given("^I am on the login page$")
    public void i_am_on_the_login_page() throws Throwable {
        pos = new PageObjects(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(pos.email));
        actions = new Actions(driver);
        pos.email.isDisplayed();
        pos.signIn.isDisplayed();
    }

    @When("^I enter valid credentials and click sign in \"([^\"]*)\", \"([^\"]*)\"$")
    public void i_enter_valid_credentials_and_click_sign_in(String userName, String password) throws Throwable {
        pos.email.sendKeys(userName);
        pos.password.sendKeys(password);
        pos.signIn.click();
    }

    @Then("^I should see the quotes list view$")
    public void i_should_see_the_quotes_list_view() throws Throwable {
        wait.until(ExpectedConditions.visibilityOf(pos.companyLogo));
        pos.companyLogo.isDisplayed();
    }

    @When("^I click on profile and see the logout$")
    public void i_click_on_profile_and_see_the_logout() throws Throwable {
        wait.until(ExpectedConditions.visibilityOf(pos.userProfile));
        pos.userProfile.isDisplayed();
        pos.userProfile.click();
        pos.logout.isDisplayed();
    }

    @Then("^I should see the validations$")
    public void i_should_see_the_validations() throws Throwable {

    }

    @When("^I click on create quote button at quotes list$")
    public void i_click_on_create_quote_button_at_quotes_list() throws Throwable {
        pos.createQuote1.click();
    }

    @Then("^I should see the create quote page and i fill the details as \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
    public void i_should_see_the_create_quote_page_and_i_fill_the_details_as(String accountNum, String quoteType, String details) throws Throwable {
        wait.until(ExpectedConditions.visibilityOf(pos.projName));
        pos.firstReactInput.click();
        actions.sendKeys(accountNum).perform();
        Thread.sleep(400);
        wait.until(ExpectedConditions.invisibilityOf(pos.spinner));
        pos.selectReactDropdown(accountNum);
        pos.projName.sendKeys("for testing perpose");
        pos.secondReactInput.click();
        actions.sendKeys(quoteType).perform();
        pos.selectReactDropdown(quoteType);
    }

    @When("^I click on the Create button$")
    public void i_click_on_the_Create_button() throws Throwable {
        pos.createQuote3.click();
        driver.navigate().to("https://buzzworld-web-iidm.enterpi.com/quote_for_parts/23b1fd51-4af6-4a46-84c0-ff58ddaab865");
    }

    @Then("^I should see the add items button at quote details page$")
    public void i_shoould_see_the_add_items_button_at_quote_details_page() throws Throwable {
        wait.until(ExpectedConditions.visibilityOf(pos.addItems));
        String quoteId = pos.repQuoteId.getText().replace("#","");
        String quoteURL = driver.getCurrentUrl();
        System.out.println("Quote is created with id# :"+quoteId);
        System.out.println("Quote url# :"+quoteURL);
    }
    @When("^I click on Add items button$")
    public void i_click_on_Add_items_button() throws Throwable {
        pos.addItems.click();
    }

    @When("^I search and add items$")
    public void i_search_and_add_items() throws Throwable {
        String[] items = {"GA80U4103ABM"};
        for (int i = 0; i < items.length; i++) {
            wait.until(ExpectedConditions.visibilityOf(pos.partsSearch));
            pos.partsSearch.sendKeys(items[i]);
            Thread.sleep(1300);
            wait.until(ExpectedConditions.invisibilityOf(pos.spinner));
            pos.itemCheckBox.click();
            pos.addSelectedItems.click();
            Thread.sleep(1200);
            wait.until(ExpectedConditions.visibilityOf(pos.textElement("GP")));
        }
        Thread.sleep(1500);
    }
}
