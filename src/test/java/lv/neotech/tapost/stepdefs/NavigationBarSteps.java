package lv.neotech.tapost.stepdefs;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import cucumber.api.java.en.Then;
import lv.neotech.tapost.pageobjects.NavigationBar;

public class NavigationBarSteps {

  private NavigationBar navigationBar;

  @Then("^Navigation Bar - is displayed$")
  public void navigationBarIsDisplayed() throws Throwable {
    navigationBar = new NavigationBar();
    assertThat(navigationBar.isPageDisplayed()).isTrue();
  }
}
