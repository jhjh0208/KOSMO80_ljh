package com.base;
/*
 * 에러에는 두 가지가 있다.
 * 하나는 컴파일 타임 에러이고 - 문법에러....
 * 두 번째는 런타임 에러이다. - 실행 오류이다.(논리의 오류이다.)
 */
import java.util.Scanner;
	

public class MoonTest_5 {
	public static void main(String[] args) {
		 double wEarth = 0.0; //지구의 몸무게
		    System.out.println("지구의 몸무게를 입력하세요.");
		    Scanner sc = new Scanner(System.in); //시스템(내가 사용하고 있는 컴)에서 in(입력장치로부터)
			try {
				wEarth = sc.nextDouble();
			}
			catch (Exception e) {
				System.out.println("Exception :"+e.toString());
				return;
			}
		    if(sc.hasNextDouble()) {//너 입력한 값 더블이야? 네.
				double wMoon = 0.0;
//				MoonTest_5 m3 = new MoonTest_5();
				Common cm = new Common();
				wMoon = cm.moonWeight(wEarth);
				System.out.println("지구의 몸무게 : "+wEarth+" kg");
				System.out.println("달의 몸무게 : "+wMoon+" kg");
			}
			else {
				System.out.println("실수만 입력하세요.. 제발..");
				//return; //메인메소드 탈출한다. 22번 아래는 진행할 필요가 없어요.
			}
			System.out.println("여기..");
	}

}
