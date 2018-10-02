package lv.neotech.tapost.pageobjects;


import lv.neotech.tapost.core.WebElementHelper;
import lv.neotech.tapost.pageobjects.base.Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ShoppingCartPage extends Page {

    @FindBy(id = "checkout-cart")
    private WebElement divShoppingCartPageCobtainer;

    @FindBy(xpath = "//*[@id=\"content\"]/div[3]/div[2]/a")
    private WebElement checkOutButton;

    @Override
    protected WebElement getControlElement() {
        return divShoppingCartPageCobtainer;
    }

    public ShoppingCartPage() {
        wait.until(ExpectedConditions.visibilityOf(divShoppingCartPageCobtainer));
    }


    public boolean isPageDisplayed() {
        return WebElementHelper.isElementDisplayed(divShoppingCartPageCobtainer);
    }
    public boolean isCheckOutButtonDisplayed() {
        return WebElementHelper.isElementDisplayed(checkOutButton);
    }



}