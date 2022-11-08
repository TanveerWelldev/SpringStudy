package io.welldev;

import org.springframework.stereotype.Component;

@Component
public class Sigma implements Tank{
    @Override
    public void doUlt() {
        System.out.println("What is that MELODY!!");
    }
}
