package io.welldev;

import io.welldev.jdbc.dao.StudentDAO;
import io.welldev.jdbc.model.Student;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class StudentManagerImpl implements StudentManager {

    private StudentDAO studentDAO;

    @Autowired
    public void setStudentJDBCTemplate(StudentJDBCTemplate studentJDBCTemplate) {
        this.studentDAO = studentJDBCTemplate;
    }

    @Transactional
    public void createStudent(Student std) {
        studentDAO.create(std);
    }

}
