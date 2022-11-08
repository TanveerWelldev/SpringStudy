package io.welldev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
//@Profile("Support")
public class Kiriko {

    @Autowired
    @Qualifier("sigma")
    private Tank tank;
    public void doUlt() {
        System.out.println("Let the Konzume guide you!!");
        tank.doUlt();
    }
}
