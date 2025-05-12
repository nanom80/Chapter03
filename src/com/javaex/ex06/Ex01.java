package com.javaex.ex06;

public class Ex01 {
	//필드
	//생성자
	//메소드 gs
	
	//메소드 일반
	public static void main(String[] args) {
		
		String s00 = new String("안녕하세요");
		String s01 = new String("안녕하세요");
		
		System.out.println(s00.toString());
		System.out.println(s01.toString());
		
		String str00 = "hi";
		String str01 = "굿모닝";
		String str02 = "굿모닝";
		
		System.out.println(str00.toString());
		System.out.println(str01.toString());
		System.out.println(str02.toString());
		System.out.println("---------------");
		
		//주소가 같냐
		System.out.println(s00==s01); //false
		System.out.println(str01==str02); //true
		System.out.println("---------------");
		
		//값이 같냐
		System.out.println(s00.equals(s01)); //true
		System.out.println(str01.equals(str02)); //true
		System.out.println("---------------");
		
		str01 = "굿이브닝";
		System.out.println(str01==str02); //false -> 문자열을 변경하면 주소가 바뀐다
		
		
		
		
	}
	
}


