package com.myProject.config.driverFactory.managers.mobileManager.local;

import com.myProject.config.configFactory.ConfigFactory;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public final class AndroidManager {

    private AndroidManager(){};

    public static RemoteWebDriver getDriver(){
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UIAutomator2");
        dc.setCapability(MobileCapabilityType.APP,System.getProperty("user.dir")+"/android-app.apk");

        return new RemoteWebDriver(ConfigFactory.getConfig().localAppiumServerURL(), dc);
    }

}
