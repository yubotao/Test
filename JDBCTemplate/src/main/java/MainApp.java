import dao.StudentJDBCTemplate;
import domain.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/07/18.
 */
public class MainApp {
    public static void main(String[] args){
    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    StudentJDBCTemplate studentJDBCTemplate = (StudentJDBCTemplate) context.getBean("studentJDBCTemplate" );

        System.out.println("开始前时间");
        Calendar cal1 = Calendar.getInstance();
        Date date1 = cal1.getTime();
        System.out.println(new SimpleDateFormat("yyyy/MM/dd-HH:mm:ss:SSS").format(date1));

//        Student record = studentJDBCTemplate.selectStudent(6);
//        System.out.print("SName :"+record.getSName());
//        System.out.print(",QQ :"+record.getQQ());
//        System.out.print(",Style :"+record.getStyle());
//        System.out.print(",Time :"+record.getTime());
//        System.out.print(",School :"+record.getSchool());
//        System.out.print(",SNumber :"+record.getSNumber());
//        System.out.print(",Link :"+record.getLink());
//        System.out.print(",Dream :"+record.getDream());
//        System.out.print(",FBro :"+record.getFBro());
//        System.out.print(",YBro :"+record.getYBro());
//        System.out.print(",WhereKnow :"+record.getWhereKnow());
//        System.out.print(",ID :"+record.getID());
//        System.out.print(",create_at :"+record.getCreate_at());
//        System.out.println(",update_at :"+record.getUpdate_at());




//该功能暂时无法使用，无法从服务器数据库内提取出列表，还未找到原因。
    List<Student> students =  studentJDBCTemplate.getStudentListByName("test" );
    if(students.isEmpty())
    {System.out.println("没有记录");}

        for(Student record1:students){
        System.out.print("SName :"+record1.getSName());
        System.out.print(",QQ :"+record1.getQQ());
        System.out.print(",Style :"+record1.getStyle());
        System.out.print(",Time :"+record1.getTime());
        System.out.print(",School :"+record1.getSchool());
        System.out.print(",SNumber :"+record1.getSNumber());
        System.out.print(",Link :"+record1.getLink());
        System.out.print(",Dream :"+record1.getDream());
        System.out.print(",FBro :"+record1.getFBro());
        System.out.print(",YBro :"+record1.getYBro());
        System.out.print(",WhereKnow :"+record1.getWhereKnow());
        System.out.print(",ID :"+record1.getID());
        System.out.print(",create_at :"+record1.getCreate_at());
        System.out.println(",update_at :"+record1.getUpdate_at());
    }

        System.out.println("开始后时间");
        Calendar cal2 = Calendar.getInstance();
        Date date2 = cal2.getTime();
        System.out.println(new SimpleDateFormat("yyyy/MM/dd-HH:mm:ss:SSS").format(date2));
}

}
