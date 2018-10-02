package lv.neotech.tapost.stepdefs.google;

import com.google.inject.Inject;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.java.guice.ScenarioScoped;
import lombok.extern.slf4j.Slf4j;
import lv.neotech.tapost.pageobjects.google.GoogleSearchResultPage;
import lv.neotech.tapost.util.DataHolderDI;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.fail;

@ScenarioScoped
@Slf4j
public class RegistrationSteps {

    @Inject
    DataHolderDI dataHolder;


}
