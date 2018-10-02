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

public class MainPage extends Page {

    @FindBy(id = "common-home")
    private WebElement divMainPageCobtainer;

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




}