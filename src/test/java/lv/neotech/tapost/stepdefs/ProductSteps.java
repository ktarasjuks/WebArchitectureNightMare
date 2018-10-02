package lv.neotech.tapost.stepdefs;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import cucumber.api.java.en.Then;
import cucumber.runtime.java.guice.ScenarioScoped;
import lv.neotech.tapost.pageobjects.ProductPage;

@ScenarioScoped
public class ProductSteps {

  private ProductPage productPage;

  @Then("^Product Page - is displayed$")
  public void navigationBarIsDisplayed() throws Throwable {
    productPage = new ProductPage();
    assertThat(productPage.isPageDisplayed()).isTrue();
  }

  @Then("^Product Page - \"([^\"]*)\" category is displayed$")
  public void softwareCategoryIsDisplayed(String category) throws Throwable {
    assertThat(productPage.isPageDisplayed(category)).isTrue();
  }
}
