import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by yubotao on 2017/11/30.
 */
public class ZZ_Matching {
    
    public static void main(String[] args) {
        //正则真的是个好东西，真的要加强，太菜了
			Pattern pattern = Pattern.compile("(\\d,)*[0-9]");
			Matcher matcher = pattern.matcher("1,2,3,9");
			System.out.println(matcher.matches());
    }
    
}
