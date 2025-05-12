package com.javaex.ex02;

public class PointApp {
	
	public static void main(String[] args) {
		
		Point p01 = new Point();
		p01.setX(5);
		p01.setY(10);
		
		System.out.println(p01.toString());
		//Object의 메소드(toString)를 사용할 수 있지만 보통 재정의해서 사용한다
		
		//print(), println()은 toString()을 실행한다
		System.out.println(p01);
		
		System.out.println(p01.getClass()); //클래스이름
		
		System.out.println(p01.hashCode()); //당분간 주소라고 생각할 것
		
		System.out.println(p01.equals(p01));
		
	}

}

