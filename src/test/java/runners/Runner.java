package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/reports/html-reports/default-cucumber-reports.html",//html formatında rapor için
                "json:target/reports/json-reports/cucumber1.json",//json formatında rapor için
                "junit:target/reports/xml-reports/cucumber1.xml",//xml formatında rapor için
                "rerun:target/failedScenarios.txt", //fail olan testleri bu text dosyasina yazar ve tekrar calistirilmalarina yardimci olur.
                "pretty" //Konsola daha guzel yazdirmaya yarar.
        },

        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@Login",
        dryRun = false // dryRun = true testi calistirmaz sadece eksik step definitionlari bulur.
)

public class Runner {

}
