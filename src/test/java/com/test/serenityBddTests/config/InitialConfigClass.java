package com.test.serenityBddTests.config;

import com.test.serenityBddTests.definitions.AbstractRestAssuredHelper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.test.serenityBddTests")
public class InitialConfigClass {
    @Bean
    public AbstractRestAssuredHelper restAssuredHelper(){
        return new AbstractRestAssuredHelper() ;
    }
}
