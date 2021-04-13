package book.ch4;

import java.util.Random;
import java.util.Scanner;

public class ScannerExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = null;
		sc2 = new Scanner(System.in);
		System.out.println("1~9까지 임의의 숫자를 입력하시오.");
		System.out.println(sc.nextInt());
		
		Random r = new Random();
		r.nextInt(10);
		System.out.println(r.nextInt(10));
		
		if(sc.nextInt() == r.nextInt()) {
			System.out.println("ff");
		}
	}

}
