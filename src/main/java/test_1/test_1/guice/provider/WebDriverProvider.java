package test_1.test_1.guice.provider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.inject.Provider;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverProvider implements Provider<WebDriver> {

    @Override
    public WebDriver get() {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        System.out.println("-");
        
        return driver;
    }
}

