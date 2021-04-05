package Gnyang;

import java.util.Calendar;
import java.util.Scanner;

public class ggg {

	 public static void main(String[] args) {

	  Scanner input = new Scanner(System.in);



	  Calendar calendar = Calendar.getInstance();

	  System.out.print("연도를 입력하세요>>");

	  int year = input.nextInt();

	  System.out.print("월를 입력하세요>>");

	  int month = input.nextInt();



	  calendar.set(year, month-1, 1); // 보고 싶은 달의 1일로 설정



	  int dayOfWeek = calendar.get(calendar.DAY_OF_WEEK); // 그 달의 1일의 요일값을 얻는다.

	  calendar.roll(Calendar.DAY_OF_MONTH, -1); // roll 함수를 통해서 그 달의 마지막 날로 옮긴다.

	  int lastDayOfMonth = calendar.get(Calendar.DAY_OF_MONTH); // 그 달의 마지막 일을 얻는다.



	  System.out.println(year + "년" + (month) + "월 달력"); // 몇 년 몇 월 달력인지 출력

	  System.out.println("일\t월\t화\t수\t목\t금\t토"); // 요일 출력



	  for (int i = 1; i < dayOfWeek - 1; i++) { // 달력 첫번째 줄 앞에 여백 생성

	   System.out.print("\t");

	  }

	  

	  int weekCnt = dayOfWeek; // 줄바꿈을 위한 변수 선언



	  for (int i = 1; i <= lastDayOfMonth; i++) { // 달력 안에 일 출력

	   if (weekCnt % 7 == 1) { // 일요일일 경우 앞에 탭 없이 출력

	    System.out.print(i);

	   } else if (weekCnt % 7 == 0) { // 토요일일 경우 앞에 탭 및 출력 후 줄바꿈

	    System.out.println("\t" + i);

	   } else { // 그 외 요일은 앞에 탭 후 출력

	    System.out.print("\t" + i);

	   }

	   weekCnt++;

	  }

	 }

	}

