package tests;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/featurefiles/SelectRQFReceivedDate.feature"
)
public class SelectingRQFReceivedDate {
}
