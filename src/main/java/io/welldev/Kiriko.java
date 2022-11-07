package io.welldev;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
//@Profile("Support")
public class Kiriko {

    public void doUlt() {
        System.out.println("Let the Konzume guide you!!");
    }
}
