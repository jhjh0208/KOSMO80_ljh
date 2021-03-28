package Gnyang;
//두개의 정수를 입력받아 큰 수에서 작은 수를 빼는 프로그램.
import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b; 
		a = sc.nextInt();
		b = sc.nextInt();
		
		 if (a>b) {
			 System.out.println(a+b);
		 }
		 else {
			 System.out.println(b+a);
		 }
//		 else{
//			 System.out.println(0);
//		 }
	}

}
