package com.example;

import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@Cucumber.Options(tags = "~@ignore", snippets = SnippetType.CAMELCASE)
public class RunTest {
    import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class BrowserActionsSteps {

    WebDriver driver;

    @Given("I open the Chrome browser and maximize the window")
    public void openChromeBrowserAndMaximizeWindow() {
        System.setProperty("webdriver.chrome.driver", "localhost:4404");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
    }

    @When("I navigate to {string}")
    public void navigateTo(String url) {
        driver.get(url);
    }

    @Then("I print the verdict based on the title")
    public void printVerdictBasedOnTitle() {
        String actualTitle = driver.getTitle();
        String expectedTitle = "We are Hiring!";
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }

    @When("I navigate back to {string}")
    public void navigateBackTo(String url) {
        driver.navigate().to(url);
    }

    @And("I print the current page URL")
    public void printCurrentPageURL() {
        System.out.println("Current Page URL: " + driver.getCurrentUrl());
    }

    @And("I navigate forward")
    public void navigateForward() {
        driver.navigate().forward();
    }

    @And("I reload the page")
    public void reloadPage() {
        driver.navigate().refresh();
    }

    @Then("I close the browser")
    public void closeBrowser() {
        driver.quit();
    }
}

}

