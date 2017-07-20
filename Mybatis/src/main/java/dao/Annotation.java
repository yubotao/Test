package dao;

import domain.Student;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * Created by Administrator on 2017/07/19.
 */
public interface Annotation {
    @Select("select * from businesstable where ID = #{ID}")
    public Student selectById(Integer ID);

    @Delete(" delete from businesstable where ID = #{ID}")
    public void deleteById(Integer ID);

    @Insert(" insert into businesstable(SName,QQ,Style,Time,School,SNumber,Link,Dream,FBro,YBro,WhereKnow,create_at)\n" +
            "        values(#{SName},#{QQ},#{Style},#{Time},#{School},#{SNumber},#{Link},#{Dream},#{FBro},#{YBro},#{WhereKnow},#{create_at})")
    public void insertStu(Student stu);

    @Update("update businesstable set SName=#{SName},QQ=#{QQ},Style=#{Style},Time=#{Time},School=#{School},SNumber=#{SNumber},\n" +
            "        Link=#{Link},Dream=#{Dream},FBro=#{FBro},YBro=#{YBro},WhereKnow=#{WhereKnow},update_at=#{update_at} where ID=#{ID}")
    public void updateStu(Student stu);
}
