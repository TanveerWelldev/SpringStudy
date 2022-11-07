package io.welldev;

import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.StandardEnvironment;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AnnotConfig.class);

//        ConfigurableEnvironment env = (ConfigurableEnvironment) context.getBean("environment");
//        env.setActiveProfiles("DPS");
        Arrays.stream(context.getEnvironment().getActiveProfiles()).forEach(System.out::println);

//        Kiriko kitsune = context.getBean(Kiriko.class);
//        kitsune.doUlt();
//
//        Hanzo adib = context.getBean(Hanzo.class);
//        adib.doUlt();





    }
}
