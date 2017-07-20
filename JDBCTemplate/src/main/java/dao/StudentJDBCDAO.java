package dao;

import domain.Student;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by Administrator on 2017/07/17.
 */
public interface StudentJDBCDAO {
    public void setDataSource(DataSource ds);

    public void insertStudent(String SName,Integer QQ,String Style,String Time,String School,Integer SNumber,
                              String Link,String Dream,String FBro,String YBro,String WhereKnow,Integer create_at);

    public void deleteStudent(int Id);

    public void updateStudent(String SName,Integer QQ,String Style,String Time,String School,Integer SNumber,
                              String Link,String Dream,String FBro,String YBro,String WhereKnow,Integer update_at,Integer ID);

    public List<Student> getStudentListByName(String SName);

    public Student selectStudent(int id);
}
