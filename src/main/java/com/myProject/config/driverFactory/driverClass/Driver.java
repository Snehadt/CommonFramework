package com.myProject.config.driverFactory.driverClass;

import com.myProject.config.configFactory.ConfigFactory;
import org.openqa.selenium.WebDriver;

public class Driver {

    private Driver(){}

    public static void initDriver() {
        WebDriver driver = LocalDriver.getDriver(ConfigFactory.getConfig().browser());
        driver.get("https://www.google.com");
    }
}
