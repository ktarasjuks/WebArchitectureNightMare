package lv.neotech.tapost.pageobjects;


import com.google.inject.Inject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import cucumber.runtime.java.guice.ScenarioScoped;
import lv.neotech.tapost.config.ApplicationProperties;
import lv.neotech.tapost.config.ApplicationProperties.ApplicationProperty;
import lv.neotech.tapost.core.DriverBase;
import lv.neotech.tapost.core.WebElementHelper;
import lv.neotech.tapost.pageobjects.base.Page;

import static java.lang.String.format;

@ScenarioScoped
public class RegistrationPage extends Page {

    @Inject
    private BreadcrumbsBar breadcrumbsBar;

    @FindBy(id = "common-home")
    private WebElement divMainPageContainer;

    @FindBy(id = "input-firstname")
    private WebElement firstName;

    @FindBy(id = "input-lastname")
    private WebElement lastName;

    @FindBy(id = "input-email")
    private WebElement email;

    @FindBy(id = "input-password")
    private WebElement password;

    @FindBy(id = "input-confirm")
    private WebElement confirmPassword;

    public RegistrationPage() {
        waitUntilLoaded();
    }

    @Override
    protected WebElement getControlElement() {
        return divMainPageContainer;
    }

    @Override
    public boolean isPageDisplayed() {
        return breadcrumbsBar != null;
    }

    public void setInputFieldValue(String fieldName, String value) {
        WebElement element = DriverBase.getDriver().findElement(By.cssSelector(format("input[@placeholder='%s']", fieldName)));
        element.sendKeys(value);
    }

    public void setFirstName(String firstName) {
        this.firstName.sendKeys(firstName);
    }

    public void setLastName(String lastName) {
        this.lastName.sendKeys(lastName);
    }

    public void setEmail(String email) {
        this.email.sendKeys(email);
    }

    public void setPassword(String password) {
        this.password.sendKeys(password);
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword.sendKeys(confirmPassword);
    }

    public static RegistrationPage navigate() {
        WebElementHelper.navigateToPage(ApplicationProperties.getString(ApplicationProperty.APP_URL));
        return new RegistrationPage();
    }

}