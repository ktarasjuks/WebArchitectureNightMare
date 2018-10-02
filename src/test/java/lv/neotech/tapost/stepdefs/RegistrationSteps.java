package lv.neotech.tapost.stepdefs;

import com.google.inject.Inject;

import java.util.Map;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.runtime.java.guice.ScenarioScoped;
import lombok.extern.slf4j.Slf4j;
import lv.neotech.tapost.pageobjects.RegistrationPage;
import lv.neotech.tapost.util.DataHolderDI;

@ScenarioScoped
@Slf4j
public class RegistrationSteps {

    @Inject
    DataHolderDI dataHolder;

    @Inject
    RegistrationPage registrationPage;

    @And("^selects \"([^\"]*)\" option$")
    public void selectsOption(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^inputs the following information$")
    public void inputsTheFollowingInformation(Map<String, String> fieldsToValues) throws Throwable {
        fieldsToValues.forEach((key, value) -> registrationPage.setInputFieldValue(key, value));
    }

    @Then("^registration succeeds$")
    public void registrationSucceeds() throws Throwable {
    }

}
