package io.welldev;


import jdk.nashorn.internal.runtime.regexp.joni.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.StandardEnvironment;

@ComponentScan({"io.welldev"})
@Configuration
@PropertySource("value.properties")
public class AnnotConfig {

}
