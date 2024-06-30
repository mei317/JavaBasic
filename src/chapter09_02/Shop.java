package chapter09_02;

public class Shop {

	private String name;
	private int sales;
	
	public Shop (String name, int sales) {
		this.name = name;
		this.sales = sales;
	}
	
	public Shop () {
		this("出店予定", 0);
	}
	
	public void display () {
		System.out.println(this.name + ":売上高 " + this.sales + "円");
	}
}