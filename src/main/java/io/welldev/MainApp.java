package io.welldev;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        LibraryService myLibraryService = (LibraryService) context.getBean("libraryServiceProxy");

        myLibraryService.issueBook(1, 1);
        myLibraryService.returnBook(2, 2);
        myLibraryService.addBook(3);



    }
}
