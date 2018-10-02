package lv.neotech.tapost.pageobjects.google;


import lv.neotech.tapost.config.ApplicationProperties;
import lv.neotech.tapost.core.WebElementHelper;
import lv.neotech.tapost.pageobjects.base.Page;
import lv.neotech.tapost.config.ApplicationProperties.ApplicationProperty;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GooglePage extends Page {

    @FindBy(how = How.NAME, using = "q")
    private WebElement inputField;

    public GooglePage() {
        wait.until(ExpectedConditions.visibilityOf(inputField));
    }

    public static GooglePage navigate() {
        WebElementHelper.navigateToPage(ApplicationProperties.getString(ApplicationProperty.GOOGLE_URL));
        return new GooglePage();
    }

    public GoogleSearchResultPage searchFor(String textToSearchFor) {
        WebElementHelper.sendKeys(inputField, textToSearchFor, Keys.ENTER);
        return new GoogleSearchResultPage();
    }

}