package io.welldev;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.event.ApplicationEventMulticaster;
import org.springframework.stereotype.Component;

@Component
public class CustomEventPublisher {
    @Autowired
    private ApplicationEventMulticaster aem;

    public void publish() {
        CustomEvent ce = new CustomEvent(this);
        System.out.println("Publishing");
        aem.multicastEvent(ce);
    }
}
