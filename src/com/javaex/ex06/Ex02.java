package com.javaex.ex06;

public class Ex02 {
	
	public static void main(String[] args) {
		
		String a = " abcd";
		String b = ",efg ";
		
		System.out.println(a+b);
		System.out.println(a.concat(b));
		System.out.println(b+a);
		System.out.println(b.concat(a));
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("-----------------");
		
		a = a.concat(b); //문자열을 합친다
		System.out.println(a);
		
		a = a.trim(); //문자열의 좌우공백을 제거한다
		System.out.println(a);
		
		a = a.replace("ab", "12"); //a의 문자열에서 ab를 12로 바꾼다
		System.out.println(a);
		
		System.out.println("-----------------");
		
		String[] sArr = a.split(",");	//a의 문자열을 ","를 기준으로 나눠어서 배열에 담는다
		for (int i=0; i<sArr.length; i++) {
			System.out.println(sArr[i]);
		}
		
		System.out.println(a);
		System.out.println("-----------------");
		
		String str = "Hello JAVA!";
		String result01 = str.substring(3); //3번째 인덱스부터 끝까지 잘라서 넣어라
		System.out.println(result01);
		
		String result02 = str.substring(1,7); //1번째 인덱스부터 7번째 인덱스까지 잘라서 넣어라
		System.out.println(result02);
		
		char c = str.charAt(10); //10번째 문자열
		System.out.println(c);
		
	}
	
}


