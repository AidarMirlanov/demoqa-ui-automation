package com.digital_nomads.modul_import;


import com.digital_nomads.helper.AlertHelper;
import com.digital_nomads.helper.BrowserManager;
import com.digital_nomads.helper.DropdownHelper;
import com.digital_nomads.helper.WebElementActions;
import org.openqa.selenium.WebDriver;

public class ImportHelpers {

    public WebDriver driver;
    public WebElementActions webElementActions;
    public BrowserManager browserManager;
    public BrowserManager.WindowHelper windowHelper;
    public AlertHelper alertHelper;
    public DropdownHelper dropdownHelper;
    public BrowserManager.IFrameHelper frameHelper;

    public ImportHelpers(WebDriver driver) {
        this.driver = driver;
        this.alertHelper = new AlertHelper(driver);
        this.browserManager = new BrowserManager(driver);
        this.dropdownHelper = new DropdownHelper(driver);
        this.frameHelper = new BrowserManager.IFrameHelper(driver);
        this.webElementActions = new WebElementActions();
        this.windowHelper = new BrowserManager.WindowHelper(driver);
    }

    public AlertHelper getAlertHelper() {
        return alertHelper;
    }

    public BrowserManager getBrowserManager() {
        return browserManager;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public BrowserManager.IFrameHelper getFrameHelper() {
        return frameHelper;
    }

    public DropdownHelper getDropdownHelper() {
        return dropdownHelper;
    }

    public WebElementActions getWebElementActions() {
        return webElementActions;
    }

    public BrowserManager.WindowHelper getWindowHelper() {
        return windowHelper;
    }
}
