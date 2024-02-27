package com.myProject.config.driverFactory.driverClass.web;

import com.myProject.config.configEnums.BrowserType;
import com.myProject.config.driverFactory.managers.browserManager.browserStackManager.BrowserStackChromeManager;
import com.myProject.config.driverFactory.managers.browserManager.browserStackManager.BrowserStackFirefoxManager;
import org.openqa.selenium.WebDriver;

public final class BrowserStackDriver {

    private BrowserStackDriver(){}

    public static WebDriver getDriver(BrowserType browserType){
        return browserType == BrowserType.CHROME ? BrowserStackChromeManager.getDriver():
                BrowserStackFirefoxManager.getDriver();
    }
}
