package lv.neotech.tapost.pageobjects.base;

import lv.neotech.tapost.core.DriverBase;
import lv.neotech.tapost.core.WebElementHelper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static lv.neotech.tapost.config.Constants.WAIT_SHORT_SECONDS;

public abstract class Page {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public Page() {
        driver = DriverBase.getDriver();
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, WAIT_SHORT_SECONDS);
    }

    public void waitUntilLoaded() {
        wait.until(ExpectedConditions.visibilityOf(getControlElement()));
    }

    public boolean isPageDisplayed() {
        return WebElementHelper.isElementDisplayed(getControlElement());
    }

    protected abstract WebElement getControlElement();

}
