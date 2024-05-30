package com.sparta.logan.TestFramework.lib.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PastPage extends WebPage {

    public PastPage(WebDriver webDriver) {
        super(webDriver);
    }
    @Override
    protected boolean isCorrectPage() {
        return webDriver.getTitle().contains("front | Hacker News");
    }

    public String getDate(){
        return webDriver.findElement(By.cssSelector("font")).getText();
    }
}
