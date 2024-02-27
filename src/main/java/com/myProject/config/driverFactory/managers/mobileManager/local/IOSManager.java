package com.myProject.config.driverFactory.managers.mobileManager.local;

import com.myProject.config.configFactory.ConfigFactory;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public final class IOSManager {
    private IOSManager(){}

    public static RemoteWebDriver getDriver(){
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.IOS);
        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"XCUITest");
        dc.setCapability(MobileCapabilityType.DEVICE_NAME,"iPhone 14");
        dc.setCapability(MobileCapabilityType.APP,System.getProperty("user.dir")+"/ios-app.zip");

        return new RemoteWebDriver(ConfigFactory.getConfig().localAppiumServerURL(), dc);
    }
}
