package Gnyang;

import java.util.Scanner;

// 어떤 수를 입력 받아서 10보다 작으면 small을 출력 아니면 아무것도 출력하지 마시오 
public class Q10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		if(i<10) {
			System.out.println("small");
		}
		else
			System.out.println("아무것도 출력하지 마시오");

	}

}
