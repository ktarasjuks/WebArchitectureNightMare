package lv.neotech.tapost.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import lv.neotech.tapost.pageobjects.base.Page;

public class BreadcrumbsBar extends Page {

    @FindBy(css = "ul.breadcrumb > li")
    private List<WebElement> breadcrumbs;

    public BreadcrumbsBar() {
//        waitUntilLoaded();
    }

    @Override
    protected WebElement getControlElement() {
        return breadcrumbs.get(0);
    }

    public List<WebElement> getBreadcrumbs() {
        return breadcrumbs;
    }

    public String getLastCrumb() {
        return breadcrumbs.isEmpty() ? null : breadcrumbs.get(breadcrumbs.size()-1).getText();
    }
}