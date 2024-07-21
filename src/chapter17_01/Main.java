package chapter17_01;

public class Main{
	
    public static void main(String[] args){
    	
        try {
            if (args.length != 2) {
            	System.out.println("引数は2つの数値を指定してください");
            	System.out.println("プログラムを終了します");
            	return;
            }
            
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);
            System.out.println(x / y);
            System.out.println("プログラムを終了します");
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("引数の数が足りません");
        } catch (NumberFormatException e) {
            System.out.println("引数はそれぞれ数値でなければいけません");
        } catch (ArithmeticException e) {
            System.out.println("不正な計算を行いました");
            System.out.println("プログラムを終了します");
        }
           
    }
    
}
