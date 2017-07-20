package dao;

import domain.Student;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;


import javax.sql.DataSource;
import java.util.List;

/**
 * Created by Administrator on 2017/07/17.
 */
public class StudentJDBCTemplate implements StudentJDBCDAO {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;

    public void setDataSource(DataSource dataSource){
        this.dataSource = dataSource;
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }

    public void insertStudent(String SName,Integer QQ,String Style,String Time,String School,Integer SNumber,
                              String Link,String Dream,String FBro,String YBro,String WhereKnow,Integer create_at){
        String sql = "insert into businesstable(SName,QQ,Style,Time,School,SNumber,Link,Dream,FBro,YBro,WhereKnow,create_at)" +
                " values(?,?,?,?,?,?,?,?,?,?,?,?)";
        jdbcTemplateObject.update(sql,SName,QQ,Style,Time,School,SNumber,Link,Dream,FBro,YBro,WhereKnow,create_at);

        return;
    }

    public void deleteStudent(int Id){
        String sql = "delete from businesstable where ID = ?";
        jdbcTemplateObject.update(sql,Id);

    }

    public void updateStudent(String SName,Integer QQ,String Style,String Time,String School,Integer SNumber,
                              String Link,String Dream,String FBro,String YBro,String WhereKnow,Integer update_at,Integer ID){
        String sql = "update businesstable set SName=?,QQ=?,Style=?,Time=?,School=?,SNumber=?,Link=?,Dream=?," +
                "FBro=?,YBro=?,WhereKnow=?,update_at=? where ID = ?";
        jdbcTemplateObject.update(sql,SName,QQ,Style,Time,School,SNumber,Link,Dream, FBro,YBro,WhereKnow,update_at,ID);

        return;
    }



    //和查询相关操作详见：http://www.yiibai.com/spring/spring-jdbctemplate-querying-examples.html
    public List<Student> getStudentListByName(String SName){
        String sql = "select * from businesstable where SName = ?";
        List<Student> students = jdbcTemplateObject.query(sql,new Object[]{SName},new BeanPropertyRowMapper(Student.class));

        return students;
    }



    public Student selectStudent(int id){
        String sql = "select * from businesstable where ID = ?";
        Student student = jdbcTemplateObject.queryForObject(sql,new Object[]{id},new StudentMapper());

        return student;

    }
}
