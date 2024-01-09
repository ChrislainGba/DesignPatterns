package com.xl1.dp.designpatterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable{
	private String shopName;
	private List<Book> books = new ArrayList<>();
	public String getShopName() {
		return shopName;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	@Override
	public String toString() {
		return "BookShop [shopName=" + shopName + ", books=" + books + "]";
	}
	
	public void loadBook() {
		for (int i = 0; i < 10; i++) {
			Book b = new Book((long)i, "book"+i);
			getBooks().add(b);
		}
	}
	
	/*
	 * @Override protected Object clone() throws CloneNotSupportedException { //
	 * super.clone() is a shalow copy That mean they share reference. return super.clone(); }
	 */
	
	@Override
	protected BookShop clone() throws CloneNotSupportedException {
		//This is deep copy
		BookShop bs = new BookShop();
		for(Book b : this.getBooks()) {
			bs.getBooks().add(b);
		}
		return bs;
	}
	
	
	
}
