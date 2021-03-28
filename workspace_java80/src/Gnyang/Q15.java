package Gnyang;

import java.util.Scanner;

//세 정수 a,b,c를 입력받았을 때 홀 짝 출력하기.
public class Q15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a%2==0) {
			System.out.println(a+"=짝수");
		}
		
		else {
			System.out.println(a+"=홀수");
		}
		if(b%2==0) {
		System.out.println(b+"=짝수");
	}
	
		else {
		System.out.println(b+"=홀수");
		}
			if(c%2==0) {
				System.out.println(c+"=짝수");
}

			else
				System.out.println(c+"=홀수");
}

}
