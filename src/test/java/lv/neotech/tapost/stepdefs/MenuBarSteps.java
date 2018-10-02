package lv.neotech.tapost.stepdefs;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import cucumber.api.java.en.Then;
import cucumber.runtime.java.guice.ScenarioScoped;
import lv.neotech.tapost.pageobjects.TopBar;

@ScenarioScoped
public class MenuBarSteps {

  private TopBar topBar;

  @Then("^Top Bar - is displayed$")
  public void navigationBarIsDisplayed() throws Throwable {
    topBar = new TopBar();
    assertThat(topBar.isPageDisplayed()).isTrue();
  }

  @Then("^Top Bar - Search Bar is displayed$")
  public void topBarSearchBarIsDisplayed() throws Throwable {
    assertThat(topBar.isSearchBarDisplayed()).isTrue();
  }

  @Then("^Menu Bar - navigate to \"([^\"]*)\" category$")
  public void topBarNavigateToCategory(String navBarName) throws Throwable {
    topBar.navigateTo(navBarName);
  }

  @Then("^Menu Bar - navigate to \"([^\"]*)\" dropdown category and \"([^\"]*)\" category$")
  public void topBarNavigateToDropdownCategory(String navBarNameDrpdwn, String categoryName) throws Throwable {
    topBar.navigateToDropdownElement(navBarNameDrpdwn, categoryName);
  }
}
