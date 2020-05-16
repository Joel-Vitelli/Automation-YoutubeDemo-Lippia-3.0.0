package com.crowdar.examples.steps;

import com.crowdar.core.Injector;
import com.crowdar.core.PageSteps;
import com.crowdar.examples.pages.YoutubeHomePage;
import com.crowdar.examples.pages.YoutubeSearchResultPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class YoutubeClickTrendingSteps extends PageSteps {

    @When("The client click the trending section")
    public void theClientClickTheTendenciesSectionOfYoutube(){
        Injector._page(YoutubeHomePage.class).clickTendenciesSection();
    }

    @And("The client open the (.*) video on trending list")
    public void theClientClickTheResultOfTendenciesList(String number){
        Injector._page(YoutubeSearchResultPage.class).clickOnTrendingVideo(number);
    }

    @Then("The client see the video")
    public void theClientSeeTheTendencieVideo() {
        Injector._page(YoutubeSearchResultPage.class).waitTrendingVideo();

    }

}
