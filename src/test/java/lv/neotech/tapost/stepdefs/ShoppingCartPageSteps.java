package lv.neotech.tapost.stepdefs;

import com.google.inject.Inject;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.java.guice.ScenarioScoped;
import lv.neotech.tapost.pageobjects.MainPage;
import lv.neotech.tapost.pageobjects.ShoppingCartPage;
import lv.neotech.tapost.util.DataHolderDI;

import static org.assertj.core.api.Assertions.assertThat;

@ScenarioScoped
public class ShoppingCartPageSteps {

    private ShoppingCartPage shoppingCartPage;
    @Inject
    private MainPage mainPage;

    @Inject
    DataHolderDI dataHolder;

    @Given("^user navigates to Shopping Cart page$")
    public void userNavigatesToShoppingCart() throws Throwable {
        shoppingCartPage = ShoppingCartPage.navigate();
    }


    @Then("^Shopping Cart Page - is displayed$")
    public void shoppingCartPageIsDisplayed() throws Throwable {
        assertThat(shoppingCartPage.isPageDisplayed()).isTrue();
    }

    @When("^users add product to shopping cart$")
    public void usersAddProductToShoppingCart() throws Throwable {
        mainPage.getProduct(0);

    }
}
