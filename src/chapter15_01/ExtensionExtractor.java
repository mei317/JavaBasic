package chapter15_01;

class ExtensionExtractor {
	
    public static void main(String[] args) {
    	
    	for(String name: args) {
    		if (name.contains(".")) {
                System.out.println(name.substring(name.lastIndexOf(".") + 1));
    		}
    	}
    	
    }
    
}
