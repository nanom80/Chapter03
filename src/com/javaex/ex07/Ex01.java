package com.javaex.ex07;

public class Ex01 {
	
	public static void main(String[] args) {
		
		int a = 3;
		System.out.println(a);
		
		Integer i = new Integer(3);
		System.out.println(i.toString());
		
		Integer sum = new Integer(3) + new Integer(3);		
		System.out.println(sum);
		
		Integer v01 = 3; //new Integer(3)를 자동으로 처리, 박싱
		System.out.println(v01);
		
		Integer i01 = new Integer(999); //i01은 주소
		int b = i01;	//언박싱
		System.out.println(b);
		
		System.out.println("-------------------");
		
		//Integer r01 = new Integer(100);
		Integer r01 = 100; //박싱
		int result01 = r01.parseInt("12345");
		System.out.println(result01+3);
		
		System.out.println("-------------------");
		//문자열을 정수로 바꿀 땐 아래 방식으로
		int result02 = Integer.parseInt("12345");
		System.out.println(result02);
		
		System.out.println("-------------------");
		//정수->문자열   12345->"12345"
		//덜 좋은 방식, 필요없는 "안녕"을 만들어야한다
		String s = new String("안녕");
		String sNum = s.valueOf(12345);
		System.out.println(sNum+1);
		
		//조금 더 좋은 방식(정수,실수->문자열)
		String sNum2 = String.valueOf(12345);
		System.out.println(sNum2+2);
		
		String sNum3 = String.valueOf(12345.6789);
		System.out.println(sNum3+1); //덧셈이 되는게 아니라 문자열 연산이 됨(뒤에 붙는다)
		
		System.out.println("-------------------");
		//숫자->문자열
		System.out.println(999+"1");
		String sNum4 = ""+999;
		System.out.println(sNum4+2);
		
		
		
		
		
	}
	
}



