package lv.neotech.tapost.pageobjects.base;

import lv.neotech.tapost.core.DriverBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import static lv.neotech.tapost.config.Constants.WAIT_SHORT_SECONDS;

public class Page {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public Page() {
        driver = DriverBase.getDriver();
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, WAIT_SHORT_SECONDS);
    }

}
