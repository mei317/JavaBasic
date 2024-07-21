package chapter11_03;

public class Switch implements Transferable{
	
	@Override
	public void transfer() {
		System.out.println("MACアドレスを使ってデータを転送します");
	}
	
}
