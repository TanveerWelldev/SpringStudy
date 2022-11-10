package io.welldev;

import io.welldev.jdbc.dao.StudentDAO;
import io.welldev.jdbc.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;


import javax.sql.DataSource;
import java.util.List;

@Component
public class StudentJDBCTemplate implements StudentDAO {

    
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;
    private PlatformTransactionManager transactionManager;

    @Autowired
    @Qualifier("driverManager")
    @Override
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }
    
    @Autowired
    public void setTransactionManager(PlatformTransactionManager transactionManager) {
        this.transactionManager = transactionManager;
    }
    @Override
    public void create(Student student) {
        String queryStudent = "insert into student (name, age) values (?, ?)";
        String queryAddress = "insert into address (id, address, country) values (?, ?, ?)";

        jdbcTemplateObject.update(queryStudent, new Object[] { student.getName(), student.getAge()});
        System.out.println("Inserted into Student Table Successfully");

        String sql2 = "select id from student where name = ?";
        int id = jdbcTemplateObject.queryForObject(sql2, Integer.class, student.getName());

        jdbcTemplateObject.update(queryAddress, new Object[] {id, student.getAddress().getAddress(),
                student.getAddress().getCountry()});
        System.out.println("Inserted into Address Table Successfully");
    }

    @Override
    public List<StudentMarks> listStudents() {
        String SQL = "select * from Student, Marks where Student.id=Marks.sid";
        List <StudentMarks> studentMarks = jdbcTemplateObject.query(SQL,
                new StudentMarksMapper());

        return studentMarks;
    }


}
