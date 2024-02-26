package com.myProject.config.converterFactory;

import com.myProject.config.configEnums.BrowserType;
import com.myProject.config.configEnums.RunMode;
import com.myProject.config.configEnums.RunModeType;
import org.aeonbits.owner.Config;


import java.net.URL;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "system:env",
        "file:${user.dir}/src/test/resources/config.properties"
})
public interface FrameworkConfig extends Config {

    @DefaultValue("CHROME")
    @ConverterClass(StringToBrowserConverter.class)
    BrowserType browser();

    @Key("runMode")
    RunMode runMode();

    @Key("runmodeType")
    RunModeType runModeType();

    @Key("StringToURLConverter.class")
    URL seleniumGridURL();

    @Key("StringToURLConverter.class")
    URL selenoidGridURL();

}
