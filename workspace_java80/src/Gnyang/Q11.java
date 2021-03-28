package Gnyang;

import java.util.Scanner;

//숫자를 입력하면 역삼각형을 출력한다.
public class Q11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int starN = sc.nextInt();
		for(int i = 0;i<starN;i++) {
			for(int j = 0; j<starN;j++) {
				if(i+j<starN) {
				System.out.print("*");
				}
			}
			System.out.println();
		}
		
 	}
}

