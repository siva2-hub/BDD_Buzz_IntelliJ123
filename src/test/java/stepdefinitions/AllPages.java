package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.cdimascio.dotenv.Dotenv;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.PageObjects;

import java.time.Duration;
import java.util.Map;

public class AllPages {
    public PageObjects pos;
    public WebDriver driver;
    public WebDriverWait wait;

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
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
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
}
