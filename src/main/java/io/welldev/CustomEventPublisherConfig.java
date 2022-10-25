package io.welldev;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class CustomEventPublisherConfig {
    @Bean
    public CustomEventPublisher customEventPublisher() {
        return new CustomEventPublisher();
    }

    @Bean
    public CustomEventHandler customEventHandler() {
        return new CustomEventHandler();
    }



}
