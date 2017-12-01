import java.util.ArrayList;
import java.util.List;

/**
 * Created by yubotao on 2017/11/30.
 */
public class StringMatching {
    
    public static void main(String[] args) {
        //使用字符数组处理字符串，比正则强一点，正则只能匹配（暂时不会如何替换）
			String test = "1,2,,,.kl;hg*13* ...,3";
			char[] array = test.toCharArray();
			List<String> strList = new ArrayList<>();
			StringBuilder stringBuilder = new StringBuilder();
				for (int i = 0; i < array.length; i++) {
//					if (array[i] >= 48 && array[i] <= 57)
//        和上面的判断得到结果一致
					if(Character.isDigit(array[i]))
					{
//        下面三个都是可以将char转换为String
//						strList.add(Character.toString(array[i]));
//						strList.add("" + array[i]);
						strList.add(String.valueOf(array[i]));
					}
				}
				stringBuilder.append(strList.get(0));
				for(int j = 1; j < strList.size(); j++){
					stringBuilder.append("," + strList.get(j));
				}

			System.out.println(stringBuilder.toString());
    }
    
}
