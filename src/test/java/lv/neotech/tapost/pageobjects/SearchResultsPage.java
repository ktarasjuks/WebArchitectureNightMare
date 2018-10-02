package lv.neotech.tapost.pageobjects;


import java.util.List;
import lv.neotech.tapost.pageobjects.base.Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultsPage extends Page {
  @FindBy(id = "product-search")
  private WebElement searchResultPageContainer;

  @FindBy(className = "product-layout")
  private List<WebElement> divProducts;

  public SearchResultsPage() {
    waitUntilLoaded();
  }

  @Override
  protected WebElement getControlElement() {
    return searchResultPageContainer;
  }

}