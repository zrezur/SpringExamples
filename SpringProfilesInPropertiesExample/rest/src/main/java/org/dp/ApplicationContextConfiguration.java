package org.dp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import javax.inject.Inject;

@Configuration
@PropertySource("classpath:application.properties")
public class ApplicationContextConfiguration {

    @Value("${spring.profiles.active}")
    private String profiles;

    @Bean
    public static PropertySourcesPlaceholderConfigurer getPropertyPlaceholder(){
        return new PropertySourcesPlaceholderConfigurer();
    }



}
