package book.ch14;
/*
 * API를 보는 습관을 들이자.
 * 1일 1커밋하는 의식
 * 이번 프로젝트에서 사용자 예외처리를 해볼 것.
 * 코드 리뷰하는 습관을 들인다.
 */

public class UserExceptionTest {
	public void test(String[] a) throws UserException{
		System.out.println("test 호출성공");
		if(a.length < 1) {
			throw new UserException("형, 아무것도 없어요.");
		}else 
			throw new UserException("최종 예선,",7000); //한줄일 때 중괄호 생략가능.
			
		
	}
	public static void main(String[] args) {
		UserExceptionTest uet = new UserExceptionTest();
		try {
			uet.test(args);
		}catch (UserException ue) {
//			System.out.println(ue.printStackTrace()); //이렇게 사용할 수 없다.
			ue.printStackTrace();
			System.out.println("[[[[[[[[[[UserException]]]]]]]]]]" +ue.toString());
//			System.exit(0);//자바가상머신과의 연결고리를 끊음.
		}catch (Exception e) {
			e.toString();
			e.getMessage();
			e.printStackTrace();
		}finally {
			System.out.println("finally - 무조건 실행됨.");
		}
		
	}

}
