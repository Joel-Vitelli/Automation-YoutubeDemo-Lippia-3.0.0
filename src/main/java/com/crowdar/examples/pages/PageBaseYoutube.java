package com.crowdar.examples.pages;

import com.crowdar.core.pageObjects.PageBaseWeb;
import org.openqa.selenium.remote.RemoteWebDriver;

public class PageBaseYoutube extends PageBaseWeb {

    public PageBaseYoutube(RemoteWebDriver driver) {
        super(driver);
        BASE_URL = "http://www.youtube.com.ar";
    }


}
