package Gnyang;
//입력한 달의 계절을 출력하기.
import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		int season = 0;
		Scanner sc = new Scanner(System.in);
		season = sc.nextInt();
		switch(season) {
		
		case 12: case 1: case 2:
			System.out.println("winter");
		break;
		case 3: case 4: case 5:
			System.out.println("spring");
		break;
		case 6: case 7: case 8:
			System.out.println("summer");
		break;
		case 9: case 10: case 11:
			System.out.println("fall");
		break;
		}
		
	}

}
