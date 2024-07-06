package chapter11_01;

abstract class Item {
	public String name;
	public int value;
	
	public Item(String name, int value) {
		this.name = name;
		this.value = value;
	}
	
	public abstract void use();
}