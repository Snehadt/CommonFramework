package com.myProject.config.configFactory;

import com.myProject.config.converterFactory.FrameworkConfig;
import org.aeonbits.owner.ConfigCache;

public final class ConfigFactory {
    private ConfigFactory(){}

    public static FrameworkConfig getConfig(){
        return ConfigCache.getOrCreate(FrameworkConfig.class);
    }
}