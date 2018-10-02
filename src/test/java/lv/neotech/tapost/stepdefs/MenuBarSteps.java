package lv.neotech.tapost.stepdefs;

import cucumber.api.java.en.Then;
import cucumber.runtime.java.guice.ScenarioScoped;
import lv.neotech.tapost.pageobjects.MenuBar;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@ScenarioScoped
public class MenuBarSteps {

  private MenuBar menuBar;

  @Then("^Menu Bar - is displayed$")
  public void navigationBarIsDisplayed() throws Throwable {
    menuBar = new MenuBar();
    assertThat(menuBar.isPageDisplayed()).isTrue();
  }

  @Then("^Menu Bar - Search Bar is displayed$")
  public void topBarSearchBarIsDisplayed() throws Throwable {
    assertThat(menuBar.isSearchBarDisplayed()).isTrue();
  }

  @Then("^Menu Bar - Shopping Cart is displayed$")
  public void topBarShoppingCartIsDisplayed() throws Throwable {
    assertThat(menuBar.isShoppingCartDisplayed()).isTrue();
  }

  @Then("^Menu Bar - Checkout is displayed$")
  public void topBarCheckoutIsDisplayed() throws Throwable {
    assertThat(menuBar.isShoppingCartDisplayed()).isTrue();
  }

  @Then("^Menu Bar - navigate to \"([^\"]*)\" category$")
  public void topBarNavigateToCategory(String navBarName) throws Throwable {
    menuBar.navigateTo(navBarName);
  }

  @Then("^Menu Bar - navigate to \"([^\"]*)\" dropdown category and \"([^\"]*)\" category$")
  public void topBarNavigateToDropdownCategory(String navBarNameDrpdwn, String categoryName) throws Throwable {
    menuBar.navigateToDropdownElement(navBarNameDrpdwn, categoryName);
  }
}
