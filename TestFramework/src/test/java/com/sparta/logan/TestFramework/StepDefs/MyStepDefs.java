package com.sparta.logan.TestFramework.StepDefs;

import com.sparta.logan.TestFramework.lib.pages.HomePage;
import com.sparta.logan.TestFramework.lib.pages.PastPage;
import com.sparta.logan.TestFramework.lib.pages.SearchPage;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.MatcherAssert;
import org.hamcrest.core.Is;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.io.IOException;

public class MyStepDefs {
    private static ChromeDriverService service;

    private static final String DRIVER_LOCATION = "src/test/resources/chromedriver.exe";

    private WebDriver webDriver;

    private HomePage homePage;

    private PastPage pastPage;

    private SearchPage searchPage;

    @Given("I am on the Hacker News Website")
    public void iAmOnTheHackerNewsWebsite() {
        webDriver.get("https://news.ycombinator.com/");
        homePage = new HomePage(webDriver);
    }

    @When("I click the past link")
    public void iClickThePastLink() {
        pastPage = homePage.goToPastPage();
    }

    @Then("I will go to the past page")
    public void iWillGoToThePastPage() {
        MatcherAssert.assertThat(pastPage.getUrl(), Is.is("https://news.ycombinator.com/front"));
    }

    @When("I enter {string} into the Search text box")
    public void iEnterIntoTheSearchTextBox(String searchTerm) {
        searchPage = homePage.search(searchTerm);
    }

    @Then("I will go to the search page with the url parameter {string}")
    public void iWillGoToTheSearchPageWithTheUrlParameter(String param) {
        String expectedUrl = "https://hn.algolia.com/?q=" + param;
        Assertions.assertEquals(expectedUrl, webDriver.getCurrentUrl());
    }

    public static ChromeOptions getChromeOptions() {

        ChromeOptions chromeOptions = new ChromeOptions();

        //chromeOptions.addArguments("headless");

        chromeOptions.addArguments("--start-maximized");

        chromeOptions.addArguments("--remote-allow-origins=*");

        return chromeOptions;

    }

    @BeforeAll
    public static void beforeAll() throws IOException {          service = new ChromeDriverService.Builder()

            .usingDriverExecutable(new File(DRIVER_LOCATION))

            .usingAnyFreePort()

            .build();

        service.start();

    }

    @Before
    public void setup() {
        webDriver = new RemoteWebDriver(service.getUrl(), getChromeOptions());

    }

    @After
    public void afterEach() {
        webDriver.quit();
    }

    @AfterAll
    public static void afterAll() {
        service.stop();
    }
}
