package lv.neotech.tapost.pageobjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import lv.neotech.tapost.config.ApplicationProperties;
import lv.neotech.tapost.config.ApplicationProperties.ApplicationProperty;
import lv.neotech.tapost.core.DriverBase;
import lv.neotech.tapost.core.WebElementHelper;
import lv.neotech.tapost.pageobjects.base.Page;

import java.util.List;

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


}