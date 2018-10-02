package lv.neotech.tapost.stepdefs;

import com.google.inject.Inject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.java.guice.ScenarioScoped;
import lv.neotech.tapost.core.DriverBase;
import lv.neotech.tapost.core.WebElementHelper;
import lv.neotech.tapost.model.ShoppingCart;
import lv.neotech.tapost.pageobjects.MainPage;
import lv.neotech.tapost.pageobjects.MenuBar;
import lv.neotech.tapost.pageobjects.ShoppingCartPage;
import lv.neotech.tapost.util.DataHolderDI;

import static org.assertj.core.api.Assertions.assertThat;

@ScenarioScoped
public class ShoppingCartPageSteps {

    private ShoppingCartPage shoppingCartPage;

    private ShoppingCart shoppingCart = new ShoppingCart();
    @Inject
    private MainPage mainPage;

    @Inject
    private MenuBar menuBar;

    @Inject
    DataHolderDI dataHolder;

    @Given("^user navigates to Shopping Cart page$")
    public void userNavigatesToShoppingCart() throws Throwable {
        menuBar.navigateToShoppingCart();
    }


    @Then("^Shopping Cart Page - is displayed$")
    public void shoppingCartPageIsDisplayed() throws Throwable {
        shoppingCartPage= new ShoppingCartPage();
        assertThat(shoppingCartPage.isPageDisplayed()).isTrue();
    }

    @When("^users add product to shopping cart$")
    public void usersAddProductToShoppingCart() throws Throwable {
        mainPage.addProduct();
        shoppingCart.setPrice(mainPage.getProductPrice());
   }

    @And("^validates the price with product price$")
    public void validatesThePriceWithProductPrice() throws Throwable {

        String price = DriverBase.getDriver().findElement(By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[5]")).getText();
        assertThat(shoppingCart.getPrice()).isEqualTo(price);
    }
}
