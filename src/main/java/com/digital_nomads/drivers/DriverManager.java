package com.digital_nomads.drivers;
import com.digital_nomads.utils.ConfigReader;
import org.openqa.selenium.WebDriver;


public class DriverManager {
    private static WebDriver driver;

    public static WebDriver getDriver () {
        if (driver == null) {
            switch (ConfigReader.getValue("browser").toLowerCase()) {
                case "chrome":
                    driver = ChromeWebDriver.loadChromeDriver();
                    break;
                case "firefox":
                    driver = FireFoxWebDriver.loadFireFoxDriver();
                    break;
                default:
                    throw new RuntimeException("Unsupported browser: " + ConfigReader.getValue("browser"));
            }
        } return driver;
    }

    public static void closeDriver () {
        try {
            if ( driver != null) {
                driver.close();
                driver.quit();
                driver = null;
            }
        }catch (Exception e ) {
            e.printStackTrace();
        }
    }

}
