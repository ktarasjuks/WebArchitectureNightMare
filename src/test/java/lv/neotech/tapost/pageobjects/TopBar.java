package lv.neotech.tapost.pageobjects;


import lv.neotech.tapost.config.ApplicationProperties;
import lv.neotech.tapost.config.ApplicationProperties.ApplicationProperty;
import lv.neotech.tapost.core.WebElementHelper;
import lv.neotech.tapost.pageobjects.base.Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TopBar extends Page {

    @FindBy(id = "menu")
    private WebElement navNavigationBarCobtainer;

    public TopBar() {
        wait.until(ExpectedConditions.visibilityOf(navNavigationBarCobtainer));
    }

    public static TopBar navigate() {
        WebElementHelper.navigateToPage(ApplicationProperties.getString(ApplicationProperty.APP_URL));
        return new TopBar();
    }

    public boolean isPageDisplayed() {
        return WebElementHelper.isElementDisplayed(navNavigationBarCobtainer);
    }




}