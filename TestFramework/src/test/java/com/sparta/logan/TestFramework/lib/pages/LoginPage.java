package com.sparta.logan.TestFramework.lib.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends WebPage{

    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    protected boolean isCorrectPage() {
        return true;
    }

    public void enterIncorrectDetails(){
        wait.until(p -> p.findElement(By.name("acct")));
        webDriver.findElement(By.name("acct")).sendKeys("nonUser");
        webDriver.findElement(By.name("pw")).sendKeys("nopassword");
        webDriver.findElement(By.cssSelector("input:nth-child(3)")).click();
    }

    public boolean containsBadLoginText(){
        return webDriver.findElement(By.cssSelector("body")).getText().contains("Bad Login");
    }
}
