package com.myProject.config.driverFactory.managers.mobileManager.remote;

import com.myProject.config.configFactory.BrowserStackConfigFactory;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public final class BrowserStackIOSManager {

    private BrowserStackIOSManager(){};

    public static RemoteWebDriver getDriver(){
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("os_version", "16");
        capabilities.setCapability("device", "iPhone 14");
        capabilities.setCapability("project"," First Java");
        capabilities.setCapability("build","browserstack-build-1");
        capabilities.setCapability("name","first_test");
        capabilities.setCapability("app", "bs://c700ce60cf13ae8ed97705a55b8e022f13c5827c");

        return new RemoteWebDriver(BrowserStackConfigFactory.getConfig().browserStackURL(),capabilities);
    }

}
