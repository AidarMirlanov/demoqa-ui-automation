package com.digital_nomads.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class AlertButtonPage extends BasePage {

    @FindBy (id = "alertButton")
    public WebElement alertButton;

    @FindBy(id = "confirmButton")
    public WebElement confirmButton;

    @FindBy(id = "promtButton")
    public WebElement promtButton;



}
