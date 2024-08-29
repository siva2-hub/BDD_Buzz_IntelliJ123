package tests;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/featurefiles/Login.feature",
        glue = "stepdefinitions",
        dryRun = true,
        plugin = {
                "pretty",
                "html:cucumber-reports.html"
        })
public class LoginTest {
}
