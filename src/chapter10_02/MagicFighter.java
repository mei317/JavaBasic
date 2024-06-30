package chapter10_02;

public class MagicFighter extends Fighter{
	
	private int mp;

	public MagicFighter() {
		super();
		this.name = "魔法戦士";
		this.mp= 10;
	}
	
	@Override
	public void attack() {
		System.out.println(this.name + "の魔法攻撃!");
		System.out.println("敵に" + (atk + this.mp) + "のダメージ!");
	}
}
