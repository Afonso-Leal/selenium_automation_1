package test_1.test_1.acceptancetests;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"test_1.test_1"},
        features = "src/test/resources/features"
        
)
public class AllTests {
}