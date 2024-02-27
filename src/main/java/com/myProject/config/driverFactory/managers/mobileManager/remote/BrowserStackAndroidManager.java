package com.myProject.config.driverFactory.managers.mobileManager.remote;

import com.myProject.config.configFactory.BrowserStackConfigFactory;
import com.myProject.config.configFactory.ConfigFactory;
import com.myProject.config.converterFactory.BrowserStackConfig;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public final class BrowserStackAndroidManager {

    private BrowserStackAndroidManager(){};

    public static RemoteWebDriver getDriver(){
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("os_version", "9.0");
        capabilities.setCapability("device", "Google Pixel 3");
        capabilities.setCapability("project"," First Java");
        capabilities.setCapability("build","browserstack-build-1");
        capabilities.setCapability("name","first_test");
        capabilities.setCapability("app", "bs://c700ce60cf13ae8ed97705a55b8e022f13c5827c");

        return new RemoteWebDriver(BrowserStackConfigFactory.getConfig().browserStackURL(),capabilities);
    }

}
