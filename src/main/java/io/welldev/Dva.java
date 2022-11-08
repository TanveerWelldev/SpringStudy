package io.welldev;

import org.springframework.stereotype.Component;

@Component
public class Dva implements Tank{
    @Override
    public void doUlt() {
        System.out.println("Nerf dis!!");
    }
}
