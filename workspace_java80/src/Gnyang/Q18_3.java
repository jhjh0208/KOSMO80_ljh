package Gnyang;

import java.util.Scanner;

//배열의 길이를 정하고 그 길이 안에 있는 모든 숫자 출력.
public class Q18_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int llong = 0;
		llong = sc.nextInt();
		int[] array = new int[llong];
		
		int i;
		for( i = 0; i<array.length; i++ ) {
			array[i] = sc.nextInt();
		}
	}
}
//		int hap = 0;
//		int j;
//	    for(j = 0; j<array.length;j++) {
//	    	hap=hap+array[j];
//	    }
//	    System.out.println(hap);
//		
//}
//}