package chapter16_01;

import java.util.ArrayList;

public class FruitsList {

	public static void main(String[] args) {
		
		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("みかん");
		fruits.add("バナナ");
		fruits.add("いちご");
		fruits.add("りんご");
		
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
	}
}
