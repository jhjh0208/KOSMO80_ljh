package Gnyang;

import java.util.Scanner;

//두 숫자릅 입력하고 그 사이의 3배 배수를 구하라.
public class Q14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();		
		for(int s = i;s<j;s++) {
			if(s%3==0) {
				System.out.println(s);
				
			}
		}
	}

}
