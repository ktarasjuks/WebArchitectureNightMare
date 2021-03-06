package lv.neotech.tapost.pageobjects;


import java.util.List;
import java.util.stream.Collectors;
import lv.neotech.tapost.config.ApplicationProperties;
import lv.neotech.tapost.config.ApplicationProperties.ApplicationProperty;
import lv.neotech.tapost.core.DriverBase;
import lv.neotech.tapost.core.WebElementHelper;
import lv.neotech.tapost.pageobjects.base.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuBar extends Page {


  @FindBy(id = "menu")
  private WebElement navNavigationBarContainer;


  @FindBy(css = "#search input")
  private WebElement inputSearchBar;

  @FindBy(id = "cart")
  private WebElement shoppingCart;



  @FindBy(css = ".navbar-nav > li")
  private List<WebElement> navBarElements;

  @FindBy(css = ".navbar-nav > li")
  private List<WebElement> navBarDropdownElement;

  private WebElement getNavBarDrodpownElement(String text) {
    return  navNavigationBarContainer.findElement(By.xpath("//*[@class='dropdown']//a[text()='" + text + "']"));
  }

  public MenuBar() {
    waitUntilLoaded();
  }

  @Override
  protected WebElement getControlElement() {
    return navNavigationBarContainer;
  }

  public static MenuBar navigate() {
    WebElementHelper.navigateToPage(ApplicationProperties.getString(ApplicationProperty.APP_URL));
    return new MenuBar();
  }

  public boolean isPageDisplayed() {
    return WebElementHelper.isElementDisplayed(navNavigationBarContainer);
  }
  public boolean isSearchBarDisplayed() {
    return WebElementHelper.isElementDisplayed(inputSearchBar);
  }

  public boolean isShoppingCartDisplayed() {
    return WebElementHelper.isElementDisplayed(shoppingCart);
  }
  public boolean isCheckOutDisplayed() {
    return WebElementHelper.isElementDisplayed(shoppingCart);
  }

  private WebElement getShoppingCartElement(){
    return DriverBase.getDriver().findElement(By.xpath("//*[@id='top']//a[@title='Shopping Cart']"));
  }

  public void navigateToShoppingCart() {
    getShoppingCartElement().click();
  }

  public WebElement getNavBarElement(String navBarName) {
    List<WebElement> list = navBarElements.stream().filter(el -> el.getText().equals(navBarName))
        .collect(Collectors.toList());

    if (list.size() > 1) {
      throw new RuntimeException("More than one element is found for: " + navBarName);
    }

    return list.get(0);
  }

  public void navigateTo(String navBarName) {
    WebElement navBarElement = getNavBarElement(navBarName);
    WebElementHelper.click(navBarElement);
  }


  public void navigateToDropdownElement(String navBarName, String elementToClickText) {
    WebElement navBarElement = getNavBarElement(navBarName);
    WebElement elementToClick = getNavBarDrodpownElement(elementToClickText);
    WebElementHelper.hoverOverAndClick(navBarElement, elementToClick);

  }

  public void searchFor(String itemToSearch) {
    WebElementHelper.sendKeys(inputSearchBar, itemToSearch, Keys.ENTER);
  }
}