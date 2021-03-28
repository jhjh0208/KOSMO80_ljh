package Gnyang;

import java.util.Scanner;

//배열의 길이를 정하고 그 길이 안에 있는 모든 숫자를 더하시오.
public class Q18_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int llong = 0;
		llong = sc.nextInt();
		int[] array = new int[llong];
		int i;
		array[0] = sc.nextInt();
		for(i = 1; i<array.length; i++ ) {
			array[i] = sc.nextInt();
			array[i] = array[i] + array[i=i+1];
		}
		System.out.println(array[i]);
//		int j = 0;
//		for(j = 0; j<array.length; j++) {
//			System.out.println(array[i]);
	    }
	    
		
}
