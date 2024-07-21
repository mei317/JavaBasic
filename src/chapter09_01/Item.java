package chapter09_01;

public class Item {

	private String name;
	private int price;
	
	public Item (String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public void display () {
		System.out.print(this.name + ":");
		System.out.println(this.price + "円");
	}
	
}