package book.ch7;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ObjectArray {

	public static void main(String[] args) {
		//JFrame은 윈도우 운영체제에서 창을 띄울 때 사용하는 클래스입니다.
		JFrame jf = new JFrame();
		//그 창(화면)안에 버튼을 배치하기 위해서 Layout에 대헌 설정이 필요함.
		//똑같은 크기의 벙이 10개가 필요하다. -행렬적인 느낌
		
		jf.setLayout(new GridLayout(1,10));
		JButton jbtns[] = new JButton[10];
		//버튼의 숫자값을 출력해야 하는데 배열을 사용하면 반복되는 코드를 줄일 수 있으므로 굳아 JButton[]정의함.
		//버튼에 들어갈 숫자문자열을 일일이 써주어야 하나요?
		String jbtn_label[] = {"0","1","2","3","4","5","6","7","8","9"};
		JButton jbtn = null;
		for(int i=0;i<jbtns.length;i++) {
			//
			jbtn = new JButton(jbtn_label[i]);
			jf.add(jbtn);
		}
		
		
		jf.setTitle("객체 배열 실습");
		jf.setSize(700, 200);
		jf.setVisible(true);
	}

}
