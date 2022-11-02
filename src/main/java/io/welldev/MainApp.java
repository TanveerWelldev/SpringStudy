package io.welldev;

import io.welldev.jdbc.model.Address;
import io.welldev.jdbc.model.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.Proxy;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JDBCConfig.class);
       StudentManagerImpl studentManager = (StudentManagerImpl) context.getBean("studentManager");

        Student std = createDummyStudent();
        studentManager.createStudent(std);

    }

    public static Student createDummyStudent() {
        Student student = new Student();
        student.setName("Rabbi");
        student.setAge(23);
        Address address = new Address();
        address.setId(2);
        address.setCountry("Bangladesh");
        address.setAddress("Albany Dr, San Jose, CA 95129");
        student.setAddress(address);
        return student;
    }




}
