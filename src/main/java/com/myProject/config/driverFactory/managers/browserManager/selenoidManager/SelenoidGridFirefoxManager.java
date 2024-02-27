package com.myProject.config.driverFactory.managers.browserManager.selenoidManager;

import com.myProject.config.configFactory.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public final class SelenoidGridFirefoxManager {

    private SelenoidGridFirefoxManager(){}

    public static WebDriver getDriver() {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("browserName","firefox");
        cap.setCapability("browserVersion","100");
        cap.setCapability("enableVNC",true);
        cap.setCapability("enableVideo",false);
        return new RemoteWebDriver(ConfigFactory.getConfig().selenoidGridURL(), cap);
    }
}
