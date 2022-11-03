package io.welldev;

import org.apache.log4j.xml.DOMConfigurator;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Locale;
import java.util.ResourceBundle;

import org.apache.log4j.Logger;

public class MainApp {
    public static void main(String[] args) {

        //Resource Bundle class
//        ResourceBundle bundle = ResourceBundle.getBundle("MessageBundle", Locale.US);
//        System.out.println("Message in "+Locale.US+":"+bundle.getString("greetings"));
//
//        Locale.setDefault(new Locale("in", "ID"));
//        bundle = ResourceBundle.getBundle("MessageBundle");
//        System.out.println("Message in"+ Locale.getDefault()+":"+bundle.getString("greetings"));

        //Logging
//        Logger log = Logger.getLogger(MainApp.class.getName());
//        log.debug("Hello this is a debug message");
//        log.info("hello this is a info message");

        //Logging XML
        Logger logger = Logger.getLogger(MainApp.class);

        DOMConfigurator.configure("/Users/tanveerzaman/Study/SpringStudy/src/main/resources/log4j.xml");
        logger.trace("Trace message");
        logger.debug("Sample debug message");
        logger.info("Sample info message");
        logger.warn("Sample warn message");
        logger.error("Sample error message");
        logger.fatal("Sample fatal message");




    }
}
