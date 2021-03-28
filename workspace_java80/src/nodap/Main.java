package nodap;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i =sc.nextInt();
		int y = sc.nextInt();
		int yoon= 29;
		int[] month = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		if(i%4==0 & i%100!=0) {
			System.out.println(yoon);
		}
		else if (i%400==0) {
			System.out.println(yoon);
		}
		else {
			System.out.println(month[y-1]);
		}
	}
}
