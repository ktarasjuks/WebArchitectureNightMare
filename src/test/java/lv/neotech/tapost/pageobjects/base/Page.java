package lv.neotech.tapost.pageobjects.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import lv.neotech.tapost.core.DriverBase;
import lv.neotech.tapost.core.WebElementHelper;

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
//        wait.until((element) -> isPageDisplayed());
    }

    public boolean isPageDisplayed() {
        WebElement controlElement = getControlElement();
        return controlElement != null && WebElementHelper.isElementDisplayed(controlElement);
    }

    protected abstract WebElement getControlElement();

}
