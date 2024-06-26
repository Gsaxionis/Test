package runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features/"},
        monochrome = true,
        tags = "@ANDROID and @DEV",
        glue = {"eu.europa.eudi.stepdefs"})
public class TestRunner {
}