package com.myProject.config.configFactory;

import com.myProject.config.converterFactory.BrowserStackConfig;
import com.myProject.config.converterFactory.FrameworkConfig;
import org.aeonbits.owner.ConfigCache;

public final class BrowserStackConfigFactory {
    private BrowserStackConfigFactory(){}

    public static BrowserStackConfig getConfig(){
        return  ConfigCache.getOrCreate(BrowserStackConfig.class);
    }
}