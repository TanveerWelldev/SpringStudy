package io.welldev;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainApp {
    public static void main(String[] args) throws IOException {
        ApplicationContext context = new AnnotationConfigApplicationContext(ResourceConfig.class);
//        ResourceLoaderImpl loader = (ResourceLoaderImpl) context.getBean("resourceLoaderImpl");
//
//        try {
//            loader.showResourceDataUsingFilePath();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        Resource resource = context.getResource("Hello.txt");
        InputStream stream = resource.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(stream));

        while(true) {
            String line = reader.readLine();

            if (line == null)
                break;
            System.out.println(line);
        } reader.close();


    }
}
