package com.pattern;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class RandomGameView {
	//선언부 
	//중앙에 그려질 속지 선언 및 생성
	JTextArea jta_display = new JTextArea(7,20);
	JScrollpane jsp_display = new JScrollpane(jta_display,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER
												);
	//남쪽에 그려질 속지 선언 및 생성 - 여기에는 버튼 10개를 붙일 거야.-일단 방만 10개 만들어 놨어. 여기에 버튼10개로 채울거야.
	JPanel jp_south = new JPanel();
	JButton jbtns[] = new JButton[10];// 꼴랑 반만
	//문자열을 담을 수 있는 방10개를 만들고 숫자를 0부터 9까지 초기화 화였음.
	String nums_label[] = {"0","1","2","3","4","5","6","7","8","9"}; 
	
	//생성자
	
	//화면처리
	public void initDisplay() {
		JFrame jf = new JFrame();
		jp_center.setBackground(Color.green);
		jp_south.setBackground(Color.red);
		
		//JFrame의 배치 레이아웃을 정함.
		jf.setLayout(new BorderLayout());
		jf.add("center", jp_display);
		jf.add("south", jp_south);
		jf.setSize(500, 400);
		jf.setVisible(true);
	}
	//메인메소드
	public static void main(String[] args) {
		RandomGameView rgView = new RandomGameView();
		rgView.initDisplay();
	}

}
