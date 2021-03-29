package level2.basic;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class A_2 extends JFrame {
	JButton jbtn = null;
	boolean isView = false;
	public A_2() {
		JButton jbtn =  new JButton("전송2");
		initDisplay();
	}
	public A_2(boolean isView) {
		this.isView = isView;
		JButton jbtn =  new JButton("전송3");
		initDisplay();
		//위치가 중요하다
	}
	public void initDisplay() {
		this.add("Center", jbtn);
		this.setSize(500, 300);
		this.setVisible(isView);
	}

	public static void main(String[] args) {
		new A_2(true); //트루를 넣지 않으면 화면이 안뜸.
		
	}

}
