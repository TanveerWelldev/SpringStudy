package io.welldev;

import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("DPS")
public class Hanzo {

    public void doUlt() {
        System.out.println("Wagateki Wakarau!!");
    }
}
