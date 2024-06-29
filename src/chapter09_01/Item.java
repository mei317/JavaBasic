package chapter09_01;

public class Item {

//	メンバ変数
	private String name;
	private int price;
	
//	コンストラクタ
	public Item (String name, int price) {
		this.name = name;
		this.price = price;
	}
	
//	メソッド
	public void display () {
		System.out.print(name + ":");
		System.out.println(price + "円");
	}
	
}