package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class YoutubeHomePage extends PageBaseYoutube {

    private final String INPUT_SEARCH_SELECTOR = "#search-input.ytd-searchbox-spt input";
    private final String SEARCH_BUTTON_SELECTOR = "#search-icon-legacy";

    public YoutubeHomePage(RemoteWebDriver driver) {
        super(driver);
        this.url = "";
    }

    public void goHome() {
        navigateToCompleteURL();
    }

    public void enterSearchVideo(String text) {
        completeField(By.cssSelector(INPUT_SEARCH_SELECTOR), text);
    }

    public void clickSearchButton() {
        clickElement(By.cssSelector(SEARCH_BUTTON_SELECTOR));
    }

}
