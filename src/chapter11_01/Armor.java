package chapter11_01;

public class Armor extends Item {
	
	public Armor(String name, int value) {
		super(name, value);
	}
	
	@Override
	public void use() {
		System.out.println(name + "を身に着けた");
		System.out.println("守備力が" + value + "上がった");
	}
	
}
