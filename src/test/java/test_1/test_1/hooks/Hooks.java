package test_1.test_1.hooks;

import jakarta.inject.Inject;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
public class Hooks {

    private final WebDriver driver;

    @Inject
    public Hooks(final WebDriver driver) {
        this.driver = driver;
    }

    @Before
    public void openWebSite() {
    	driver.get("http://www.google.com");
    }

    @After
    public void closeSession() {
        driver.close();
    }
}
