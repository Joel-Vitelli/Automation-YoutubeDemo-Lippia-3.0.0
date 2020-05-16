package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class YoutubeHomePage extends PageBaseYoutube {

    private final String INPUT_SEARCH_SELECTOR = "#search-input.ytd-searchbox-spt input";
    private final String SEARCH_BUTTON_SELECTOR = "#search-icon-legacy";
    private final String MUSIC_SECTION_FULL_XPATH = "/html/body/ytd-app/div/app-drawer/div[2]/div/div[2]/div[2]/ytd-guide-renderer/div[1]/ytd-guide-section-renderer[3]/div/ytd-guide-entry-renderer[1]/a/paper-item";
    private final String TENDENCIES_SECTION_SELECTOR = "#items > ytd-guide-entry-renderer:nth-child(2)";

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
    public void clickMusicSection(){
        clickElement(By.xpath(MUSIC_SECTION_FULL_XPATH));

    }

    public void clickTendenciesSection(){
        clickElement(By.cssSelector(TENDENCIES_SECTION_SELECTOR));

    }
}
