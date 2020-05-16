package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class YoutubeSearchResultPage extends PageBaseYoutube {
    private final String RESULTS_DIV_SELECTOR = "head > title";
    private static final String RESULT_SELECTOR = "#contents > ytd-video-renderer:nth-child(1)";
    private static final String MUSIC_RESULT_SELECTOR = "#contents > ytd-rich-item-renderer:nth-child(%s)";
    private static final String TRENDING_RESULT_SELECTOR = "#grid-container > ytd-video-renderer:nth-child(%s)";

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

    public void clickOnResult(){
        clickElement(By.cssSelector(RESULT_SELECTOR));
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("#top-level-buttons > ytd-button-renderer:nth-child(3)")));

    }

    public String getTitleText(){
        return driver.getTitle();
    }

    public void clickOnMusicalVideo(String number){
        clickElement(By.cssSelector(String.format(MUSIC_RESULT_SELECTOR, number)));

    }

    public void waitMusicalVideo(){
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#movie_player > div.html5-video-container > video")));
    }

    public void clickOnTrendingVideo(String number){
        clickElement(By.cssSelector(String.format(TRENDING_RESULT_SELECTOR, number)));

    }

    public void waitTrendingVideo(){
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#movie_player > div.html5-video-container > video")));
    }

}
