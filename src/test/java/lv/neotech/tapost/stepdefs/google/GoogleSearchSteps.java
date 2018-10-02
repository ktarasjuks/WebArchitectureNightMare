package lv.neotech.tapost.stepdefs.google;

import com.google.inject.Inject;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.runtime.java.guice.ScenarioScoped;
import lv.neotech.tapost.pageobjects.google.GooglePage;
import lv.neotech.tapost.util.DataHolderDI;

@ScenarioScoped
public class GoogleSearchSteps {

  private GooglePage googlePage;

  @Inject
  DataHolderDI dataHolder;

  @Given("^I navigate to Google page")
  public void iNavigateToGoogleCom() throws Throwable {
    googlePage = GooglePage.navigate();
  }

  @Given("^I navigate to demoshop24 page")
  public void iNavigateToDemoshop() throws Throwable {

  }

  @When("^I search for \"([^\"]*)\"$")
  public void iSearchFor(String searchItem) throws Throwable {
    googlePage.searchFor(searchItem);
  }

  @When("^I set variable in one class$")
  public void iSetVariableInOneClass() throws Throwable {
    dataHolder.setSharedVariable("SHARED VARIABLE");
  }
}
