package com.base;
//오라클과 자바 만남
//이어야 됨 - 연결고리
//VO패턴 - 데이터의 영속성을 윶해주는 오라클 서버 제품과 연결하기
//Data관리 목적 - 모든 집합의 이름 뒤에 접미어로 VO붙임.
//메인메소드는 필요없다. 단독으로 실행하지 않는더.
/*
 * Number(2) - 정수형. 담을 수 있는 최대 크기는 99까지 임계값 
 *           - int(4byte), long(8byte)
 *           
 * varchar(4000byte) - String
 * VO패턴을 사용하면 한꺼번에 3가지 종류[부서번호, 부서명, 지역]의 값을 관리 가능함.
 * 
 */

public class Class2 {
	private int   deptno = 0;
	private String dname = null;
	private String loc = null;
	
	
}
