package io.welldev;

import io.welldev.jdbc.dao.StudentDAO;
import io.welldev.jdbc.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

@Component("studentManager")
public class StudentManagerImpl implements StudentManager{

    private StudentDAO studentDAO;

    @Autowired
    public void setStudentJDBCTemplate(StudentJDBCTemplate studentJDBCTemplate) {
        this.studentDAO = studentJDBCTemplate;
    }
    @Override
    @Transactional
    public void createStudent(Student std) {
        studentDAO.create(std);
    }
}
