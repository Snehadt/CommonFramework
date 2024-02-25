package com.myProject.config.converterFactory;

import com.myProject.config.configEnums.BrowserType;
import com.myProject.config.configEnums.RunMode;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;
import java.util.Locale;
import java.util.Map;

public class StringToRunModeConverter implements Converter<RunMode> {

    @Override
    public RunMode convert(Method method, String runMode) {
        return RunMode.valueOf(runMode.toUpperCase(Locale.ROOT));
    }
}