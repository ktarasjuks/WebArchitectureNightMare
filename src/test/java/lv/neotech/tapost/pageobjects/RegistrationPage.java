package lv.neotech.tapost.pageobjects;


import com.google.inject.Inject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

import cucumber.runtime.java.guice.ScenarioScoped;
import lv.neotech.tapost.pageobjects.base.Page;

import static java.lang.String.format;
import static org.assertj.core.api.Assertions.assertThat;

@ScenarioScoped
public class RegistrationPage extends Page {

    @Inject
    private BreadcrumbsBar breadcrumbsBar;

    @FindBy(css = "input[value='Continue']")
    private WebElement continueButton;

    @FindBy(css = "input[name='agree']")
    private WebElement agreeCheckbox;

    @FindBy(id = "content")
    private WebElement afterRegContent;

    @FindBy(css = ".alert-danger")
    private List<WebElement> errors;

    public RegistrationPage() {
    }

    @Override
    protected WebElement getControlElement() {
        return null;
    }

    @Override
    public boolean isPageDisplayed() {
        return breadcrumbsBar != null && breadcrumbsBar.getLastCrumb().equals("Register");
    }

    public void setInputFieldValue(String fieldName, String value) {
        WebElement element = driver.findElement(By.cssSelector(format("input[placeholder='%s']", fieldName)));
        element.sendKeys(value);
    }

    public void clickAgree() {
        agreeCheckbox.click();
    }

    public void clickContinue() {
        continueButton.click();
    }

    public void verifyIfRegistered() {
        verifyNoErrors();
        ExpectedConditions.visibilityOf(afterRegContent);
        String afterRegText = afterRegContent.getText();
        assertThat(afterRegText).contains("Congratulations! Your new account has been successfully created!");
    }

    private void verifyNoErrors() {
        assertThat(errors.isEmpty());
    }

}