package Gnyang;

import java.util.Scanner;

//태어난 해, 월, 일을 입력받아 사주팔자를 보는 프로그램을 작성하시오.
//사주를 보는 방법)
//세 수(년,월,일)가 주어지면, (년 - 월 + 일)에 마지막 숫자가 0이면 
//"대박"을 출력, 그렇지 않으면 "그럭저럭"을 출력하세요.

public class QQ2 {
		int s;
	
		
	
	private void methodA() {
		System.out.println("생년월일을 입력하시오");
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		int m = sc.nextInt();
		int d = sc.nextInt();
			s = y - m + d; 
			
			if(s%10 == 0) {
				System.out.println("대박");
			}
			else {
				System.out.println("그럭저럭");
			}
		}



	public static void main(String[] args) {
		QQ2 qq2 = new QQ2();
		qq2.methodA();
	}

}
