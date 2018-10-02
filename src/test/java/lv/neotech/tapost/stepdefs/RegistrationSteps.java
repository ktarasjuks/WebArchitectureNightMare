package lv.neotech.tapost.stepdefs;

import com.google.inject.Inject;

import java.util.Map;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.runtime.java.guice.ScenarioScoped;
import lombok.extern.slf4j.Slf4j;
import lv.neotech.tapost.pageobjects.RegistrationPage;
import lv.neotech.tapost.pageobjects.TopBar;
import lv.neotech.tapost.util.DataHolderDI;

@ScenarioScoped
@Slf4j
public class RegistrationSteps {

    @Inject
    private DataHolderDI dataHolder;

    @Inject
    private RegistrationPage registrationPage;

    @Inject
    private TopBar topBar;


    @And("^inputs the following information$")
    public void inputsTheFollowingInformation(Map<String, String> fieldsToValues)  {
        fieldsToValues.forEach((key, value) -> registrationPage.setInputFieldValue(key, value));
    }

    @And("^clicks Agree to Policy$")
    public void clickAgree() {
        registrationPage.clickAgree();
    }

    @And("^clicks Continue$")
    public void clickContinue() {
        registrationPage.clickContinue();
    }

    @Then("^registration succeeds$")
    public void registrationSucceeds() {
    }

}
