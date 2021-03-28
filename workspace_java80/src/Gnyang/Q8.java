package Gnyang;

import java.util.Scanner;

//다섯 개의 숫자를 입력 받아서 반대로 출력하기.
public class Q8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int s = 0;
		int[] a = new int[sc.nextInt()];
		for(int j =0;j<a.length;j++) {
			a[j] = sc.nextInt(); 
			
		}
			for(i=a.length-1;i>=0;i--) {
				System.out.println(a[i]);
		
			
			
		}
	}

}
