package chapter03_04;

import java.util.ArrayList;
import java.util.List;

class Main {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();

		names.add("菅原拓真");
		names.add("湊雄輔");
		names.add("朝香あゆみ");
		names.add("大江岳人");

		names.stream()
				.filter(name -> name.length() <= 4)
				.map(name -> name + "さん")
				.forEach(System.out::println);
		
	}

}
