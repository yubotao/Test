import dao.Annotation;
import domain.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Administrator on 2017/07/19.
 */
public class AnnotationTest {
    public SqlSession getSession() throws IOException {
        String resource = "Configure.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        return sqlSession;
    }
    @Test
    public void selectStudent() throws IOException {
        SqlSession sqlSession = getSession();
        Annotation ant = sqlSession.getMapper(Annotation.class);
        Student stu = ant.selectById(2);
        System.out.println(stu);
        sqlSession.close();

    }

    @Test
    public void insertStudent() throws IOException{
        SqlSession sqlSession = getSession();
        Student stu = new Student("s",22,"dsfa","20170705",null,null,
                null,null,null,null,null,null,20170707,null);
        Annotation ant = sqlSession.getMapper(Annotation.class);
        ant.insertStu(stu);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void deleteStudent() throws  IOException{
        SqlSession sqlSession = getSession();
        Annotation ant = sqlSession.getMapper(Annotation.class);
        ant.deleteById(18);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void updateStudent() throws IOException{
        SqlSession sqlSession = getSession();
        Student stu = new Student("s",22,"dsfa","20170705",null,null,
                null,null,null,null,null,null,null,20170707);
        stu.setID(3);
        Annotation ant = sqlSession.getMapper(Annotation.class);
        ant.updateStu(stu);
        sqlSession.commit();
        sqlSession.close();
    }
}
