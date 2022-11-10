package io.welldev;

import io.welldev.jdbc.model.Address;
import io.welldev.jdbc.model.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JDBCConfig.class);
       StudentManager studentManager = (StudentManager) context.getBean(StudentManager.class);

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
