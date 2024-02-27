package com.myProject.config.driverFactory.driverClass.web;

import com.myProject.config.configEnums.BrowserType;
import com.myProject.config.configEnums.RunModeType;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Function;

public class RemoteDriver {

    private RemoteDriver(){

    }

    private static final Map<RunModeType, Function<BrowserType,WebDriver>> MAP = new EnumMap<RunModeType, Function<BrowserType, WebDriver>>(RunModeType.class);

    private static final Function<BrowserType , WebDriver> SELENIUM_GRID = SeleniumGridDriver::getDriver;
    private static final Function<BrowserType , WebDriver> SELENOID = SelenoidDriver::getDriver;
    private static final Function<BrowserType , WebDriver> BROWSER_STACK = BrowserStackDriver::getDriver;

    static{
        MAP.put(RunModeType.SELENIUM_GRID,SELENIUM_GRID);
        MAP.put(RunModeType.SELENOID,SELENOID);
        MAP.put(RunModeType.BROWSERSTACK,BROWSER_STACK);
    }

    public static WebDriver getDriver(RunModeType runModeType , BrowserType browserType){
        return MAP.get(runModeType).apply(browserType);
    }
}