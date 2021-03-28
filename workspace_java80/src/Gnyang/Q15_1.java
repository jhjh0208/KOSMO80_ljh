package Gnyang;

import java.util.Scanner;

//세 정수 a,b,c를 입력받았을 때 홀 짝 출력하기.
public class Q15_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[3];
		for(int i = 0;i<array.length;i++) {
			array[i] = sc.nextInt();
		}
		for(int j = 0;j<array.length;j++) {
				if(array[j]%2==0) {
					System.out.println(j+1+"번쨰는 짝수");
				}
				else
					System.out.println(j+1+"번째는 홀수");
		}
		
		}
}
	
