package lv.neotech.tapost.stepdefs;

import cucumber.api.java.en.Given;
import cucumber.runtime.java.guice.ScenarioScoped;
import lv.neotech.tapost.core.DriverBase;

@ScenarioScoped
public class DirectNavigationSteps {

  @Given("^user navigates to URL (.+)$")
  public void iNavigateToGoogleCom(String url) {
    DriverBase.getDriver().get(url);
  }

}
