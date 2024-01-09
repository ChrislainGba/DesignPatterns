package com.xl1.dp.designpatterns.prototype;

public class PrototypeDP {
	//you want to create object using another one
	//if you want to clone object to not fetch data again
	public static void main(String[] args) throws CloneNotSupportedException {
		BookShop bs = new BookShop();
		bs.setShopName("Eleclerk");
		bs.loadBook();
		
		
		
		
		
		BookShop bs1 = (BookShop) bs.clone();
		
		bs.getBooks().remove(2);
		System.out.println(bs);
		
		bs1.setShopName("SuperU");
		System.out.println(bs1);
	}
}
