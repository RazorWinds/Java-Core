package com.sparta.logan.TestFramework.StepDefs;

import com.sparta.logan.TestFramework.lib.pages.HomePage;
import com.sparta.logan.TestFramework.lib.pages.PastPage;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.MatcherAssert;
import org.hamcrest.core.Is;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;

public class MyStepDefs {
    private static ChromeDriverService service;

    private static final String DRIVER_LOCATION = "src/test/resources/chromedriver.exe";

    private WebDriver webDriver;

    private HomePage homePage;

    private PastPage pastPage;

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
        webDriver = new ChromeDriver(service, getChromeOptions());

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
