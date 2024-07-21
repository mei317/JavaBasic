package chapter16_03;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Main {
	
    public static void main(String[] args) {
        //HashMapインスタンスを生成
    	Map<String, Integer> scores = new HashMap<>();
    	
        //各科目の科目名と得点を要素として追加
    	scores.put("国語", 90);
    	scores.put("数学", 80);
    	scores.put("英語", 70);

        //HashMapからkeySetを取り出し、拡張forで各科目の
        //科目名と得点を表示する。
        Set<String> subjects = scores.keySet();
        for (String subject : subjects) {
            int score = scores.get(subject);
            System.out.println(subject + ":" + score);
        }

    }
    
}
