package com.digital_nomads.pages;

import com.digital_nomads.drivers.DriverManager;
import com.digital_nomads.helper.WebElementActions;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    WebElementActions webElementActions = new WebElementActions();

    public BasePage(){
        PageFactory.initElements(DriverManager.getDriver(), this);
    }

}
