package chapter15_01;

public class ExtensionExtractor {
	
    public static void main(String[] args) {
    	
    	for(int i = 0; i < args.length; i++) {
    		if (args.length >= 1) {
                System.out.println(args[i].substring(args[i].lastIndexOf(".")));
    		}
    	}
    }
    
}
