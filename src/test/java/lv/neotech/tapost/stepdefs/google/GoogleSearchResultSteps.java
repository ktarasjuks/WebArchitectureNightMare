package lv.neotech.tapost.stepdefs.google;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.fail;

import com.google.inject.Inject;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.java.guice.ScenarioScoped;
import lombok.extern.slf4j.Slf4j;
import lv.neotech.tapost.pageobjects.google.GoogleSearchResultPage;
import lv.neotech.tapost.util.DataHolderDI;

@ScenarioScoped
@Slf4j
public class GoogleSearchResultSteps {

    @Inject
    DataHolderDI dataHolder;

    private GoogleSearchResultPage googleSearchResultPage;


    @Then("^first result should contain word \"([^\"]*)\"$")
    public void firstResultShouldContainWord(String searchResult) throws Throwable {
        assertThat(googleSearchResultPage.getSearchResultElements().get(0).getText().toLowerCase()).contains(searchResult);
    }

    @Then("^I purposefully fail this scenario to get a screenshot")
    public void iPurposefullyFailThisFeature() throws Throwable {
        fail();
    }

    @When("^I wait for (\\d+) seconds$")
    public void iWaitForSeconds(int waitTimeInSeconds) throws Throwable {
        Thread.sleep(waitTimeInSeconds*1000);
    }

    @Then("^search result is displayed$")
    public void searchResultIsDisplayed() throws Throwable {
        googleSearchResultPage = new GoogleSearchResultPage();
    }

    @Then("^I retrieve variable in other class$")
    public void iRetrieveVariableInOtherClass() throws Throwable {
        assertThat(dataHolder.getSharedVariable()).isNotNull();
    }
}
