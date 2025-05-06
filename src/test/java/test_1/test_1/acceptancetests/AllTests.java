package test_1.test_1.acceptancetests;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"test_1.test_1"},
        features = "src/test/resources/features"
        
)
public class AllTests {
}