package chapter03_02;

class Main{
	
	public static void main(String[] args) {
	    Func1 func1 = x -> x % 2 == 1;
	    Func2 func2 = (point, name) -> name + "さんは" + (point > 65 ? "合格" : "不合格");
	    
		Boolean result1 = func1.apply(20);
		String result2 = func2.apply(70, "田中");
		
		System.out.println(result1);
		System.out.println(result2);
	}
	
}
