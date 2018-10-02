package lv.neotech.tapost.pageobjects;


import lv.neotech.tapost.config.ApplicationProperties;
import lv.neotech.tapost.config.ApplicationProperties.ApplicationProperty;
import lv.neotech.tapost.core.WebElementHelper;
import lv.neotech.tapost.pageobjects.base.Page;
import lv.neotech.tapost.pageobjects.google.GoogleSearchResultPage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class MainPage extends Page {

    @FindBy(id = "common-home")
    private WebElement divMainPageCobtainer;

    @FindBy(className = "product-layout col-lg-3 col-md-3 col-sm-6 col-xs-12")
    private List<WebElement> divProducts;

    public MainPage() {
        wait.until(ExpectedConditions.visibilityOf(divMainPageCobtainer));
    }

    public static MainPage navigate() {
        WebElementHelper.navigateToPage(ApplicationProperties.getString(ApplicationProperty.APP_URL));
        return new MainPage();
    }

    public boolean isPageDisplayed() {
        return WebElementHelper.isElementDisplayed(divMainPageCobtainer);
    }

    public WebElement getProduct(int orderNumber) {
        return divProducts.get(orderNumber);
    }


}