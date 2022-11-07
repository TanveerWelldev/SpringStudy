package io.welldev;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.StandardEnvironment;

@ComponentScan({"io.welldev"})
@Configuration
@PropertySource("value.properties")
public class AnnotConfig {

    private final ConfigurableEnvironment env;

    public AnnotConfig(ConfigurableEnvironment environment) {
        this.env = environment;
        this.env.setActiveProfiles("DPS");
    }

}
