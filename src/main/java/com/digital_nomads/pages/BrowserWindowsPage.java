package com.digital_nomads.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BrowserWindowsPage extends  BasePage{
    @FindBy(id = "tabButton")
    public WebElement newTab;

    @FindBy(id = "windowButton")
    public WebElement newWindowButton;

    //    @FindBy(xpath = "//button[@id='messageWindowButton']")
    @FindBy(css = "button[id='messageWindowButton']")
    public WebElement newWindowMassage;
}
