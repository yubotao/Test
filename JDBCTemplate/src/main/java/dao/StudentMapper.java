package dao;

import domain.Student;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Administrator on 2017/07/17.
 */
public class StudentMapper implements RowMapper<Student> {
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        Student student = new Student();
        student.setSName(rs.getString("SName"));
        student.setQQ(rs.getInt("QQ"));
        student.setStyle(rs.getString("Style"));
        student.setTime(rs.getString("Time"));
        student.setSchool(rs.getString("School"));
        student.setSNumber(rs.getInt("SNumber"));
        student.setLink(rs.getString("Link"));
        student.setDream(rs.getString("Dream"));
        student.setFBro(rs.getString("FBro"));
        student.setYBro(rs.getString("YBro"));
        student.setWhereKnow(rs.getString("WhereKnow"));
        student.setID(rs.getInt("ID"));
        student.setCreate_at(rs.getInt("create_at"));
        student.setUpdate_at(rs.getInt("update_at"));

        return student;
    }
}
