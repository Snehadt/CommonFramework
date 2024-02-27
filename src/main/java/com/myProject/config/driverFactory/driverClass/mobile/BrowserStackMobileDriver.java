package com.myProject.config.driverFactory.driverClass.mobile;

import com.myProject.config.configEnums.MobileType;
import com.myProject.config.driverFactory.managers.mobileManager.local.AndroidManager;
import com.myProject.config.driverFactory.managers.mobileManager.local.IOSManager;
import com.myProject.config.driverFactory.managers.mobileManager.remote.BrowserStackAndroidManager;
import com.myProject.config.driverFactory.managers.mobileManager.remote.BrowserStackIOSManager;
import org.openqa.selenium.WebDriver;

public final class BrowserStackMobileDriver {

    private BrowserStackMobileDriver(){}

    public static WebDriver getDriver(MobileType mobileType){
        return mobileType == MobileType.ANDROID ? BrowserStackAndroidManager.getDriver():
                BrowserStackIOSManager.getDriver();
    }
}
