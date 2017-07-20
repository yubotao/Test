import dao.StudentDAO;
import dao.StudentDAOImpl;
import daomain.Student;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Administrator on 2017/07/18.
 */
public class jdbcMain {
    public static void main(String[] args) {

        StudentDAO sDAO = new StudentDAOImpl();
//JDBC主函数只用来实现插入数据了

        Student entity = new Student();

        entity.setSName("一条不一样");
        entity.setQQ(0000000);
        entity.setStyle("java");
        entity.setTime("2017.7.18");
        entity.setSchool("GZU");
        entity.setSNumber(1902);
        entity.setLink("www.");
        entity.setDream("dddd");
        entity.setFBro("zy");
        entity.setYBro("zy");
        entity.setWhereKnow("zh");
        entity.setCreate_at(20170718);

        Student entity2 = new Student();

        entity2.setSName("换一条");
        entity2.setQQ(0000000);
        entity2.setStyle("java");
        entity2.setTime("2017.7.18");
        entity2.setSchool("GZU");
        entity2.setSNumber(1902);
        entity2.setLink("www.");
        entity2.setDream("dddd");
        entity2.setFBro("zy");
        entity2.setYBro("zy");
        entity2.setWhereKnow("zh");
        entity2.setCreate_at(20170718);

        Student entity3 = new Student();

        entity3.setSName("还得换");
        entity3.setQQ(0000000);
        entity3.setStyle("java");
        entity3.setTime("2017.7.18");
        entity3.setSchool("GZU");
        entity3.setSNumber(1902);
        entity3.setLink("www.");
        entity3.setDream("dddd");
        entity3.setFBro("zy");
        entity3.setYBro("zy");
        entity3.setWhereKnow("zh");
        entity3.setCreate_at(20170718);

        Student entity4 = new Student();

        entity4.setSName("再来");
        entity4.setQQ(0000000);
        entity4.setStyle("java");
        entity4.setTime("2017.7.18");
        entity4.setSchool("GZU");
        entity4.setSNumber(1902);
        entity4.setLink("www.");
        entity4.setDream("dddd");
        entity4.setFBro("zy");
        entity4.setYBro("zy");
        entity4.setWhereKnow("zh");
        entity4.setCreate_at(20170718);

        Student entity5 = new Student();

        entity5.setSName("还来");
        entity5.setQQ(0000000);
        entity5.setStyle("java");
        entity5.setTime("2017.7.18");
        entity5.setSchool("GZU");
        entity5.setSNumber(1902);
        entity5.setLink("www.");
        entity5.setDream("dddd");
        entity5.setFBro("zy");
        entity5.setYBro("zy");
        entity5.setWhereKnow("zh");
        entity5.setCreate_at(20170718);

        Student entity6 = new Student();

        entity6.setSName("智障吧");
        entity6.setQQ(0000000);
        entity6.setStyle("java");
        entity6.setTime("2017.7.18");
        entity6.setSchool("GZU");
        entity6.setSNumber(1902);
        entity6.setLink("www.");
        entity6.setDream("dddd");
        entity6.setFBro("zy");
        entity6.setYBro("zy");
        entity6.setWhereKnow("zh");
        entity6.setCreate_at(20170718);

        Student entity7 = new Student();

        entity7.setSName("服了");
        entity7.setQQ(0000000);
        entity7.setStyle("java");
        entity7.setTime("2017.7.18");
        entity7.setSchool("GZU");
        entity7.setSNumber(1902);
        entity7.setLink("www.");
        entity7.setDream("dddd");
        entity7.setFBro("zy");
        entity7.setYBro("zy");
        entity7.setWhereKnow("zh");
        entity7.setCreate_at(20170718);

        Student entity8 = new Student();

        entity8.setSName("好");
        entity8.setQQ(0000000);
        entity8.setStyle("java");
        entity8.setTime("2017.7.18");
        entity8.setSchool("GZU");
        entity8.setSNumber(1902);
        entity8.setLink("www.");
        entity8.setDream("dddd");
        entity8.setFBro("zy");
        entity8.setYBro("zy");
        entity8.setWhereKnow("zh");
        entity8.setCreate_at(20170718);

        Student entity9 = new Student();

        entity9.setSName("大司马");
        entity9.setQQ(0000000);
        entity9.setStyle("java");
        entity9.setTime("2017.7.18");
        entity9.setSchool("GZU");
        entity9.setSNumber(1902);
        entity9.setLink("www.");
        entity9.setDream("dddd");
        entity9.setFBro("zy");
        entity9.setYBro("zy");
        entity9.setWhereKnow("zh");
        entity9.setCreate_at(20170718);

        Student entity10 = new Student();

        entity10.setSName("很皮");
        entity10.setQQ(0000000);
        entity10.setStyle("java");
        entity10.setTime("2017.7.18");
        entity10.setSchool("GZU");
        entity10.setSNumber(1902);
        entity10.setLink("www.");
        entity10.setDream("dddd");
        entity10.setFBro("zy");
        entity10.setYBro("zy");
        entity10.setWhereKnow("zh");
        entity10.setCreate_at(20170718);

        Student entity11 = new Student();

        entity11.setSName("骚猪");
        entity11.setQQ(0000000);
        entity11.setStyle("java");
        entity11.setTime("2017.7.18");
        entity11.setSchool("GZU");
        entity11.setSNumber(1902);
        entity11.setLink("www.");
        entity11.setDream("dddd");
        entity11.setFBro("zy");
        entity11.setYBro("zy");
        entity11.setWhereKnow("zh");
        entity11.setCreate_at(20170718);

        Student entity12 = new Student();

        entity12.setSName("？");
        entity12.setQQ(0000000);
        entity12.setStyle("java");
        entity12.setTime("2017.7.18");
        entity12.setSchool("GZU");
        entity12.setSNumber(1902);
        entity12.setLink("www.");
        entity12.setDream("dddd");
        entity12.setFBro("zy");
        entity12.setYBro("zy");
        entity12.setWhereKnow("zh");
        entity12.setCreate_at(20170718);



       for (int i = 0; i < 100000000; i++) {

           boolean flag = sDAO.insert(entity);
           if (flag) {
               System.out.println("插入成功");
           } else {
               System.out.println("插入失败");
           }

           boolean flag2 = sDAO.insert(entity2);
           if (flag2) {
               System.out.println("插入成功");
           } else {
               System.out.println("插入失败");
           }

           boolean flag3 = sDAO.insert(entity3);
           if (flag3) {
               System.out.println("插入成功");
           } else {
               System.out.println("插入失败");
           }

           boolean flag4 = sDAO.insert(entity4);
           if (flag4) {
               System.out.println("插入成功");
           } else {
               System.out.println("插入失败");
           }

           boolean flag5 = sDAO.insert(entity5);
           if (flag5) {
               System.out.println("插入成功");
           } else {
               System.out.println("插入失败");
           }
           boolean flag6 = sDAO.insert(entity6);
           if (flag6) {
               System.out.println("插入成功");
           } else {
               System.out.println("插入失败");
           }
           boolean flag7 = sDAO.insert(entity7);
           if (flag7) {
               System.out.println("插入成功");
           } else {
               System.out.println("插入失败");
           }
           boolean flag8 = sDAO.insert(entity8);
           if (flag8) {
               System.out.println("插入成功");
           } else {
               System.out.println("插入失败");
           }
           boolean flag9 = sDAO.insert(entity9);
           if (flag9) {
               System.out.println("插入成功");
           } else {
               System.out.println("插入失败");
           }
           boolean flag10 = sDAO.insert(entity10);
           if (flag10) {
               System.out.println("插入成功");
           } else {
               System.out.println("插入失败");
           }
           boolean flag11 = sDAO.insert(entity11);
           if (flag11) {
               System.out.println("插入成功");
           } else {
               System.out.println("插入失败");
           }
           boolean flag12 = sDAO.insert(entity12);
           if (flag12) {
               System.out.println("插入成功");
           } else {
               System.out.println("插入失败");
           }
       }

/*
        System.out.println("打印运行前时间：");
        Calendar cal1 = Calendar.getInstance();
        Date date1 = cal1.getTime();
        System.out.println(new SimpleDateFormat("yyyy/MM/dd-HH:mm:ss:SSS").format(date1));

        Student stu = sDAO.selectByName("测试");
        System.out.println(stu.toString());

        System.out.println("打印运行后时间：");
        Calendar cal2 = Calendar.getInstance();
        Date date2 = cal2.getTime();

        System.out.println(new SimpleDateFormat("yyyy/MM/dd-HH:mm:ss:SSS").format(date2));

*/
    }

}

