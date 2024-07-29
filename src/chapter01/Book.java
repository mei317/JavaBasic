package chapter01;

import java.util.Date;
import java.util.Objects;

class Book implements Comparable<Book>, Cloneable {
    private String title;
    private Date publishDate;
    private String comment;
    
    protected Book(String title, Date publishDate ,String comment){
    	this.title = title;
    	this.publishDate = publishDate;
    	this.comment = comment;
    }

	String getTitle() {
    	return this.title;
    }
    
    Date getPublishDate() {
    	return this.publishDate;
    }
    
    String getComment() {
    	return this.comment;
    }
    
//    HashSetなどを正しく利用可能
    @Override
    public int hashCode() {
    	return Objects.hash(title, publishDate);
    }
    
//    書名と発行日が同じ場合等価判定
    @Override
    public boolean equals(Object obj) {
    	if (!(obj instanceof Book)) return false;

    	Book book = (Book)obj;
    	return Objects.equals(title, book.title) && Objects.equals(publishDate, book.publishDate);
    }
    
//    発行日が古い順に自然順序
    @Override
    public int compareTo(Book obj) {
    	return this.publishDate.compareTo(obj.publishDate);
    }
    
//    clone()をサポート
    @Override
    protected Book clone() throws CloneNotSupportedException {
    	Book objClone = (Book)super.clone();
    	objClone.publishDate = (Date) this.publishDate.clone();
    	return objClone;
    }
     
}
