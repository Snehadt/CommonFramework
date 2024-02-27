package com.myProject.config.driverFactory.entity;

import com.myProject.config.configEnums.BrowserType;
import com.myProject.config.configEnums.MobileType;
import com.myProject.config.configEnums.RunModeMobile;
import com.myProject.config.configEnums.RunModeMobileType;
import com.myProject.config.driverFactory.driverClass.web.RemoteDriver;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DriverData {

    private BrowserType browserType;
    private RemoteDriver remoteDriver;
    private MobileType mobileType;
    private RunModeMobile runModeMobile;
    private RunModeMobileType runModeMobileType;
}
