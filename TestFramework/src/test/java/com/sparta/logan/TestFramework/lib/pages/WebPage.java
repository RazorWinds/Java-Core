package com.sparta.logan.TestFramework.lib.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class WebPage {
    protected final WebDriver webDriver;
    protected final WebDriverWait wait;

    public WebPage(WebDriver webDriver) {
        if (!isCorrectPage()) {
            throw new IllegalStateException("This is not "+ this.getClass().getName()+", " +
                    "current page is: " + webDriver.getCurrentUrl());
        }
        this.webDriver = webDriver;
        this.wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
    }

    public String getUrl() {
        return webDriver.getCurrentUrl();
    }

    public String getTitle() {
        return webDriver.getTitle();
    }

    protected abstract boolean isCorrectPage();
}
