package com.javaex.ex01;

//public class GoodsApp extends Object {
//Object 클래스는 기본으로 상속되서 보통 안쓴다 
public class GoodsApp {

	public static void main(String[] args) {
		
		//모든 클래스의 부모는 Object 클래스이다
		Goods camera = new Goods();
		camera.hashCode(); //Object 클래스의 메소드
		
		Object obj = new Object();
		System.out.println(obj.getClass());				//class java.lang.Object	클래스정보
		System.out.println(obj.getClass().getName());	//java.lang.Object			클래스명
		System.out.println(obj.toString());				//java.lang.Object@28a418fc	출력정보
		System.out.println(obj.hashCode());				//681842940					당분간 주소라고 생각하자
		System.out.println(obj.equals(camera));			//false						두 개가 같냐
		
	}
}
