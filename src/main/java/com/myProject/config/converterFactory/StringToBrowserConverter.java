package com.myProject.config.converterFactory;

import com.myProject.config.configEnums.BrowserType;
import org.aeonbits.owner.Converter;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.Map;

public class StringToBrowserConverter implements Converter<BrowserType> {

    @Override
    public BrowserType convert(Method method, String browserName) {
       Map<String, BrowserType> map = Map.of("CHROME",BrowserType.CHROME,
                "FIREFOX",BrowserType.FIREFOX);
        return map.getOrDefault(browserName.toUpperCase(Locale.ROOT),BrowserType.CHROME);
    }
}