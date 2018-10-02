package lv.neotech.tapost.pageobjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import lv.neotech.tapost.config.ApplicationProperties;
import lv.neotech.tapost.config.ApplicationProperties.ApplicationProperty;
import lv.neotech.tapost.core.DriverBase;
import lv.neotech.tapost.core.WebElementHelper;
import lv.neotech.tapost.pageobjects.base.Page;

public class TopBar extends Page {

    @FindBy(id = "menu")
    private WebElement navNavigationBarContainer;

    public TopBar() {
        waitUntilLoaded();
    }

    @Override
    protected WebElement getControlElement() {
        return navNavigationBarContainer;
    }

    public static TopBar navigate() {
        WebElementHelper.navigateToPage(ApplicationProperties.getString(ApplicationProperty.APP_URL));
        return new TopBar();
    }

    public void navigateToShoppingCart() {
        DriverBase.getDriver().findElement(new By.ByLinkText("Shopping Cart")).click();
    }
}