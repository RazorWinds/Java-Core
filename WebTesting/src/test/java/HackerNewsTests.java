
import java.io.File;
import java.io.IOException;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;


public class HackerNewsTests {

    private static final String DRIVER_LOCATION = "src/test/resources/chromedriver.exe";
    private static final String URL_UNDER_TEST = "https://news.ycombinator.com/";
    private static ChromeDriverService service;
    private WebDriver driver;

    public ChromeOptions getChromeOptions() {
        ChromeOptions options = new ChromeOptions();
        // the browser to be maximised
        options.addArguments("--start-maximized");
        // the code should run without opening the browser
  //      options.addArguments("--headless");
        // The browser should allow access from the test program
        options.addArguments("--remote-allow-origins=*");

        return options;
    }

    @BeforeAll
    static void startService() throws IOException {
        service = new ChromeDriverService.Builder()
                .usingDriverExecutable(new File(DRIVER_LOCATION))
                .usingAnyFreePort()
                .build();
        service.start();
    }

    @AfterAll
    static void stopService() {
        service.stop();
    }

    @BeforeEach
    void setup() {
        driver = new RemoteWebDriver(service.getUrl(), getChromeOptions());
    }

    @AfterEach
    void closeDriverWindow() {
        driver.quit();
    }

    @Test
    @DisplayName("Check that the webdriver works")
    public void checkWebDriver() {
        driver.get(URL_UNDER_TEST);
        Assertions.assertEquals("https://news.ycombinator.com/", driver.getCurrentUrl());
        Assertions.assertEquals("Hacker News", driver.getTitle());
    }
}
