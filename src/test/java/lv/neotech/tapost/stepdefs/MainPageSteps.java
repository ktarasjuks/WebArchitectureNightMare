package lv.neotech.tapost.stepdefs;

import com.google.inject.Inject;

import cucumber.api.java.en.Given;
import cucumber.runtime.java.guice.ScenarioScoped;
import lv.neotech.tapost.pageobjects.MainPage;
import lv.neotech.tapost.util.DataHolderDI;

import static org.assertj.core.api.Assertions.assertThat;

@ScenarioScoped
public class MainPageSteps {

  private MainPage mainPage;

  @Inject
  DataHolderDI dataHolder;

  @Given("^user navigates to Demo shop$")
  public void iNavigateToGoogleCom() {
    mainPage = MainPage.navigate();
    assertThat(mainPage.isPageDisplayed()).isTrue();
  }

}
