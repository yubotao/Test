import dao.StudentJDBCTemplate;
import domain.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by Administrator on 2017/07/17.
 */
public class JDBCTemplateTest {
    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    StudentJDBCTemplate studentJDBCTemplate = (StudentJDBCTemplate) context.getBean("studentJDBCTemplate" );


    @Test
    public void insert(){
        studentJDBCTemplate.insertStudent("ss",22,null,null,null,
                null,null,null,null,null,null,20170709);
    }

    @Test
    public void selectById(){
        Student stu = studentJDBCTemplate.selectStudent(1);
        System.out.println(stu.toString());
    }

    @Test
    public void deleteById(){
        studentJDBCTemplate.deleteStudent(12);
    }

    @Test
    public void update(){
        studentJDBCTemplate.updateStudent("乱码？",000,null,null,null,
                null,null,null,null,null,null,20170709,3);
    }

    @Test
    public void getStudentListByName(){
        List<Student> students =  studentJDBCTemplate.getStudentListByName("测试");
        for(Student record:students){
            System.out.print("SName :"+record.getSName());
            System.out.print(",QQ :"+record.getQQ());
            System.out.print(",Style :"+record.getStyle());
            System.out.print(",Time :"+record.getTime());
            System.out.print(",School :"+record.getSchool());
            System.out.print(",SNumber :"+record.getSNumber());
            System.out.print(",Link :"+record.getLink());
            System.out.print(",Dream :"+record.getDream());
            System.out.print(",FBro :"+record.getFBro());
            System.out.print(",YBro :"+record.getYBro());
            System.out.print(",WhereKnow :"+record.getWhereKnow());
            System.out.print(",ID :"+record.getID());
            System.out.print(",create_at :"+record.getCreate_at());
            System.out.println(",update_at :"+record.getUpdate_at());
        }
    }
}
