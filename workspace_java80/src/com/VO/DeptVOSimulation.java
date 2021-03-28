package com.VO;

public class DeptVOSimulation {
	void methodB() {//반환값이 전혀 역할을 못함.
		
	}
	

	public static void main(String[] args) {
		DeptVO dvo = new DeptVO();
		//위치 - 어디서 호출해야 할까요?
		//insert here => 1
		dvo.setDeptno(30);//생성자로 처리해 보시오. 
		//int x = dvo.setDeptno(30);
		//boolean isOK = dvo.setDeptno(30);
		
		int myDeptNo = dvo.getDeptno();//0출력
		//insert here - 부서번호 30을 출력하도록 코드를 추가하시오.
		
		
		int dovNo = 30;
		String myDname = dvo.getDname();//null
		String myLoc = dvo.getLoc();//null
		System.out.println(dovNo);
	} 
		
}
		