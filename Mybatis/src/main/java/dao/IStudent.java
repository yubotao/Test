package dao;

import domain.Student;

import java.util.List;

/**
 * Created by Administrator on 2017/07/17.
 */
public interface IStudent {
    public List<Student> getStudentList();
    public void insertStudent(Student stu);
    public void updateStudent(Student stu);
    public void deleteStudent(int Id);
    public Student selectStudent(int id);
}
