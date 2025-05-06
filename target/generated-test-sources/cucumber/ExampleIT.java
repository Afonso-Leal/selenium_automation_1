import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true,
features = {"C:/Users/leala/eclipse-workspace/test-1/src/test/resources/features/example.feature:8"},
plugin = {"json:target/cucumber-reports/1.json"},
monochrome = false,
glue = { "test-1" })
public class ExampleIT {
}
