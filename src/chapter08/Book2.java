package chapter08;

public class Book2 extends Book {
	
	public static void showBook() {
		Book book = new Book();
		
		System.out.println("この本のタイトルは"+ book.title +"、価格は"+ book.price +"です。");
		System.out.println("生成番号は"+ book.number + "です。");
	}
	
	public static int getCount() {
		return Book.count;
	}
	
	public static void main(String[] args) {
		showBook();
	}
	
}