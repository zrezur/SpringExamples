package org.dp;


import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

public class ApplicationProfileInitializer implements
        ApplicationContextInitializer<ConfigurableApplicationContext> {

    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        String profilesSysProp = System.getProperty("spring.profiles.active");
        System.out.println("XXXX");
        System.out.println(profilesSysProp);
    }
}
