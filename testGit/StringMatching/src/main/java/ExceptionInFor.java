import java.util.ArrayList;
import java.util.List;

/**
 * Created by yubotao on 2017/11/30.
 */
public class ExceptionInFor {
    
    public static void main(String[] args) {
        //for循环处理异常，但是会继续处理，如果不做try/catch处理，程序直接终止
        List<Integer> a = new ArrayList<>();
        String[] strArray = {"1","2",".","4","455"};
        for(int i = 0; i < strArray.length; i++){
            try {
                a.add(Integer.parseInt(strArray[i]));
            }catch (Exception e){
                e.printStackTrace();
//					return;
//					break;
            }finally {
                System.out.println("xxx");
            }
        }
    
    
        System.out.println(a);
    }
    
}
