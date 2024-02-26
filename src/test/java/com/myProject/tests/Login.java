package com.myProject.tests;

import com.myProject.config.configFactory.ConfigFactory;
import org.testng.annotations.Test;

public class Login {
    @Test
    public void launchBrowser(){
        System.out.println(ConfigFactory.getConfig().browser());
    }
}
