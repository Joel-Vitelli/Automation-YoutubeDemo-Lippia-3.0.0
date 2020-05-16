package com.crowdar.examples.steps;

import com.crowdar.core.Injector;
import com.crowdar.core.PageSteps;
import com.crowdar.examples.pages.YoutubeHomePage;
import com.crowdar.examples.pages.YoutubeSearchResultPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;


public class YoutubeSearchSteps extends PageSteps {

    @Given("The client is in youtube page")
    public void goHome() {
        Injector._page(YoutubeHomePage.class).goHome();
    }

    @When("The client search for (.*)")
    public void search(String nombre_video) {
        Injector._page(YoutubeHomePage.class).enterSearchVideo(nombre_video);
        Injector._page(YoutubeHomePage.class).clickSearchButton();

    }

    @Then("The client verify that results are shown properly")
    public void statVerfication() {
        Assert.assertFalse(!Injector._page(YoutubeSearchResultPage.class).getStats().isEmpty());
    }

}
