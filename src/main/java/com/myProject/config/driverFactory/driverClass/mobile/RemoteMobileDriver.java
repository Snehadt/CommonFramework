package com.myProject.config.driverFactory.driverClass.mobile;

import com.myProject.config.configEnums.BrowserType;
import com.myProject.config.configEnums.MobileType;
import com.myProject.config.configEnums.RunModeMobileType;
import com.myProject.config.configEnums.RunModeType;
import com.myProject.config.driverFactory.driverClass.web.BrowserStackDriver;
import com.myProject.config.driverFactory.driverClass.web.SeleniumGridDriver;
import com.myProject.config.driverFactory.driverClass.web.SelenoidDriver;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Function;

public class RemoteMobileDriver {

    private RemoteMobileDriver(){

    }

    private static final Map<RunModeMobileType, Function<MobileType,WebDriver>> MAP = new EnumMap<RunModeMobileType, Function<MobileType, WebDriver>>(RunModeMobileType.class);
    private static final Function<MobileType , WebDriver> BROWSER_STACK = BrowserStackMobileDriver::getDriver;

    static{
        MAP.put(RunModeMobileType.BROWSERSTACK,BROWSER_STACK);
    }

    public static WebDriver getDriver(RunModeMobileType runModeMobileType , MobileType mobileType){
        return MAP.get(runModeMobileType).apply(mobileType);
    }
}