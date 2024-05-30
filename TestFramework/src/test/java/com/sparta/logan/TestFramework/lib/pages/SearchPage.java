package com.sparta.logan.TestFramework.lib.pages;

import org.openqa.selenium.WebDriver;

public class SearchPage extends WebPage {


    public SearchPage(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    protected boolean isCorrectPage() {
        return true;
    }

}
