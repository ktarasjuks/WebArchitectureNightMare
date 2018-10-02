package lv.neotech.tapost.pageobjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import lv.neotech.tapost.config.ApplicationProperties;
import lv.neotech.tapost.config.ApplicationProperties.ApplicationProperty;
import lv.neotech.tapost.core.WebElementHelper;
import lv.neotech.tapost.pageobjects.base.Page;

public class MainPage extends Page {

    @FindBy(id = "common-home")
    private WebElement divMainPageContainer;

    public MainPage() {
        waitUntilLoaded();
    }

    @Override
    protected WebElement getControlElement() {
        return divMainPageContainer;
    }

    public static MainPage navigate() {
        WebElementHelper.navigateToPage(ApplicationProperties.getString(ApplicationProperty.APP_URL));
        return new MainPage();
    }

}