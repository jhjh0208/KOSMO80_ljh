package com.pattern;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutview {

	public static void main(String[] args) {
		//버튼갹체를 5개 선언 및 초기화 하기- 메모리에 로딩일어남.
		JButton jbtn_north  = new JButton("북쪽");
		JButton jbtn_south  = new JButton("남쪽");
		JButton jbtn_center = new JButton("중앙");
		JButton jbtn_east   = new JButton("동쪽");
		JButton jbtn_west   = new JButton("서쪽");
		//윈도우에서 독립된 창을 띄울 때 사용함.
		JFrame jf = new JFrame();
		//JFrame의 배치 레이아웃을 정함.
		jf.setLayout(new BorderLayout());
		//
		//
		jf.add("south",jbtn_south);
		
		
		
		
	}

}
