package lv.neotech.tapost.stepdefs;

import static org.assertj.core.api.Assertions.assertThat;

import com.google.inject.Inject;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.runtime.java.guice.ScenarioScoped;
import lv.neotech.tapost.pageobjects.MainPage;
import lv.neotech.tapost.util.DataHolderDI;

@ScenarioScoped
public class MainPageSteps {

  private MainPage mainPage;

  @Inject
  DataHolderDI dataHolder;

  @Given("^user navigates to Demo shop$")
  public void userNavigatesToDemoShop() throws Throwable {
    mainPage = MainPage.navigate();
  }


  @Then("^Main Page - is displayed$")
  public void mainPageIsDisplayed() throws Throwable {
    assertThat(mainPage.isPageDisplayed()).isTrue();
  }
}
