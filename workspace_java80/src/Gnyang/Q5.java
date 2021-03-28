package Gnyang;

import java.util.Scanner;

//2개의 정수를 입력받아 입력받은 정수의 차를 결과로 쿨력하는 프로그램
public class Q5 {

	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		if(a>=b) {
			System.out.println(a-b);
			}
		else{
			System.out.println(b-a);
		}
	}
	
		

}
