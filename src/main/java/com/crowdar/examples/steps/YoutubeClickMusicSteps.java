package com.crowdar.examples.steps;

import com.crowdar.core.Injector;
import com.crowdar.core.PageSteps;
import com.crowdar.examples.pages.YoutubeHomePage;
import com.crowdar.examples.pages.YoutubeSearchResultPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class YoutubeClickMusicSteps extends PageSteps {


    @When("The client click the music section")
    public void theClientClickTheMusicSectionOfYoutube(){
        Injector._page(YoutubeHomePage.class).clickMusicSection();
    }

    @And("The client open the (.*) video-musical")
    public void theClientClickTheResultOfMusicList(String number){
        Injector._page(YoutubeSearchResultPage.class).clickOnMusicalVideo(number);
    }

    @Then("The client see the video-musical")
    public void theClientSeeTheVideo() {
        Injector._page(YoutubeSearchResultPage.class).waitMusicalVideo();

    }

}
