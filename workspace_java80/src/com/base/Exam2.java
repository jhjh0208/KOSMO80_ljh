package com.base;

 public class Exam2 {
	 /*실행순서는...
	  * 7-8(x에 5가 저장됨) - 9(주변생김) - 10(메소드 호출됨 - 파라미터로 5가 복사됨)
	  * 
	  */
 	public static void main(String []args) {
 	int x = 5; 
 	Exam2 p = new Exam2();
 	p.doStuff(x);
 	System.out.print(" main x = "+ x);
 }

 void doStuff(int x) {
 	System.out.print("doStuff x =" + x++);  
 }
 }