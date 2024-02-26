package com.myProject.config.driverFactory.browserManager.selenoidManager;

import com.myProject.config.configFactory.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public final class SelenoidridChromeManager {

    private SelenoidridChromeManager(){}

    public static WebDriver getDriver() {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("browserName","chrome");
        cap.setCapability("browserVersion","121.0.6167");
        cap.setCapability("enableVNC",true);
        cap.setCapability("enableVideo",false);
        return new RemoteWebDriver(ConfigFactory.getConfig().selenoidGridURL(), cap);
    }
}
