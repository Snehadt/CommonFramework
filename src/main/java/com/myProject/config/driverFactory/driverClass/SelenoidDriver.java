package com.myProject.config.driverFactory.driverClass;

import com.myProject.config.configEnums.BrowserType;
import com.myProject.config.driverFactory.browserManager.selenoidManager.SelenoidGridFirefoxManager;
import com.myProject.config.driverFactory.browserManager.selenoidManager.SelenoidridChromeManager;
import org.openqa.selenium.WebDriver;

public final class SelenoidDriver {

    private SelenoidDriver(){}

    public static WebDriver getDriver(BrowserType browserType){
        return browserType == BrowserType.CHROME ? SelenoidridChromeManager.getDriver():
                SelenoidGridFirefoxManager.getDriver();
    }
}
