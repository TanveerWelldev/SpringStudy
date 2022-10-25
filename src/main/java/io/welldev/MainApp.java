package io.welldev;

import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(CustomEventPublisherConfig.class, AsynchronousSpringEventsConfig.class);

        CustomEventPublisher cvp = (CustomEventPublisher) context.getBean(CustomEventPublisher.class);


        cvp.publish();
        cvp.publish();



    }
}
