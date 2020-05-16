package com.crowdar.examples.steps;

import com.crowdar.core.Injector;
import com.crowdar.core.PageSteps;
import com.crowdar.examples.pages.YoutubeHomePage;
import com.crowdar.examples.pages.YoutubeSearchResultPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;


public class YoutubeClickFirstResultSteps extends PageSteps {

    @Given("The client is in the home of youtube page")
    public void home() {
        Injector._page(YoutubeHomePage.class).goHome();
    }


    @When("The client go to search for (.*) and click the first result")
    public void theClientSearchForAutomationOnYoutube(String texto){
        Injector._page(YoutubeHomePage.class).enterSearchVideo(texto);
        Injector._page(YoutubeHomePage.class).clickSearchButton();
        Injector._page(YoutubeSearchResultPage.class).clickOnResult();

    }

    @Then("The client see the video selected")
    public void titleVerfication() {
        Assert.assertEquals("New Automation Game Record! Almost 4500HP From The Mighty V16! - YouTube", Injector._page(YoutubeSearchResultPage.class).getTitleText());

    }

}
