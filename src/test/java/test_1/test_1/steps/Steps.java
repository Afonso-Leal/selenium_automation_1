package test_1.test_1.steps;

import javax.inject.Inject;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.Given;

import static org.junit.Assert.assertEquals;

public class Steps {

    @Inject
    private WebDriver webDriver;

    @Given("^I search for \"([^\"]*)\"$")
    public void i_search_for(String arg1) {
    	System.out.println("Hello World 1");
    	String title = webDriver.getTitle();
    	System.out.println(title);
    }

    @Then("^I google should show me results!$")
    public void i_google_should_show_me_results() {
    	System.out.println("Hello World 2");
    }
}