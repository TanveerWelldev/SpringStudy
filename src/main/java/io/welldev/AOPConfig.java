package io.welldev;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan({"io.welldev"})
@Configuration
@EnableAspectJAutoProxy
public class AOPConfig {
    @Bean(name = "student")
    public Student getStudent() {
        Student std = new Student();
        std.setAge(11);
        std.setName("Zara");

        return std;
    }
}
