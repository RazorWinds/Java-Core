package com.sparta.logan.TestFramework.lib.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends WebPage {

    private final By pastLink = new By.ByLinkText("past");
    private final By searchField = new By.ByName("q");

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    protected boolean isCorrectPage() {
        return webDriver.getTitle().equals("Hacker News");
    }

    public PastPage goToPastPage() {
        webDriver.findElement(pastLink).click();
        return new PastPage(webDriver);
    }

    public LoginPage goToLoginPage(){
        webDriver.findElement(By.linkText("login")).click();
        return new LoginPage(webDriver);
    }

    public  SearchPage search(String input){
        WebElement search = webDriver.findElement(By.name("q"));
        search.sendKeys(input, Keys.ENTER);
        return new SearchPage(webDriver);
    }

}