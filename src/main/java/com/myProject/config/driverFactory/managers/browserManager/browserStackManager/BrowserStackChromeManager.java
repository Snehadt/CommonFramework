package com.myProject.config.driverFactory.managers.browserManager.browserStackManager;

import com.myProject.config.configFactory.BrowserStackConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public final class BrowserStackChromeManager {

    private BrowserStackChromeManager(){}

    public static WebDriver getDriver() {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("browser","chrome");
        cap.setCapability("browser_version","121.0.6167");
        cap.setCapability("os","Windows");
        cap.setCapability("os_version","10");
        return new RemoteWebDriver(BrowserStackConfigFactory.getConfig().browserStackURL(),cap);
    }
}
