package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@ScenarioOutline",
        dryRun = false // dryRun = true testi calistirmaz sadece eksik step definitionlari bulur.
)

public class Runner {

}
