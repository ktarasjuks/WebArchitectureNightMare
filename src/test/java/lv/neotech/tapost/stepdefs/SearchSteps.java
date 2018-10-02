package lv.neotech.tapost.stepdefs;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.runtime.java.guice.ScenarioScoped;
import lv.neotech.tapost.pageobjects.SearchResultsPage;
@ScenarioScoped
public class SearchSteps {

  private SearchResultsPage searchResultsPage;

  @Then("^Search Page - is displayed$")
  public void searchPageIsDisplayed() throws Throwable {
    searchResultsPage = new SearchResultsPage();
    assertThat(searchResultsPage.isPageDisplayed()).isTrue();
  }

  @And("^Search Page - all results should contain \"([^\"]*)\" word$")
  public void searchPageAllResultsShouldContainWord(String textToContain) throws Throwable {
//    todo
  }
}
