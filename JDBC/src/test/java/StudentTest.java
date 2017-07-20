import dao.StudentDAO;
import dao.StudentDAOImpl;
import daomain.Student;
import org.junit.Test;

/**
 * Created by Administrator on 2017/07/17.
 */
public class StudentTest {
    StudentDAO sDAO = new StudentDAOImpl();
    @Test
    public void insert(){
        Student entity = new Student();
        entity.setSName("测试");
        entity.setQQ(1111);
        entity.setStyle("java");
        entity.setTime("2017.7.2");
        entity.setSchool("GZU");
        entity.setSNumber(1902);
        entity.setLink("www.");
        entity.setDream("dddd");
        entity.setFBro("zy");
        entity.setYBro("zy");
        entity.setWhereKnow("zh");
        entity.setCreate_at(20170705);
        boolean flag = sDAO.insert(entity);
        if(flag){
            System.out.println("插入成功");
        }else{
            System.out.println("插入失败");
        }
    }

    @Test
    public void selectById(){
        Student entity = sDAO.selectById(1);
        System.out.println(entity.toString());
    }

    @Test
    public void selectByName(){
        Student entity = sDAO.selectByName("测试");
        System.out.println(entity.toString());
    }

    @Test
    public void updateById(){
        Student entity = sDAO.selectById(4);
        entity.setSName("测试2");
        entity.setQQ(2222);
        entity.setUpdate_at(20170705);
        boolean flag = sDAO.updateById(entity);
        if(flag){
            System.out.println("更新成功");
        } else{
            System.out.println("更新失败");
        }
    }

    @Test
    public void deleteById(){
        boolean flag = sDAO.deleteById(27);
        if(flag){
            System.out.println("删除成功");
        }else{
            System.out.println("删除失败");
        }
    }
}
