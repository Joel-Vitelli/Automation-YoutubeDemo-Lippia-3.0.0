package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class YoutubeSearchResultPage extends PageBaseYoutube {
    private final String RESULTS_DIV_SELECTOR = "head > title";

    private WebElement stats() {
        return getWebElement(By.cssSelector(RESULTS_DIV_SELECTOR));
    }

    public YoutubeSearchResultPage(RemoteWebDriver driver) {
        super(driver);
        this.url = "";
    }

    public String getStats() {
        return stats().getText();
    }

}
