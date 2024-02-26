package com.myProject.config.driverFactory.driverClass;

import com.myProject.config.configEnums.BrowserType;
import com.myProject.config.configEnums.RunModeType;
import org.openqa.selenium.WebDriver;

public class RemoteDriver {

    private RemoteDriver(){

    }

    public static WebDriver getDriver(RunModeType runModeType , BrowserType browserType){

        if(runModeType == RunModeType.SELENIUM_GRID){
            return SeleniumGridDriver.getDriver(browserType);
        }else if(runModeType == RunModeType.SELENOID){

        }else{

        }return null;
    }
}
