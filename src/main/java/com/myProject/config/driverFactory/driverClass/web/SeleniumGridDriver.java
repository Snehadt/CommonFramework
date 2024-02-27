package com.myProject.config.driverFactory.driverClass.web;

import com.myProject.config.configEnums.BrowserType;
import com.myProject.config.driverFactory.managers.browserManager.seleniumGrid.SeleniumGridChromeManager;
import com.myProject.config.driverFactory.managers.browserManager.seleniumGrid.SeleniumGridFirefoxManager;
import org.openqa.selenium.WebDriver;

public final class SeleniumGridDriver {

    private SeleniumGridDriver(){};

    public static WebDriver getDriver(BrowserType browserType){
        return browserType == BrowserType.CHROME ? SeleniumGridChromeManager.getDriver():
                SeleniumGridFirefoxManager.getDriver();
    }
}
