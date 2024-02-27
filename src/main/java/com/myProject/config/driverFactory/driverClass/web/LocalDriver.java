package com.myProject.config.driverFactory.driverClass.web;

import com.myProject.config.configEnums.BrowserType;
import com.myProject.config.driverFactory.managers.browserManager.localManager.ChromeManager;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public class LocalDriver {

    private LocalDriver(){
    }

    private static final Map<BrowserType, Supplier<WebDriver>> MAP = new EnumMap<>(BrowserType.class);
    private static final Supplier<WebDriver> CHROME = ChromeManager::getDriver;
    private static final Supplier<WebDriver> FIREFOX = ChromeManager::getDriver;

    static {
        MAP.put(BrowserType.CHROME,CHROME);
        MAP.put(BrowserType.FIREFOX,FIREFOX);
    }

    public static WebDriver getDriver(BrowserType browserType){
        return MAP.get(browserType).get();
    }

}
