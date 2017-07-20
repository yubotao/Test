import domain.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by Administrator on 2017/07/17.
 */
public class MybatisTest {
    public SqlSession getSession() throws IOException {
        String resource = "Configure.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        return sqlSession;
    }
    //selectById
    @Test
    public void selectStudent() throws IOException{
        SqlSession sqlSession = getSession();
        Student stu = sqlSession.selectOne("stu.selectStudent",1);
        System.out.println(stu);
        sqlSession.close();
    }
    //selectList
    @Test
    public void getStudentListByName() throws IOException{
        SqlSession sqlSession = getSession();
        List<Student> list = sqlSession.selectList("stu.getStudentListByName","一条不一样");
        //System.out.println(list);
        for(Student record1:list) {
            System.out.print("SName :" + record1.getSName());
            System.out.print(",QQ :" + record1.getQQ());
            System.out.print(",Style :" + record1.getStyle());
            System.out.print(",Time :" + record1.getTime());
            System.out.print(",School :" + record1.getSchool());
            System.out.print(",SNumber :" + record1.getSNumber());
            System.out.print(",Link :" + record1.getLink());
            System.out.print(",Dream :" + record1.getDream());
            System.out.print(",FBro :" + record1.getFBro());
            System.out.print(",YBro :" + record1.getYBro());
            System.out.print(",WhereKnow :" + record1.getWhereKnow());
            System.out.print(",ID :" + record1.getID());
            System.out.print(",create_at :" + record1.getCreate_at());
            System.out.println(",update_at :" + record1.getUpdate_at());
        }
        sqlSession.close();
    }
    //insert
    @Test
    public void insertStudent() throws IOException{
        SqlSession sqlSession = getSession();
        Student stu = new Student("s",22,"dsfa","20170705",null,null,
                null,null,null,null,null,null,20170707,null);
        sqlSession.insert("stu.insertStudent",stu);
        sqlSession.commit();
        System.out.println(stu.getID());
        sqlSession.close();
    }
    //delete
    @Test
    public void deleteStudent() throws  IOException{
        SqlSession sqlSession = getSession();
        sqlSession.delete("stu.deleteStudent",5);
        sqlSession.commit();
        sqlSession.close();
    }
    //update
    @Test
    public void updateStudent() throws IOException{
        SqlSession sqlSession = getSession();
        Student stu = new Student("s",22,"dsfa","20170705",null,null,
                null,null,null,null,null,null,null,20170707);
        stu.setID(6);
        sqlSession.update("stu.updateStudent",stu);
        sqlSession.commit();
        sqlSession.close();
    }
}
