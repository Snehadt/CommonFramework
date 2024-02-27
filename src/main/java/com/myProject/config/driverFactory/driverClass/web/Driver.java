package com.myProject.config.driverFactory.driverClass.web;

import com.myProject.config.configFactory.BrowserStackConfigFactory;
import com.myProject.config.configFactory.ConfigFactory;
import com.myProject.config.driverFactory.driverClass.DriverFactory;
import com.myProject.config.driverFactory.driverClass.mobile.RemoteMobileDriver;
import com.myProject.config.driverFactory.entity.DriverData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import static com.myProject.config.configFactory.ConfigFactory.getConfig;


public class Driver {

    private Driver(){}

    public static void initDriver() {
        WebDriver driver = //LocalDriver.getDriver(ConfigFactory.getConfig().browser());

                RemoteDriver.getDriver(ConfigFactory.getConfig().runModeType(),ConfigFactory.getConfig().browser());
        driver.get("https://www.google.com");
    }

}
