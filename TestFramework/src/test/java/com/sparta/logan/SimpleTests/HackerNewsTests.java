package com.sparta.logan.SimpleTests;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;

public class HackerNewsTests {
    private static final String DRIVER_LOCATION = "src/test/resources/chromedriver.exe";
    private static final String BASE_URL = "https://news.ycombinator.com/";

    // Is static. It should be created only once, at the beginning of the test run - we will be using
    // the BeforeAll hook
    private static ChromeDriverService service;
    private WebDriver webDriver;
    public ChromeOptions getChromeOptions(){
        ChromeOptions options = new ChromeOptions();
        // the browser to be maximised
        options.addArguments("--start-maximized");
        // the code should run without opening the browser
        // options.addArguments("--headless");
        // The browser should allow access from the test program
        options.addArguments("--remote-allow-origins=*");
        return options;
    }

    @BeforeAll
    public static void beforeAll() throws IOException {
        service = new ChromeDriverService.Builder()
                // Specify the location of the ChromeDriver executable
                .usingDriverExecutable(new File(DRIVER_LOCATION))
                // configure the service so it uses ana available free port
                .usingAnyFreePort()
                //build the ChromeDriverService instance
                .build();
        //start the ChromeDriverService
        service.start();
    }
    @BeforeEach
    public void setup(){
        webDriver = new RemoteWebDriver(service.getUrl(), getChromeOptions());
    }

    @AfterAll
    public static void afterAll(){
        service.stop();
    }
    @AfterEach
    public void afterEach(){
        // This will close every associated window the driver has openened
        webDriver.quit();
    }

    @Test
    @DisplayName("Check that the webdriver works")
    public void checkWebDriver() throws InterruptedException {
        webDriver.get(BASE_URL);
        Assertions.assertEquals("https://news.ycombinator.com/", webDriver.getCurrentUrl());
        Assertions.assertEquals("Hacker News", webDriver.getTitle() );
    }


    @Test
    @DisplayName("Check that the link to the past page works")
    public void checkPastLink(){
        //Arrange
        webDriver.get(BASE_URL);
        // Act
        WebElement pastLink = webDriver.findElement(By.linkText("past"));
        pastLink.click();
        // Assert
        MatcherAssert.assertThat(webDriver.getCurrentUrl(), is("https://news.ycombinator.com/front"));
        MatcherAssert.assertThat(webDriver.getTitle(), containsString("front"));
    }

    @Test
    @DisplayName("Check that the number of articles on the homepage is correct")
    public void checkNumberOfArticlesOnHomePage(){
        webDriver.get(BASE_URL);
        List<WebElement> rows = webDriver.findElements(By.className("athing"));
        int rowCount = rows.size();
        MatcherAssert.assertThat(rowCount, is(30));
    }


    @Test
    @DisplayName("Check that we can search for java")
    void searchJava(){
        webDriver.get(BASE_URL);
        WebElement search = webDriver.findElement(By.name("q"));
        search.sendKeys("Java", Keys.ENTER);
        MatcherAssert.assertThat(webDriver.getCurrentUrl(), is("https://hn.algolia.com/?q=Java"));
    }


    @Test
    @DisplayName("Testing the past button")
    public void pastTest() {
        LocalDate date = LocalDate.now();
        LocalDate expectedDate = date.minusDays(1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String expectedDateAsString = expectedDate.format(formatter);

        webDriver.get(BASE_URL);
        webDriver.findElement(By.linkText("past")).click();
        webDriver.findElement(By.cssSelector("td:nth-child(2) > .pagetop")).click();
        MatcherAssert.assertThat(webDriver.findElement(By.cssSelector("font")).getText(), CoreMatchers.is(expectedDateAsString));
    }

    @Test
    public void testLogin() {
        webDriver.get("https://news.ycombinator.com/login");
        webDriver.findElement(By.name("acct")).sendKeys("nonUser");
        webDriver.findElement(By.name("pw")).sendKeys("nopassword");
        webDriver.findElement(By.cssSelector("input:nth-child(3)")).click();
        MatcherAssert.assertThat(webDriver.findElement(By.cssSelector("body")).getText(), CoreMatchers.containsString("Bad login"));
    }


    @Test
    @DisplayName("Test amount of stories")
    void testStoriesTableSize() throws  Exception{
        webDriver.get("https://news.ycombinator.com");
        List<WebElement>  listItems = webDriver.findElements(By.className("rank"));
        MatcherAssert.assertThat(listItems.size(), is(30));
    }
}
