package Gnyang;
//임의의 숫자를 3번 입력하고 출력하시오.
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		Scanner sc = new Scanner(System.in);
		
//		for(int j=1;j<=3;j++) {
//			int i = sc.nextInt();
//			System.out.println(i);
//		}
		while (i<3) {
			j = sc.nextInt();
			System.out.println(j);
			i++;
		}
		
	}

}
