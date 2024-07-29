package chapter01;

import java.util.Comparator;

class TitleComparator implements Comparator<Book> {

//	書名の昇順で並び替える
	@Override
	public int compare(Book x, Book y) {
		return x.getTitle().compareTo(y.getTitle());
	}

}
