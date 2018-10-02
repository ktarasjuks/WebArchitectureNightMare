package lv.neotech.tapost.pageobjects;


import lv.neotech.tapost.core.WebElementHelper;
import lv.neotech.tapost.pageobjects.base.Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProductPage extends Page {

    @FindBy(id = "content")
    private WebElement divProductContainer;

    @FindBy(css = "#content h2")
    private WebElement hdrProductHeader;

    public ProductPage() {
        wait.until(ExpectedConditions.visibilityOf(divProductContainer));
    }

    public boolean isPageDisplayed(String category) {
        return WebElementHelper.isElementDisplayed(divProductContainer)
            && WebElementHelper.getText(hdrProductHeader).equals(category);
    }

    @Override
    protected WebElement getControlElement() {
        return divProductContainer;
    }


}