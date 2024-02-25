package com.myProject.config.driverFactory;

import com.myProject.config.configEnums.BrowserType;
import com.myProject.config.configFactory.ConfigFactory;
import com.myProject.config.driverFactory.browserManager.ChromeManager;
import com.myProject.config.driverFactory.browserManager.FirefoxManager;
import org.openqa.selenium.WebDriver;

public class LocalDriver {
    static WebDriver driver = null;
    public WebDriver getDriver(){
        if(isBrowserChrome())
            driver =ChromeManager.getDriver();
        else
            driver = FirefoxManager.getDriver();

        return driver;
    }

    private static boolean isBrowserChrome(){
        return ConfigFactory.getConfig().browser() == BrowserType.CHROME;
    }
}
