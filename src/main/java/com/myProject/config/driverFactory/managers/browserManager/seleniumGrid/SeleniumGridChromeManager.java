package com.myProject.config.driverFactory.managers.browserManager.seleniumGrid;

import com.myProject.config.configFactory.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public final class SeleniumGridChromeManager {

    private SeleniumGridChromeManager(){}
    public static WebDriver getDriver(){
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setBrowserName(BrowserType.CHROME);
        return new RemoteWebDriver(ConfigFactory.getConfig().seleniumGridURL(),cap);
    }
}
