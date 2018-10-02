package lv.neotech.tapost.stepdefs;

import com.google.inject.Inject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import cucumber.runtime.java.guice.ScenarioScoped;
import lombok.extern.slf4j.Slf4j;
import lv.neotech.tapost.pageobjects.RegistrationPage;
import lv.neotech.tapost.pageobjects.TopBar;
import lv.neotech.tapost.util.DataHolderDI;

@ScenarioScoped
@Slf4j
public class TopBarSteps {

    @Inject
    private DataHolderDI dataHolder;

    @Inject
    private RegistrationPage registrationPage;

    @Inject
    private TopBar topBar;

    @When("^clicks Top Bar main option \"([^\"]*)\"$")
    public void selectsTopOption(String optionName) {
        topBar.clickTopLevelOption(optionName);
    }

    @When("^Top Bar button \"([^\"]*)\" is clickable$")
    public void topBarButtonIsClickable(String optionName) {
        topBar.buttonIsClickable(optionName);
    }

    @And("^selects \"([^\"]*)\" option$")
    public void selectsOption(String optionName) throws Throwable {
        topBar.clickSubOption(optionName);
    }

}
