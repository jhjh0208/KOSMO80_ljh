package book.ch4;

import java.util.StringTokenizer;

public class SwitchTest {

	public static void main(String[] args) {
		int protocol = 100; //로그인
		protocol = 200; //입장하기
		protocol = 300; //다자간 대화
		protocol = 301; //귓속말, 1:1채팅
		String id = "tomato";
		String input = "오늘 스터디 할까?";
		String msg = protocol+"="+id+"="+input;
		StringTokenizer st = new StringTokenizer(msg, "=");
		protocol = Integer.parseInt(st.nextToken());
		String s_id = st.nextToken();
		String s_input = st.nextToken();
		System.out.println(protocol);
		System.out.println(s_id);
//		System.out.);
		
		//제어문의 역할은 업무 순서에 대한 흐음을 바꾼다.
		//순서에 대한 정보를 바탕으로 의사를 결정할 수 있는 것은 팀장,차장,부장 선택자
		//선택(비즈니스로직계층 - Model계층)에 따라
		//break 반대 continue
		//break 사용
		//for문, while..... 무한루프를 방지학; 위해서
		//if문 break 대신에 return이다. 메소드를 탈출한다.
		//switch문에서 break는 switch문을 탈출
		protocol = 10;
		switch(protocol){//원시형 타입+String타입
		   case 0:
			   //실행문
			   System.out.println("0입니다.");
			   
		   case 10:
			   //실행문
			   System.out.println("10입니다.");
		   case 100:
			   //실행문
			   System.out.println("100입니다.");
			   break;
		   default:
			   System.out.println("default입니다.");
			
		}//////end of switch
		System.out.println("여기");
		
	}

}
