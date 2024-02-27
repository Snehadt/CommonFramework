package com.myProject.config.driverFactory.driverClass.web;

import com.myProject.config.configEnums.BrowserType;
import com.myProject.config.driverFactory.managers.browserManager.selenoidManager.SelenoidGridFirefoxManager;
import com.myProject.config.driverFactory.managers.browserManager.selenoidManager.SelenoidridChromeManager;
import org.openqa.selenium.WebDriver;

public final class SelenoidDriver {

    private SelenoidDriver(){}

    public static WebDriver getDriver(BrowserType browserType){
        return browserType == BrowserType.CHROME ? SelenoidridChromeManager.getDriver():
                SelenoidGridFirefoxManager.getDriver();
    }
}
