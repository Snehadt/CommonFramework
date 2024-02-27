package com.myProject.tests;

import com.myProject.config.configFactory.BrowserStackConfigFactory;
import com.myProject.config.configFactory.ConfigFactory;
import com.myProject.config.driverFactory.driverClass.mobile.RemoteMobileDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import static com.myProject.config.configFactory.BrowserStackConfigFactory.getConfig;

public class Login {
    @Test
    public void launchBrowser(){
        //System.out.println(ConfigFactory.getConfig().browser());
        //System.out.println();
    }
}
