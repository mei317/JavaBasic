package chater17_02;

import java.io.FileReader;
import java.io.FileNotFoundException;

class Main{

    public static void main(String[] args) {
    	
        if (args.length != 2) {
            System.out.println("引数は2つの数値を指定してください");
            System.out.println("プログラムを終了します");
            return;
        }
        
        try {
            loadFile();
        } catch (FileNotFoundException e) {
            System.out.println("ファイルを読込できません");
        }
    }

    private static void loadFile() throws FileNotFoundException {
    	
        FileReader fr = new FileReader("notfound.txt");
        
    }
}
