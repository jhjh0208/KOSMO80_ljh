package com.base;
/*
 * ++i는 i = i + 1;과 같다.
 * --i는 i = i - 1;과 같다.
 * i++은 후위연산자 이므로 먼저 비교하고 나중에 1을 증가시킴
 * ++i은 전위연산자이다.
 */

public class Exam1 {
	
	public static void main(String[] args) {
		int i = 1;
		int j = 2;
		if((++i>j--)&(++i>j)) {
			
			//실행 되는가?
		}else {
			//실행되나?
		}
		//변수 초기화가 있을 때와 없을 때 차이가 있습니까?
		i = 1;
		j = 2;
		
		if((++i>j--)&&(++i>j)) {
			
		
		}else {
		}
	}

}
