package com.base;

import java.util.Scanner;

public class MoonTest {

	public static void main(String[] args) {
		    double wEarth = 0.0; //지구의 몸무게
		    double wMoon = 0.0; //달의 몸무게
		    System.out.println("지구의 몸무게를 입력하세요.");
		    Scanner sc = new Scanner(System.in); //시스템(내가 사용하고 있는 컴)에서 in(입력장치로부터)
			wEarth = sc.nextDouble();
			wMoon = (wEarth*17)/100.0;//(double*int)/int=double
			
			System.out.println("지구의 몸무게 : "+wEarth+" kg");
			System.out.println("달의 몸무게 : "+wMoon+" kg");
		
	}

}
