package lv.neotech.tapost.pageobjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import lv.neotech.tapost.config.ApplicationProperties;
import lv.neotech.tapost.config.ApplicationProperties.ApplicationProperty;
import lv.neotech.tapost.core.WebElementHelper;
import lv.neotech.tapost.pageobjects.base.Page;

public class ShoppingCartPage extends Page {

    @FindBy(id = "checkout-cart")
    private WebElement divShoppingCartPageCobtainer;

    @Override
    protected WebElement getControlElement() {
        return divShoppingCartPageCobtainer;
    }

    public ShoppingCartPage() {
        wait.until(ExpectedConditions.visibilityOf(divShoppingCartPageCobtainer));
    }

    public static ShoppingCartPage navigate() {
        WebElementHelper.navigateToPage("http://demoshop24.com/index.php?route=checkout/cart");//ApplicationProperties.getString(ApplicationProperty.APP_URL));
        return new ShoppingCartPage();
    }

    public boolean isPageDisplayed() {
        return WebElementHelper.isElementDisplayed(divShoppingCartPageCobtainer);
    }


}