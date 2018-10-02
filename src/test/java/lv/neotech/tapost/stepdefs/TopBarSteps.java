package lv.neotech.tapost.stepdefs;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import cucumber.api.java.en.Then;
import lv.neotech.tapost.pageobjects.TopBar;

public class TopBarSteps {

  private TopBar topBar;

  @Then("^Top Bar - is displayed$")
  public void navigationBarIsDisplayed() throws Throwable {
    topBar = new TopBar();
    assertThat(topBar.isPageDisplayed()).isTrue();
  }
}
