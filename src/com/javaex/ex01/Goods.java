package com.javaex.ex01;

public class Goods {
	
	//필드
	String name;
	int price;
	
	//생성자
	public Goods() {
		super();
	}
	
	public Goods(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	//메소드gs
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}

	//메소드일반
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + "]";
	}
	
}
