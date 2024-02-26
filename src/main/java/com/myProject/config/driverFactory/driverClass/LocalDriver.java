package com.myProject.config.driverFactory.driverClass;

import com.myProject.config.configEnums.BrowserType;
import com.myProject.config.configFactory.ConfigFactory;
import com.myProject.config.driverFactory.browserManager.localManager.ChromeManager;
import com.myProject.config.driverFactory.browserManager.localManager.FirefoxManager;
import org.openqa.selenium.WebDriver;

public class LocalDriver {
    static WebDriver driver = null;
    public static WebDriver getDriver(BrowserType browserType){
        return (isBrowserChrome(browserType)) ? ChromeManager.getDriver() :
                FirefoxManager.getDriver();


    }

    private static boolean isBrowserChrome(BrowserType browserType){
        return ConfigFactory.getConfig().browser() == BrowserType.CHROME;
    }
}
