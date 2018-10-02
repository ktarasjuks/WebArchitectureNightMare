package lv.neotech.tapost.stepdefs;

import static org.assertj.core.api.Assertions.assertThat;

import cucumber.api.java.en.Given;
import cucumber.runtime.java.guice.ScenarioScoped;
import lv.neotech.tapost.pageobjects.MainPage;

@ScenarioScoped
public class MainPageSteps {

  private MainPage mainPage;

  @Given("^user navigates to Demo shop$")
  public void userNavigatesToDemoShop() {
    mainPage = MainPage.navigate();
    assertThat(mainPage.isPageDisplayed()).isTrue();
  }

}
