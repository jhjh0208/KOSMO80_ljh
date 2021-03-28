package com.design.zipcode;

import java.util.List;
import java.util.Vector;

/*
 * 자료구조의 종류
 * 1) List계열
 *    ArrayList - 싱글스레드에 안전, 동기화 처리 생략, 속도 빠르다.
 *    Vector - 멀티스레드 안전, 동기화 처리, 속도 느린편.
 *     :경랍, 다중 접속자 처리, 순서, 동기화처리
 * 2) Map계열(해시태그)
 *    
 * 3) Set계열(빈도 낮음)-집합 
 * 
 */
public class ZipCodeList {

	public static void main(String[] args) {
		// 꺽쇠 : 제네릭이라고 함. 생성부에는 타입 없이 다이아모드 연산자만 붙임.
		Vector<ZipCodeVO> v = new Vector<>();// 다형성을 누릴 수 없다.
		List<ZipCodeVO> v2 = new Vector<>();// 다형성 누린다.
		
		ZipCodeVO zcVO = null;
		ZipCodeVO[] zcVOs = null;
		int i = 0;
		
		while (i < 3) {
//			zcVO.setAddress("서울시"); 
			zcVO = new ZipCodeVO();
			zcVO.setAddress("서울시");// OK address=서울시
//			System.out.println("zxVO주소번지 바뀐다.==>" + zcVO.getAddress()); // "서울시"
			v.add(zcVO);
			zcVO.setAddress("인천직할시");// OK address=서울시S
			i++;
		}
		
		for (int x = 0; x < v.size(); x++) {
			ZipCodeVO zVO = v.get(x);// 31번에서 만들어진 VO와는 다른 것이다.
			System.out.println(zVO);// 다른 주소번지가 출력된다.
		}
		
		zcVOs = new ZipCodeVO[v.size()];// 객체배열이 3개 만들어 진다.
		System.out.println("배열의 크기 는" + zcVOs.length);// 3이 출력됨
		v.copyInto(zcVOs);// 벡터에 담긴 것을 배열에 담아준다.
		for (int y = 0; y < zcVOs.length; y++) {
			System.out.println(zcVOs[y] + ", " + zcVOs[y].getAddress());// 객체 배열의 주소번지가 3개 출력된다.
		}
	}
}
