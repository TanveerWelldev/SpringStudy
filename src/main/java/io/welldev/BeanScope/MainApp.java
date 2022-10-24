package io.welldev.BeanScope;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld objA = (HelloWorld) context.getBean("helloWorld");

        //Hello this is another check
        // Check from Rawnak's PC
        //Check from Arnob's PC
        // Check from new branch (Rawnak's PC)

        objA.getMessage();
        context.registerShutdownHook();

//        objA.setMessage("I'm Object A");
//        objA.getMessage();
//
//        HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
//        objB.getMessage();

    }
}
