package chapter01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;

class Main {

	public static void main(String[] args) throws ParseException {
//		日付フォーマット変換
		SimpleDateFormat day = new SimpleDateFormat("yyyy/MM/dd");
		 
//		ArrayList作成
		ArrayList<Book> books = new ArrayList<>();
		
//		ArrayList格納
		books.add(new Book("Java 入門", day.parse("2011/10/07"), "スッキリわかる"));
		books.add(new Book("Python 入門", day.parse("2019/06/11"), "カレーが食べたくなる"));
		books.add(new Book("C 言語入門", day.parse("2018/06/21"), "ポインタも自由自在"));
	
//   	書名順で並び替え
		Collections.sort(books, new TitleComparator());
		
		for(Book book: books) {
			System.out.println(book.getTitle() + " " + day.format(book.getPublishDate()) + " " +book.getComment());
		}
	}
}
