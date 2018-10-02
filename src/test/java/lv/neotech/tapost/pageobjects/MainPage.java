package lv.neotech.tapost.pageobjects;


import java.util.List;
import lv.neotech.tapost.config.ApplicationProperties;
import lv.neotech.tapost.config.ApplicationProperties.ApplicationProperty;
import lv.neotech.tapost.core.WebElementHelper;
import lv.neotech.tapost.pageobjects.base.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends Page {

  @FindBy(id = "common-home")
  private WebElement divMainPageContainer;

  @FindBy(className = "product-layout")
  private List<WebElement> divProducts;

  public MainPage() {
    waitUntilLoaded();
  }

  @Override
  protected WebElement getControlElement() {
    return divMainPageContainer;
  }

  public static MainPage navigate() {
    WebElementHelper.navigateToPage(ApplicationProperties.getString(ApplicationProperty.APP_URL));
    return new MainPage();
  }

  public boolean isPageDisplayed() {
    return WebElementHelper.isElementDisplayed(divMainPageContainer);
  }

  public WebElement getProduct(int orderNumber) {
    return divProducts.get(orderNumber);
  }

    public void addProduct() {
        getProduct(0).findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[3]/button[1]/span")).click();
            }
    public String getProductPrice() {
        String price = getProduct(0).findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[2]/p[2]/span")).getText();
        price = price.replace("Ex Tax: ","");
        return price;
    }



}