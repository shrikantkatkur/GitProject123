package com.gitproject.pages;

public class CartPage {

	 int i=10;
	
	public static void main(String[] args) {
	
		CartPage t1= new CartPage();
		CartPage t2= new CartPage();
		CartPage t3= new CartPage();
		
		t1.i= t1.i+5;
		t2.i=t1.i+10;
		
		
		
		
		System.out.println(t1.i);
		System.out.println(t2.i);
		System.out.println(t3.i);
	}
}
