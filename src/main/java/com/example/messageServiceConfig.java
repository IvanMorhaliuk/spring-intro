package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class messageServiceConfig {
    @Bean(name="messageService")
    @Scope("prototype")
    public MyNameMessageService getMyNameMessageService() {
        return new MyNameMessageService();
    }

    @Bean(name="messageService2")
    @Scope("prototype")
    public RandomTextMessageService getRandomTextMessageService() {
        return new RandomTextMessageService();
    }
}
