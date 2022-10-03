package com.ex;

public class Category {
	private String name;
	private Book sai;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Category(Book sai) {
		super();
		this.sai = sai;
	}
	/*public Book getSai() {
		return sai;
	}
	public void setSai(Book sai) {
		this.sai = sai;
	}*/
	void show() {
		System.out.println("Book Name:"+sai.getBookName());
		System.out.println("BookPrice:"+sai.getBookPrice());
		System.out.println("Book Author:"+sai.getBookAuthor());
				
	}

}
