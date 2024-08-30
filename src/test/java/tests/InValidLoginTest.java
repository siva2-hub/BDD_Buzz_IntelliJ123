package tests;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/featurefiles/InValidLogin.feature",
        glue = "stepdefinitions",
        dryRun = false,
        plugin = {
                "pretty",
                "html:cucumber-reports.html"
        })
public class InValidLoginTest {
}
