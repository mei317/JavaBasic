package chapter10_02;

public class Fighter {

	public String name;
	public int atk;
	
	public Fighter() {
		this.name = "戦士";
		this.atk = 10;		
	}
	
	public void attack() {
		System.out.println(this.name + "の攻撃!");
		System.out.println("敵に" + this.atk + "のダメージ!");
	}
	
}

