package dao;

import daomain.Student;

/**
 * Created by Administrator on 2017/07/17.
 */
public interface StudentDAO {
    boolean insert(Student entity);//增
    boolean deleteById(Integer ID);//删
    boolean updateById(Student entity);//改
    Student selectById(Integer ID);//查

    Student selectByName(String name);//根据学院姓名查找
}
