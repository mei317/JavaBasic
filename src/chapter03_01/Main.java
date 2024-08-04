package chapter03_01;

class Main{

	public static void main(String[] args) {
		FuncList funcList = new FuncList();
		
		Func1 func1 = FuncList::isOdd;
		Func2 func2 = funcList::passCheck;
		
		Boolean result1 = func1.apply(20);
		String result2 = func2.apply(70, "田中");
		
		System.out.println(result1);
		System.out.println(result2);
		
	}

}
