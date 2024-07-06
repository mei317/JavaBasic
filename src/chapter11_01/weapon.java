package chapter11_01;

public class weapon extends Item{
	
	public weapon(String name,int value) {
		super(name, value);
	}
	
	@Override
	public void use() {
		System.out.println(name + "でこうげき!!");
		System.out.println("敵に" + value + "のダメージ!!");
	}
	
}
