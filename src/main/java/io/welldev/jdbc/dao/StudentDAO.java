package io.welldev.jdbc.dao;

import io.welldev.StudentMarks;
import io.welldev.jdbc.model.Student;

import javax.sql.DataSource;
import java.util.List;

public interface StudentDAO {
    public void setDataSource(DataSource ds);

    public void create(Student student);

    public List<StudentMarks> listStudents();

}
