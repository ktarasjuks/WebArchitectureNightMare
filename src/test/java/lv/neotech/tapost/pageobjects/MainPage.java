package lv.neotech.tapost.pageobjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import lv.neotech.tapost.config.ApplicationProperties;
import lv.neotech.tapost.config.ApplicationProperties.ApplicationProperty;
import lv.neotech.tapost.core.WebElementHelper;
import lv.neotech.tapost.pageobjects.base.Page;

import java.util.List;

public class MainPage extends Page {

    @FindBy(id = "common-home")
    private WebElement divMainPageContainer;

    @FindBy(className = "product-layout col-lg-3 col-md-3 col-sm-6 col-xs-12")
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


}