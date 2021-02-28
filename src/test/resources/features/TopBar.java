package lv.neotech.tapost.pageobjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import cucumber.runtime.java.guice.ScenarioScoped;
import lv.neotech.tapost.pageobjects.base.Page;

import static com.google.common.base.Preconditions.checkState;
import static java.lang.String.format;

@ScenarioScoped
public class TopBar extends Page {

    @FindBy(id = "top")
    private WebElement navTopBarContainer;

    @FindBy(css = "#top-links > ul.list-inline > li")
    private List<WebElement> topLinks;

    private WebElement currentTopLevelOption;

    public TopBar() {
        waitUntilLoaded();
    }

    @Override
    protected WebElement getControlElement() {
        return navTopBarContainer;
    }

    public void clickTopLevelOption(String optionName) {
        currentTopLevelOption = topLinks.stream()
                .filter((element) -> element.getText().contains(optionName))
                .findAny()
                .orElseThrow(() -> new RuntimeException(format("Option '%s' not found", optionName)));
        currentTopLevelOption.click();
    }

    public void buttonIsClickable(String optionName) {
        currentTopLevelOption = topLinks.stream()
                .filter((element) -> element.getText().contains(optionName))
                .findAny()
                .orElseThrow(() -> new RuntimeException(format("Option '%s' not found", optionName)));
        currentTopLevelOption.isEnabled();
    }


    public void clickSubOption(String subOptionName) {
        checkState(currentTopLevelOption != null);
        By linkSelector = By.cssSelector("ul.dropdown-menu > li > a");
        List<WebElement> elements = currentTopLevelOption.findElements(linkSelector);
        WebElement subOption = elements.stream()
                .filter((element) -> element.getText().equals(subOptionName))
                .findAny()
                .orElseThrow(() -> new RuntimeException(format("Option '%s' not found", subOptionName)));
        subOption.click();
    }

}