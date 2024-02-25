package com.myProject.config.converterFactory;

import com.myProject.config.configEnums.RunMode;
import com.myProject.config.configEnums.RunModeType;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;
import java.util.Locale;

public class StringToRunModeTypeConverter implements Converter<RunModeType> {

    @Override
    public RunModeType convert(Method method, String runmodeType) {
        return RunModeType.valueOf(runmodeType.toUpperCase(Locale.ROOT));
    }
}