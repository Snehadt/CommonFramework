package com.myProject.config.converterFactory;

import org.aeonbits.owner.Config;
import java.net.URL;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "system:env",
        "file:${user.dir}/src/test/resources/browserStack.properties"
})
public interface BrowserStackConfig extends Config {
    @Key("username")
    String username();

    String key();

    @DefaultValue("https://${username}:${key}@hub-cloud.browserstack.com/wd/hub")
    @ConverterClass(StringToURLConverter.class)
    URL browserStackURL();
}
