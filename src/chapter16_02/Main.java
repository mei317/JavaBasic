package chapter16_02;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

        //HashSetインスタンスを生成し、Set型の変数setに代入する
		//扱う要素はString型
		Set<String> set = new HashSet<>();

        //addメソッドを使って、「みかん」「バナナ」「いちご」「りんご」
        //の各文字列を要素として追加する
		set.add("みかん");
		set.add("バナナ");
		set.add("いちご");
		set.add("りんご");

        //removeメソッドを使って「みかん」を削除する
		set.remove("みかん");
        System.out.println(set);
        
        //containsメソッドを使って「バナナ」が含まれているかを判定し、trueかfalseを表示する
        if(set.contains("バナナ")) {
        	System.out.println(true);
        } else {
        	System.out.println(false);
        }

        //containsメソッドを使って「みかん」が含まれているかを判定し、trueかfalseを表示する
        if(set.contains("みかん")) {
        	System.out.println(true);
        } else {
        	System.out.println(false);
        }

	}

}
