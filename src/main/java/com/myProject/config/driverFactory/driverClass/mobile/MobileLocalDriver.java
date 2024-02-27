package com.myProject.config.driverFactory.driverClass.mobile;

import com.myProject.config.configEnums.MobileType;
import com.myProject.config.driverFactory.managers.mobileManager.local.AndroidManager;
import com.myProject.config.driverFactory.managers.mobileManager.local.IOSManager;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public class MobileLocalDriver {

    private MobileLocalDriver(){
    }

    private static final Map<MobileType, Supplier<WebDriver>> MAP = new EnumMap<>(MobileType.class);
    private static final Supplier<WebDriver> ANDROID = AndroidManager::getDriver;
    private static final Supplier<WebDriver> IOS = IOSManager::getDriver;

    static {
        MAP.put(MobileType.ANDROID,ANDROID);
        MAP.put(MobileType.IOS,IOS);
    }

    public static WebDriver getDriver(MobileType mobileType){
        return MAP.get(mobileType).get();
    }

}
