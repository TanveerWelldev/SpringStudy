package io.welldev;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.event.ApplicationEventMulticaster;
import org.springframework.stereotype.Component;

@Component
public class CustomEventPublisher {
    @Autowired
    private ApplicationEventMulticaster aem;

    @Value("${engine.fuelType}")
    private String fuelType;

    public void publish() {
        CustomEvent ce = new CustomEvent(this);
        System.out.println(fuelType);
        System.out.println("Publishing");
        aem.multicastEvent(ce);
    }
}
