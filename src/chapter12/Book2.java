package chapter12;

public class Book2 {
	
    private String title;
    private int price;
    
    public Book2(String title,int price) {
    	this.title = title;
    	setPrice(price);
    }
    
    public String getTitle() {
    	return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public int getPrice() {
        return price;
    }
    
    public void setPrice(int price) {
    	if (price < 0) {
    		System.out.println("設定する値が-" + price + "のため、価格は0を設定しました。");
    		this.price = 0;
    	} else {
        	this.price = price;
    	}
    }
    
    public void show() {
        System.out.println("この本のタイトルは" + this.title + "で、値段は" + this.price + "です。");
    }
    
}
